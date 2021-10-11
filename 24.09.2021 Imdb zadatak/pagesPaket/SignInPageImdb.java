package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPageImdb {
	WebDriver driver;
	WebElement emailField;
	WebElement passField;
	WebElement submitButton;

	public SignInPageImdb(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getEmailField() {
		return driver.findElement(By.name("email"));

	}

	public WebElement getPassField() {
		return driver.findElement(By.name("password"));

	}

	public WebElement getSubmitButton() {
		return driver.findElement(
				By.cssSelector(".a-button.a-button-span12.a-button-primary.auth-disable-button-on-submit"));
	};

	public void insertEmail(String text) {
		this.getEmailField().clear();
		this.getEmailField().sendKeys(text);
	}

	public void insertPassword(String text) {
		this.getPassField().clear();
		this.getPassField().sendKeys(text);
	}

	public void clickSubmit() {
		this.getSubmitButton().click();
	}

}
