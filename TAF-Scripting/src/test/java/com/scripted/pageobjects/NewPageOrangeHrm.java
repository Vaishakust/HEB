package com.scripted.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.scripted.web.WebHandlers;

public class NewPageOrangeHrm {
	
	@SuppressWarnings("unused")
	private WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	private WebElement inputUsername;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	private WebElement inputPassword;
	
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	private WebElement btnSubmit;
	
	public NewPageOrangeHrm(WebDriver driver) {
		this.driver = driver;	
	}
	
	public void login (String username, String password ) throws InterruptedException {
        WebHandlers.enterText(inputUsername,username );
        WebHandlers.enterText(inputPassword,password );
        WebHandlers.clickByJsExecutor(btnSubmit);     
    }

}
