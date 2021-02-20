package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RepeatInventory {
	
	public static final String INVENTORY_URL = "https://www.saucedemo.com/inventory.html";
	private static final String DROP_DOWN_XPATH = "//*[@id=\"inventory_filter_container\"]/select";
	private static final String MENU_BTTN_XPATH = "//*[@id=\"menu_button_container\"]/div/div[3]/div/button";
	private static final String LOGOUT_XPATH = "//*[@id=\"logout_sidebar_link\"]";
	
	public static void sort(WebDriver driver) {
		Select dropDownSort = new Select(driver.findElement(By.xpath(DROP_DOWN_XPATH)));
		dropDownSort.selectByVisibleText("Price (high to low)");
	}
	
	public static void clickMenu(WebDriver driver) {
		driver.findElement(By.xpath(MENU_BTTN_XPATH)).click();
	}
	
	public static void clickLogout(WebDriver driver) {
		driver.findElement(By.xpath(LOGOUT_XPATH)).click();
	}

}
