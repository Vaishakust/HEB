package com.scripted.json;
import com.jayway.jsonpath.Configuration;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class JsonTestData {
	
	public static Map<String, Object> objectRepository = new HashMap<>();
	 static Object document;

	    public static String load(String dataFile){
	        String dir =System.getProperty("user.dir");
	        String jsonData = "";
	        String filePath = dir + "/src/main/resources/DataFiles/json/" + dataFile + ".json";
	        try{
	        	jsonData  = FileUtils.readFileToString(new File(filePath), StandardCharsets.UTF_8);
	            document = Configuration.defaultConfiguration().jsonProvider().parse(jsonData);
	            JSONObject obj = new JSONObject(jsonData);
	            objectRepository = obj.toMap(); 
	        } catch (Exception e){
	            e.printStackTrace();
	        }
			return jsonData;
	    }
	    
	    public static String loadforCurrentElements(String filePath){
	        String jsonData = "";
	        try{
	        	jsonData  = FileUtils.readFileToString(new File(filePath), StandardCharsets.UTF_8);
	            document = Configuration.defaultConfiguration().jsonProvider().parse(jsonData);
	            JSONObject obj = new JSONObject(jsonData);
	            objectRepository = obj.toMap(); 
	        } catch (Exception e){
	            e.printStackTrace();
	        }
			return jsonData;
	    }
	    

	    public static String loadforParentElements(String dataFile){
	        String dir =System.getProperty("user.dir");
	        String jsonData = "";
	        String filePath = dir + "/src/main/resources/HealingConfigurations/Parent/" + dataFile + ".json";
	        try{
	        	jsonData  = FileUtils.readFileToString(new File(filePath), StandardCharsets.UTF_8);
	            document = Configuration.defaultConfiguration().jsonProvider().parse(jsonData);
	            JSONObject obj = new JSONObject(jsonData);
	            objectRepository = obj.toMap(); 
	        } catch (Exception e){
	            e.printStackTrace();
	        }
			return jsonData;
	    }


}
