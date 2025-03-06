package com.scripted.api;

import static org.testng.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.codehaus.groovy.ast.ModuleNode;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
//import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

import com.scripted.generic.DateTimeHelper;
import com.scripted.generic.FileUtils;

@SuppressWarnings("unused")
public class RestAssuredWrapper {

	GetProp getPropertiesInMap = new GetProp();
	HashMap<String, Object> propMap = new HashMap<>();
	Map<String, Object> ObjMap = new HashMap<>();

	public String filename = null;
	public static Response apiResponse = null;
	public static String url = null;
	public static String uri = null;
	public static String queryParam = null;
	public static RequestSpecification restSpec = RestAssured.given();
	public static Logger LOGGER = LogManager.getLogger(RestAssuredWrapper.class);
	public static String FileIdvalue;

	@SuppressWarnings("rawtypes")
	public RequestSpecification CreateRequest(RequestParams raWrapper) {
		try {
			propMap = getPropertiesInMap.getPropValues("src/main/resources/WebServices/Properties/" + filename);
			ObjMap = ConvertObjectToMap(raWrapper);
			boolean isPropMapEmpty = propMap.isEmpty();

			if (isPropMapEmpty == false) {
				for (Iterator<?> it = propMap.entrySet().iterator(); it.hasNext();) {
					HashMap.Entry reqParams = (HashMap.Entry) it.next();
					if (reqParams.getKey().equals("uri")) {
						uri = reqParams.getValue().toString();
					}
					if (reqParams.getKey().equals("url")) {
						url = reqParams.getValue().toString();
					}
					if (reqParams.getKey().equals("proxyAndPort")) {
						if (!reqParams.getValue().toString().isEmpty()) {
							String proxyPort = reqParams.getValue().toString();
							String[] splitproxyPort = proxyPort.split(":");
							int port = Integer.parseInt(splitproxyPort[1]);
							restSpec.proxy(splitproxyPort[0], port);
						}
					}
					if (reqParams.getKey().equals("contenttype")) {
						if (reqParams.getValue().toString().contains("json")) {
							restSpec.contentType(ContentType.JSON);
						}
						if (reqParams.getValue().toString().contains("xml")) {
							restSpec.contentType(ContentType.XML);
						}
					}
					if (reqParams.getKey().equals("accept")) {
						if (reqParams.getValue().toString().contains("json")) {
							restSpec.accept(ContentType.JSON);
						}
						if (reqParams.getValue().toString().contains("xml")) {
							restSpec.accept(ContentType.XML);
						}
					}

					if (reqParams.getKey().equals("restMethodType")) {
						if (reqParams.getValue().toString().equals("POST")
								|| reqParams.getValue().toString().equals("PUT")
						|| reqParams.getValue().toString().equals("GET"))
							{
							if(raWrapper.getXmlbody()!=null) {
							restSpec.body(raWrapper.getXmlbody().toString());
							}
							if(raWrapper.getJsonbody()!=null) {
								restSpec.body(raWrapper.getJsonbody().toString());
								}
						}
					}
				}
					
			}
			LOGGER.info("Successfully added headers");
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("Error while trying to create request :" + e);
			Assert.fail("Error while trying to create request" + e);
		}
		return restSpec;
	}

	public RequestSpecification CreateRequestforJsonfilesupport(String url1, String contenttype, String accept , String restMethodType , String Json) {
		try {
			
			if (url1!= null || url1!="" ) {
				uri = url1.toString();
			}

			if (contenttype!=null || contenttype!="") {
				if (contenttype.contains("json")) {
					restSpec.contentType(ContentType.JSON);
				}
				if (contenttype.contains("xml")) {
					restSpec.contentType(ContentType.XML);
				}
			}
			if (accept!=null || accept!="") {
				if (accept.contains("json")) {
					restSpec.accept(ContentType.JSON);
				}
				if (accept.contains("xml")) {
					restSpec.accept(ContentType.XML);
				}
			}

			if (restMethodType != null ||restMethodType != "") {
				if (restMethodType.equals("POST") || restMethodType.equals("PUT")) {
					restSpec.body(Json);
				}
			}
			LOGGER.info("Successfully added headers");
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("Error while trying to create request :" + e);
			Assert.fail("Error while trying to create request" + e);
		}
		return restSpec;
	}

