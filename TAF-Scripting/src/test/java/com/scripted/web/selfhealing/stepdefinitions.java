package com.scripted.web.selfhealing;

import java.util.LinkedHashMap;
import java.util.Map;

import com.scripted.generic.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import com.scripted.Allure.AllureListener;
import com.scripted.PDF.CucumberPDF;
import com.scripted.configurations.SkriptmateConfigurations;
import com.scripted.dataload.ExcelConnector;
import com.scripted.dataload.PropertyDriver;
import com.scripted.dataload.TestDataFactory;
import com.scripted.dataload.TestDataObject;
import com.scripted.pageobjects.NewPage1;
import com.scripted.web.BrowserDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

@Listeners({ AllureListener.class })
public class stepdefinitions {
//	public static WebDriver driver = null;
	WebDriver driver;
	NewPage1 objLoginPage;
	public static Map<String, String> fAutoRow;
	PropertyDriver propDriver = new PropertyDriver();
	private static Map<String, String> configMap;

	@Before("@Excel")
	public void setupExcelData() {	
		String filename = FileUtils.getCurrentDir() + "src/main/resources/DataFiles/Excel/TestDataAutomationPrac.xlsx";
		String sheetname = "TC001";
		String key = "";
		ExcelConnector con = new ExcelConnector(filename, sheetname);
		TestDataFactory test = new TestDataFactory();
		TestDataObject obj = test.GetData(key, con);
		LinkedHashMap<String, Map<String, String>> getAllData = obj.getTableData();
		fAutoRow = (getAllData.get("1"));

	}

	@Before("@saucedemo")
	public void invokeBrowser() {
//		configMap = SkriptmateConfigurations.readConf();
//		BrowserDriver.getCuPalDriver();
//		driver = BrowserDriver.getDriver();
	}

	@Given("I am on the login page")
	public void saveMART1() throws Throwable {

//		objLoginPage = PageFactory.initElements(BrowserDriver.getDriver(), NewPage1.class);
//		BrowserDriver.launchWebURL("https://www.saucedemo.com/");
		
	}

	@When("I login with username and password")
	public void user_pass() throws Throwable {
//		objLoginPage.login("standard_user", "secret_sauce");

	}

	@Then("User add product to the cart")
	public void add_product() {
//		objLoginPage.add_Product();

	}

	@When("User checkout from the cart")
	public void check_out() {
//		objLoginPage.check_out();

	}

	@After("@saucedemo")
	public void after(Scenario scenario) {
		
//        System.out.println("-----------------------------------------");
//        System.out.println("Completed Scenario with tags -> ");
//        scenario.getSourceTagNames().stream().forEach(System.out::println);
//        System.out.println("-----------------------------------------");    
	}
	
}
