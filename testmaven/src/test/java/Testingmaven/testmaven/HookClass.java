package Testingmaven.testmaven;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;

public class HookClass {

	
	public WebDriver driver= Configuration.browser();
	@After
	public void closeBrowser() {
		driver.quit();
	}
}
