package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RepeatHome {
	
	public static final String URL = "https://www.saucedemo.com/index.html";
	private static final String TXT_USER_XPATH = "//*[@id=\"user-name\"]";
	private static final String TXT_PASS_XPATH = "//*[@id=\"password\"]";
	private static final String LOGIN_BTTN_XPATH = "//*[@id=\"login-button\"]";
	
	public static void inputUser(WebDriver driver, String username) {
		driver.findElement(By.xpath(TXT_USER_XPATH)).sendKeys(username);
	}
	
	public static void inputPass(WebDriver driver, String password) {
		driver.findElement(By.xpath(TXT_PASS_XPATH)).sendKeys(password);
	}
	
	public static void clickLogin(WebDriver driver) {
		driver.findElement(By.xpath(LOGIN_BTTN_XPATH)).click();
	}

}