	public void setAPIFileProName(String fileName) {
		this.filename = fileName;
	}

	public static Map<String, Object> ConvertObjectToMap(RequestParams raWrapper)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			Class<?> pomclass = raWrapper.getClass();
			pomclass = raWrapper.getClass();
			java.lang.reflect.Method[] methods = raWrapper.getClass().getMethods();

			for (java.lang.reflect.Method m : methods) {
				if (m.getName().startsWith("get") && !m.getName().startsWith("getClass")) {
					Object value = (Object) m.invoke(raWrapper);
					map.put(m.getName().substring(3), (Object) value);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("Error while trying to convert object to map :" + e);
			Assert.fail("Error while trying to convert object to map :" + e);
		}
		return map;
	}

	public void sendRequest(String method, RequestSpecification reqSpec) {
		try {
			if (method.contains("Get")) {
				reqSpec.relaxedHTTPSValidation();
				Response response = reqSpec.when().get(uri);
				setReponse(response);
			}
			if (method.contains("Post")) {
				reqSpec.relaxedHTTPSValidation();
				Response response = reqSpec.post(uri);
				setReponse(response);
			}
			if (method.contains("Put")) {
				reqSpec.relaxedHTTPSValidation();
				Response response = reqSpec.put(uri);
				setReponse(response);
			}
			LOGGER.info("Successfully send the request and got the response");
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("Fail to send the request, Exception :" + e);
			Assert.fail("Fail to send the request, Exception :" + e);
		}

	}

	public void sendGetRequestWithParams(RequestSpecification reqSpec) {
		try {
			reqSpec.relaxedHTTPSValidation();
			Response response = reqSpec.when().get(uri);
			String responseBody = response.getBody().asString();
			setReponse(response);
			LOGGER.info("Successfully send the request and got the response");
		} catch (Exception e) {
			LOGGER.error("Fail to send the request, Exception :" + e);
			Assert.fail("Fail to send the request, Exception :" + e);
		}
	}

	@SuppressWarnings("static-access")
	public Response getResponse() {
		LOGGER.info("get Response : " + apiResponse.asString());
		return this.apiResponse;
	}

	@SuppressWarnings("static-access")
	public void setReponse(Response response) {
		this.apiResponse = response;
		LOGGER.info("Set Response : " + apiResponse.asString());
	}

	public void valResponseCode(int respCode) {
		try {
			int statusCode = apiResponse.getStatusCode();
			System.out.println("Response Code : " + statusCode);
			assertEquals(respCode, statusCode);
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("Response code, Exception :" + e);
			Assert.fail("Response code, Exception :" + e);
		}
	}

	public static Object fetchJsonPathValue(JSONObject jsonObject, String jsonPath, String jsonKey) {
		int jsonPathLen;
		Object strObjValue = null;
		try {
			JSONArray jsonArr = new JSONArray();
			if (jsonPath.contains(".")) {
				String[] splitJsonObj = jsonPath.split("\\.");
				jsonPathLen = splitJsonObj.length;
				for (int i = 0; i < jsonPathLen; i++) {
					if (splitJsonObj[i].contains("[")) {
						String[] splitJsonArr = splitJsonObj[i].split("\\[");
						jsonArr = jsonObject.getJSONArray(splitJsonArr[0]);
						String jsonarrCount = splitJsonArr[1].replace("]", "");
						int arrCount = Integer.parseInt(jsonarrCount);
						jsonObject = jsonArr.getJSONObject(arrCount);
					} else {
						jsonObject = jsonObject.getJSONObject(splitJsonObj[i]);
					}
				}
				strObjValue = jsonObject.get(jsonKey).toString();

			} else {

				if (jsonPath.contains("[")) {
					String[] splitJsonArr = jsonPath.split("\\[");
					jsonArr = jsonObject.getJSONArray(splitJsonArr[0]);
					String jsonarrCount = splitJsonArr[1].replace("]", "");
					int arrCount = Integer.parseInt(jsonarrCount);
					jsonObject = jsonArr.getJSONObject(arrCount);
				} else {
					jsonObject = jsonObject.getJSONObject(jsonPath);
				}
				strObjValue = jsonObject.get(jsonKey).toString();
			}

		} catch (Exception e) {
			LOGGER.error("Error in fetching the jsonpath value, Exception :" + e);
			Assert.fail("Error in fetching the jsonpath value, Exception :" + e);

		}
		return strObjValue;
	}

