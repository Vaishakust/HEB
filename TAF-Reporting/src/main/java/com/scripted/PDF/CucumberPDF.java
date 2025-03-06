package com.scripted.PDF;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.scripted.generic.FileUtils;
import com.scripted.web.BrowserDriver;


public class CucumberPDF {
	
    public static PdfWriter writer = null;
    public static Document document;
    public static String cdir = System.getProperty("user.dir");
    public static String currentTimeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss")
            .format(Calendar.getInstance().getTime());
    public static String destination;
    static PdfPTable Table = null;
    public static Logger LOGGER = LogManager.getLogger(CucumberPDF.class);
    WebDriver driver;


    public static void pdfGenerate() {

        String path = cdir + "/SkriptmateReport/PDFReport" + File.separator + currentTimeStamp;
        FileUtils.makeDirs(path);
        destination = path + File.separator + "PDFTest_Report.pdf";
        try {
            document = new Document(PageSize.A4, 36, 36, 68, 36);
            writer = PdfWriter.getInstance(document, new FileOutputStream(destination));
            PDFReportUtils event = new PDFReportUtils();
            writer.setPageEvent(event);
        } catch (Exception e2) {
            e2.printStackTrace();
            System.out.println(e2.toString());
        }

        try {
            document.open();
            Paragraph pgraph = new Paragraph(" Skriptmate Test Report",
                    FontFactory.getFont(FontFactory.TIMES_ROMAN, 24, Font.BOLD, BaseColor.BLACK));
            pgraph.setAlignment(Element.ALIGN_CENTER);
            document.add(pgraph);
            Paragraph pgraph2 = new Paragraph("Date&Time:" + (new Date().toString()),
                    FontFactory.getFont(FontFactory.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLACK));
            pgraph2.setAlignment(Element.ALIGN_CENTER);
            document.add(pgraph2);

        } catch (Exception e1) {
            e1.printStackTrace();
            LOGGER.error("Error while generating pdf" + e1);
        }
    }

    public static void ExportJsondataPdf(String jsonFile) throws Exception, IOException {
        try {
            String imFile = "./src/main/resources/Reporting/Email/PieChart.jpeg";
            pdfGenerate();
            Map<?, ?> result = DataFromJSON.scenariodetails(jsonFile);
            PDFPieChart.generateChartFromJsonValue(jsonFile);
            Image image = Image.getInstance(imFile);
            image.setAlignment(Element.ALIGN_CENTER);
            image.scaleToFit(400, 190);
            document.add(image);

            Table = new PdfPTable(2);
            Table.setSpacingBefore(45f);
            Paragraph pgraph = new Paragraph("Cucumber Report",
                    FontFactory.getFont(FontFactory.TIMES_ROMAN, 18, Font.BOLD));
            PdfPCell cell = new PdfPCell(pgraph);
            cell.setColspan(2);
            cell.setBackgroundColor(new BaseColor(27, 131, 72));
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            Table.addCell(cell);
            cell = new PdfPCell(new Paragraph("Scenario Details"));
            cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            Table.addCell(cell);
            cell = new PdfPCell(new Paragraph("Status"));
            cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            Table.addCell(cell);
            String scenarioName = "";
            String passCount = null;
            String failCount = null;
            String flag = "PASS";
            for (Map.Entry<?, ?> scenarioMap : result.entrySet()) {
                scenarioName = scenarioMap.getKey().toString();
                passCount = scenarioMap.getValue().toString().split("##")[0];
                failCount = scenarioMap.getValue().toString().split("##")[1];
                PdfPCell cell2 = new PdfPCell(new Paragraph(scenarioName));
                cell2.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                Table.addCell(cell2);
                if (Integer.parseInt(failCount) != 0)
                    flag = "FAIL";
                cell2 = new PdfPCell(new Paragraph(flag));
                cell2.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                Table.addCell(cell2);
            }
            document.add(Table);

            // Add a new page for scenario names and statuses
            addScenarioStatusPage(jsonFile);
            LOGGER.info("Successfully Pdf Report is generated in:" + destination);
            document.close();
        } catch (Exception e1) {
            e1.printStackTrace();
            LOGGER.error("Error while exporting json data" + e1);
        }
    }

