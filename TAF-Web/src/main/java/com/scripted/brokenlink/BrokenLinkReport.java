package com.scripted.brokenlink;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.apache.commons.lang3.RandomStringUtils;

public class BrokenLinkReport {
	static StringBuffer Pagebody = new StringBuffer();
	static StringBuffer piechartbody = new StringBuffer();
	static StringBuffer linkbody = new StringBuffer();
	static StringBuffer failedCheckBox = new StringBuffer();
	public static String username = System.getProperty("user.name");
	public static String currentTimeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss")
			.format(Calendar.getInstance().getTime());
	static String reportFolderNme;
	static String reportPath;
	public static String cdir = com.scripted.generic.FileUtils.getCurrentDir();
	String applicationurl;
	String totalPages;
	String ScannedlinkCount;
	String TotalPasscount;
	String PagePassCount;

	public String getPagePassCount() {
		return PagePassCount;
	}

	public void setPagePassCount(String pagePassCount) {
		PagePassCount = pagePassCount;
	}

	public String getPageFailCount() {
		return PageFailCount;
	}

	public void setPageFailCount(String pageFailCount) {
		PageFailCount = pageFailCount;
	}

	String PageFailCount;

	public String getTotalPasscount() {
		return TotalPasscount;
	}

	public void setTotalPasscount(String totalPasscount) {
		TotalPasscount = totalPasscount;
	}

	public String getTotalFailcount() {
		return TotalFailcount;
	}

	public void setTotalFailcount(String totalFailcount) {
		TotalFailcount = totalFailcount;
	}

	String TotalFailcount;

	public String getScannedlinkCount() {
		return ScannedlinkCount;
	}

	public void setScannedlinkCount(String scannedlinkCount) {
		ScannedlinkCount = scannedlinkCount;
	}

	public String getApplicationurl() {
		return applicationurl;
	}

	public void setApplicationurl(String aurl) {
		applicationurl = aurl;
	}

	public String getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(String TPages) {
		totalPages = TPages;
	}

