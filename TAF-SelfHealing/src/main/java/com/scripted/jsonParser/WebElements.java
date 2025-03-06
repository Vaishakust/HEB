package com.scripted.jsonParser;
 
public class WebElements {
	
	private String elementName;
	private Locators locators;
	private Attributes attributes;
	public String getElementName() {
		return elementName;
	}
	public void setElementName(String elementName) {
		this.elementName = elementName;
	}
	
	public Locators getLocators() {
		return locators;
	}
	public void setLocators(Locators locators) {
		this.locators = locators;
	}
	
	public Attributes getattributes() {
		return attributes;
	}
	
	public void setattributes(Attributes attributes) {
		this.attributes = attributes;
	}
	
	
	@Override
	public String toString() {
		return "WebElements [elementName=" + elementName + ", locators=" + locators + ",attributes=" + attributes +"]";
	}


}
