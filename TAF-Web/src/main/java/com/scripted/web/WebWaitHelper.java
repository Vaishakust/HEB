package com.scripted.web;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.google.common.base.Function;
import com.scripted.dataload.PropertyDriver;

public class WebWaitHelper {
	public static Logger LOGGER = LogManager.getLogger(WebWaitHelper.class);
	public static Actions action = new Actions(BrowserDriver.getDriver());
	static WebDriverWait wait = new WebDriverWait(BrowserDriver.getDriver(),getWaitTime());

	protected static int getElementTimeout() {
		return 10;
	}

	private static long getPollingTimeoutInMilliSeconds() {
		return 30;
	}

	private static Duration getPollingTimeoutInDuration() {
		return Duration.ofMillis(300);
	}

	private static Duration getElementWaitTimeoutInDuration() {
		return Duration.ofSeconds(20);
	}
	
	private static Duration getWaitTime() {
		PropertyDriver p = new PropertyDriver();
		p.setPropFilePath("src/main/resources/Web/Properties/Browser.properties");
		int time=Integer.valueOf(PropertyDriver.readProp("selenium.waitTime"));
		return Duration.ofSeconds(time);
		
	}

	public static void waitForElement(WebElement webEle) {

		new FluentWait<WebDriver>(BrowserDriver.getDriver()).withTimeout(getElementWaitTimeoutInDuration())
				.pollingEvery(getPollingTimeoutInDuration()).ignoring(NoSuchElementException.class)
				.until(new Function<WebDriver, Boolean>() {
					boolean flag = false;

					public Boolean apply(WebDriver d) {
						try {
							By byEle = WebHandlers.webElementToBy(webEle);
							waitForPresence(byEle, getElementTimeout());
							waitForNotStale(byEle, getElementTimeout());
							scrollToElement(byEle);
							waitForVisibleble(byEle, getElementTimeout());
							waitForClickable(byEle, getElementTimeout());
							flag = true;
						} catch (Exception e) {
							e.printStackTrace();
							LOGGER.error("Error occurred while waiting for loading the locator :" + webEle
									+ "Exception :" + e);
							String err = BrowserDriver.setScrnshoterrmsg(
									"Error occurred while waiting for loading the locator:" + webEle);
							JavascriptExecutor js = (JavascriptExecutor) BrowserDriver.getDriver();
							js.executeScript(err);
						}
						return flag;
					}
				});

	}

	public static void waitForElementPresence(WebElement webEle) {

		new FluentWait<WebDriver>(BrowserDriver.getDriver()).withTimeout(getElementWaitTimeoutInDuration())
				.pollingEvery(getPollingTimeoutInDuration()).ignoring(NoSuchElementException.class)
				.until(new Function<WebDriver, Boolean>() {
					boolean flag = false;

					public Boolean apply(WebDriver d) {
						try {
							By byEle = WebHandlers.webElementToBy(webEle);
							waitForPresence(byEle, getElementTimeout());
							waitForNotStale(byEle, getElementTimeout());
							scrollToElement(byEle);
							flag = true;
						} catch (Exception e) {
							e.printStackTrace();
							LOGGER.error("Error occurred while performing  waitForElementPresence action for  locator :"
									+ webEle + "Exception :" + e);
							String err = BrowserDriver.setScrnshoterrmsg(
									"Error occurred while performing  waitForPresence action for  locator:" + webEle);
							JavascriptExecutor js = (JavascriptExecutor) BrowserDriver.getDriver();
							js.executeScript(err);
							Assert.fail("Error occurred while performing  waitForElementPresence action for  locator :"
									+ webEle + "Exception :" + e);
						}
						return flag;
					}
				});

	}

	public static void waitForPresence(By byEle, int time, WebElement locator) {
		try {
			WebDriverWait wait = new WebDriverWait(BrowserDriver.getDriver(), Duration.ofSeconds(time),
					Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfElementLocated(byEle));
		} catch (Exception e) {
			e.printStackTrace();
			/*
			 * if (shflag) { LOGGER.info("Element healed: " + HealdLctr);
			 * //waitForPresence(byEle, time, locator); } else { e.printStackTrace();
			 * LOGGER.
			 * error("Error occurred while performing  waitForPresence action for  locator :"
			 * + byEle + "Exception :" + e); Assert.
			 * fail("Error occurred while performing  waitForPresence action for  locator :"
			 * + byEle + "Exception :" + e);
			 */
			// }

		}
	}

