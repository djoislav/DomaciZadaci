package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImdbSignin {
	WebDriver driver;
	WebElement imdbSign;
	WebElement signInOptions;

	public ImdbSignin(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getImdbSign() {
		return driver.findElement(By.cssSelector(".auth-sprite.imdb-logo.retina "));
	}

	public void clickImdbSignIn() {
		this.getImdbSign().click();
	}

	public String getTitlePage() {
		return driver.getTitle();
	}

	public WebElement getSignInOptions() {
		return driver.findElement(By.id("signin-options"));
	}

}
