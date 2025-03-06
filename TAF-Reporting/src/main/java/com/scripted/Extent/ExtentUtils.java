package com.scripted.Extent;
 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
 
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
 
import org.apache.commons.configuration2.AbstractConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.*;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
 
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.observer.entity.MediaEntity.MediaEntityBuilder;
 
@SuppressWarnings("unused")
public class ExtentUtils {
	private static ExtentReports extent;
	public static ExtentTest test;
	private static String cdir = System.getProperty("user.dir");
	public static String timeStamp = "";
	public static Logger LOGGER = LogManager.getLogger(ExtentUtils.class);
 
	static ExtentSparkReporter spark;
 
	/**
	 * ************* Function to declare extent config
	 *
	 * @throws Exception *************
	 */
	public static void setExtentConfig() throws Exception {
		try {
 
			// Specify the report location
//			timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
//			htmlReporter = new ExtentHtmlReporter(
//					System.getProperty("user.dir") + "/SkriptmateReport/Extent/" + timeStamp + "/Skripmatereport.html");
 
//			htmlReporter.loadXMLConfig(System.getProperty("user.dir") + "/test-output/config.xml");
//			htmlReporter.loadXMLConfig(System.getProperty("user.dir") + "/src/main/resources/extent-config.xml");
 
			spark = new ExtentSparkReporter(
					System.getProperty("user.dir") + "/SkriptmateReport/Extent/" + timeStamp + "/Skripmatereport.html");
			extent = new ExtentReports();
			extent.attachReporter(spark);
 
			// Passing General information
			extent.setSystemInfo("OS Name", System.getProperty("os.name"));
			extent.setSystemInfo("User Name", System.getProperty("user.name"));
			extent.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
			extent.setSystemInfo("Host name", "Spartans");
			extent.setSystemInfo("Environemnt", "QA");
 
		} catch (Exception e1) {
			e1.printStackTrace();
			LOGGER.error("Error while setting extent configuration" + e1);
		}
 
	}
 
	/**
	 * ************* Function to close extent stream *************
	 */
	public static void closeExtent() {
		extent.flush();
	}
 
	/**
	 * ************* Function to set step as pass *************
	 *
	 * @param message
	 */
	public static void eStepPass(String message) {
		test.log(Status.PASS, MarkupHelper.createLabel(message, ExtentColor.GREEN));
	}
 
	/**
	 * ************* Function to set step as info *************
	 *
	 * @param message
	 */
	public static void eStepInfo(String message) {
		test.log(Status.INFO, MarkupHelper.createLabel(message, ExtentColor.CYAN));
	}
 
	/**
	 * ************* Function to set step as fail *************
	 *
	 * @param message
	 */
	public static void addStepScreenshot(String message, Media media) {
		test.log(Status.FAIL, MarkupHelper.createLabel(message, ExtentColor.RED));
 
	}
 
	/**
	 * Function to set step as skip
	 *
	 * @param message
	 */
	public static void eStepSkip(String message) {
		test.log(Status.SKIP, MarkupHelper.createLabel(message, ExtentColor.TEAL));
	}
 
	/**
	 * Function to set step as fail
	 *
	 * @param message
	 */
	public static void eStepFail(String message) {
		test.log(Status.FAIL, MarkupHelper.createLabel(message, ExtentColor.RED));
	}
 
	/**
	 * ************* Function to set step as debug *************
	 *
	 * @param message
	 */
	public static void eStepDebug(String message) {
		test.log(Status.WARNING, MarkupHelper.createLabel(message, ExtentColor.ORANGE));
 
	}
 
	/**
	 * ************* Function to create test *************
	 *
	 * @param testName
	 */
	public static void eCreateTest(String testName) {
		test = extent.createTest(testName);
		ExtentListener.setTestObject(test);
	}
 
	/**
	 * ************* Function to create test step *************
	 *
	 * @param stepName
	 */
	public static void eCreateStep(String stepName) {
		test.createNode(stepName);
	}
 