	public static void waitelementforHealCheck(By byEle, int time) {

		try {
			WebDriverWait wait = new WebDriverWait(BrowserDriver.getDriver(), Duration.ofSeconds(time),
					Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfElementLocated(byEle));
		} catch (Exception e) {
			System.err.println("An exception was thrown for waiting the element");
		}
	}

	public static void waitelementforHealCheckClickable(By byEle, int time) {

		try {
			WebDriverWait wait = new WebDriverWait(BrowserDriver.getDriver(), Duration.ofSeconds(time),
					Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(byEle));
		} catch (Exception e) {
			System.err.println("An exception was thrown for waiting the element");
		}
	}

	private static void waitForPresence(By byEle, int time) {
		try {
			WebDriverWait wait = new WebDriverWait(BrowserDriver.getDriver(), Duration.ofSeconds(time),
					Duration.ofSeconds(10));
			wait.until(ExpectedConditions.presenceOfElementLocated(byEle));
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("Error occurred while performing  waitForPresence action for  locator :" + byEle
					+ "Exception :" + e);
			String err = BrowserDriver
					.setScrnshoterrmsg("Error occurred while performing  waitForPresence action for  locator:" + byEle);
			JavascriptExecutor js = (JavascriptExecutor) BrowserDriver.getDriver();
			js.executeScript(err);
		}
	}

	private static void waitForClickable(By byEle, int time) {
		try {
			WebDriverWait wait = new WebDriverWait(BrowserDriver.getDriver(), Duration.ofSeconds(time),
					Duration.ofSeconds(getPollingTimeoutInMilliSeconds()));
			wait.until(ExpectedConditions.elementToBeClickable(byEle));
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("Error occurred while performing  waitForClickable action for  locator :" + byEle
					+ "Exception :" + e);
			String err = BrowserDriver.setScrnshoterrmsg(
					"Error occurred while performing  waitForClickable action for  locator:" + byEle);
			JavascriptExecutor js = (JavascriptExecutor) BrowserDriver.getDriver();
			js.executeScript(err);
		}
	}

	public static void waitForVisibleble(By byEle, int time) {
		try {
			WebDriverWait wait = new WebDriverWait(BrowserDriver.getDriver(), Duration.ofSeconds(time),
					Duration.ofSeconds(getPollingTimeoutInMilliSeconds()));
			wait.until(ExpectedConditions.visibilityOfElementLocated(byEle));
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("Error occurred while performing  waitForVisibleble action for  locator :" + byEle
					+ "Exception :" + e);
			String err = BrowserDriver.setScrnshoterrmsg(
					"Error occurred while performing  waitForVisibleble action for  locator:" + byEle);
			JavascriptExecutor js = (JavascriptExecutor) BrowserDriver.getDriver();
			js.executeScript(err);
		}
	}

	public static void waitForNotStale(By byEle, int time) {
		try {
			WebDriverWait wait = new WebDriverWait(BrowserDriver.getDriver(), Duration.ofSeconds(time),
					Duration.ofSeconds(getPollingTimeoutInMilliSeconds()));
			wait.until(stalenessOf(byEle));
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("Error occurred while performing  waitForNotStale action for  locator :" + byEle
					+ "Exception :" + e);
			String err = BrowserDriver
					.setScrnshoterrmsg("Error occurred while performing  waitForNotStale action for  locator:" + byEle);
			JavascriptExecutor js = (JavascriptExecutor) BrowserDriver.getDriver();
			js.executeScript(err);
		}
	}

	public static void scrollToElement(By locator) {
		try {
			WebElement element = BrowserDriver.getDriver().findElement(locator);
			Coordinates coordinate = ((Locatable) element).getCoordinates();
			coordinate.onPage();
			coordinate.inViewPort();
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("Error occurred while performing  scrollToElement action for  locator :" + locator
					+ "Exception :" + e);
			String err = BrowserDriver.setScrnshoterrmsg(
					"Error occurred while performing  scrollToElement action for  locator:" + locator);
			JavascriptExecutor js = (JavascriptExecutor) BrowserDriver.getDriver();
			js.executeScript(err);
			Assert.fail("Error occurred while performing  scrollToElement action for  locator :" + locator
					+ "Exception :" + e);
		}
	}

