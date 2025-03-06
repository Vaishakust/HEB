package com.scripted.api.apistepdefs;

import org.json.JSONArray;
import org.json.JSONObject;

public class sampleJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JSONObject requestParams = new JSONObject();
		requestParams.put("Input", "testing");		
		JSONArray FileDetails = new JSONArray();
		JSONObject FileIdd = new JSONObject();
		FileIdd.put("FileId", "1233");		
		FileDetails.put(FileIdd);	
		requestParams.put("FileDetails", FileDetails);		
	}

}