	public static void setSparkExtentPropValue(String extentPropFilePath) throws Exception {
		try {
			Configurations configs = new Configurations();
			Configuration baseConfig = configs.properties(new File(extentPropFilePath));
			Configuration subConfig = new PropertiesConfiguration();
			timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm").format(new Date());
			System.out.println(timeStamp);
			Thread.sleep(2000);
			String reportFolder = "./SkriptmateReport/Extent/";
			com.scripted.generic.FileUtils.makeDirs(reportFolder);
			subConfig.addProperty("extent.reporter.spark.out", reportFolder + timeStamp + "/" + "Extent_Report");
			subConfig.addProperty("screenshot.dir", reportFolder + timeStamp + "/" + "spark/screenshots/");
			subConfig.addProperty("screenshot.rel.path", "./spark/screenshots/");
			((AbstractConfiguration) subConfig).append(baseConfig);
 
//			org.apache.commons.configuration.PropertiesConfiguration conf = new org.apache.commons.configuration.PropertiesConfiguration(extentPropFilePath);
//			timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm").format(new Date());
//			System.out.println(timeStamp);
//			Thread.sleep(2000);
//			String reportFolder = "./SkriptmateReport/Extent/";
//			com.scripted.generic.FileUtils.makeDirs(reportFolder);
//			conf.setProperty("extent.reporter.spark.out", reportFolder + timeStamp +"/"+ "Extent_Report");
//			conf.setProperty("screenshot.dir", reportFolder + timeStamp +"/"+ "spark/screenshorts/");
//			conf.setProperty("screenshot.rel.path",  "./spark/screenshorts/");
//			conf.save();
		} catch (Exception e1) {
			e1.printStackTrace();
			LOGGER.error("Error while setting extent property values" + e1);
		}
	}
 
	public static String getTimeStamp() {
		return timeStamp;
	}
	public static void copyExtentLogo() throws Exception {
		try {
			File f1 = new File(cdir + "/src/main/resources/Reporting/Artefacts/Logo.png");
			File f2 = new File(cdir + "/SkriptmateReport/Extent/" + timeStamp + "/Logo.png");
			FileUtils.copyFile(f1, f2);
			File f3 = new File(cdir + "/SkriptmateReport/Extent/Report.html");
			File f4 = new File(cdir + "/SkriptmateReport/Extent/" + timeStamp + File.separator + timeStamp + "_Report.html");
			FileUtils.copyFile(f3, f4);
		} catch (Exception e1) {
			e1.printStackTrace();
			LOGGER.error("Error while copy extent logo" + e1);
		}
	}
	public static void copyExtentLogoAndScreenshots(String extentPropFilePath) {
		try {
			File f1 = new File(cdir + "/src/main/resources/Reporting/Artefacts/Logo.png");
			File f2 = new File(cdir + "/SkriptmateReport/Extent/" + timeStamp + "/Logo.png");
			FileUtils.copyFile(f1, f2);
			File f3 = new File(cdir + "/SkriptmateReport/Extent/Artefacts/Extent_Report.html");
			File f4 = new File(
					cdir + "/SkriptmateReport/Extent/" + timeStamp + File.separator + timeStamp + "_Report.html");
			if (f3.exists()) {
				FileUtils.moveFile(f3, f4);
			}			
			Configurations configs = new Configurations();
			Configuration baseConfig = configs.properties(new File(extentPropFilePath));
			if (!baseConfig.getProperty("extent.reporter.spark.base64imagesrc").equals("true")) {
				File f5 = new File(cdir + "/SkriptmateReport/Extent/Artefacts/spark");
				File f6 = new File(cdir + "/SkriptmateReport/Extent/" + timeStamp + File.separator + "spark");
				if (f5.exists()) {
					FileUtils.moveDirectory(f5, f6);
				}
			}
			File artefactsFile = new File(cdir + "/SkriptmateReport/Extent/Artefacts");
			FileUtils.deleteDirectory(artefactsFile);
		} catch (Exception e1) {
			e1.printStackTrace();
			LOGGER.error("Error while copying extent logo" + e1);
		}
	}
}