package HeroPOI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogOutPageHeroquapp {

	WebDriver driver;
	WebElement logoutButton;
	WebElement message;

	public LogOutPageHeroquapp(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getLogoutButton() {
		return driver.findElement(By.cssSelector(".icon-2x.icon-signout"));
	}

	public WebElement getMessage() {
		return driver.findElement(By.className("subheader"));
	}

	public void pressLogoutButton() {
		this.getLogoutButton().click();
	}

	public String successfulLogInText() {
		return getMessage().getText();
	}

}
