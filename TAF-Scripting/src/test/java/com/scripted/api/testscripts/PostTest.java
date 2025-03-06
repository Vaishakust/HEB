package com.scripted.api.testscripts;

import org.testng.annotations.Test;

import com.scripted.api.RequestParams;
import com.scripted.api.RestAssuredWrapper;
import com.scripted.envconfig.EnvConfigDefine;

import io.restassured.specification.RequestSpecification;

public class PostTest extends EnvConfigDefine {
	
	RequestParams Attwrapper = new RequestParams();
	RestAssuredWrapper raWrapper = new RestAssuredWrapper();
	@Test
	public void Test01(){
		String url = baseurl()+chainedUrl();
		raWrapper.setAPIFileProName("SamplePOSTApi.properties");
		raWrapper.setbaseValues(url, proxyandport());
	   Attwrapper.setJsonbyTemplate("Post");

	RequestSpecification reqSpec = raWrapper.CreateRequest(Attwrapper);		
	raWrapper.sendRequest("Post",reqSpec);
	raWrapper.valResponseCode(201);

	}
}
