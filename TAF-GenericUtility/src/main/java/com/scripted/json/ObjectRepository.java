package com.scripted.json;


import org.json.JSONObject;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.testng.Assert;

public class ObjectRepository {
	
	public static Map<String, String> objectRepository = new HashMap<>();
    static boolean isAndroid;


    public static String  get(String key){
        return objectRepository.get(key);
    }

    
    @SuppressWarnings("rawtypes")
	public static void loadJsonForMobile(String platform) {
        String dir =System.getProperty("user.dir");
        dir += "/src/main/resources/ObjectRepository";

        if (platform.toLowerCase().contains("android")){
            isAndroid = true;
        }

        try{
            List<Path> paths = Files.walk(Paths.get(dir),1)
                    .filter(Files::isRegularFile)
                    .filter(path-> path.getFileName().toString().endsWith(".json"))
                    .collect(Collectors.toList());
            for(Path path : paths) {
                String fileName = path.getFileName().toString().split("\\.")[0] + ".";
                String json = new String(Files.readAllBytes(path));
                JSONObject obj = new JSONObject(json);
                Map<String, Object> map = obj.toMap();
                for (Map.Entry<String,Object> entry : map.entrySet()){
                    String value = (String) (isAndroid ?  ((HashMap) entry.getValue()).get("android")
                                                : ((HashMap) entry.getValue()).get("ios"));
                    objectRepository.put(fileName + entry.getKey(), value);
                    }
                }
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Error while parsing object repository json");
        }
        System.out.println("Finished Loading Object Repository");
    }


}
