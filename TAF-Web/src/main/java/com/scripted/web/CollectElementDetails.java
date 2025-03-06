package com.scripted.web;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;
import org.json.simple.JSONArray;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.scripted.dataload.PropertyDriver;
import com.scripted.json.JsonTestData;
import com.scripted.selfhealing.SMWebHealer;

public class CollectElementDetails {

	static Boolean InsideFrame = false;
	public static String skyFlePath = "/src/main/resources/HealingConfigurations/skyFiles/";
	public static ConcurrentHashMap<String, String> PageElementMapforWebHandlers = new ConcurrentHashMap<>();
	public static Logger LOGGER = LogManager.getLogger(CollectElementDetails.class);

	public static void elementDetails(WebElement element) throws Exception {
		String pageName = null;
		String eleName = null;
		try {
			CollectElementDetails objEle = new CollectElementDetails();
			ConcurrentHashMap<String, String> healRptInfo1 = SMWebHealer.PageEleMapDetails;
			HashMap<String, String> CurrentelementDetails = objEle.findSelectorsforCurrentElement(element);
			ConcurrentHashMap<String, String> healRptInfo = CollectElementDetails.getPgAndElmtName(element);
			if (healRptInfo.get("PageName") == null && healRptInfo.get("ElementName") == null) {
				pageName = healRptInfo1.get("PageName");
				eleName = healRptInfo1.get("ElementName");
			} else {
				pageName = healRptInfo.get("PageName");
				eleName = healRptInfo.get("ElementName");
			}
			if (pageName != null || eleName != null) {
				objEle.writeJsonforCurrentElement(BrowserDriver.getDriver(), pageName, eleName, CurrentelementDetails);
			} else if (pageName == null || eleName == null) {
				throw new Exception("Not able to capture element details. PageName/ Element name is Null.");
			}
		} catch (Exception e) {
			LOGGER.error("Exception while collect element details" + e.getMessage());
		}
	}

	@SuppressWarnings({ "rawtypes", "unused" })
	public static ConcurrentHashMap<String, String> getPgAndElmtName(WebElement ele) {
		ConcurrentHashMap<String, String> PageEleMap = new ConcurrentHashMap<>();
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		String eleFlag = null;
		for (StackTraceElement strClasses : stackTraceElements) {
			String locatorType = null;
			String locatorValue = null;
			if (strClasses.getClassName().contains("Page") || strClasses.getClassName().contains("page")) {
				try {
					// System.out.println("Class names :" + strClasses.getClassName());
					String strClass = strClasses.getClassName();
					Class cls = Class.forName(strClass);
					ClassLoader cLoader = cls.getClassLoader();
					Field[] classElements = cls.getDeclaredFields();
					String eleDetails = ele.toString();
					// System.out.println("Element details inside pagename identify : "+eleDetails);
					eleDetails = eleDetails.substring(1, eleDetails.length() - 1);
					String[] data = null;
					if (eleDetails.contains("DefaultElementLocator"))
						data = eleDetails.split("By.")[1].split(": ");
					else
						data = eleDetails.split(" -> ")[1].split(": ");
					locatorType = data[0];
					locatorValue = data[1];
					PageEleMap.put("locatorValue", locatorValue);
					PageEleMap.put("locatorType", locatorType);
					for (Field classElement : classElements) { // issue
						if (classElement.getType().toString().contains("WebElement")) {
							String elementName = classElement.toString();
							FindBy findByAnnotation = classElement.getAnnotation(FindBy.class);
							PageEleMap.putAll(identifyElement(findByAnnotation, elementName, PageEleMap));
							eleFlag = PageEleMap.get("status");
							if (eleFlag == "true")
								break;
						}

					}
				} catch (Exception e1) {
					LOGGER.error("Error while getting locator type and locator value");
					e1.printStackTrace();

				}
			}
		}
		return PageEleMap;
	}

