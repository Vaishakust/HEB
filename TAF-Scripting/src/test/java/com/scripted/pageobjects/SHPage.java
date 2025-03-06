package com.scripted.pageobjects;

import java.io.IOException;
import java.time.Duration;
import java.util.LinkedHashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.scripted.web.BrowserDriver;
import com.scripted.web.WebHandlers;
import com.scripted.web.WebWaitHelper;

public class SHPage {
		
	@FindBy(id = "resultTable")
	private WebElement usersTable;
	
	@FindBy(xpath = "//input[@id='ohrmList_chkSelectRecord_2']")
	private WebElement adminCheckBox;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement emailInput;
	
	@FindBy(xpath = "//button[@onclick='windowAlertFunction()']")
	private WebElement alertButton;
	
	@FindBy(id = "coming google")
	private WebElement iframeElement;
	
	@FindBy(id = "i6")
	private WebElement radioButtonYes;
	
	@FindBy(xpath = "//input[@placeholder='First Enter name']")
	private WebElement firstNameField;
	
	@FindBy(xpath = "//input[@placeholder='First Enter name']/../label//following::*[local-name()=\"svg\"]")
	private WebElement editButton;
	
	@FindBy(xpath = "//input[@name='payment']")
	private WebElement nonExistentPaymentField;
	
	@FindBy(id = "cars")
	private WebElement carsDropdown;
	
	public void clickLinkInTable(String link) {
		WebHandlers.TblCelLinkClick(usersTable, link);
	}
	public void clickElementInTable(int columnIndex, String element) {
		WebHandlers.TblCelEleClick(usersTable, element,columnIndex,"a");
	}
	public int getNumberOfTabsOpened() {
		WebWaitHelper.waitForPageLoad();
		String[] handles=WebHandlers.getWindowHandles();
		return handles.length;
		
	}
	public void selectCheckBox(int columnIndex, String element) {
		WebHandlers.TblCelChkboxClick(usersTable, element, columnIndex);
	}
	public boolean isCheckBoxClicked() {
		WebDriverWait wait = new WebDriverWait(BrowserDriver.getDriver(), Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.elementSelectionStateToBe(adminCheckBox, true));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return WebHandlers.chkboxIsChecked(adminCheckBox);
	}
	public void enterEmailByJS(String email) throws IOException{
		WebHandlers.enterTxtByJavaScript(emailInput, email);
	}
	public void verifyEmail(String email) {
		WebHandlers.verifyText(emailInput, email);
	}
	public void clickAlertButton() {
		WebWaitHelper.scrollToElement(WebHandlers.webElementToBy(alertButton));
		WebHandlers.click(alertButton);
	}
	public void acceptAlert() {
		WebHandlers.acceptAlert();
	}
	public void dismissAlert() {
		WebHandlers.dismissAlert();
	}
	public String getCurrentUrl() {
		WebWaitHelper.waitForPageLoad();
		return BrowserDriver.getDriver().getCurrentUrl();
	}
	public void waitForExpectedNumberOfTabs(int numberOfTabs) {
		WebDriverWait wait = new WebDriverWait(BrowserDriver.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfWindowsToBe(numberOfTabs));
	}
	public void switchToNewWindow() {
		WebHandlers.switchToNewWindow();
	}
	public void switchToDefaultWindow() {
		WebHandlers.switchToDefaultWindow();
	}
	public String getCurrentWindowHandle() {
		return WebHandlers.GetCurrentWindowHandle();
	}
	public void closeCurrentWindow(String parentWindow) {
		WebHandlers.closeCurrentWindow(parentWindow);
	}
	public void switchToFrame() throws Exception {
		WebWaitHelper.scrollToElement(WebHandlers.webElementToBy(iframeElement));
		WebHandlers.switchToFrame(iframeElement);
	}
	public void clickRadioButton() {
		WebDriverWait wait = new WebDriverWait(BrowserDriver.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(radioButtonYes));
		WebHandlers.click(radioButtonYes);
	}
//	public boolean isRadioButtonYesSelected() {
//		return WebHandlers.radioBtnIsSelected(radioButtonYes);
//	}
	public boolean isFirstNameDisabled() {
		return WebHandlers.elementDisabled(firstNameField);
	}
	public void clickEdit() {
		WebHandlers.click(editButton);
		WebDriverWait wait = new WebDriverWait(BrowserDriver.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(firstNameField));
	}
	public boolean isEmailFieldExist() {
		return WebHandlers.elementExists(emailInput);
	}
	public boolean isPaymentFieldExist() {
		return WebHandlers.elementExists(nonExistentPaymentField);
	}
	public void enterEmail(String email){
		WebHandlers.click(emailInput);
		WebHandlers.enterText(emailInput, email);
	}
	public boolean verifyTextInDropDown(String text) {
		return WebHandlers.verifyText(carsDropdown, text);
	}
	public LinkedHashMap<String, String> getColMapByIndex(Integer index){
		return WebHandlers.getColMapByIndxVal(usersTable, index);
	}
	public LinkedHashMap<String, String> getColMapByHeader(String header){
		return WebHandlers.getColMapByHdrVal(usersTable, header);
	}
	public LinkedHashMap<String, String> getRowMapByHeader(String header){
		return WebHandlers.getRowMapByHdrVal(usersTable, header);
	}
	public LinkedHashMap<String, String> getRowMapByIndex(Integer index){
		return WebHandlers.getRowMapByIndxVal(usersTable, index);
	}
}
