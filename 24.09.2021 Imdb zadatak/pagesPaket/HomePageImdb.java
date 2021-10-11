package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageImdb {

	public WebDriver driver;
	WebElement watchlist;
	WebElement firstFilmWhatToWatch;
	WebDriverWait wdwait;

	public HomePageImdb(WebDriver driver, WebDriverWait wdwait) {
		super();
		this.driver = driver;
		this.wdwait = wdwait;
	}

	public WebElement getWatchlist() {
		return driver
				.findElement(By.cssSelector(".ipc-icon.ipc-icon--watchlist.ipc-button__icon.ipc-button__icon--pre"));
	}

	public void clickWachlist() {
		getWatchlist().click();
	}

	public WebElement getFirstFilmWhatToWatch() {
		return wdwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*[@id=\"__next\"]/main/div/div[3]/div[3]/section[2]/div/div/div/div/div[2]/div[1]/div[1]/div[1]")));
	}

	public void clickOnAddFilm() {
		getFirstFilmWhatToWatch().click();
	}

	public String getHomePageTitle() {
		return driver.getTitle();
	}

}