	public void valJsonResponseVal(String jsonPath, Object expValue) {

		try {
			String strVal = null;
			int intVal;
			boolean bVal;
			double dVal;

			JsonPath jsonPathEvaluator = apiResponse.jsonPath();
			Object obj = jsonPathEvaluator.get(jsonPath);
			String getObjType = obj.getClass().getTypeName().toString();
			if (getObjType.contains("String")) {
				strVal = jsonPathEvaluator.get(jsonPath);
				Assert.assertEquals(expValue, strVal, "Mismatch in the response - JsonPath : " + jsonPath);
				LOGGER.info("Expected value " + expValue + " is matching with the actual : " + strVal);
			}
			if (getObjType.contains("Integer")) {
				intVal = jsonPathEvaluator.get(jsonPath);
				Assert.assertEquals(expValue, intVal, "Mismatch in the response - JsonPath : " + jsonPath);
				LOGGER.info("Expected value " + expValue + " is matching with the actual : " + intVal);
			}
			if (getObjType.contains("Boolean")) {
				bVal = jsonPathEvaluator.get(jsonPath);
				Assert.assertEquals(expValue, bVal, "Mismatch in the response - JsonPath : " + jsonPath);
				LOGGER.info("Expected value " + expValue + " is matching with the actual : " + bVal);
			}
			if (getObjType.contains("Double")) {
				dVal = jsonPathEvaluator.get(jsonPath);
				Assert.assertEquals(expValue, dVal, "Mismatch in the response - JsonPath : " + jsonPath);
				LOGGER.info("Expected value " + expValue + " is matching with the actual : " + dVal);
			}
		} catch (Exception e) {
			LOGGER.error("Error in validating the response, Exception :" + e);
			Assert.fail("Error in validating the response, Exception :" + e);
		}
	}

	public void valXmlResponseVal(String xmlPath, Object expValue) {
		try {
			String strVal = null;
			int intVal;
			boolean bVal;
			double dVal;
			XmlPath xmlPathEvaluator = apiResponse.xmlPath();
			Object obj = xmlPathEvaluator.get(xmlPath);
			String getObjType = obj.getClass().getTypeName().toString();
			if (getObjType.contains("String")) {
				strVal = xmlPathEvaluator.get(xmlPath);
				Assert.assertEquals("Mismatch in the response - XmlPath : ", expValue, strVal);
				LOGGER.info("Expected value " + expValue + " is matching with the actual : " + strVal);
			}
			if (getObjType.contains("Integer")) {
				intVal = xmlPathEvaluator.get(xmlPath);
				Assert.assertEquals(expValue, intVal, "Mismatch in the response - XmlPath : ");
				LOGGER.info("Expected value " + expValue + " is matching with the actual : " + intVal);
			}
			if (getObjType.contains("Boolean")) {
				bVal = xmlPathEvaluator.get(xmlPath);
				Assert.assertEquals(expValue, bVal, "Mismatch in the response - XmlPath : ");
				LOGGER.info("Expected value " + expValue + " is matching with the actual : " + bVal);
			}
			if (getObjType.contains("Double")) {
				dVal = xmlPathEvaluator.get(xmlPath);
				Assert.assertEquals(expValue, dVal, "Mismatch in the response - XmlPath : ");
				LOGGER.info("Expected value " + expValue + " is matching with the actual : " + dVal);
			}
		} catch (Exception e) {
			LOGGER.error("Error in validating the response, Exception :" + e);
			Assert.fail("Error in validating the response, Exception :" + e);
		}
	}

	public void setGetQueryParams(HashMap<String, String> params) {
		restSpec.params(params);
	}

	public void validateJsonKeyExistence(String jsonPath) {
		try {
			JsonPath jsonPathEvaluator = apiResponse.jsonPath();
			Object obj = jsonPathEvaluator.get(jsonPath);
			if (obj != null) {
				LOGGER.info("element " + jsonPath + " is exist in the responce");
			} else {
				LOGGER.info("element " + jsonPath + " is not exist in the responce");
				Assert.fail("element " + jsonPath + " is not exist in the responce");
			}
		} catch (Exception e) {
			LOGGER.error("Error in while checking existence element:" + e);
			Assert.fail("Error in while checking existence element:" + e);
		}
	}