	public void reportGen() {
		pieChartBody();
		File file = new File(reportPath + File.separator + "BrokenLinkReport.html");
		String newtext;
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

			String line = "", oldtext = "";
			while ((line = reader.readLine()) != null) {
				oldtext += line + "\r\n";
			}
			reader.close();
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh.mm.ss aa");
			String dateString = dateFormat.format(new Date()).toString();
			newtext = oldtext.replace("{ExecutedBy}", username);
			newtext = newtext.replace("{ExecutedOn}", dateString);
			// Count and percentage for graph
			newtext = newtext.replace("{Application Url}", getApplicationurl());
			newtext = newtext.replace("{Pages}", getTotalPages());
			newtext = newtext.replace("{Links}", getScannedlinkCount());
			newtext = newtext.replace("{passcount}", getTotalPasscount());
			newtext = newtext.replace("{failcount}", getTotalFailcount());
			newtext = newtext.replace("{pagebody}", Pagebody);

			newtext = newtext.replace("{piechartBody}", piechartbody);
			try (FileWriter writer = new FileWriter(reportPath + File.separator + "BrokenLinkReport.html")) {
				writer.write(newtext);
				writer.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void reportPathCreate() {

		try {

			reportFolderNme = "BrokenLink_" + currentTimeStamp;

			reportPath = cdir + "/SkriptMateReport/BrokenLink/" + reportFolderNme;
			com.scripted.generic.FileUtils.makeDirs(reportPath);

			File sourceFolder = new File(cdir + "/src/main/resources/Web/Artefacts");
			File destinationFolder = new File(reportPath);
			copyFolder(sourceFolder, destinationFolder);

		} catch (Exception e) {

			e.printStackTrace();

			System.out.println("Issues while creating report path" + e.getMessage());

		}

	}

	private static void copyFolder(File sourceFolder, File destinationFolder) throws IOException {
		if (sourceFolder.isDirectory()) {
			if (!destinationFolder.exists()) {
				destinationFolder.mkdir();
			}
			String files[] = sourceFolder.list();
			for (String file : files) {
				File srcFile = new File(sourceFolder, file);
				File destFile = new File(destinationFolder, file);
				copyFolder(srcFile, destFile);
			}
		} else

		{
			Files.copy(sourceFolder.toPath(), destinationFolder.toPath(), StandardCopyOption.REPLACE_EXISTING);
		}

	}

	public void pageBody(String pagename, String pagepasscount, String pagefailcount, String random) {
		String id = RandomStringUtils.randomAlphanumeric(5).toString();
		Pagebody.append("<div class=\"panel-group\" id=\"accordion" + random + "\">\r\n"
				+ "				<div class=\"panel panel-default\">");
		Pagebody.append("<div class=\"panel-heading\">\r\n" + "						<h4 class=\"panel-title\">\r\n"
				+ "\r\n" + "							<a class=\"accordion-toggle\" data-toggle=\"collapse\"\r\n"
				+ "								data-parent=\"#accordion" + random + "\" href=\"#collapse" + id + "\"> "
				+ pagename + "</a> &nbsp; <span class=\"noti_style2\">" + pagefailcount + "</span> <span\r\n"
				+ "								class=\"noti_style1\">" + pagepasscount + "</span>\r\n"
				+ "						</h4>\r\n" + "					</div>");
		Pagebody.append("<div id=\"collapse" + id + "\" class=\"panel-collapse collapse \">");
		Pagebody.append("<div class=\"panel-body\">");

	}

	public void addDivClosure(int count) {
		for (int i = 0; i < count; i++) {
			Pagebody.append("</div>");
		}
	}

	public void linkbody(String status, String linkurl, String responseCode) {

		linkbody.append("<div class='list'>");
		linkbody.append("<div>");
		if (status.equalsIgnoreCase("Pass")) {
			linkbody.append("<img src = 'img/pass.png' class='logo-table1' alt='Pass'/>");
		} else {
			linkbody.append("<img src = 'img/fail.png' class='logo-table1' alt='Pass' />");
		}
		linkbody.append("</div>");
		linkbody.append("<div class='text_sec' style='flex: auto;'>\r\n"
				+ "									<div class='list_heading1'>\r\n"
				+ "										<div>" + linkurl + "</div>\r\n"
				+ "										<div class=\"error__style\"> Response Code:" + responseCode
				+ "</div>\r\n" + "									</div>\r\n"
				+ "								</div>");
		linkbody.append("</div>");
	}

	public void linkBodyEmpty() {
		linkbody.delete(0, linkbody.length());
	}

	public void CreatePageBody() {
		Pagebody.append(linkbody);
		Pagebody.append("</div></div></div></div>");
	}

	public void pieChartBody() {
		piechartbody.append("<script>\r\n"
				+ "		 var ctx = document.getElementById(\"myChart\").getContext('2d');\r\n"
				+ "    var myChart = new Chart(ctx, {\r\n" + "        type: 'doughnut',\r\n" + "        data: {\r\n"
				+ "            labels: [\"Success\", \"Failure\",],\r\n" + "            datasets: [{\r\n"
				+ "                backgroundColor: [\r\n" + "                    \"#45B39D\",\r\n"
				+ "                    \"#FB5252\"\r\n" + "                ],\r\n" + "                data: ["
				+ getTotalPasscount() + ", " + getTotalFailcount() + "]\r\n" + "            }]\r\n" + "        },\r\n"
				+ "        options: {\r\n" + "            cutoutPercentage: 50\r\n" + "        }\r\n" + "    });\r\n"
				+ "\r\n" + "</script>\r\n" + "");
	}

	public void reportGenLatest() {
		pieChartBody();
		failedCheckBox();
		File file = new File(reportPath + File.separator + "BrokenLinkReport.html");
		String newtext;
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

			String line = "", oldtext = "";
			while ((line = reader.readLine()) != null) {
				oldtext += line + "\r\n";
			}
			reader.close();
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh.mm.ss aa");
			String dateString = dateFormat.format(new Date()).toString();
			newtext = oldtext.replace("{ExecutedBy}", username);
			newtext = newtext.replace("{ExecutedOn}", dateString);
			// Count and percentage for graph
			int index = getApplicationurl().indexOf("com/");
			newtext = newtext.replace("{Application Url}", getApplicationurl().substring(0, index + 3));
			newtext = newtext.replace("{Pages}", getTotalPages());
			newtext = newtext.replace("{Links}", getScannedlinkCount());
			newtext = newtext.replace("{passcount}", getTotalPasscount());
			newtext = newtext.replace("{failcount}", getTotalFailcount() + failedCheckBox);
			newtext = newtext.replace("{pagebody}", Pagebody);

			newtext = newtext.replace("{piechartBody}", piechartbody);
			try (FileWriter writer = new FileWriter(reportPath + File.separator + "BrokenLinkReport.html")) {
				writer.write(newtext);
				writer.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void reportPathCreateLatest() {

		try {

			reportFolderNme = "BrokenLink_" + currentTimeStamp;

			reportPath = cdir + "/SkriptMateReport/BrokenLink/" + reportFolderNme;
			com.scripted.generic.FileUtils.makeDirs(reportPath);

			File sourceFolder = new File(cdir + "/src/main/resources/Web/Artefacts");
			File destinationFolder = new File(reportPath);
			File screenshotFolder = new File(cdir + "/screenshots");
			com.scripted.generic.FileUtils.makeDirs(reportPath + "/screenshots");
			copyFolder(sourceFolder, destinationFolder);
			if (screenshotFolder.exists()) {
				File screenshotDestination = new File(reportPath + "/screenshots");
				Files.move(screenshotFolder.toPath(), screenshotDestination.toPath(),
						StandardCopyOption.REPLACE_EXISTING);
			}

		} catch (Exception e) {

			e.printStackTrace();

			System.out.println("Issues while creating report path" + e.getMessage());

		}

	}

	public void pageBodyLatest(String pagename, boolean isPassed, String random) {
		String id = RandomStringUtils.randomAlphanumeric(5).toString();
		Pagebody.append("<div class=\"panel-group\" status=\"" + isPassed + "\" id=\"accordion" + random + "\">\r\n"
				+ "				<div class=\"panel panel-default\">");
		Pagebody.append("<div class=\"panel-heading\">\r\n" + "						<h4 class=\"panel-title\">\r\n"
				+ "\r\n" + "							<a class=\"accordion-toggle\" data-toggle=\"collapse\"\r\n"
				+ "								data-parent=\"#accordion" + random + "\" href=\"#collapse" + id + "\"> "
				+ pagename + "</a> &nbsp;");
		if (isPassed) {
			Pagebody.append("<span class=\"noti_style1\">&check;</span>\r\n");
		} else {
			Pagebody.append("<span class=\"noti_style2\">&cross;</span>\r\n");
		}
		Pagebody.append("						</h4>\r\n" + "					</div>");
		Pagebody.append("<div id=\"collapse" + id + "\" class=\"panel-collapse collapse \">");
		Pagebody.append("<div class=\"panel-body\">");

	}

	public void linkbodyLatest(String status, String linkurl, String screenshotFilePath, String exception,
			String headerValidationMessage, String footerValidationMessage) {
		linkbody.append("<div class='list'>");
		linkbody.append("<div>");
		if (status.equalsIgnoreCase("Pass")) {
			linkbody.append("<img src = 'img/pass.png' class='logo-table1' alt='Pass'/>");
		} else {
			linkbody.append("<img src = 'img/fail.png' class='logo-table1' alt='Pass' />");
		}
		linkbody.append("</div>");
		linkbody.append("<div class='text_sec' style='flex: auto;'>\r\n"
				+ "									<div class='list_heading1'>\r\n"
				+ "										<div>" + linkurl + "</div>\r\n"
				+ "										<div class=\"error__style\"></div>\r\n");
//		if (Integer.valueOf(responseCode) >= 400 || Integer.valueOf(responseCode) == 0) {
//			if (Integer.valueOf(responseCode) == 0) {
//				linkbody.append(
//						"							<div class=\"error__style\"><span class='legend1'><img src='img/fail.png' class='logo-table' alt='Fail'></span> Response Code: Error getting response</div>");
//			} else {
//				linkbody.append(
//						"							<div class=\"error__style\"><span class='legend1'><img src='img/fail.png' class='logo-table' alt='Fail'></span> Response Code:"
//								+ responseCode + "</div>");
//			}
//		} else {
//			linkbody.append(
//					"								<div class=\"error__style\"><span class='legend1'><img src='img/pass.png' class='logo-table' alt='Pass'></span> Response Code:"
//							+ responseCode + "</div>");
//		}
		linkbody.append("										<div class=\"error__style\">" + headerValidationMessage
				+ "<br>\r\n" + "										<div class=\"error__style\">"
				+ footerValidationMessage + "<br>\r\n");
//		if(Integer.valueOf(responseCode)>=400 ||Integer.valueOf(responseCode)==0) {
//			if(Integer.valueOf(responseCode)==0) {
//			linkbody.append( "							<span class='legend1'><img src='img/fail.png' class='logo-table' alt='Fail'></span> Response Code: Error getting response");
//			}
//			else {
//				linkbody.append( "							<span class='legend1'><img src='img/fail.png' class='logo-table' alt='Fail'></span> Response Code:" + responseCode);
//			}
//		}else {
//		linkbody.append( "								<span class='legend1'><img src='img/pass.png' class='logo-table' alt='Pass'></span> Response Code:" + responseCode);
//		}
		if (status.equalsIgnoreCase("Fail")) {
			linkbody.append("<div class=\"error__style\">");
			if (exception != "") {
				linkbody.append("Exception:" + exception);
			}
			linkbody.append("<img\r\n" + "src=\"" + screenshotFilePath + "\"\r\n" + "	alt='Screenshot_icon'\r\n"
					+ "style=\"width: 100%; height: 400px; border: 1px solid #ddd; border-radius: 4px; padding: 5px;\" /></div>");
		}

		linkbody.append("</div>\r\n" + "</div>\r\n"
				+ "								</div>");
		linkbody.append("</div></div>");
	}

	public void failedCheckBox() {
		failedCheckBox.append("<script>\r\n function filterFailed() {\r\n"
				+ "     const checkbox = document.getElementById('filterCheckbox');\r\n"
				+ "     const passedItems = document.querySelectorAll('[status=\"true\"]');\r\n"
				+ "     passedItems.forEach(item => {\r\n"
				+ "       item.style.display = checkbox.checked ? 'none' : '';\r\n" + "     });\r\n"
				+ "   }</script>\r\n<br><br><label>\r\n"
				+ "<input type=\"checkbox\" id=\"filterCheckbox\" onclick=\"filterFailed()\"> Show Failed Links\r\n"
				+ "</label>");
	}

	public void linkbodyLatestResponse(String status, String linkurl, String responseCode, String errorMessage) {
		boolean flag = false;
		if (status.equalsIgnoreCase("Pass")) {
			flag = true;
		}
		linkbody.append("<div class='list' status=\"" + flag + "\">");
		linkbody.append("<div>");
		if (status.equalsIgnoreCase("Pass")) {
			linkbody.append("<img src = 'img/pass.png' class='logo-table1' alt='Pass'/>");
		} else {
			linkbody.append("<img src = 'img/fail.png' class='logo-table1' alt='Pass' />");
		}
		linkbody.append("</div>");
		linkbody.append("<div class='text_sec' style='flex: auto;'>\r\n"
				+ "									<div class='list_heading1'>\r\n"
				+ "										<div>" + linkurl + "</div>\r\n");
		if (Integer.valueOf(responseCode) == 0) {
			linkbody.append(
					"										<div class=\"error__style\"> Response Code: Error getting response</div>\r\n");
		} else {
			linkbody.append("										<div class=\"error__style\"> Response Code: "
					+ responseCode + "</div>\r\n");
		}
		if (errorMessage != "") {
			linkbody.append("										<div class=\"error__style\"> Error Message: "
					+ errorMessage + "</div>\r\n");
		}
		linkbody.append("									</div>\r\n" + "								</div>");
		linkbody.append("</div>");
	}

	public void reportGenResponse() {
		pieChartBody();
		failedCheckBox();
		File file = new File(reportPath + File.separator + "BrokenLinkReport.html");
		String newtext;
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

			String line = "", oldtext = "";
			while ((line = reader.readLine()) != null) {
				oldtext += line + "\r\n";
			}
			reader.close();
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh.mm.ss aa");
			String dateString = dateFormat.format(new Date()).toString();
			newtext = oldtext.replace("{ExecutedBy}", username);
			newtext = newtext.replace("{ExecutedOn}", dateString);
			// Count and percentage for graph
			newtext = newtext.replace("{Application Url}", getApplicationurl());
			newtext = newtext.replace("{Pages}", getTotalPages());
			newtext = newtext.replace("{Links}", getScannedlinkCount());
			newtext = newtext.replace("{passcount}", getTotalPasscount());
			newtext = newtext.replace("{failcount}", getTotalFailcount() + failedCheckBox);
			newtext = newtext.replace("{pagebody}", Pagebody);

			newtext = newtext.replace("{piechartBody}", piechartbody);
			try (FileWriter writer = new FileWriter(reportPath + File.separator + "BrokenLinkReport.html")) {
				writer.write(newtext);
				writer.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
