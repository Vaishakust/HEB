package com.scripted.web;

import java.io.File;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.paulhammant.ngwebdriver.NgWebDriver;
import com.scripted.dataload.PropertyDriver;
import com.scripted.license.VerifyKey;

public class BrowserDriver {
	public static String BrowserDriver = null;
	public static WebDriver driver = null;
	public static ThreadLocal<RemoteWebDriver> thDriver = new ThreadLocal<RemoteWebDriver>();
	public static ThreadLocal<WebDriver> lthDriver = new ThreadLocal<>();
	public static String strBrowserName = null;
	public static String strBrowserVersion = null;
	public static boolean strenableVideo;
	public static boolean strrecordVideo;
	public static boolean strenableVNC;
	public static String strhostURL = null;
	public static String strBrowserNameAndVersion = null;
	public static Logger LOGGER = LogManager.getLogger(BrowserDriver.class);
	public static String url = null;
	
	public static String buildID = System.getProperty("buildId");

	static ArrayList<String> groupList;
	public static void funcGetWebdriver(ArrayList<String> grpNames){

		groupList = grpNames;
		funcGetWebdriver();
	}



	@SuppressWarnings("static-access")
	public static String getAccelerator(){
		PropertyDriver propertyAcc = new PropertyDriver();
		propertyAcc.setPropFilePath("src/main/resources/Web/Properties/Browser.properties");

		String[] ACCarr = propertyAcc.readProp("taf.acc.list").split(",");

		for (String st : ACCarr){
			for (String st2 : groupList){
				if (st.equalsIgnoreCase(st2)){

					if(Boolean.parseBoolean(propertyAcc.readProp("acc."+st))){
						System.out.println(st);
						return st;
					}
				}
			}
		}
		System.out.println("SEL ##");
		return "SEL";
	}
	
	public static WebDriver funcGetWebdriver() {
		try {
//			VerifyKey obj = new VerifyKey();
//			if (obj.verifyexpiry()) {

				PropertyDriver p = new PropertyDriver();
				if (driver == null) {
					p.setPropFilePath("src/main/resources/Web/Properties/Browser.properties");
					strBrowserName = PropertyDriver.readProp("browserName");
				}
				if (strBrowserName == null || strBrowserName.equals(" ")) {
					LOGGER.info("Browser name is null, please check the value of browserName in config.properties");
					System.exit(0);
				} else {
					LOGGER.info("Browser : " + strBrowserName);
					strBrowserName = strBrowserName.toLowerCase();

					switch (strBrowserName) {

					case "chrome":
						ChromeSettings chromeSettings = new ChromeSettings();
						driver = new ChromeDriver(chromeSettings.setBychromeOptions(PropertyDriver.getFilePath()));
						break;

					case "ie":
						IExplorerSettings iExplorerSettings = new IExplorerSettings();
						driver = new InternetExplorerDriver(iExplorerSettings.setByIExplorerOptions(PropertyDriver.getFilePath()));
						break;

					case "firefox":
						FireFoxSettings fireFoxSettings = new FireFoxSettings();
						driver = new FirefoxDriver(fireFoxSettings.setByFirefoxOptions(PropertyDriver.getFilePath()));
						break;

					case "edge":

						MsEdgeSettings MsEdgeSettings = new MsEdgeSettings();
						MsEdgeSettings.setByMsEdgeOptions(PropertyDriver.getFilePath());
						driver = new EdgeDriver();
						break;
					}
				}

			//}
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("Error occurred while configuring webdrivers" + "Exception :" + e);
			Assert.fail("Webdriver initialisation issues" + "Exception :" + e);
			Thread.currentThread().interrupt();
		}
		if (driver != null) {
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
			driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(60));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		return driver;
	}
	
