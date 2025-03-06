
package com.scripted.brokenlink;

import org.openqa.selenium.WebDriver;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.scripted.generic.FileUtils;
import com.scripted.web.BrowserDriver;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.net.Socket;
import java.net.URL;
import java.security.cert.CertificateException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;;

public class BrokenLink {
	static JSONObject resulltObject = new JSONObject();
	static JSONObject brokenObject = new JSONObject();
	static JSONArray pagearray = new JSONArray();
	static String jsonReportName;
	static String jsonpath;
	private static String cdir = System.getProperty("user.dir");
	double Passcount = 0;
	double Failcount = 0;
	static BrokenLinkReport linkinfo = new BrokenLinkReport();
	static String senariostatus;
	public static String scenarioStatusLatest;
	Map<String, String> resultmap = new HashMap<String, String>();
	static int scannedUrlCount = 0;
	static int totalpasscount = 0;
	static int totalfailcount = 0;
	static int pagepasscount = 0;
	static int pagefailcount = 0;
	private static WebDriver driver;

	public BrokenLink(final WebDriver pDriver) {
		driver = pDriver;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	@SuppressWarnings("static-access")
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	@SuppressWarnings({ "unchecked", "unused" })
	public void brokenLinkValidate(String pagename) {
		int linkcount;
		int responseCode = 0;
		int id = 0;
		String scanLinkUrl = null;
		// BrowserDriver.launchWebURL(driver.getCurrentUrl());
		linkinfo.setApplicationurl(driver.getCurrentUrl());
		JSONArray linkarray = new JSONArray();
		try {
			List<WebElement> links = BrowserDriver.getDriver().findElements(By.tagName("a"));
			linkcount = links.size();
			System.out.println("total link count:" + linkcount);
			for (int i = 0; i < links.size(); i++) {

				WebElement ele = links.get(i);
				String linkUrl = ele.getAttribute("href");
				if (linkUrl != null) {
					if (linkUrl.startsWith("http")) {
						id++;
						scanLinkUrl = linkUrl;
						if (linkUrl.contains("#")) {
							linkUrl = linkUrl.replace("#", "%23");
						}
						linkUrl = linkUrl.trim();
						trustAllHosts();
						URL url = new URL(new String(linkUrl));
						url.toURI();
						HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
						httpURLConnect.setConnectTimeout(5000);
						httpURLConnect.connect();
						responseCode = httpURLConnect.getResponseCode();
						if (responseCode >= 400) {
							senariostatus = "Fail";
						} else {
							senariostatus = "Pass";
						}

					}
				}
				if ((linkUrl != null) && !linkUrl.startsWith("javascript")) {
					linkarray.add(generateJsonarray(scanLinkUrl, senariostatus, Integer.toString(responseCode)));

				}
			}
			System.out.println("Brokenlinks is validated in current url");
			resulltObject = writeToJson(pagename, linkarray);
			pagearray.add(resulltObject);
			brokenObject = GenerateReportJson(pagearray);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public static JSONObject GenerateReportJson(JSONArray dataarray) {
		JSONObject MainObject = new JSONObject();
		MainObject.put("BrokenLink Data", dataarray);
		return MainObject;

	}

	@SuppressWarnings("unchecked")
	public static JSONObject writeToJson(String pagename, JSONArray urls) {
		JSONObject Object = new JSONObject();
		Object.put("Pagename", pagename);
		Object.put("PageUrl", pagename);
		Object.put("Urls", urls);
		return Object;

	}
	@SuppressWarnings("unchecked")
	public static JSONObject writeToJsonLatest(String pagename, JSONArray urls) {
		JSONObject Object = new JSONObject();
		Object.put("Pagename", pagename);
		Object.put("PageUrl", pagename);
		Object.put("Urls", urls);
		return Object;

	}
	@SuppressWarnings("unchecked")
	public static JSONObject generateJsonarray(String linkurl, String Status, String responceCode) {
		JSONObject urlobject = new JSONObject();
		urlobject.put("linkurl", linkurl);
		urlobject.put("Status", Status);
		urlobject.put("responseCode", responceCode);
		return urlobject;

	}

	public static void saveJson(JSONObject Object) {
		jsonpathcreate();
		try (FileWriter file = new FileWriter(jsonpath + jsonReportName + ".json")) {

			file.write(Object.toJSONString());
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void jsonpathcreate() {
		DateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss_ms_aa");
		String dateString = dateFormat.format(new Date()).toString();
		jsonReportName = "brokenLinkjsonResults_" + dateString;
		jsonpath = cdir + "/brokenLink-results/";
		com.scripted.generic.FileUtils.makeDirs(jsonpath);
	}

	@SuppressWarnings("static-access")
	public void brokenLinkReportGen() {

		JSONParser jsonParser = new JSONParser();
		int pagecount = 0;
		int urlcount = 0;
		String pageurl;
		String pagename;
		String linkurl;
		String status;
		String responseCode;
		int pagepasscount = 0;
		int pagefailcount = 0;
		try {
			saveJson(brokenObject);
			linkinfo.reportPathCreate();
			FileReader reader = new FileReader(jsonpath + jsonReportName + ".json");
			Object obj = jsonParser.parse(reader);
			JSONObject JsonObj = (JSONObject) obj;
			JSONArray jsonarray = (JSONArray) JsonObj.get("BrokenLink Data");
			pagecount = jsonarray.size();
			for (int i = 0; i < pagecount; i++) {
				linkinfo.linkBodyEmpty();
				pagepasscount = 0;
				pagefailcount = 0;
				pageurl = (String) ((JSONObject) jsonarray.get(i)).get("PageUrl").toString();
				linkinfo.setApplicationurl(pageurl);
				pagename = (String) ((JSONObject) jsonarray.get(i)).get("Pagename").toString();
				JSONArray scanUrls = (JSONArray) ((JSONObject) jsonarray.get(i)).get("Urls");
				urlcount = scanUrls.size();
				for (int j = 0; j < urlcount; j++) {
					scannedUrlCount++;
					linkurl = (String) ((JSONObject) scanUrls.get(j)).get("linkurl").toString();
					status = (String) ((JSONObject) scanUrls.get(j)).get("Status").toString();
					responseCode = (String) ((JSONObject) scanUrls.get(j)).get("responseCode").toString();
					if (status.equalsIgnoreCase("Pass")) {
						pagepasscount++;
						totalpasscount++;
					} else {
						pagefailcount++;
						totalfailcount++;
					}
					linkinfo.linkbody(status, linkurl, responseCode);

				}

				linkinfo.pageBody(pagename, Integer.toString(pagepasscount), Integer.toString(pagefailcount),
						Integer.toString(i));
				linkinfo.CreatePageBody();

			}

			linkinfo.setTotalPages(Integer.toString(pagecount));
			linkinfo.setScannedlinkCount(Integer.toString(scannedUrlCount));
			linkinfo.setTotalPasscount(Integer.toString(totalpasscount));
			linkinfo.setTotalFailcount(Integer.toString(totalfailcount));

			linkinfo.reportGen();
			System.out.println("report generated");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void trustAllHosts() {
		// TODO Auto-generated method stub
		try {
			TrustManager[] trustAllCerts = new TrustManager[] { new X509ExtendedTrustManager() {
				@Override
				public java.security.cert.X509Certificate[] getAcceptedIssuers() {
					return null;
				}

				@Override
				public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType) {
				}

				@Override
				public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType) {
				}

				@Override
				public void checkClientTrusted(java.security.cert.X509Certificate[] xcs, String string, Socket socket)
						throws CertificateException {

				}

				@Override
				public void checkServerTrusted(java.security.cert.X509Certificate[] xcs, String string, Socket socket)
						throws CertificateException {

				}

				@Override
				public void checkClientTrusted(java.security.cert.X509Certificate[] xcs, String string, SSLEngine ssle)
						throws CertificateException {

				}

				@Override
				public void checkServerTrusted(java.security.cert.X509Certificate[] xcs, String string, SSLEngine ssle)
						throws CertificateException {

				}

			} };

			SSLContext sc = SSLContext.getInstance("SSL");
			sc.init(null, trustAllCerts, new java.security.SecureRandom());
			HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

			// Create all-trusting host name verifier
			HostnameVerifier allHostsValid = new HostnameVerifier() {
				@Override
				public boolean verify(String hostname, SSLSession session) {
					return true;
				}
			};
			// Install the all-trusting host verifier
			HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@SuppressWarnings({ "unchecked", "unused" })
	public void brokenLinkExtractXml(String xmlPath) {
		try {
			File xmlFile = new File(xmlPath);
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(xmlFile);
			document.getDocumentElement().normalize();
			NodeList locList = document.getElementsByTagName("loc");
			StringBuilder contentBuilder = new StringBuilder();
			for (int i = 0; i < locList.getLength(); i++) {
				Node locNode = locList.item(i);
				if (locNode.getNodeType() == Node.ELEMENT_NODE) {
					Element locElement = (Element) locNode;
					String url = locElement.getTextContent();
					Pattern fileNamePattern = Pattern.compile("urlmap-([a-zA-Z-]+)\\.xml");
					Matcher fileNameMatcher = fileNamePattern.matcher(url);
					String fileName = "";
					if (fileNameMatcher.find()) {
						fileName = fileNameMatcher.group(1);// From <loc>
					}
					try (FileWriter writer = new FileWriter("src/main/resources/BrokenLink/" + fileName + ".txt")) {
						File subXmlFile = new File("src/main/resources/BrokenLink/" + fileName + ".xml");
						DocumentBuilderFactory subFactory = DocumentBuilderFactory.newInstance();
						DocumentBuilder subBuilder = subFactory.newDocumentBuilder();
						Document subDocument = subBuilder.parse(subXmlFile);
						subDocument.getDocumentElement().normalize();
						NodeList subLocList = subDocument.getElementsByTagName("loc");
						for (int j = 0; j < subLocList.getLength(); j++) {
							Node subLocNode = subLocList.item(j);

							if (subLocNode.getNodeType() == Node.ELEMENT_NODE) {
								Element subLocElement = (Element) subLocNode;
								String subUrl = subLocElement.getTextContent();
								writer.write(subUrl + "\r\n");
							}
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static ArrayList<String> getRoleNameList(WebDriver driver) {

		WebElement scriptElement = driver.findElement(By.id("__JSS_STATE__"));
		String jsonData = scriptElement.getAttribute("innerHTML");

		// Parse the JSON data
		org.json.JSONObject jsonObject = new org.json.JSONObject(jsonData);
		org.json.JSONArray countryRoles = jsonObject.getJSONObject("sitecore").getJSONObject("context")
				.getJSONArray("countryRoles");
		ArrayList<String> roleNameList = new ArrayList<>();
		for (int i = 0; i < countryRoles.length(); i++) {
			org.json.JSONObject role = countryRoles.getJSONObject(i);
			roleNameList.add(role.getString("role"));
		}

		return roleNameList;
	}
	@SuppressWarnings({ "unchecked", "unused" })
	public void brokenLinkValidateLatest(String url, boolean isFailed, String exception, WebDriver driver, boolean header, boolean footer) {
		boolean headerVisible = header;
		boolean footerVisible = footer;
		String footerValidationMessage = "";
		String headerValidationMessage = "";
		int linkcount;
		int id = 0;
		String scanLinkUrl = null;
		JSONArray linkarray = new JSONArray();
		scanLinkUrl = url;
		try {

			if (isValidURL(url)) {
				// Validate URL format
				Request.Builder requestBuilder = new Request.Builder().url(url).method("GET", null);
				StringBuilder cookieHeader = new StringBuilder();
				String screenshotFile = "";
				try {	try {
						Set<Cookie> cookies = driver.manage().getCookies();
						for (Cookie cookie : cookies) {
							cookieHeader.append(cookie.getName()).append("=").append(cookie.getValue()).append("; ");
						}
					} catch (Exception e) {
						isFailed = true;
						exception = e.getMessage();
					}
					if (!footerVisible) {
						footerValidationMessage = "<span class='legend1'><img src='img/fail.png' class='logo-table' alt='Fail'></span> Global footer not present within the footer segment";
					} else {
						footerValidationMessage = "<span class='legend1'><img src='img/pass.png' class='logo-table' alt='Pass'></span> Global footer present within the footer segment";
					}
					if (!headerVisible) {
						headerValidationMessage = "<span class='legend1'><img src='img/fail.png' class='logo-table' alt='Fail'></span> Header not present within the header segment";
					} else {
						headerValidationMessage = "<span class='legend1'><img src='img/pass.png' class='logo-table' alt='Pass'></span> Header present within the header segment";
					}
					if (!headerVisible || !footerVisible || isFailed) {
						System.out.println("Broken link: " + url );
						scenarioStatusLatest = "Fail";
						try {
						TakesScreenshot scrShot = ((TakesScreenshot) driver);
						byte[] screenshot = scrShot.getScreenshotAs(OutputType.BYTES);

						// Save screenshot to a file

						SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
						String timestamp = dateFormat.format(new Date());

						screenshotFile = "./screenshots/screenshot_" + timestamp + ".png";
						FileUtils.makeDirs("screenshots");

						FileOutputStream fos = new FileOutputStream(screenshotFile);
						fos.write(screenshot);
						fos.close();
						}catch(Exception e) {
							System.out.println("Error while taking screenshot");
							screenshotFile="Error while taking screenshot";
						}

					} else {
						System.out.println("Valid link: " + url );
						scenarioStatusLatest = "Pass";
					}

				} catch (Exception e) {
					e.printStackTrace();
					scenarioStatusLatest = "Fail";
					exception = e.getMessage();
					System.out.println("Error checking link: " + url + " (" + e.getMessage() + ")");
					try {
					TakesScreenshot scrShot = ((TakesScreenshot) driver);
					byte[] screenshot = scrShot.getScreenshotAs(OutputType.BYTES);

					// Save screenshot to a file

					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
					String timestamp = dateFormat.format(new Date());

					screenshotFile = "./screenshots/screenshot_" + timestamp + ".png";
					FileUtils.makeDirs("screenshots");

					FileOutputStream fos = new FileOutputStream(screenshotFile);
					fos.write(screenshot);
					fos.close();
					}catch(Exception ex) {
						System.out.println("Error while taking screenshot");
						screenshotFile="Error while taking screenshot";
					}
				}
				if ((url != null) && !url.startsWith("javascript")) {
					linkarray.add(
							generateJsonarrayLatest(scanLinkUrl, scenarioStatusLatest,
									screenshotFile, exception, headerValidationMessage, footerValidationMessage));

				}
			}
			System.out.println("Brokenlinks is validated in current url");
			resulltObject = writeToJsonLatest(url, linkarray);
			pagearray.add(resulltObject);
			brokenObject = GenerateReportJson(pagearray);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private boolean isValidURL(String urlStr) {
		try {
			new URL(urlStr);
			return true;
		} catch (MalformedURLException e) {
			System.out.println("Malformed URL");
			return false;
		}
	}
	@SuppressWarnings("static-access")
	public void brokenLinkReportGenLatest(String mapUrl) {
		JSONParser jsonParser = new JSONParser();
		int pagecount = 0;
		String pageurl;
		String pagename;
		String linkurl;
		String status;
		String screenshotFilePath;
		String exception;
		String headerValidationMessage;
		String footerValidationMessage;

		try {
			saveJson(brokenObject);
			linkinfo.setApplicationurl(mapUrl);
			linkinfo.reportPathCreateLatest();
			FileReader reader = new FileReader(jsonpath + jsonReportName + ".json");
			Object obj = jsonParser.parse(reader);
			JSONObject JsonObj = (JSONObject) obj;
			JSONArray jsonarray = (JSONArray) JsonObj.get("BrokenLink Data");
			pagecount = jsonarray.size();
			for (int i = 0; i < pagecount; i++) {
				linkinfo.linkBodyEmpty();
				boolean isPassed = false;
				pageurl = (String) ((JSONObject) jsonarray.get(i)).get("PageUrl").toString();
				linkinfo.setApplicationurl(pageurl);
				pagename = (String) ((JSONObject) jsonarray.get(i)).get("Pagename").toString();
				JSONArray scanUrls = (JSONArray) ((JSONObject) jsonarray.get(i)).get("Urls");
				scannedUrlCount++;
				if (scanUrls.size() > 0) {
					linkurl = (String) ((JSONObject) scanUrls.get(0)).get("linkurl").toString();
					status = (String) ((JSONObject) scanUrls.get(0)).get("Status").toString();
					screenshotFilePath = (String) ((JSONObject) scanUrls.get(0)).get("screenshotFile").toString();
					exception = (String) ((JSONObject) scanUrls.get(0)).get("exception").toString();
					headerValidationMessage = (String) ((JSONObject) scanUrls.get(0)).get("headerValidationMessage")
							.toString();
					footerValidationMessage = (String) ((JSONObject) scanUrls.get(0)).get("footerValidationMessage")
							.toString();

					if (status.equalsIgnoreCase("Pass")) {
						isPassed = true;
						totalpasscount++;
					} else {
						totalfailcount++;
					}
					linkinfo.linkbodyLatest(status, linkurl, screenshotFilePath, exception,
							headerValidationMessage, footerValidationMessage);

					linkinfo.pageBodyLatest(pagename, isPassed, Integer.toString(i));
					linkinfo.CreatePageBody();
				}

			}

			linkinfo.setTotalPages(Integer.toString(pagecount));
			linkinfo.setScannedlinkCount(Integer.toString(scannedUrlCount));
			linkinfo.setTotalPasscount(Integer.toString(totalpasscount));
			linkinfo.setTotalFailcount(Integer.toString(totalfailcount));

			linkinfo.reportGenLatest();
			System.out.println("report generated");
			FileUtils.deleteDirectory(new File(FileUtils.getCurrentDir() + "/screenshots"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@SuppressWarnings("unchecked")
	public static JSONObject generateJsonarrayLatest(String linkurl, String Status,
			String screenshotFilePath, String exception, String headerValidationMessage,
			String footerValidationMessage) {
		JSONObject urlobject = new JSONObject();
		urlobject.put("linkurl", linkurl);
		urlobject.put("Status", Status);
		urlobject.put("screenshotFile", screenshotFilePath);
		urlobject.put("exception", exception);
		urlobject.put("headerValidationMessage", headerValidationMessage);
		urlobject.put("footerValidationMessage", footerValidationMessage);

		return urlobject;

	}
	@SuppressWarnings("unchecked")
	public static JSONObject generateJsonarrayLatestResponse(String linkurl, String Status, String responseCode,
			String error) {
		JSONObject urlobject = new JSONObject();
		urlobject.put("linkurl", linkurl);
		urlobject.put("Status", Status);
		urlobject.put("responseCode", responseCode);
		urlobject.put("errorMessage", error);
		return urlobject;

	}
	@SuppressWarnings({ "unchecked", "unused" })
	public void brokenLinkValidateResponseForLocalXml(String fileName) {
		try {		
			String file = "src/main/resources/BrokenLink/"+fileName+".txt";
					JSONArray linkarray = new JSONArray();
					List<String> urlList = new ArrayList<>();
			        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			            String line;
			            while ((line = reader.readLine()) != null) {
			                urlList.add(line);  // Add each URL to the list
			            }
			        } catch (IOException e) {
			            e.printStackTrace();
			        }
					
					for (String stringUrl:urlList) {
							int responseCode=0;
							String error = "";
								
								trustAllHosts();
								URL url = new URL(new String(stringUrl));
								url.toURI();
								try {
									HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
									httpURLConnect.setConnectTimeout(5000);
									httpURLConnect.connect();
									responseCode = httpURLConnect.getResponseCode();

									if (responseCode >= 400) {
										senariostatus = "Fail";
									} else {
										senariostatus = "Pass";
									}
								} catch (Exception e) {
									error = e.getMessage();
									senariostatus = "Fail";
								}

							if ((stringUrl != null) && !stringUrl.startsWith("javascript")) {
								linkarray.add(generateJsonarrayLatestResponse(stringUrl, senariostatus,
										Integer.toString(responseCode), error));

							}
							System.out.println(stringUrl + " completed: " + senariostatus + " " + error);
					}
				System.out.println("Brokenlinks is validated in current url");
				resulltObject = writeToJsonLatestResponse(fileName, linkarray);
				pagearray.add(resulltObject);
				brokenObject = GenerateReportJson(pagearray);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	@SuppressWarnings("unchecked")
	public static JSONObject writeToJsonLatestResponse(String pagename, JSONArray urls) {
		JSONObject Object = new JSONObject();
		Object.put("Pagename", pagename);
		Object.put("PageUrl", pagename);
		Object.put("Urls", urls);
		return Object;

	}
	@SuppressWarnings("static-access")
	public void brokenLinkReportGenLatestResponse(String applicationUrl) {
		JSONParser jsonParser = new JSONParser();
		int pagecount = 0;
		int urlcount = 0;
		String pageurl;
		String pagename;
		String linkurl;
		String status;
		String responseCode;
		String errorMessage;
		int pagepasscount = 0;
		int pagefailcount = 0;
		try {
			saveJson(brokenObject);
			linkinfo.reportPathCreate();
			FileReader reader = new FileReader(jsonpath + jsonReportName + ".json");
			Object obj = jsonParser.parse(reader);
			JSONObject JsonObj = (JSONObject) obj;
			JSONArray jsonarray = (JSONArray) JsonObj.get("BrokenLink Data");
			pagecount = jsonarray.size();
			for (int i = 0; i < pagecount; i++) {
				linkinfo.linkBodyEmpty();
				pagepasscount = 0;
				pagefailcount = 0;
				pageurl = (String) ((JSONObject) jsonarray.get(i)).get("PageUrl").toString();
				linkinfo.setApplicationurl(pageurl);
				pagename = (String) ((JSONObject) jsonarray.get(i)).get("Pagename").toString();
				JSONArray scanUrls = (JSONArray) ((JSONObject) jsonarray.get(i)).get("Urls");
				urlcount = scanUrls.size();
				for (int j = 0; j < urlcount; j++) {
					scannedUrlCount++;
					linkurl = (String) ((JSONObject) scanUrls.get(j)).get("linkurl").toString();
					status = (String) ((JSONObject) scanUrls.get(j)).get("Status").toString();
					responseCode = (String) ((JSONObject) scanUrls.get(j)).get("responseCode").toString();
					errorMessage = (String) ((JSONObject) scanUrls.get(j)).get("errorMessage").toString();
					if (status.equalsIgnoreCase("Pass")) {
						pagepasscount++;
						totalpasscount++;
					} else {
						pagefailcount++;
						totalfailcount++;
					}
					linkinfo.linkbodyLatestResponse(status, linkurl, responseCode, errorMessage);
				}

				linkinfo.pageBody(pagename, Integer.toString(pagepasscount), Integer.toString(pagefailcount),
						Integer.toString(i));
				linkinfo.CreatePageBody();

			}
			linkinfo.setApplicationurl(applicationUrl);
			linkinfo.setTotalPages(Integer.toString(pagecount));
			linkinfo.setScannedlinkCount(Integer.toString(scannedUrlCount));
			linkinfo.setTotalPasscount(Integer.toString(totalpasscount));
			linkinfo.setTotalFailcount(Integer.toString(totalfailcount));

			linkinfo.reportGenResponse();
			System.out.println("report generated");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@SuppressWarnings({ "unchecked", "unused" })
	public void brokenLinkValidateResponse(String xml) {
		try {
					URL subUrl = new URL(xml);
					JSONArray linkarray = new JSONArray();
					String userAgent = "chrome/127.0 (X11; Ubuntu; Linux x86_64; rv:26.0) Gecko/20100101.";
					HttpURLConnection subConnection = (HttpURLConnection) subUrl.openConnection();
					subConnection.setRequestMethod("GET");
					subConnection.setRequestProperty("user-agent", "Selenium" + userAgent); // Mimic a browser
					BufferedReader subIn = new BufferedReader(new InputStreamReader(subConnection.getInputStream()));
					StringBuilder subContentBuilder = new StringBuilder();
					String subInputLine;

					while ((subInputLine = subIn.readLine()) != null) {
						subContentBuilder.append(subInputLine);
					}
					subIn.close();
					String subXmlContent = subContentBuilder.toString();

					// Regular expression to match URLs within <loc> tags or any link tags
					String subRegex = "<loc>(https?://[^<]+)</loc>|<xhtml:link>(https?://[^<]+)</xhtml:link>";
					Pattern subPattern = Pattern.compile(subRegex);
					Matcher subMatcher = subPattern.matcher(subXmlContent);
					while (subMatcher.find()) {
						if (subMatcher.group(1) != null) {
							String scanLinkUrl = null;
							int responseCode=0;
							String error = "";
							String linkUrl = subMatcher.group(1);
							if (linkUrl != null) {
								scanLinkUrl = linkUrl;
								linkUrl = linkUrl.trim();
								trustAllHosts();
								URL url = new URL(new String(linkUrl));
								url.toURI();
								try {
									HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
									httpURLConnect.setConnectTimeout(5000);
									httpURLConnect.setRequestProperty("user-Agent", "Selenium" + userAgent);
									httpURLConnect.connect();
									responseCode = httpURLConnect.getResponseCode();

									if (responseCode >= 400) {
										senariostatus = "Fail";
									} else {
										senariostatus = "Pass";
									}
								} catch (Exception e) {
									error = e.getMessage();
									senariostatus = "Fail";
								}

							}
							if ((linkUrl != null) && !linkUrl.startsWith("javascript")) {
								linkarray.add(generateJsonarrayLatestResponse(scanLinkUrl, senariostatus,
										Integer.toString(responseCode), error));

							}
							System.out.println(scanLinkUrl + " completed: " + senariostatus + " " + error);
						}
					}
				System.out.println("Brokenlinks is validated in current url");
				resulltObject = writeToJsonLatestResponse(xml, linkarray);
				pagearray.add(resulltObject);
				brokenObject = GenerateReportJson(pagearray);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

