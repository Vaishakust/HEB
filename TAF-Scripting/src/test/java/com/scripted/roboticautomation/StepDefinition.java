package com.scripted.roboticautomation;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.json.JSONObject;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.scripted.api.RequestParams;
import com.scripted.api.RestAssuredWrapper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import jakarta.xml.bind.DatatypeConverter;

public class StepDefinition {
	String access_Token;
	 int i=0;
	@Given("I have triggered endpoint to generate Access token")
	public void i_have_triggered_endpoint_to_generate_access_token() {

	
		RestAssured.baseURI = "http://192.168.1.101/api/v1";
			RequestSpecification request = RestAssured.given();
			request.header("Content-Type", "application/x-www-form-urlencoded")
			.contentType(ContentType.URLENC)
			.formParam("email", "tester@ust.com")
	        .formParam("password", "Tester@116");
			
			Response response1 = request.post("/token/");
		String body1 = response1.asPrettyString();
 
		JSONObject jsonObjectbase1 = new JSONObject(body1);
		access_Token = jsonObjectbase1.getString("access_token");
		System.out.println("Access token Generated");
	}

	

	
	@When("I have logged in to HEB")
	public void i_have_logged_in_to_heb() throws IOException {
		Response respon=ApiRequest().get("logging_in/");
		String body = respon.asPrettyString();
		getImages(body);
		System.out.println("logged in successfully");
	}

	@Then("I have added the items")
	public void i_have_added_the_items() throws IOException {
		Response respon=ApiRequest().get("adding_items/");
		String body = respon.asPrettyString();
		getImages(body);
		System.out.println("added item successfully");
	}

	@Then("I have initiated the payment")
	public void i_have_initiated_the_payment() throws IOException {
		Response respon=ApiRequest().get("payment/");
		String body = respon.asPrettyString();
		getImages(body);
		System.out.println("initiated payment successfully");
	}

	@Then("I have done the payment using demo card tap")
	public void i_have_done_the_payment_using_demo_card_tap() throws IOException {
		Response respon=ApiRequest().get("demo_card_tap/");
		String body = respon.asPrettyString();
		getImages(body);
		System.out.println("demo card tap completed successfully");
	}

	@Then("I logout from the system")
	public void i_logout_from_the_system() throws IOException {
		Response respon=ApiRequest().get("logout/");
		String body = respon.asPrettyString();
		getImages(body);
		System.out.println("logout the system successfully");
	}
	
	public RequestSpecification ApiRequest() {
		RestAssured.baseURI = "http://192.168.1.101/api/v1/hapi/DUT_A/";
		String bearer = " Bearer "+ access_Token;
		RequestSpecification request = RestAssured.given();
		request
		.header("Authorization", bearer)
		.contentType(ContentType.URLENC);
		
		return request;
	}
	
	public void getImages(String body) throws IOException {
		JSONObject jsonObjectbase2 = new JSONObject(body);
		//String imageDecode = jsonObjectbase2.getJSONObject("message").getJSONObject("API No:").getString("proof_img");
	    JSONObject json=jsonObjectbase2.getJSONObject("message");
	   
	    for(String keys:json.keySet())
	    {
	    	
	    	String imageDecode = jsonObjectbase2.getJSONObject("message").getJSONObject(keys).getString("proof_img");
	    	if(imageDecode!=null) { 
	    	byte[] imageBytes = DatatypeConverter.parseBase64Binary(imageDecode);
			    BufferedImage image = ImageIO.read(new java.io.ByteArrayInputStream(imageBytes));
			    // write the image to a file
			    File outputfile = new File("C:\\Users\\248953\\Desktop\\vyshnav\\SkriptmateTestlytic\\TAF-Scripting\\src\\main\\resources\\images\\myImage"+keys+""+i+".png");
			    ImageIO.write(image, "png", outputfile);
			    System.out.println(keys);
			  //  ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(imageDecode);
			    Allure.addAttachment("My Image", "image/png", new FileInputStream(outputfile), "png");  
			    i++;
	    	}
	    	
	    	if(keys.contains("ocr")) {
	    		String ocr= jsonObjectbase2.getJSONObject("message").getJSONObject(keys).getString("response_data");
	    		Allure.addAttachment("Ocr Data", ocr);
	    	}
	    }
	}
}