 // Method to add a new page for scenario names and statuses
    private static void addScenarioStatusPage(String jsonFile) throws IOException, DocumentException {
        document.newPage();

        // Read and parse the cucumber.json file
        JsonParser jsonParser = new JsonParser();
        JsonElement jsonElement = jsonParser.parse(new FileReader(jsonFile));
        JsonArray featuresArray = jsonElement.getAsJsonArray();

        // Iterate through each feature
        for (JsonElement featureElement : featuresArray) {
            JsonObject featureObject = featureElement.getAsJsonObject();
            String featureName = featureObject.get("name").getAsString();

            // Iterate through each scenario in the feature
            for (JsonElement scenarioElement : featureObject.getAsJsonArray("elements")) {
                JsonObject scenarioObject = scenarioElement.getAsJsonObject();
                String scenarioName = scenarioObject.get("name").getAsString();

                // Get the overall scenario status
                String overallStatus = "Passed";
                JsonArray stepsArray = scenarioObject.getAsJsonArray("steps");
                if (stepsArray != null && !stepsArray.isJsonNull() && stepsArray.size() > 0) {
                    for (JsonElement stepElement : stepsArray) {
                        JsonObject stepObject = stepElement.getAsJsonObject();
                        String status = stepObject.getAsJsonObject("result").get("status").getAsString();
                        if (status.equalsIgnoreCase("Failed")) {
                            overallStatus = "Failed";
                            break;
                        }
                    }
                }
                
                // Create Paragraph elements for scenario name and overall status
                Paragraph scenarioParagraph = new Paragraph("Scenario: " + scenarioName,
                        FontFactory.getFont(FontFactory.TIMES_ROMAN, 14, Font.BOLD, BaseColor.BLACK));
                scenarioParagraph.setAlignment(Element.ALIGN_CENTER);

                Paragraph statusParagraph = new Paragraph("Overall Status: " + overallStatus,
                        FontFactory.getFont(FontFactory.TIMES_ROMAN, 14, Font.BOLD, BaseColor.BLACK));
                statusParagraph.setAlignment(Element.ALIGN_CENTER);

                // Add scenario name and overall status to the PDF
                try {
                    document.add(scenarioParagraph);
                    document.add(statusParagraph);
                    document.add(new Paragraph("\n"));
                } catch (DocumentException e) {
                    e.printStackTrace();
                }
                
                // Create a table with three columns: Step, Status, and Screenshot
                PdfPTable stepTable = new PdfPTable(new float[] { 1, (float) 0.5, 2 });
                stepTable.setWidthPercentage(100);
                stepTable.setSpacingBefore(10f);
                stepTable.setSpacingAfter(10f);


                PdfPCell stepHeader = new PdfPCell(new Paragraph("Step"));
                stepHeader.setBackgroundColor(BaseColor.LIGHT_GRAY);
                stepHeader.setHorizontalAlignment(Element.ALIGN_CENTER);
                stepTable.addCell(stepHeader);

                PdfPCell statusHeader = new PdfPCell(new Paragraph("Status"));
                statusHeader.setBackgroundColor(BaseColor.LIGHT_GRAY);
                statusHeader.setHorizontalAlignment(Element.ALIGN_CENTER);
                stepTable.addCell(statusHeader);

                PdfPCell screenshotHeader = new PdfPCell(new Paragraph("Screenshot"));
                screenshotHeader.setBackgroundColor(BaseColor.LIGHT_GRAY);
                screenshotHeader.setHorizontalAlignment(Element.ALIGN_CENTER);
                stepTable.addCell(screenshotHeader);

                // Iterate through each step in the scenario
                for (JsonElement stepElement : stepsArray) {
                    JsonObject stepObject = stepElement.getAsJsonObject();
                    String name = stepObject.get("name").getAsString();
                    String status = stepObject.getAsJsonObject("result").get("status").getAsString();
                    
                    // Add step name and status to the table
                    PdfPCell stepCell = new PdfPCell(new Paragraph(name));
                    stepCell.setHorizontalAlignment(Element.ALIGN_CENTER);
                    stepTable.addCell(stepCell);

                    PdfPCell statusCell = new PdfPCell(new Paragraph(status));
                    statusCell.setHorizontalAlignment(Element.ALIGN_CENTER);
                    stepTable.addCell(statusCell);

                        // Capture and embed screenshot for failed steps
                        if (status.equalsIgnoreCase("Failed")) {
                            String screenshotPath = captureScreenshotAndReturnPath(); 
                            if (screenshotPath != null) {
                                Image stepImage = Image.getInstance(screenshotPath);
                                
                                stepImage.scaleToFit(293, 293); // Scale image to fit within the cell
                                PdfPCell imageCell = new PdfPCell(stepImage);
                                imageCell.setHorizontalAlignment(Element.ALIGN_CENTER);
                                imageCell.setPadding(5); // Optional: Add some padding to the image cell
                                stepTable.addCell(imageCell);
                                }


                             else {
                                stepTable.addCell(new PdfPCell(new Paragraph("No Screenshot")));
                            }
                        } else {
                            stepTable.addCell(new PdfPCell(new Paragraph("N/A")));
                        }
                      }

                try {
                    document.add(stepTable);
                } catch (DocumentException e) {
                    e.printStackTrace();
                }
            }
        }
    }

// Method to capture screenshot and return path 
    public static String captureScreenshotAndReturnPath() {
        WebDriver driver = BrowserDriver.getDriver(); 
        String screenshotPath = null;
        try {
            // Take screenshot as byte array
            TakesScreenshot scrShot = ((TakesScreenshot) driver);
            byte[] screenshot = scrShot.getScreenshotAs(OutputType.BYTES);

            // Save screenshot to a file
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
            String timestamp = dateFormat.format(new Date());
            String screenshotFile = "./screenshots/screenshot_" + timestamp + ".png";
            FileUtils.makeDirs("./screenshots"); 
            FileOutputStream fos = new FileOutputStream(screenshotFile);
            fos.write(screenshot);
            fos.close();

            // Set screenshotPath to the saved file path
            screenshotPath = screenshotFile;

        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("Failed to capture screenshot: " + e.getMessage());
        }
        return screenshotPath;
    }
}