	public byte[] convertFileToByte() {
		String jsonval = apiResponse.asString();
		byte[] responseval = jsonval.getBytes();
		return responseval;
	}

	public JSONObject conRespStringToJson() {
		String jsonval = apiResponse.asString();
		// JsonObject jsonObject = new JsonParser().parse(jsonval).getAsJsonObject();
		JSONObject json = new JSONObject(jsonval);
		return json;
	}

	public boolean valJsonEleNotExists(JSONObject jsonObject, String jsonPath, String jsonKey) {
		int jsonPathLen;
		String errorMessage = null;
		Object strObjValue = null;
		boolean flag = true;
		try {

			JSONArray jsonArr = new JSONArray();
			if (jsonPath.contains(".")) {
				String[] splitJsonObj = jsonPath.split("\\.");
				jsonPathLen = splitJsonObj.length;
				for (int i = 0; i < jsonPathLen; i++) {
					if (splitJsonObj[i].contains("[")) {
						String[] splitJsonArr = splitJsonObj[i].split("\\[");
						jsonArr = jsonObject.getJSONArray(splitJsonArr[0]);
						String jsonarrCount = splitJsonArr[1].replace("]", "");
						int arrCount = Integer.parseInt(jsonarrCount);
						jsonObject = jsonArr.getJSONObject(arrCount);
					} else {
						jsonObject = jsonObject.getJSONObject(splitJsonObj[i]);
					}
				}
				strObjValue = jsonObject.get(jsonKey).toString();

			} else {

				if (jsonPath.contains("[")) {
					String[] splitJsonArr = jsonPath.split("\\[");
					jsonArr = jsonObject.getJSONArray(splitJsonArr[0]);
					String jsonarrCount = splitJsonArr[1].replace("]", "");
					int arrCount = Integer.parseInt(jsonarrCount);
					jsonObject = jsonArr.getJSONObject(arrCount);
				} else {
					jsonObject = jsonObject.getJSONObject(jsonPath);
				}
				strObjValue = jsonObject.get(jsonKey).toString();
			}

		} catch (Exception e) {
			// LOGGER.error("Error in fetching the jsonpath value, Exception :" + e);
			errorMessage = e.getMessage();
		}
		if (errorMessage != null) {
			if (errorMessage.contains("not found")) {
				LOGGER.info("Element : " + jsonKey + " is not exist in the response");
			} else {
				flag = false;
			}

		} else {
			flag = false;
		}

		return flag;
	}

	public void setbaseValues(String uri, String proxyandport) {
		RestAssuredWrapper.uri = uri;

		if (!proxyandport.isEmpty()) {
			String proxyPort = proxyandport;
			String[] splitproxyPort = proxyPort.split(":");
			int port = Integer.parseInt(splitproxyPort[1]);
			restSpec.proxy(splitproxyPort[0], port);
		}

	}

	@SuppressWarnings("rawtypes")
	public static String postRequest(String fileName, String FilePath) {
		ResponseBody body = null;
		Response response;
		String Status = "";
		try {
			File path = new File(FilePath);

			RestAssured.baseURI = "https://ustglobaluk.outsystemscloud.com/CoPilot_Core/rest/CoPilot/documentsearch/uploadFile";
			RestAssured.useRelaxedHTTPSValidation();
			RequestSpecification request = RestAssured.given();

			JSONObject requestParams = new JSONObject();
			requestParams.put("x-api-key", "b811bd24-86bc-47df-b43c-cd36c1f6e34d");
			requestParams.put("x-file-name", fileName);

			// Add a header stating the Request body is a JSON
			request.header("x-api-key", "b811bd24-86bc-47df-b43c-cd36c1f6e34d"); // Add the Json to the body of the
																					// request
			request.header("x-file-name", fileName);
			request.body(path);

			response = request.post();
			body = response.getBody();
			JSONObject jsonvalue = new JSONObject(body.asString());
			FileIdvalue = jsonvalue.getString("FileId");
			System.out.println("File Id after Upload:- " + FileIdvalue);

			Status = response.getStatusLine();
		} catch (Exception e) {

		}

		// if(.contains("200")) {
		return Status;
	}