	public static ExpectedCondition<Boolean> stalenessOf(By byEle) {
		return new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver ignored) {
				try {
					// Calling any method forces a staleness check
					ignored.findElement(byEle).isEnabled();
					return true;
				} catch (StaleElementReferenceException expected) {
					return false;
				}
			}

			@Override
			public String toString() {
				return String.format("element (%s) to become stale", byEle);
			}
		};
	}

	public static void waitForClear(By by, int time) {
		try {
			WebDriverWait wait = new WebDriverWait(BrowserDriver.getDriver(), Duration.ofSeconds(time),
					Duration.ofSeconds(getPollingTimeoutInMilliSeconds()));
			wait.until(clearOf(by));
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("Error occurred while performing  waitForClear action" + "Exception :" + e);
			String err = BrowserDriver.setScrnshoterrmsg("Error occurred while performing  waitForClear action");
			JavascriptExecutor js = (JavascriptExecutor) BrowserDriver.getDriver();
			js.executeScript(err);
		}
	}

	public static ExpectedCondition<Boolean> clearOf(final By by) {

		return new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver ignored) {
				try {
					WebElement element = ignored.findElement(by);

					try {
						getAction().keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).pause(1000)
								.sendKeys(Keys.DELETE).build().perform();
					} catch (Throwable e) {
						// TODO: handle exception
					}
					if (element.getText().length() < 1)
						return true;
					try {
						element.click();
						element.clear();
					} catch (Throwable e) {
						// TODO: handle exception
					}
					if (element.getText().length() < 1)
						return true;
					try {
						element.click();
						((JavascriptExecutor) ignored).executeScript("arguments[0].value ='';", element);
					} catch (Throwable e) {
						// TODO: handle exception
					}
					if (element.getText().length() < 1)
						return true;
					return false;
				} catch (Exception expected) {
					return false;
				}
			}

			@Override
			public String toString() {
				return String.format("textbox (%s) to become clear", by);
			}
		};
	}

	public static Actions getAction() {
		return new Actions(BrowserDriver.getDriver());
	}

	public static void waitelementHealcheck(WebElement locator) {
		try {
			waitForElement(locator);
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("An exception was thrown for waiting the element :" + "With Exception :" + e);
		}
	}
	
	public static void waitForPageLoad() {

	    Wait<WebDriver> wait = new WebDriverWait(BrowserDriver.getDriver(), Duration.ofSeconds(15));
	    wait.until(new Function<WebDriver, Boolean>() {
	        public Boolean apply(WebDriver driver) {
	            System.out.println("Current Window State       : "
	                + String.valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState")));
	            return String
	                .valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
	                .equals("complete");
	        }
	    });
	}
	

	@SuppressWarnings("deprecation")
	public static void wait(int seconds) {
		try {
			BrowserDriver.getDriver().manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS); 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void waitForElementVisibility(WebElement element) {
		try {
			
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void waitForElementVisibilityOfListOfElements(List<WebElement> elements) {
		try {
			wait.until(ExpectedConditions.visibilityOfAllElements(elements));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void waitForElementVisibilityOfListOfElementsBylocator(By locator) {
		try {
		
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void waitForElementToBeClickable(WebElement element) {
		try {
		
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void waitForElementToBeSelected(WebElement element) {
		try {
		
			wait.until(ExpectedConditions.elementToBeSelected(element));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void waitForStalness(WebElement element) {
		try {
		
			wait.until(ExpectedConditions.stalenessOf(element));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void waitForTextToPresnt(WebElement element,String text) {
		try {
		
			wait.until(ExpectedConditions.textToBePresentInElement(element, text));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void waitForTextToPresntinAttibuteValue(WebElement element,String text) {
		try {
		
			wait.until(ExpectedConditions.textToBePresentInElementValue(element, text));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void waitForTitle(String Title) {
		try {
		
			wait.until(ExpectedConditions.titleContains(Title));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void waitForAlert() {
		try {
		
			wait.until(ExpectedConditions.alertIsPresent());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void waitForFrameAndSwitchtoIt(By locator) {
		try {
		
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void waitForFrameAndSwitchtoIt(WebElement webElement) {
		try {
		
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(webElement));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}