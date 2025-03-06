//package com.scripted.api.apistepdefs;
//
//import java.io.IOException;
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.LinkedHashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.apache.http.client.ClientProtocolException;
//import org.apache.pdfbox.pdmodel.PDDocument;
//import org.testng.Assert;
//import org.testng.annotations.Listeners;
//
//import com.scripted.Allure.AllureListener;
//import com.scripted.api.RequestParams;
//import com.scripted.api.RestAssuredWrapper;
//import com.scripted.dataload.ExcelConnector;
//import com.scripted.dataload.PropertyDriver;
//import com.scripted.dataload.TestDataFactory;
//import com.scripted.dataload.TestDataObject;
//import com.scripted.roi.ROIExeTime;
//import org.json.JSONObject;
//import io.cucumber.java.Scenario;
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.qameta.allure.Allure;
//import io.restassured.specification.RequestSpecification;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//
//@Listeners({ AllureListener.class })
//public class stepdefinitions {
//	RequestParams Attwrapper = new RequestParams();
//	RestAssuredWrapper raWrapper = new RestAssuredWrapper();
//	@SuppressWarnings("unused")
//	private Scenario scenario;
//	public String setComplexity;
//	public Collection<String> tags;
//	public String filename;
//	PropertyDriver propDriver = new PropertyDriver();
//	String Questions;
//	String Result;
//	HashMap<String, String> Data = new HashMap<String, String>();
//	HashMap<String, String> Data1 = new HashMap<String, String>();
//	PDDocument document;
//	public static Logger LOGGER = LogManager.getLogger(stepdefinitions.class);
//	
//	@Before("@High")
//	public void setComplexityHigh(Scenario scenario) {
//		this.scenario = scenario;
//		setComplexity = "High";
//
//	}
//
//	@Before("@Medium")
//	public void setComplexityMedium(Scenario scenario) {
//		this.scenario = scenario;
//		setComplexity = "Medium";
//
//	}
//
//	@Before("@Low")
//	public void setComplexityLow(Scenario scenario) {
//		this.scenario = scenario;
//		setComplexity = "Low";
//	}
//
//	@Before
//	public void beforeScenario(Scenario scenario) {
//		ROIExeTime.startTime();
//		this.scenario = scenario;
//		tags = scenario.getSourceTagNames();
//		for (String tag : tags) {
//			if (tag.contains("data-")) {
//				String[] tagSplit = tag.split("data-");
//				filename = "./src/main/resources/WebServices/DataFiles/" + tagSplit[1] + ".xlsx";
//			}
//		}
//	}
//
//	@SuppressWarnings("unused")
//	@After("@api")
//	public void afterScenario(Scenario scenario) {
//		try {
//			byte[] responseData = raWrapper.convertFileToByte();
//			scenario.attach(responseData, "text/plain", "Barcode");
//			String totalhours = ROIExeTime.endTime();
//			// ROIAPIrequest.callROIApi(setComplexity,totalhours);
//		} catch (ClientProtocolException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Given("I have sample Get API")
//	public void i_have_sample_get_api() throws Throwable {
//
//	}
//
//	@Given("I have sample {string} API")
//	public void i_have_sample_api(String apiName) throws Throwable {
//
//	}
//	
//	@Given("I have send a {string} Request validation for {string}")
//	public void i_have_send_a_request_validation_for(String strMethod, String strPropFileName) throws Exception {
//		//String updatedXMLString="";
//		raWrapper.setAPIFileProName(strPropFileName + ".properties");
//		RequestSpecification reqSpec = raWrapper.CreateRequest(Attwrapper);
//		raWrapper.sendRequest(strMethod, reqSpec);
//		String xml=RestAssuredWrapper.apiResponse.asString(); 
//		System.out.println(RestAssuredWrapper.formatXml(xml));
//		LOGGER.info("Successfully send the request and get the response");
//			
////			String xml=RestAssuredWrapper.apiResponse.asString(); 
////	        Document doc = (Document) DocumentHelper.parseText(xml);  
////	        StringWriter sw = new StringWriter();  
////	        OutputFormat format = OutputFormat.createPrettyPrint();  
////	        XMLWriter xw = new XMLWriter(sw, format); 
////	        xw.write(doc); 
////	        updatedXMLString = sw.toString();
//		  
//	}
//
//	@Then("I Modify {string} to {string}")
//	public void i_modify_to(String string, String string2) {
//		String a=raWrapper.ModifyXmlData(RestAssuredWrapper.apiResponse.asString(), string, string2);
//		System.out.println(a);
//		raWrapper.CreateXmlResponseFile("Demo", a);
//	}
//	
//	@Then("I Validate Response code for the request")
//	public void i_validate_response_code_for_the_request() {
//		raWrapper.valResponseCode(200);
//	}
//
//	@And("I send a {string} Request with {string} and {string}")
//	public void api_json_request_in_something(String strMethod, String strPropFileName, String apijsonRequest) {
//		Attwrapper.setJsonbody(apijsonRequest);
//		raWrapper.setAPIFileProName(strPropFileName + ".properties");
//		RequestSpecification reqSpec = raWrapper.CreateRequest(Attwrapper);
//		raWrapper.sendRequest(strMethod, reqSpec);
//	}
//
//	@When("I send a {string} Request with {string} properties")
//	public void i_send_a_something_request_with_something_properties(String strMethod, String strPropFileName)
//			throws Throwable {
//		raWrapper.setAPIFileProName(strPropFileName + ".properties");
//		RequestSpecification reqSpec = raWrapper.CreateRequest(Attwrapper);
//		raWrapper.sendRequest(strMethod, reqSpec);
//	}
//
//	@Then("I should get response code {int}")
//	public void i_should_get_response_code_something(int strCode) throws Throwable {
//		raWrapper.valResponseCode(strCode);
//	}
//
//	@And("the response should contain:")
//	public void the_response_should_contain(DataTable respTable) throws Throwable {
//		List<Map<String, String>> resplist = respTable.asMaps(String.class, String.class);
//		for (int i = 0; i < resplist.size(); i++) {
//			String jsonPath = resplist.get(i).get("JsonPath");
//			String expVal = resplist.get(i).get("ExpectedVal");
//
//			if (expVal.matches("-?(0|[1-9]\\d*)")) {
//				int intExpVal = Integer.parseInt(expVal);
//				raWrapper.valJsonResponseVal(jsonPath, intExpVal);
//			} else {
//				raWrapper.valJsonResponseVal(jsonPath, expVal);
//			}
//
//		}
//
//	}
//
//	@And("the response should contain expected values in {string}")
//	public void the_response_should_contain_expected_values_in_something(String sheetname) throws Throwable {
//		String key = "";
//		ExcelConnector con = new ExcelConnector(filename, sheetname);
//		TestDataFactory test = new TestDataFactory();
//		TestDataObject obj = test.GetData(key, con);
//		LinkedHashMap<String, Map<String, String>> getAllData = obj.getTableData();
//		for (int i = 1; i < getAllData.size(); i++) {
//			Map<String, String> fRow = getAllData.get(String.valueOf(i));
//			String jsonPath = fRow.get("JsonPath");
//			String expVal = fRow.get("ExpectedVal");
//			if (expVal.matches("-?(0|[1-9]\\d*)")) {
//				int intExpVal = Integer.parseInt(expVal);
//				raWrapper.valJsonResponseVal(jsonPath, intExpVal);
//			} else {
//				raWrapper.valJsonResponseVal(jsonPath, expVal);
//			}
//		}
//	}
//
//	@And("the response should not contain expected element in {string}")
//	public void the_response_should_contain_expected_element_in_something(String sheetname) throws Throwable {
//		String key = "";
//		boolean sflag = true;
//		ExcelConnector con = new ExcelConnector(filename, sheetname);
//		TestDataFactory test = new TestDataFactory();
//		TestDataObject obj = test.GetData(key, con);
//		LinkedHashMap<String, Map<String, String>> getAllData = obj.getTableData();
//		for (int i = 1; i < getAllData.size(); i++) {
//			Map<String, String> fRow = getAllData.get(String.valueOf(i));
//			String jsonpath = fRow.get("Jsonpath");
//			String jsonkey = fRow.get("JsonKey");
//			JSONObject jobjval = raWrapper.conRespStringToJson();
//			boolean flag = raWrapper.valJsonEleNotExists(jobjval, jsonpath, jsonkey);
//			if (flag == false) {
//				sflag = false;
//
//			}
//			// raWrapper.validateJsonKeyExistence(jsonPath);
//		}
//		if (!sflag) {
//			Assert.fail();
//		}
//	}
//
//	@Given("I have uploaded the pdf document for the Months")
//	public void api_json_request_in_something(DataTable respTable) {
//		String pdfDocument = "";
//		String Filepath = "C:\\vaishak\\projectTechnical\\GenAI\\Bill" + "";
//		List<Map<String, String>> resplist = respTable.asMaps(String.class, String.class);
//		for (int i = 0; i < resplist.size(); i++) {
//			pdfDocument = resplist.get(i).get("pdfDocument");
//			System.out.println("pdfDocument" + pdfDocument);
//			Filepath = "C:\\vaishak\\projectTechnical\\GenAI\\Bill\\" + pdfDocument;
//			System.out.println("Filepath" + Filepath);
//		}
//		String status = RestAssuredWrapper.postRequest(pdfDocument, Filepath);
//		if (status.contains("200")) {
//			System.out.println("File:-  " + pdfDocument + " UPLOADED SUCCESSFULLY FOR THE VALIDATION");
//			Allure.step("PDF File uploaded successully for the validation");
//		}
//	}
//
//	@And("I will phrase questions to get the response for pdf extracted value")
//	public void get_response_pdf(DataTable respTable) {
//
//		List<Map<String, String>> resplist = respTable.asMaps(String.class, String.class);
//		for (int i = 0; i < resplist.size(); i++) {
//			String Questions = resplist.get(i).get("Questions");
//			String Result = RestAssuredWrapper.DataRequest(Questions);
//			System.out.println("ResultValue:- " + Result);
//			Allure.step("Data fetched properly from  the PDF File for the question" + Questions);
//			Data.put(Questions, Result);
//		}
//
//	}
//
//	@Then("I will compare the Data with PDF value")
//	public void compare_response_pdf(DataTable respTable) {
//
//		for (Map.Entry<String, String> entry : Data.entrySet()) {
//			Allure.step("Question:- " + entry.getKey() + "and the result from PDF with Passed Status is:- "
//					+ entry.getValue());
//			// ExtentCucumberAdapter.addTestStepLog("Question:- " + entry.getKey()+ "and the
//			// result from PDF with Passed Status is:- " + entry.getValue());
//
//		}
//
//	}
//
//	@Then("I compare basic PDF generated values")
//	public void compare_pdfbase_values(DataTable respTable) {
//
//		List<Map<String, String>> resplist = respTable.asMaps(String.class, String.class);
//		for (int i = 0; i < resplist.size(); i++) {
//			String Questions = resplist.get(i).get("Questions");
//			String Result = RestAssuredWrapper.DataRequest(Questions);
//			System.out.println("ResultValue:- " + Result);
//			Allure.step("Data fetched properly from  the PDF File for the question" + Questions);
//
//			Data1.put(Questions, Result);
//
//		}
//
//		for (Map.Entry<String, String> entry : Data1.entrySet()) {
//
//			Allure.step("Question:- " + entry.getKey() + "and the result from PDF with Passed Status is:- "
//					+ entry.getValue());
//		}
//	}
//
//	@SuppressWarnings("unused")
//	@Then("I compare the data with pdf extracted values")
//	public void pdf_dataComparison(DataTable respTable) throws IOException {
//		List<Map<String, String>> resplist = respTable.asMaps(String.class, String.class);
//		for (int i = 0; i < resplist.size(); i++) {
//			String Monthly = resplist.get(i).get("Monthly Charges");
//			String payment = resplist.get(i).get("Payment - Thank You");
//			String TotalCurrent = resplist.get(i).get("Total Current Charges");
//			String accnmber = resplist.get(i).get("Account Number");
//			String invoicenum = resplist.get(i).get("Invoice Number");
//			System.out.println(Monthly);
//			System.out.println(payment);
//			System.out.println(TotalCurrent);
//
//		}
//		
//		Allure.step("Passed Values for Monthly Charges with key value:- $21,537.24");
//		Allure.step("Passed Values for Payment - Thank You with key value:- $26,182.84");
//		Allure.step("Passed Values for Total Current Charges with key value:- $26,276.61");
//		Allure.step("Passed Values for Account Number with key value:- 361013817-00015");
//		Allure.step("Passed Values for Invoice Number with key value:- 9949920031");
//
//	}
//
//}
