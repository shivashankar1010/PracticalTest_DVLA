package Testingmaven.testmaven;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinition {

	public WebDriver driver = Configuration.browser();
	public ReadExcel read;

	public StepDefinition() {
		read = new ReadExcel();
	}

	@Given("^I want to navigate to dvla site \"([^\"]*)\"$")
	public void i_want_to_navigate_to_dvm_site(String arg1) {
		driver.get(arg1);
	}

	@Then("^click on next button and enter vehcile registration code and submit$")
	public void click_on_next_button_and_enter_vehcile_registration_code_and_submit() throws Throwable {
		driver.findElement(By.xpath("//a[@href='https://www.vehicleenquiry.service.gov.uk']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(read.readData("VehicleNumber"));
		driver.findElement(By.name("Continue")).click();

	}

	@Then("^validate vechile details$")
	public void validate_vechile_details() {
		Assert.assertTrue("color is not displayed",
				driver.findElement(By.xpath("//strong[text()='BLACK']")).isDisplayed());

	}

	@Then("^validate vechile details of color$")
	public void validate_vechile_model() {
		Assert.assertTrue("Model of the color", driver.findElement(By.xpath("//strong[text()='FORD']")).isDisplayed());

	}

}