	@SuppressWarnings({ "unused" })
	public static WebDriver funcGetNgWebdriver() {
		try {
			PropertyDriver p = new PropertyDriver();
			VerifyKey obj = new VerifyKey();
			if (obj.verifyexpiry()) {
				if (driver == null) {
					p.setPropFilePath("src/main/resources/Web/Properties/Browser.properties");
					strBrowserName = PropertyDriver.readProp("browserName");
				}
				if (strBrowserName == null || strBrowserName.equals(" ")) {
					LOGGER.info("Browser name is null, please check the value of browserName in config.properties");
					System.exit(0);
				} else {
					LOGGER.info("Browser : " + strBrowserName);
					strBrowserName = strBrowserName.toLowerCase();

					switch (strBrowserName) {

					case "chrome":
						ChromeSettings chromeSettings = new ChromeSettings();
						driver = new ChromeDriver(chromeSettings.setBychromeOptions(PropertyDriver.getFilePath()));
						break;

					case "ie":
						IExplorerSettings iExplorerSettings = new IExplorerSettings();
						driver = new InternetExplorerDriver(iExplorerSettings.setByIExplorerOptions(PropertyDriver.getFilePath()));
						break;

					case "firefox":
						FireFoxSettings fireFoxSettings = new FireFoxSettings();
						driver = new FirefoxDriver(fireFoxSettings.setByFirefoxOptions(PropertyDriver.getFilePath()));
						break;

					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("Error occurred while configuring webdrivers" + "Exception :" + e);
			Assert.fail("Webdriver initialisation issues" + "Exception :" + e);
			Thread.currentThread().interrupt();
		}
		if (driver != null) {
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
			driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(60));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			JavascriptExecutor jsdriver = (JavascriptExecutor) driver;
			NgWebDriver ngdriver = new NgWebDriver(jsdriver);
		}
		return driver;
	}

	public static void launchWebURL(String strURL) {
		try {
			
			getDriver().get(strURL);
			url = strURL;
			pageWait();
			LOGGER.info("Application launched successfully");
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("Error occurred while launching Web URL" + "Exception :" + e);
			Assert.fail("Error occurred while launching Web URL" + "Exception :" + e);
		}
	}

	public static void closeBrowser() {
		try {
			getDriver().close();
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("Error occurred while closing browser" + "Exception :" + e);
			Assert.fail("Error occurred while closing browser" + "Exception :" + e);
		}
	}

	public static void quitBrowser() {
		try {
			getDriver().quit();
			driver = null;
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("Error occurred while quit browser" + "Exception :" + e);
			Assert.fail("Error occurred while quit browser" + "Exception :" + e);
		}
	}

	public static WebDriver getDriver() {
		if (driver == null) {
			if (thDriver.get() != null) {
				WebDriver rmDriver = thDriver.get();
				return rmDriver;
			} else {
				WebDriver lDriver = lthDriver.get();
				return lDriver;
			}
		} else {
			return driver;
		}
	}

	public static ThreadLocal<WebDriver> getlthDriver() {
		return lthDriver;
	}

	public static void pageWait() {
		try {
			getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
			getDriver().manage().timeouts().scriptTimeout(Duration.ofSeconds(60));
			getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("Error occurred while page wait" + "Exception :" + e);
			Assert.fail("Error occurred while page wait" + "Exception :" + e);
		}
	}

	public static WebDriver funcSelenoidWebdriver() {
		try {
			PropertyDriver p = new PropertyDriver();

			if (driver == null) {
				p.setPropFilePath("src/main/resources/Web/Properties/Selenoid.properties");
				strBrowserName = PropertyDriver.readProp("browserName");
				strBrowserVersion = PropertyDriver.readProp("browserVersion");
				strenableVideo = Boolean.valueOf(PropertyDriver.readProp("enableVideo"));
				strenableVNC = Boolean.valueOf(PropertyDriver.readProp("enableVNC"));
				strhostURL = PropertyDriver.readProp("hostURL");
			}
			if (strBrowserName == null || strBrowserName.equals(" ")) {
				LOGGER.info("Browser name is null, please check the value of browserName in config.properties");
				System.exit(0);
			} else {
				LOGGER.info("Browser : " + strBrowserName);
				strBrowserName = strBrowserName.toLowerCase();
                 
				ChromeOptions dcap = new ChromeOptions();
				//DesiredCapabilities dcap = DesiredCapabilities.chrome();
				dcap.setCapability("enableVideo", strenableVideo);
				dcap.setCapability("enableVNC", strenableVNC);
				URL url = new URL(strhostURL);

				switch (strBrowserName) {

				case "chrome":
					driver = new RemoteWebDriver(url, dcap);
					break;

				case "ie":
					driver = new RemoteWebDriver(url, dcap);
					break;

				case "firefox":
					driver = new RemoteWebDriver(url, dcap);
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("Error occurred while configuring webdrivers" + "Exception :" + e);
			Assert.fail("Webdriver initialisation issues" + "Exception :" + e);
		}

		if (driver != null) {
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
			driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(60));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		return driver;
	}
	
	public static WebDriver getSelenoidDriverParallel(String browser, String version) {
		try {

			URL url = null;
			PropertyDriver p = new PropertyDriver();
			p.setPropFilePath("src/main/resources/Web/Properties/Selenoid.properties");
			Boolean strenableVideo = Boolean.valueOf(PropertyDriver.readProp("enableVideo"));
			Boolean strenableVNC = Boolean.valueOf(PropertyDriver.readProp("enableVNC"));
			String strhostURL = PropertyDriver.readProp("hostURL");

			switch (browser) {
			case "chrome":
				DesiredCapabilities cCaps = new DesiredCapabilities();
				ChromeOptions cOptions = new ChromeOptions();
				cOptions.setCapability("enableVideo", strenableVideo);
				cOptions.setCapability("enableVNC", strenableVNC);
				cCaps.setBrowserName(browser);
				cCaps.setVersion(version);
				cCaps.setCapability(ChromeOptions.CAPABILITY, cOptions);
				url = new URL(strhostURL);
				driver = new RemoteWebDriver(url, cCaps);
				break;

			case "ie":
				IExplorerSettings iExplorerSettings = new IExplorerSettings();
				driver = new InternetExplorerDriver(iExplorerSettings.setByIExplorerOptions(PropertyDriver.getFilePath()));
				break;

			case "firefox":
				DesiredCapabilities fCaps = new DesiredCapabilities();
				FirefoxOptions fOptions = new FirefoxOptions();
				fOptions.setCapability("enableVideo", strenableVideo);
				fOptions.setCapability("enableVNC", strenableVNC);
				fCaps.setBrowserName(browser);
				fCaps.setVersion(version);
				fCaps.setCapability(FirefoxOptions.FIREFOX_OPTIONS, fOptions);
				url = new URL(strhostURL);
				driver = new RemoteWebDriver(url, fCaps);
				break;

			case "opera":
				DesiredCapabilities oCaps = new DesiredCapabilities();
				// OperaOptions oOptions = new OperaOptions();
				oCaps.setCapability("enableVideo", strenableVideo);
				oCaps.setCapability("enableVNC", strenableVNC);
				oCaps.setBrowserName(browser);
				oCaps.setVersion(version);
				url = new URL(strhostURL);
				driver = new RemoteWebDriver(url, oCaps);
				break;
			}
			if (driver != null) {
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
				driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(60));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			}

		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("Error occurred while configuring webdrivers" + "Exception :" + e);
			Assert.fail("Webdriver initialisation issues" + "Exception :" + e);
		}
		return driver;
	}

	
	public static WebDriver getSelenoidDriverSeq(String browser, String browserVersion) {
		try {

			URL url = null;
			PropertyDriver p = new PropertyDriver();
			if (driver == null) {
				p.setPropFilePath("src/main/resources/Web/Properties/Selenoid.properties");

				strBrowserNameAndVersion = PropertyDriver.readProp("browserNameAndVersion");
				strBrowserName = browser;
				strBrowserVersion = browserVersion;
				strenableVideo = Boolean.valueOf(PropertyDriver.readProp("enableVideo"));
				strenableVNC = Boolean.valueOf(PropertyDriver.readProp("enableVNC"));
				strhostURL = PropertyDriver.readProp("hostURL");
			}
			if (strBrowserName == null || strBrowserName.equals(" ")) {
				LOGGER.info("Browser name is null, please check the value of browserName in config.properties");
				System.exit(0);
			} else {
				LOGGER.info("Browser : " + strBrowserName);
				strBrowserName = strBrowserName.toLowerCase();

				switch (browser) {
				case "chrome":
					DesiredCapabilities cCaps = new DesiredCapabilities();
					ChromeOptions cOptions = new ChromeOptions();
					cOptions.setCapability("enableVideo", strenableVideo);
					cOptions.setCapability("enableVNC", strenableVNC);
					cCaps.setBrowserName(strBrowserName);
					cCaps.setVersion(strBrowserVersion);
					cCaps.setCapability(ChromeOptions.CAPABILITY, cOptions);
					url = new URL(strhostURL);
					driver = new RemoteWebDriver(url, cCaps);
					break;

				case "ie":
					IExplorerSettings iExplorerSettings = new IExplorerSettings();
					driver = new InternetExplorerDriver(iExplorerSettings.setByIExplorerOptions(PropertyDriver.getFilePath()));
					break;

				case "firefox":
					DesiredCapabilities fCaps = new DesiredCapabilities();
					FirefoxOptions fOptions = new FirefoxOptions();
					fOptions.setCapability("enableVideo", strenableVideo);
					fOptions.setCapability("enableVNC", strenableVNC);
					fCaps.setBrowserName(strBrowserName);
					fCaps.setVersion(strBrowserVersion);
					fCaps.setCapability(FirefoxOptions.FIREFOX_OPTIONS, fOptions);
					url = new URL(strhostURL);
					driver = new RemoteWebDriver(url, fCaps);
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("Error occurred while configuring webdrivers" + "Exception :" + e);
			Assert.fail("Webdriver initialisation issues" + "Exception :" + e);
		}

		if (driver != null) {
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
			driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(60));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		return driver;
	}

	public static WebDriver getZaleniumDriverParallel(String browser, String version) {
		try {
			VerifyKey obj = new VerifyKey();
			if (obj.verifyexpiry()) {
				URL url = null;
				PropertyDriver p = new PropertyDriver();
				p.setPropFilePath("src/main/resources/Web/Properties/Zalenium.properties");
				Boolean strenableVideo = Boolean.valueOf(PropertyDriver.readProp("enableVideo"));
				Boolean strrecordVideo = Boolean.valueOf(PropertyDriver.readProp("recordVideo"));
				Boolean strenableVNC = Boolean.valueOf(PropertyDriver.readProp("enableVNC"));
				String strhostURL = PropertyDriver.readProp("hostURL");

				switch (browser) {
				case "chrome":
					DesiredCapabilities cCaps = new DesiredCapabilities();
					ChromeOptions cOptions = new ChromeOptions();
					cOptions.setCapability("enableVideo", strenableVideo);
					cOptions.setCapability("recordVideo", strrecordVideo);
					cOptions.setCapability("enableVNC", strenableVNC);
					cCaps.setBrowserName(browser);
					cCaps.setVersion(version);
					cCaps.setCapability(ChromeOptions.CAPABILITY, cOptions);
					url = new URL(strhostURL);
					thDriver.set(new RemoteWebDriver(url, cCaps));
					break;

				case "ie":
					IExplorerSettings iExplorerSettings = new IExplorerSettings();
					driver = new InternetExplorerDriver(iExplorerSettings.setByIExplorerOptions(PropertyDriver.getFilePath()));
					break;

				case "firefox":
					DesiredCapabilities fCaps = new DesiredCapabilities();
					FirefoxOptions fOptions = new FirefoxOptions();
					fOptions.setCapability("enableVideo", strenableVideo);
					fOptions.setCapability("recordVideo", strrecordVideo);
					fOptions.setCapability("enableVNC", strenableVNC);
					fCaps.setBrowserName(browser);
					fCaps.setVersion(version);
					fCaps.setCapability(FirefoxOptions.FIREFOX_OPTIONS, fOptions);
					url = new URL(strhostURL);
					thDriver.set(new RemoteWebDriver(url, fCaps));
					break;

				case "opera":
					DesiredCapabilities oCaps = new DesiredCapabilities();
					oCaps.setCapability("enableVideo", strenableVideo);
					oCaps.setCapability("recordVideo", strrecordVideo);
					oCaps.setCapability("enableVNC", strenableVNC);
					oCaps.setBrowserName(browser);
					oCaps.setVersion(version);
					url = new URL(strhostURL);
					thDriver.set(new RemoteWebDriver(url, oCaps));
					break;
				}
				
				if (getDriver()!= null) {
				getDriver().manage().deleteAllCookies();
				getDriver().manage().window().maximize();
				getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
				getDriver().manage().timeouts().scriptTimeout(Duration.ofSeconds(60));
				getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			}
		 }
		} catch (Exception e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
		return getDriver();
	}

	public static WebDriver getZaleniumDriverSeq(String browser, String browserVersion) {
		try {
			VerifyKey obj = new VerifyKey();
			if (obj.verifyexpiry()) {
				URL url = null;
				PropertyDriver p = new PropertyDriver();
				if (driver == null) {
					p.setPropFilePath("src/main/resources/Web/Properties/Zalenium.properties");

					strBrowserNameAndVersion = PropertyDriver.readProp("browserNameAndVersion");
					strBrowserName = browser;
					strBrowserVersion = browserVersion;
					strenableVideo = Boolean.valueOf(PropertyDriver.readProp("enableVideo"));
					strrecordVideo = Boolean.valueOf(PropertyDriver.readProp("recordVideo"));
					strenableVNC = Boolean.valueOf(PropertyDriver.readProp("enableVNC"));
					strhostURL = PropertyDriver.readProp("hostURL");
				}
				if (strBrowserName == null || strBrowserName.equals(" ")) {
					LOGGER.info("Browser name is null, please check the value of browserName in config.properties");
					System.exit(0);
				} else {
					LOGGER.info("Browser : " + strBrowserName);
					strBrowserName = strBrowserName.toLowerCase();

					switch (browser) {
					case "chrome":
						DesiredCapabilities cCaps = new DesiredCapabilities();
						ChromeOptions cOptions = new ChromeOptions();
						cOptions.setCapability("enableVideo", strenableVideo);
						cOptions.setCapability("recordVideo", strrecordVideo);
						cOptions.setCapability("enableVNC", strenableVNC);
						cCaps.setBrowserName(strBrowserName);
						cCaps.setVersion(strBrowserVersion);
						cCaps.setCapability(ChromeOptions.CAPABILITY, cOptions);
						url = new URL(strhostURL);
						thDriver.set(new RemoteWebDriver(url, cCaps));
						break;

					case "ie":
						IExplorerSettings iExplorerSettings = new IExplorerSettings();
						driver = new InternetExplorerDriver(iExplorerSettings.setByIExplorerOptions(PropertyDriver.getFilePath()));
						break;

					case "firefox":
						DesiredCapabilities fCaps = new DesiredCapabilities();
						FirefoxOptions fOptions = new FirefoxOptions();
						fOptions.setCapability("enableVideo", strenableVideo);
						fOptions.setCapability("recordVideo", strrecordVideo);
						fOptions.setCapability("enableVNC", strenableVNC);
						fCaps.setBrowserName(strBrowserName);
						fCaps.setVersion(strBrowserVersion);
						fCaps.setCapability(FirefoxOptions.FIREFOX_OPTIONS, fOptions);
						url = new URL(strhostURL);
						thDriver.set(new RemoteWebDriver(url, fCaps));
						break;
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("Error occurred while configuring webdrivers" + "Exception :" + e);
			Assert.fail("Webdriver initialisation issues" + "Exception :" + e);
			Thread.currentThread().interrupt();
		}
        if(getDriver()!=null) {
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		getDriver().manage().timeouts().scriptTimeout(Duration.ofSeconds(60));
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        }
		return getDriver();
	}

	public static void getSeleniunGridDriver(String browser) {
		try {
			VerifyKey obj = new VerifyKey();
			if (obj.verifyexpiry()) {
				URL url = null;
				LOGGER.info("Browser : " + browser);
				// LOGGER.info("Version : " + version);
				PropertyDriver p = new PropertyDriver();
				p.setPropFilePath("src/main/resources/Web/Properties/SeleniumGrid.properties");
				String strhostURL = PropertyDriver.readProp("hostURL");

				switch (browser) {
				case "chrome":
					DesiredCapabilities cCaps = new DesiredCapabilities();
					ChromeOptions cOptions = new ChromeOptions();
					cOptions.addArguments("--start-maximized");
					cCaps.setBrowserName(browser);
					cCaps.setCapability(ChromeOptions.CAPABILITY, cOptions);
					url = new URL(strhostURL);
					thDriver.set(new RemoteWebDriver(url, cCaps));
					break;

				case "internet explorer":
					InternetExplorerOptions iCaps = new InternetExplorerOptions();
					iCaps.setCapability(CapabilityType.BROWSER_NAME, browser);
					url = new URL(strhostURL);
					thDriver.set(new RemoteWebDriver(url, iCaps));
					break;

				case "firefox":
					DesiredCapabilities fCaps = new DesiredCapabilities();
					FirefoxOptions fOptions = new FirefoxOptions();
					fCaps.setBrowserName(browser);
					fCaps.setCapability(FirefoxOptions.FIREFOX_OPTIONS, fOptions);
					url = new URL(strhostURL);
					thDriver.set(new RemoteWebDriver(url, fCaps));
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
	}

	@SuppressWarnings({ "unused", "static-access" })
	public static void getCuPalDriver() {
		try {
			VerifyKey obj = new VerifyKey();
			if (obj.verifyexpiry()) {
				URL url = null;
				PropertyDriver p = new PropertyDriver();
				p.setPropFilePath("src/main/resources/Web/Properties/Browser.properties");
				String browser = PropertyDriver.readProp("browserName");
				LOGGER.info("Browser : " + browser);

				switch (browser) {
				case "chrome":
					ChromeSettings chromeSettings = new ChromeSettings();
					lthDriver.set(new ChromeDriver(chromeSettings.setBychromeOptions(PropertyDriver.getFilePath())));
					LOGGER.info("Thread local driver initiated" + lthDriver);
					break;

				case "internet explorer":
					IExplorerSettings iExplorerSettings = new IExplorerSettings();
					lthDriver.set(new InternetExplorerDriver(iExplorerSettings.setByIExplorerOptions(PropertyDriver.getFilePath())));
					LOGGER.info("Thread local driver initiated" + lthDriver);
					break;

				case "firefox":
					FireFoxSettings fireFoxSettings = new FireFoxSettings();
					lthDriver.set(new FirefoxDriver(fireFoxSettings.setByFirefoxOptions(PropertyDriver.getFilePath())));
					LOGGER.info("Thread local driver initiated" + lthDriver);
					break;
				
				
			    case "edge":
				MsEdgeSettings MsEdgeSettings = new MsEdgeSettings();
				MsEdgeSettings.setByMsEdgeOptions(PropertyDriver.getFilePath());
				//driver = new EdgeDriver();
				lthDriver.set(new EdgeDriver(MsEdgeSettings.setByMsEdgeOptions(p.getFilePath())));
				Dimension objdimen = new Dimension(1920, 1080);
				getDriver().manage().window().setSize(objdimen);
				lthDriver.get();
				break;
				}
				if(getDriver()!=null) {
				getDriver().manage().deleteAllCookies();
				getDriver().manage().window().maximize();
				getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
				getDriver().manage().timeouts().scriptTimeout(Duration.ofSeconds(60));
				getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
	}

	public static String getPopup(String message) {
		return "var infoSpan = document.createElement('div');\r\n" + "infoSpan.id = 'infoSpan';\r\n"
				+ "infoSpan.innerHTML = '" + message + "';\r\n" + "var style = document.createElement('style');\r\n"
				+ "style.innerHTML = '#infoSpan {font-family: Arial;font-size: larger;top: 1px;position: absolute;color: #ffffff;background-color: #ff0000;padding: 20px;;width: 1400px;height: 50px;z-index:2000;}';\r\n"
				+ "document.head.appendChild(style);\r\n" + "document.body.appendChild(infoSpan);\r\n";
	}

	public static String setScrnshoterrmsg(String message) {
		try {
			return "var infoSpan = document.createElement('div');\r\n" + "infoSpan.id = 'infoSpan';\r\n"
					+ "infoSpan.innerHTML = '" + message + "';\r\n" + "var style = document.createElement('style');\r\n"
					+ "style.innerHTML = '#infoSpan {font-family: Arial;font-size: larger;top: 1px;position: absolute;color: #ffffff;background-color: #ff0000;padding: 20px;;width: 1400px;height: 50px;z-index:2000;}';\r\n"
					+ "document.head.appendChild(style);\r\n" + "document.body.appendChild(infoSpan);\r\n";
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("Error occurred to set the screen shot error message" + "Exception :" + e);
			Assert.fail("Error occurred to set the screen shot error message" + "Exception :" + e);
		}
		return null;
	}

	public static void launchWebURL_Auth(String strURL, String userName, String password) {
		try {
			strURL = createAuthUrl(strURL, userName, password);
			getDriver().get(strURL);
			pageWait();
			if (!getDriver().getCurrentUrl().equals(strURL)) {
				getDriver().get(strURL);
			}
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("Error occurred while launching Web URL" + "Exception :" + e);
			Assert.fail("Error occurred while launching Web URL" + "Exception :" + e);
		}
	}

	public static String createAuthUrl(String url, String usr, String pwd) throws Exception {
		int p1 = url.indexOf("://");
		String http = "http://";
		String site = "";
		if (p1 != -1) {
			http = url.substring(0, p1) + "://";
			site = url.substring(p1 + 3);
		}
		// return http + usr + ":" + GenericUtils.decryptPass(pwd) + "@" + site;
		return http + usr + ":" + pwd + "@" + site;
	}
	public static void takeScreenshots() throws Exception {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd_HH_mm_ss_SSS");
		Date date = new Date();
		String Dateformat = formatter.format(date);
		TakesScreenshot screenshot = (TakesScreenshot) getDriver();
		// Saving the screenshot in desired location
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		// Path to the location to save screenshot
		FileUtils.copyFile(source, new File("./src/main/resources/Web/Screenshots/" + Dateformat + ".png"));
 
	}
	public static byte[] getCurrentScreenshotAsBytesArray() {
		return ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES);
	}

}