	@SuppressWarnings("rawtypes")
	public static String DataRequest(String Question) {

		System.out.println("Questions:- " + Question);

		RestAssured.baseURI = "https://ustglobaluk.outsystemscloud.com/CoPilot_Core/rest/CoPilot/documentsearch/search";
		RestAssured.useRelaxedHTTPSValidation();
		RequestSpecification request = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("Input", Question.trim());
		JSONArray FileDetails = new JSONArray();
		JSONObject FileIdd = new JSONObject();
		FileIdd.put("FileId", "November2023Bill_07192024061948.pdf");
		FileDetails.put(FileIdd);
		requestParams.put("FileDetails", FileDetails);
		request.header("Content-Type", "application/json");
		request.header("x-api-key", "b811bd24-86bc-47df-b43c-cd36c1f6e34d");
		request.body(requestParams.toString());

		Response response = request.post();
		ResponseBody body = response.getBody();

		JSONObject jsonvalue = new JSONObject(body.asString());
		System.out.println("PDF result after ask question:- " + jsonvalue);
		String Result = jsonvalue.getString("Result");
		return Result;
	}
	
	public String ModifyXmlData(String XmlData,String xmlPath,String xmlValue) {
		 String updatedXMLString="";
		try {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      DocumentBuilder builder;
			builder = factory.newDocumentBuilder();
			org.w3c.dom.Document doc = builder.parse(new InputSource(new StringReader(XmlData)));
			 doc.getDocumentElement().normalize();	
     
      XPath xPath = XPathFactory.newInstance().newXPath();
      
      	Node nameNode = (Node) xPath.evaluate(xmlPath, doc, XPathConstants.NODE);
      	if(xmlPath.indexOf("@")!=-1) {
      		Node detailsNode = (Node) xPath.evaluate(xmlPath, doc, XPathConstants.NODE);
      		 
   
              if (detailsNode != null && detailsNode.getNodeType() == Node.ELEMENT_NODE) {
                  Element detailsElement = (Element) detailsNode;
                  detailsElement.setAttribute("Code", xmlValue); 
                  LOGGER.info("Updated name attribute: " + detailsElement.getAttribute("Code"));

              } else {
                  System.out.println("Node not found");
              }
      	}
      	else if (nameNode != null) {
      		

              nameNode.setTextContent(xmlValue);
              
              LOGGER.info("Updated The data: " + nameNode.getTextContent()+" for the element "+xmlPath);
          } else {
              System.out.println(xmlValue);
          }
      	
      	 
      	
      	Transformer transformer = TransformerFactory.newInstance().newTransformer();
          transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
          transformer.setOutputProperty(OutputKeys.INDENT, "yes");
          StringWriter writer = new StringWriter();
          transformer.transform(new DOMSource(doc), new StreamResult(writer));
          updatedXMLString = writer.toString();
		}
		catch(Exception e) {
			e.printStackTrace(); 
		}
      	
      	return updatedXMLString;
    
		}
	
	
	public void CreateXmlResponseFile(String FolderName,String XmlData) {
		File responseDirectory=new File(FileUtils.getCurrentDir()+"/src/main/resources/WebServices/APIXmlResponse/"+FolderName);
		if(!responseDirectory.exists()) {
			FileUtils.makeDirs(FileUtils.getCurrentDir()+"/src/main/resources/WebServices/APIXmlResponse/"+FolderName);
		}
		  try (FileWriter writer = new FileWriter(FileUtils.getCurrentDir()+"/src/main/resources/WebServices/APIXmlResponse/"+FolderName+"/output"+DateTimeHelper.getTimeStamp()+".txt")) {
	            writer.write(XmlData);  
	            System.out.println("File created and string written successfully.");
	        } catch (IOException e) {
	            e.printStackTrace();  
	        }
	}
	
	public static String formatXml(String xmlContent){
        try {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new java.io.ByteArrayInputStream(xmlContent.getBytes()));
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        transformer.transform(new DOMSource(document), new StreamResult(outputStream));
        return outputStream.toString();
        }
        catch(Exception e) {
        	e.printStackTrace(); 
        }
		return "";
    }
}