	private static ConcurrentHashMap<String, String> identifyElement(FindBy findByAnnotation, String eleNme,
			ConcurrentHashMap<String, String> PgeEleVleMap) {
		ConcurrentHashMap<String, String> PgeIdentifyEleMap = new ConcurrentHashMap<>();
		// System.out.println("Locator value in identifyElement : "+locatorValue);
		// System.out.println("Locator type in identifyElement : "+locatorType);
		// System.out.println("Element name in identifyElement "+eleNme);
		try {
			switch (PgeEleVleMap.get("locatorType")) {
			case "xpath":
				if (!findByAnnotation.xpath().isEmpty()
						&& findByAnnotation.xpath().trim().equals(PgeEleVleMap.get("locatorValue")))
					PgeIdentifyEleMap = setPgAndElmtMap(eleNme);
				break;
			case "css selector":
				if (!findByAnnotation.css().isEmpty()
						&& findByAnnotation.css().trim().equals(PgeEleVleMap.get("locatorValue")))
					PgeIdentifyEleMap = setPgAndElmtMap(eleNme);
				break;
			case "id":
				if (!findByAnnotation.id().isEmpty()
						&& findByAnnotation.id().trim().equals(PgeEleVleMap.get("locatorValue")))
					PgeIdentifyEleMap = setPgAndElmtMap(eleNme);
				break;
			case "tag name":
				if (!findByAnnotation.tagName().isEmpty()
						&& findByAnnotation.tagName().trim().equals(PgeEleVleMap.get("locatorValue")))
					PgeIdentifyEleMap = setPgAndElmtMap(eleNme);
				break;
			case "name":
				if (!findByAnnotation.name().isEmpty()
						&& findByAnnotation.name().trim().equals(PgeEleVleMap.get("locatorValue")))
					PgeIdentifyEleMap = setPgAndElmtMap(eleNme);
				break;
			case "link text":
				if (!findByAnnotation.linkText().isEmpty()
						&& findByAnnotation.linkText().trim().equals(PgeEleVleMap.get("locatorValue")))
					PgeIdentifyEleMap = setPgAndElmtMap(eleNme);
				break;
			case "class name":
				if (!findByAnnotation.className().isEmpty()
						&& findByAnnotation.className().trim().equals(PgeEleVleMap.get("locatorValue")))
					PgeIdentifyEleMap = setPgAndElmtMap(eleNme);
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("Error while checking using findBy Annotation");
			// System.out.println("Page details inside Identify element :" +PgeEleMap);
		}

		return PgeIdentifyEleMap;

	}

	public static ConcurrentHashMap<String, String> setPgAndElmtMap(String eleNme) {
		ConcurrentHashMap<String, String> PageElementMap = new ConcurrentHashMap<>();
		// System.out.println("eleNme in setPgAndElmtMap :"+eleNme);
		try {
			String[] eleArray = eleNme.split("[.]");
			int length = eleNme.split("[.]").length;
			PageElementMap.put("PageName", eleArray[length - 2]);
			PageElementMap.put("ElementName", eleArray[length - 1]);
			PageElementMapforWebHandlers.put("PageName", eleArray[length - 2]);
			PageElementMapforWebHandlers.put("ElementName", eleArray[length - 1]);
			LOGGER.info("Pagename is : " + PageElementMap.get("PageName"));
			LOGGER.info("Element name is : " + PageElementMap.get("ElementName"));
			PageElementMap.put("status", "true");
		} catch (Exception e) {
			LOGGER.error("Error while setting pagename and elementname");
		}
		return PageElementMap;
	}

	@SuppressWarnings({ "null", "unchecked", "unused" })
	public HashMap<String, String> findSelectorsforCurrentElement(WebElement element) {
		HashMap<String, String> CurrentElement = new HashMap<>();
		List<Object> listdatavalues = null;

		try {
			JavascriptExecutor js = (JavascriptExecutor) BrowserDriver.getDriver();
			String selectorsHubJs = null;
			try {
				selectorsHubJs = new String(
						this.getClass().getClassLoader().getResourceAsStream("selectorshub.js").readAllBytes(),
						StandardCharsets.UTF_8);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Object out = js.executeScript(selectorsHubJs + ";prepareListOfAttrText(arguments[0]);"
					+ "return onInspectElementClick(arguments[0], ',withid,withclass,withname,withplaceholder,withtext', 'GeneratorAndEditor')",
					element);
			List<Object> values = (ArrayList<Object>) out;
			int value = values.size();
			CurrentElement.put("name", element.getText().toString());
			String parentbdxpth = null;
			String currenEleTagName = element.getTagName().toString();
			String currentelementcss = null;

			for (int i = 0; i < values.size(); i++) {
				Object gh = values.get(i);
				if (gh != null && gh != "null" && gh != "" && !gh.equals("")) {
					String gj = gh.toString();
					String[] hj = gj.split(",");
					String csscurrElement = hj[0].substring(1);
					if (i == 1) {
						if (csscurrElement != null && csscurrElement != "null") {
							currentelementcss = csscurrElement;
						}
					}
				}
			}

			// AttributeBasedXpath

			HashMap<String, String> AttributeBasedXpathDetails = getElementAttributeBasedXpath(element);

			if (AttributeBasedXpathDetails != null) {

				for (Entry<String, String> var : AttributeBasedXpathDetails.entrySet()) {

					if (var.getKey().equals("Dataid")) {
						String DataidVal = var.getValue().toString();
						if (DataidVal != null && DataidVal != "") {
							CurrentElement.put("xpath:Dataid", DataidVal);
						} else {
							CurrentElement.put("xpath:Dataid", "");
						}
					}

					if (var.getKey().equals("ArialLabel")) {
						String labelVal = var.getValue().toString();
						if (labelVal != null && labelVal != "") {
							CurrentElement.put("xpath:ArialLabel", labelVal);
						} else {
							CurrentElement.put("xpath:ArialLabel", "");
						}
					}

					if (var.getKey().equals("text")) {
						String textVal = var.getValue().toString();
						if (textVal != null && textVal != "") {
							CurrentElement.put("xpath:text", textVal);
						} else {
							CurrentElement.put("xpath:text", "");
						}
					}

					if (var.getKey().equals("placeholder")) {
						String placeVal = var.getValue().toString();
						if (placeVal != null && placeVal != "") {
							CurrentElement.put("xpath:placeholder", placeVal);
						} else {
							CurrentElement.put("xpath:placeholder", "");
						}
					}
				}
			}

			// Parentxpath collection for currentElement

			WebElement parentElement = ImmediateparentElemetDetails(element);
			String parrentEleTagName = parentElement.getTagName().toString();

			HashMap<String, Object> elementDetailsforParent = findSelectorsforParentElement(parentElement);
			int actualPositionParent = 0;
			String parxpathRelative = null;
			String parxpathwithindex = null;
			String parxpathbasedonCSS = null;
			String parxpathBasedonAbsxpath = null;
			String parvalueBasedonindexing = null;
			String parvalueBasedonCss = null;

			for (Entry<String, Object> var : elementDetailsforParent.entrySet()) {

				if (var.getKey().equals("relativexpath")) {
					String parvalueBasedonRel = var.getValue().toString();
					if (parvalueBasedonRel != null && parvalueBasedonRel != "null" && parvalueBasedonRel != ""
							&& !parvalueBasedonRel.equals("")) {
						parxpathRelative = parvalueBasedonRel + "//child::" + currenEleTagName;
					}
				}

				if (var.getKey().equals("xpathwithindex")) {
					parvalueBasedonindexing = var.getValue().toString();
					if (parvalueBasedonindexing != null && parvalueBasedonindexing != "null"
							&& parvalueBasedonindexing != "" && !parvalueBasedonindexing.equals("")) {
						parxpathwithindex = parvalueBasedonindexing + "//child::" + currenEleTagName;
					}
				}

				if (var.getKey().equals("CSS")) {
					parvalueBasedonCss = var.getValue().toString();
					if (parvalueBasedonCss != null && parvalueBasedonCss != "null" && parvalueBasedonCss != ""
							&& !parvalueBasedonCss.equals("")) {
						parxpathbasedonCSS = parvalueBasedonCss + " " + currentelementcss;
					}
				}

				if (var.getKey().equals("AbsXpath")) {
					String parvalueBasedonAbsxpath = var.getValue().toString();
					if (parvalueBasedonAbsxpath != null && parvalueBasedonAbsxpath != "null"
							&& parvalueBasedonAbsxpath != "" && !parvalueBasedonAbsxpath.equals("")) {
						parxpathBasedonAbsxpath = parvalueBasedonAbsxpath + "//child::" + currenEleTagName;

					}
				}
			}

			// Ancestorxpath collection for currentElement

			WebElement ancestorElement = ImmediateancestorElemetDetails(element);

			HashMap<String, Object> elementDetailsforancestor = findSelectorsforParentElement(ancestorElement);

			String ancestorxpathRelative = null;
			String ancestorxpathwithindex = null;
			String ancestorxpathbasedonCSS = null;

			// Position of current element
			int posParent = 0;

			for (Entry<String, Object> varancestor : elementDetailsforancestor.entrySet()) {
				if (varancestor.getKey().equals("relativexpath")) {
					String ancestorvalueBasedonRel = varancestor.getValue().toString();
					List<WebElement> parenelemcheck = BrowserDriver.getDriver()
							.findElements(By.xpath(ancestorvalueBasedonRel));
					int parentindex = parenelemcheck.indexOf(parentElement);
					posParent = parentindex + 1;
					if (ancestorvalueBasedonRel != null && ancestorvalueBasedonRel != "null"
							&& ancestorvalueBasedonRel != "" && !ancestorvalueBasedonRel.equals("")) {

						ancestorxpathRelative = ancestorvalueBasedonRel + "/" + parrentEleTagName + "//child::"
								+ currenEleTagName;
						// ancestorxpathRelative = ancestorvalueBasedonRel + "/" +
						// parvalueBasedonindexing +"//child::" + currenEleTagName;
					}
				}

				if (varancestor.getKey().equals("xpathwithindex")) {
					String ancestorvalueBasedonindexing = varancestor.getValue().toString();
					if (ancestorvalueBasedonindexing != null && ancestorvalueBasedonindexing != "null"
							&& ancestorvalueBasedonindexing != "" && !ancestorvalueBasedonindexing.equals("")) {
						ancestorxpathwithindex = ancestorvalueBasedonindexing + "//child::" + currenEleTagName;
					}
				}

			}

			// Position of current element

			List<WebElement> yt = BrowserDriver.getDriver().findElements(By.xpath(parxpathRelative));
			int indexCurrEle = yt.indexOf(element);
			int actualPosition = indexCurrEle + 1;

			// following-Sibling for currentElement
			String followingsiblingxpth = "";
			WebElement elementsibprev = prevsibilingsElemetDetails(element);
			if (elementsibprev != null) {

				HashMap<String, Object> elementDetailsforoutsiblings = findSelectorsforParentElement(elementsibprev);
				for (Entry<String, Object> varsibprev : elementDetailsforoutsiblings.entrySet()) {
					if (varsibprev.getKey().equals("relativexpath")) {
						String sibprevvalueBasedonRel = varsibprev.getValue().toString();
						List<WebElement> sibilings = BrowserDriver.getDriver()
								.findElements(By.xpath(sibprevvalueBasedonRel));
						int indexelebased = sibilings.indexOf(element);
						indexelebased = indexelebased + 1;
						if (indexelebased == 0) {
							if (sibprevvalueBasedonRel != null && sibprevvalueBasedonRel != "null"
									&& sibprevvalueBasedonRel != "" && !sibprevvalueBasedonRel.equals("")) {
								followingsiblingxpth = sibprevvalueBasedonRel + "/following-sibling::"
										+ currenEleTagName;

							}
						} else {
							if (sibprevvalueBasedonRel != null && sibprevvalueBasedonRel != "null"
									&& sibprevvalueBasedonRel != "" && !sibprevvalueBasedonRel.equals("")) {
								followingsiblingxpth = sibprevvalueBasedonRel + "/following-sibling::"
										+ currenEleTagName + "[" + indexelebased + "]";

							}
						}
					}
				}
			} else {
				followingsiblingxpth = null;
			}
			// next-Sibling for currentElement
			String nextsiblingxpth = "";
			WebElement elementnextsib = nextElementsibilingsDetails(element);
			if (elementnextsib != null) {
				HashMap<String, Object> elementDetailsnextsiblings = findSelectorsforParentElement(elementnextsib);
				for (Entry<String, Object> varsibnext : elementDetailsnextsiblings.entrySet()) {
					if (varsibnext.getKey().equals("relativexpath")) {
						String sibnextvalueBasedonRel = varsibnext.getValue().toString();
						List<WebElement> sibilingsnext = BrowserDriver.getDriver()
								.findElements(By.xpath(sibnextvalueBasedonRel));
						int indexelebasedsib = sibilingsnext.indexOf(element);
						indexelebasedsib = indexelebasedsib + 1;
						if (indexelebasedsib == 0) {
							if (sibnextvalueBasedonRel != null && sibnextvalueBasedonRel != "null"
									&& sibnextvalueBasedonRel != "" && !sibnextvalueBasedonRel.equals("")) {
								nextsiblingxpth = sibnextvalueBasedonRel + "/preceding-sibling::" + currenEleTagName;

							} else {
								if (sibnextvalueBasedonRel != null && sibnextvalueBasedonRel != "null"
										&& sibnextvalueBasedonRel != "" && !sibnextvalueBasedonRel.equals("")) {
									nextsiblingxpth = sibnextvalueBasedonRel + "/preceding-sibling::" + currenEleTagName
											+ "[" + indexelebasedsib + "]";
									;

								}
							}
						}
					}

				}
			} else {
				nextsiblingxpth = null;
			}

			Object elementAttributes = js.executeScript(
					"var items = {}; for (index = 0; index < arguments[0].attributes.length; ++index) { items[arguments[0].attributes[index].name] = arguments[0].attributes[index].value }; return items;",
					element);

			System.out.println("Attribute values" + elementAttributes.toString());

			String jj = null;
			for (int i = 0; i < values.size(); i++) {
				Object gh = values.get(i);
				if (gh != null && gh != "null" && gh != "" && !gh.equals("")) {
					String gj = gh.toString();
					String[] hj = gj.split(",");
					jj = hj[0].substring(1);
					if (i == 0) {
						if (jj != null && jj != "null") {
							String xpathappend = jj;
							CurrentElement.put("xpath:default", jj);
							CurrentElement.put("xpath:Parent", parxpathRelative + "[" + actualPosition + "]");
							CurrentElement.put("xpath:parentwithindex", parxpathwithindex + "[" + actualPosition + "]");
							CurrentElement.put("xpath:parentoncss", parxpathbasedonCSS);
							CurrentElement.put("xpath:parentonAbsxpath",
									parxpathBasedonAbsxpath + "[" + actualPosition + "]");
							CurrentElement.put("xpath:Ancestor", ancestorxpathRelative + "[" + actualPosition + "]");
							CurrentElement.put("xpath:ancestorwithindex",
									ancestorxpathwithindex + "[" + actualPosition + "]");
							CurrentElement.put("xpath:Follows", followingsiblingxpth);
							if (nextsiblingxpth != null) {
								CurrentElement.put("xpath:Precedance", nextsiblingxpth + "[" + actualPosition + "]");
							} else if (nextsiblingxpth == null) {
								CurrentElement.put("xpath:Precedance", "");
							}
						}
					}

					if (i == 1) {
						if (jj != null && jj != "null") {
							CurrentElement.put("css", jj);
						}
					}

					if (i == 2) {
						if (jj != null && jj != "null") {
							String xpathappend = jj;
							CurrentElement.put("xpath:Position", jj);
						}
					}

					if (i == 3) {
						if (jj != null && jj != "null") {
							CurrentElement.put("id", jj);
						}
					}

					if (i == 4) {
						if (jj != null && jj != "null") {
							CurrentElement.put("name", jj);
						}
					}

					if (i == 5) {
						if (jj != null && jj != "null") {
							CurrentElement.put("classname", jj);
						}
					}

					if (i == 6) {
						if (jj != null && jj != "null") {
							CurrentElement.put("linkText", jj);
						}
					}

					if (i == 7) {
						if (jj != null && jj != "null") {
							CurrentElement.put("partiallinktext", jj);
						}
					}

					if (i == 8) {
						if (jj != null && jj != "null") {
							CurrentElement.put("xpath:fullXPath", jj);
						}
					}

				} else if (gh == null || gh == "null" || gh == "" || gh.equals("")) {

					if (i == 0) {
						CurrentElement.put("xpath:default", "");
						CurrentElement.put("xpath:Parent", "");
					}

					if (i == 1) {

						CurrentElement.put("css", "");

					}

					if (i == 2) {

						CurrentElement.put("xpath:position", "");

					}

					if (i == 3) {

						CurrentElement.put("id", "");

					}

					if (i == 4) {

						CurrentElement.put("name", "");

					}

					if (i == 5) {

						CurrentElement.put("classname", "");

					}

					if (i == 6) {

						CurrentElement.put("linkText", "");

					}

					if (i == 7) {
						CurrentElement.put("partiallinktext", "");
					}

					if (i == 8) {
						CurrentElement.put("xpath:fullxpath", "");
					}

					if (i == 13) {

						CurrentElement.put("xpath:attributes", elementAttributes.toString());
					}

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return CurrentElement;
	}

	// Immediate element details for second json file

	@SuppressWarnings("unused")
	public WebElement ImmediateparentElemetDetails(WebElement element) {
		WebElement parentElement;
		String currentElementTagename = element.getTagName();
		parentElement = (WebElement) ((JavascriptExecutor) BrowserDriver.getDriver())
				.executeScript("return arguments[0].parentNode;", element);
		System.out.println("Parent element " + parentElement.getTagName());
		String tagname = parentElement.getTagName();
		String parentid = parentid(parentElement);
		String parentClassName = parentclassName(parentElement);
		String parentName = parentName(parentElement);

		if (!tagname.contains("table") && !tagname.contains("tr") && !tagname.contains("td")) {
			if (parentid == "" && parentid.isBlank() && parentid.isEmpty() && parentid == null && parentClassName == ""
					&& parentClassName.isBlank() && parentClassName.isEmpty() && parentClassName == null
					&& parentName == "" && parentName.isBlank() && parentName.isEmpty() && parentName == null) {
				ImmediateparentElemetDetails(parentElement);
			}
		}
		return parentElement;
	}

	public String parentid(WebElement Ele) {
		String _attributeElement3 = null;
		try {
			_attributeElement3 = Ele.getAttribute("id");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return _attributeElement3;

	}

	public String parentclassName(WebElement Ele) {
		String _attributeElement3 = null;
		try {
			_attributeElement3 = Ele.getAttribute("class");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return _attributeElement3;

	}

	public String parentName(WebElement Ele) {
		String _attributeElement3 = null;
		try {
			_attributeElement3 = Ele.getAttribute("name");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return _attributeElement3;

	}

	@SuppressWarnings("unused")
	private HashMap<String, String> getElementAttributeBasedXpath(WebElement ele) {
		HashMap<String, String> attrubteBasedXpath = new HashMap<>();
		String elementText = "";
		String AttribureDataidExpression = null;
		String AttribureArialabelXpath = null;
		String AttriburetextbasedXpath = null;
		String AttribureplaceholderXpath = null;
		String AttriburedataidXpath = null;
		String eletext = ele.getText();
		String eletagName = ele.getTagName();
		String datatestid = ele.getAttribute("data-testid");
		if (null != ele && ele.getTagName().equalsIgnoreCase("input")) {
			String eleType = ele.getAttribute("type");
			String eledatatestid = ele.getAttribute("data-testid");
			String elearialabel = ele.getAttribute("aria-label");
			String eleplaceholder = ele.getAttribute("placeholder");

			// AttributeBasedDataidXpath
			if (eleType != null && eledatatestid != null) {

				AttribureDataidExpression = "//" + ele.getTagName() + "[" + "@type='" + eleType + "'" + "and"
						+ "@data-testid='" + eledatatestid + "']";
				List<WebElement> webdatatestid = BrowserDriver.getDriver()
						.findElements(By.xpath(AttribureDataidExpression));
				int value = webdatatestid.indexOf(ele);
				value = value + 1;
				attrubteBasedXpath.put("Dataid", AttribureDataidExpression + "[" + value + "]");
			}
			// AttributeBasedArialabelXpath

			if (elearialabel != null) {
				AttribureArialabelXpath = "//" + ele.getTagName() + "[" + "@aria-label='" + elearialabel + "']";
				List<WebElement> webdatatestid = BrowserDriver.getDriver()
						.findElements(By.xpath(AttribureArialabelXpath));
				int value = webdatatestid.indexOf(ele);
				value = value + 1;
				attrubteBasedXpath.put("ArialLabel", AttribureArialabelXpath + "[" + value + "]");
			}

			if (eleplaceholder != null) {
				AttribureplaceholderXpath = "//" + ele.getTagName() + "[" + "@placeholder='" + eleplaceholder + "']";
				List<WebElement> webdatatestid = BrowserDriver.getDriver()
						.findElements(By.xpath(AttribureplaceholderXpath));
				int value = webdatatestid.indexOf(ele);
				value = value + 1;

				attrubteBasedXpath.put("placeholder", AttribureplaceholderXpath + "[" + value + "]");

			}
		} else {
			// AttributeBasedtextbasedXpath
			if (eletext != null) {
				// *[text()='Show1']
				AttriburetextbasedXpath = "//" + ele.getTagName() + "[text()='" + eletext + "']";
				List<WebElement> webdatatestid = BrowserDriver.getDriver()
						.findElements(By.xpath(AttriburetextbasedXpath));
				int value = webdatatestid.indexOf(ele);
				value = value + 1;
				attrubteBasedXpath.put("text", AttriburetextbasedXpath + "[" + value + "]");
			}
			if (datatestid != null) {
				// *[text()='Show1']
				AttriburedataidXpath = "//" + ele.getTagName() + "[@data-testid='" + datatestid + "']";
				List<WebElement> webdatatestid = BrowserDriver.getDriver().findElements(By.xpath(AttriburedataidXpath));
				int value = webdatatestid.indexOf(ele);
				value = value + 1;
				attrubteBasedXpath.put("Datatestid", AttriburedataidXpath + "[" + value + "]");
			}
		}
		return attrubteBasedXpath;
	}

	@SuppressWarnings({ "null", "unchecked" })
	public HashMap<String, Object> findSelectorsforParentElement(WebElement element) {
		HashMap<String, Object> Parentlement = new HashMap<>();
		try {
			JavascriptExecutor js = (JavascriptExecutor) BrowserDriver.getDriver();
			String selectorsHubJs = null;
			try {
				selectorsHubJs = new String(
						this.getClass().getClassLoader().getResourceAsStream("selectorshub.js").readAllBytes(),
						StandardCharsets.UTF_8);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Object out = js.executeScript(selectorsHubJs + ";prepareListOfAttrText(arguments[0]);"
					+ "return onInspectElementClick(arguments[0], ',withid,withclass,withname,withplaceholder,withtext', 'GeneratorAndEditor')",
					element);
			List<Object> values = (List<Object>) out;
			values.size();
			Parentlement.put("name", element.getText());
			if (values.get(0) != null) {
				List<Object[]> fg = (List<Object[]>) values.get(0);
				Parentlement.put("relativexpath", fg.get(0));
			}

			if (values.get(1) != null) {
				List<Object[]> fg = (List<Object[]>) values.get(1);
				Parentlement.put("CSS", fg.get(0));
			}

			if (values.get(2) != null) {
				List<Object[]> fg = (List<Object[]>) values.get(2);
				Parentlement.put("xpathwithindex", fg.get(0));
			}

			if (values.get(3) != null) {
				List<Object[]> fg = (List<Object[]>) values.get(3);
				Parentlement.put("id", fg.get(0));
			}
			if (values.get(4) != null) {
				List<Object[]> fg = (List<Object[]>) values.get(4);
				Parentlement.put("name", fg.get(0));
			}

			if (values.get(5) != null) {
				List<Object[]> fg = (List<Object[]>) values.get(5);
				Parentlement.put("classname", fg.get(0));
			}
			if (values.get(8) != null) {
				List<Object[]> fg = (List<Object[]>) values.get(8);
				Parentlement.put("AbsXpath", fg.get(0));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Parentlement;
	}

	public WebElement ImmediateancestorElemetDetails(WebElement element) {

		@SuppressWarnings("unused")
		String currentElementTagename = element.getTagName();
		WebElement parentElement = (WebElement) ((JavascriptExecutor) BrowserDriver.getDriver())
				.executeScript("return arguments[0].parentNode;", element);
		WebElement ancestorElement = (WebElement) ((JavascriptExecutor) BrowserDriver.getDriver())
				.executeScript("return arguments[0].parentNode;", parentElement);
		System.out.println("ancestor element " + ancestorElement.getTagName());
		return ancestorElement;

	}

	public WebElement prevsibilingsElemetDetails(WebElement element) {
		WebElement previousSiblingsElement = (WebElement) ((JavascriptExecutor) BrowserDriver.getDriver())
				.executeScript("return arguments[0].previousElementSibling;", element);
		return previousSiblingsElement;

	}

	public WebElement nextElementsibilingsDetails(WebElement element) {
		WebElement nextElementSibling = (WebElement) ((JavascriptExecutor) BrowserDriver.getDriver())
				.executeScript("return arguments[0].nextElementSibling;", element);
		return nextElementSibling;

	}

	@SuppressWarnings({ "unchecked", "unused" })
	public void writeJsonforCurrentElement(WebDriver driver, String PageName, String ElementName,
			HashMap<String, String> currentElement) throws IOException {
		PropertyDriver propDriver = new PropertyDriver();
		propDriver.setPropFilePath("src/main/resources/DataFiles/Properties/config.properties");
		String project = PropertyDriver.readProp("project");
		String url = BrowserDriver.url;
		JSONObject elementObject = new JSONObject();
		JSONObject elementObjectbase = new JSONObject();
		String dir = System.getProperty("user.dir");
		dir += "/src/main/resources/HealingConfigurations/skyFiles";
		// Creating a JSONObject object

		for (Entry<String, String> var : currentElement.entrySet()) {
			if (var.getKey().equals("id")) {
				elementObjectbase.put(var.getKey(), var.getValue());

			}
			if (var.getKey().equals("name")) {
				elementObjectbase.put(var.getKey(), var.getValue());
			}
			if (var.getKey().equals("classname")) {
				elementObjectbase.put(var.getKey(), var.getValue());
			}

			if (var.getKey().equals("css")) {
				elementObjectbase.put(var.getKey(), var.getValue());
			}

			if (var.getKey().equals("attributes")) {
				elementObjectbase.put(var.getKey(), var.getValue());
			}

			if (var.getKey().contains("xpath")) {
				String path[] = var.getKey().split("xpath:", 0);
				elementObject.put(path[1], var.getValue());
			}
		}

		String dir1 = System.getProperty("user.dir");
		File f = new File(dir1 + skyFlePath + "Web.json");

		if (f.exists()) {
			String jsonValue = JsonTestData.loadforCurrentElements(f.toString());
			JSONObject jsonloader = new JSONObject(jsonValue);
			String projectName = jsonloader.getString("projectName");
			String projecturl = jsonloader.getString("pageUrl");
			Boolean pageExists = false;
			if (projectName.equals(project) && projecturl.equals(BrowserDriver.url)) {
				org.json.JSONArray Pages = jsonloader.getJSONObject("objectRepository").getJSONObject("webObjectRepo")
						.getJSONArray("pages");
				for (int i = 0; i < Pages.length(); i++) {
					String PgName = Pages.getJSONObject(i).getString("pageName");
					if (PgName.equals(PageName)) {
						pageExists = true;
						org.json.JSONArray Webelements = Pages.getJSONObject(i).getJSONArray("webElements");
						Boolean notElementMatch = false;
						String iframe = "";
						Boolean notElementIframe = false;
						for (int a = 0; a < Webelements.length(); a++) {
							String EleName = Webelements.getJSONObject(a).getString("elementName");

							if (EleName.equals(ElementName)) {
								JSONObject locatorsJson = Webelements.getJSONObject(a).getJSONObject("locators");
								iframe = locatorsJson.getString("iframeElement");
								Webelements.getJSONObject(a).put("locators", elementObjectbase);
								elementObjectbase.put("xpath", elementObject);
								if (iframe.equals("true") || InsideFrame.equals("true")) {
									elementObjectbase.put("iframeElement", "true");
								} else if (iframe.equals("false")) {
									elementObjectbase.put("iframeElement", InsideFrame.toString());
								}
								notElementMatch = true;
								break;
							}

						}
						if (!notElementMatch) {
							JSONObject elementDetails = new JSONObject();
							elementObjectbase.put("xpath", elementObject);
							elementDetails.put("elementName", ElementName);
							elementObjectbase.put("iframeElement", InsideFrame.toString());
							elementDetails.put("locators", elementObjectbase);
							Webelements.put(elementDetails);
							break;
						}
					}
				}
				if (!pageExists) {

					elementObjectbase.put("xpath", elementObject);

					JSONObject elementDetails = new JSONObject();

					elementDetails.put("elementName", ElementName);

					elementObjectbase.put("iframeElement", InsideFrame.toString());

					elementDetails.put("locators", elementObjectbase);

					JSONArray Elementdetailsarray = new JSONArray();
					Elementdetailsarray.add(elementDetails);

					JSONObject pageNameDetails = new JSONObject();
					pageNameDetails.put("pageName", PageName);
					pageNameDetails.put("webElements", Elementdetailsarray);

					Pages.put(pageNameDetails);

				}
				FileWriter file = new FileWriter(f);
				file.write(jsonloader.toString(4));
				file.close();
			}
		} else {

			elementObjectbase.put("xpath", elementObject);

			JSONObject elementDetails = new JSONObject();

			elementDetails.put("elementName", ElementName);

			elementObjectbase.put("iframeElement", InsideFrame.toString());

			elementDetails.put("locators", elementObjectbase);

			JSONArray Elementdetailsarray = new JSONArray();
			Elementdetailsarray.add(elementDetails);

			JSONObject pageNameDetails = new JSONObject();
			pageNameDetails.put("pageName", PageName);
			pageNameDetails.put("webElements", Elementdetailsarray);

			JSONArray pages = new JSONArray();
			pages.add(pageNameDetails);

			JSONObject pageinit = new JSONObject();
			pageinit.put("pages", pages);

			JSONObject webObjectRepo = new JSONObject();
			webObjectRepo.put("webObjectRepo", pageinit);

			JSONObject objectRepository = new JSONObject();
			objectRepository.put("objectRepository", webObjectRepo);

			JSONObject finalDetailsLa = new JSONObject();
			finalDetailsLa.put("projectName", project);
			finalDetailsLa.put("pageUrl", BrowserDriver.url);
			finalDetailsLa.put("objectRepository", webObjectRepo);

			FileWriter file = new FileWriter(dir + "/Web.json");
			file.write(finalDetailsLa.toString(4));
			file.close();
		}
	}

	public static Boolean elementPresenceCheck(WebElement element) throws Exception {
		Boolean elem = false;
		try {
			element.isDisplayed();
			// Since, no exception, so element is present
			System.out.println("Element present");
			elem = true;
		} catch (NoSuchElementException e) {
			// Element is not present
			LOGGER.error("Element not available for the webPage" + e.getMessage());
			elem = false;
		}
		return elem;
	}

}
