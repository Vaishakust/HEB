package com.scripted.postman;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.io.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class postmanCollection {
	JSONParser parser = new JSONParser();

	public void readJson(String Packagename, String classname) throws FileNotFoundException, IOException, ParseException {

		Object obj = parser.parse(new FileReader("C:/Users/188162/Desktop/postman/goRest.postman_collection.json"));
		JSONObject jsonObject = (JSONObject) obj;
		JSONArray items = (JSONArray) jsonObject.get("item");
		System.out.println("Total number of requests " + items.size());
		for (int i = 0; i < items.size(); i++) {
			JSONObject jsonobjectitems = (JSONObject) items.get(i);
			Object name = jsonobjectitems.get("name");
			System.out.println(name);
			JSONObject request = (JSONObject) jsonobjectitems.get("request");

			// Authorization Details
			JSONObject auth = (JSONObject) request.get("auth");
			Object type = auth.get("type");
			JSONArray bearervalue = (JSONArray) auth.get("bearer");
			Object author = null;
			String token = null;
			if (type.toString().contains("bearer")) {
				for (int j = 0; j < bearervalue.size(); j++) {
					JSONObject tokenValue = (JSONObject) bearervalue.get(j);
					Object token1 = tokenValue.get("value");
					token = "bearer" + token1;
				}
				author = "Authorization";
			}

			Object method = request.get("method");
			System.out.println("method" + method);
			JSONArray header = (JSONArray) request.get("header");
			Object headerKey = null;
			Object headerValue = null;

			for (int j = 0; j < header.size(); j++) {
				JSONObject valueheader = (JSONObject) header.get(j);
				headerKey = valueheader.get("key");
				headerValue = valueheader.get("value");
				System.out.println("header Key:- " + valueheader.get("key"));
				System.out.println("header Value:- " + valueheader.get("value"));
			}
			Object body = request.get("body");
			System.out.println("Body" + body);
			JSONObject url = (JSONObject) request.get("url");
			Object urlraw = url.get("raw");
			System.out.println("Url" + urlraw);

			createRestassured(Packagename, classname, method, urlraw, headerKey, headerValue, author, token);

		}
	}

	public void createRestassured(String packagename,String classname, Object method, Object urlraw, Object headerKey,
			Object headerValue, Object author, String token) {

		if (method.toString().equalsIgnoreCase("GET")) {
			
			String GetValue = "RequestParams Attwrapper = new RequestParams();	\r \n"
					+ "RestAssuredWrapper raWrapper = new RestAssuredWrapper(); \r \n"					
					+"RequestSpecification reqSpec = raWrapper.CreateRequestforJsonfilesupport(" + "\""  + urlraw.toString() +  "\"" + "," + "\"" + headerValue.toString() +  "\"" + "," + "\"" + headerValue.toString() +  "\"" + "," + "\"" + "Get" + "\"" + "," + "\"" +"\""+ ");\r \n"	
			         +"raWrapper.sendRequest(" +"\"" + "Get" + "\""  + "," +  "reqSpec" + ");\r\n"
			         + "raWrapper.valResponseCode(200);";
			createJavaFile(packagename,classname, GetValue);
		}
		
		if (method.toString().equalsIgnoreCase("PUT")) {

			String GetValue = "RequestSpecification restSpec = RestAssured.given();	\r \n"
					+ "restSpec.relaxedHTTPSValidation(); \r \n"
					+ "restSpec.header(" + "\"" + headerKey.toString() + "\"" + "," + "\""
					+ headerValue.toString() + "\"" + ");\r \n" + "restSpec.header(" + "\"" + author + " \"" + ","
					+ "\"" + token + "\"" + ");\r \n"
					+ "Response response = restSpec.when().get(" + "\""  + urlraw.toString() +  "\"" + ");" ;
			createJavaFile(packagename,classname, GetValue);
		}
	}

	public void createJavaFile(String packagename,String classname,  String Value) {

		String userdir = System.getProperty("user.dir");
		
		try {

			// create a new file with name specified
			// by the file object
			String classnnn = classname.substring(1).replace(".java", "");
			System.out.println(classnnn);
			String program = "package org.examples; \r \n " + "import org.testng.annotations.Test; \r \n"
					+ "import io.restassured.specification.RequestSpecification; \r \n"
					+ "import com.scripted.api.RequestParams; \r \n"
					+ "import com.scripted.api.RestAssuredWrapper; \r \n"
					+ "import io.restassured.RestAssured; \r \n" 
					+ "import io.restassured.response.Response; \r \n"
					+ " public class " + classnnn + "{  \r \n" 
					+ "@Test \r \n"
					+ "public void GetMethod() { \r \n  " + "" + Value + "\r \n " + "} \r \n" + "}";

			try {
				// Creates a Writer using FileWriter
				FileWriter output = new FileWriter(userdir + "\\src\\test\\java" + packagename + classname);

				// Writes the program to file
				output.write(program);
				System.out.println("Data is written to the file.");

				// Closes the writer
				output.close();
			} catch (Exception e) {
				e.getStackTrace();
			}
//			} else {
//				System.out.println("The file already exists.");
//			}
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
