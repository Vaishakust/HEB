package com.scripted.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.scripted.web.WebHandlers;
import com.scripted.web.WebWaitHelper;

public class NewPage1 {
	
	@SuppressWarnings("unused")
	private WebDriver driver;
	
	@FindBy(xpath = "//*[@id='user-name']")
	private WebElement inputUsername;
	
	@FindBy(xpath = "//*[@id='password']")
	private WebElement inputPassword;
	
	
	@FindBy(xpath = "//*[@id='login-button']")
	private WebElement btnSubmit;
	
	
	@FindBy(css = "button#add-to-cart-sauce-labs-backpack")
	private WebElement addtocart;
	
	@FindBy(css = "div#shopping_cart_container>a")
	private WebElement icon;
	
	
	@FindBy(css = "button#checkout")
	private WebElement buttoncheckout;
	
	//scripts for clientPerf
	@FindBy(xpath = "//devsite-tabs[@class='upper-tabs']/nav/tab[3]/a")
	private WebElement solutions;
	

	public NewPage1(WebDriver driver) {
		this.driver = driver;
	}

	
	public void login (String username, String password ) {
        WebHandlers.enterText(inputUsername,username );
        WebHandlers.enterText(inputPassword,password );
        WebHandlers.click(btnSubmit);     
    }

    public void add_Product () {
    	WebWaitHelper.waitForElementToBeClickable(addtocart);
    	WebHandlers.click(addtocart);      
    }

    public void check_out () {
    	WebWaitHelper.waitForElementToBeClickable(icon);
        WebHandlers.click(icon);
        WebHandlers.click(buttoncheckout);   
    }
    
    public void click_solutions()  {
    	WebWaitHelper.waitForElementToBeClickable(solutions);
       WebHandlers.click(solutions); 
       WebWaitHelper.waitForPageLoad();
   }

}
