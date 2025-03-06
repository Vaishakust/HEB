package com.scripted.roi;

import java.io.IOException;

import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.core5.http.ClassicHttpRequest;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.client5.http.ClientProtocolException;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.scripted.dataload.PropertyDriver;

public class ROIAPIrequest {
	public static CloseableHttpResponse httpsResponse = null;
	private static final Logger log = LogManager.getLogger(ROIAPIrequest.class);

	@SuppressWarnings({ "deprecation", "unused" })
	public static void callROIApi(String setComplexity, String totalHours) throws ClientProtocolException, IOException {
		try {
			PropertyDriver propDriver = new PropertyDriver();
			propDriver.setPropFilePath("src/main/resources/ROI/Properties/ROIGETApi.properties");
			String roiURI=PropertyDriver.readProp("roiURI");
			String projectName = PropertyDriver.readProp("project");
			String strUserName = PropertyDriver.readProp("username");
			String strDebugFlag = PropertyDriver.readProp("debug");
			String strRequestBody = "{\"Project\":\"" + projectName + "\",\"Complexity\":\"" + setComplexity
					+ "\",\"ExecutionTime\" : \"" + totalHours + "\",\"User\" : \"" + strUserName + "\",\"debug\":\""
					+ strDebugFlag + "\"} ";
			CloseableHttpClient httpClient = HttpClientBuilder.create().build();
			HttpPost request = new HttpPost(roiURI);

			StringEntity params;
			params = new StringEntity(strRequestBody);
			request.addHeader("content-type", "application/json");
			request.setEntity(params);

			httpsResponse = httpClient.execute((ClassicHttpRequest) request);
			String responseString = EntityUtils.toString((HttpEntity) httpsResponse.getEntity());
			log.info("responseString");

		} catch (Exception e) {
			e.printStackTrace();
			log.error("Error occurred while calling ROI API "+"Exception"+e);
		}

	}
}
