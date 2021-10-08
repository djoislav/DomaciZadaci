package HeroPOI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPageHeroquapp {

	WebDriver driver;
	WebElement usernameField;
	WebElement passwordField;
	WebElement loginButton;
	WebElement message;
	public WebDriverWait wdwait;

	public LogInPageHeroquapp(WebDriver driver, WebDriverWait wdwait) {
		this.driver = driver;
		this.wdwait = wdwait;
	}

	public WebElement getUsernameField() {
		return driver.findElement(By.id("username"));
	}

	public WebElement getPasswordField() {
		return driver.findElement(By.id("password"));
	}

	public WebElement getLoginButton() {
		return driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in"));
	}

	public WebElement getMessage() {
		return driver.findElement(By.id("flash-messages"));
	}

	public void pressLoginButton() {
		this.getLoginButton().click();
	}

	public String textMessageLogIn() {
		return getMessage().getText();
	}

	public void insertUsername(String usernameData) {
		this.getUsernameField().clear();
		this.getUsernameField().sendKeys(usernameData);
	}

	public void insertPassword(String passwordData) {
		this.getPasswordField().clear();
		this.getPasswordField().sendKeys(passwordData);
	}

	public void waiter(WebElement element) throws InterruptedException {
		wdwait.until(ExpectedConditions.elementToBeClickable(element));
	}
}
