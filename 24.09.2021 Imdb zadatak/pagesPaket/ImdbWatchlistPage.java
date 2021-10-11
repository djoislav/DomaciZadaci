package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImdbWatchlistPage {

	WebDriver driver;
	WebDriverWait wdwait;
	WebElement removeFilmX;
	WebElement filmPresent;
	WebElement emptyWatchList;
	WebElement imdbIcon;

	public ImdbWatchlistPage(WebDriver driver, WebDriverWait wdwait) {
		super();
		this.driver = driver;
		this.wdwait = wdwait;
	}

	public WebElement getFilmPresent() {
		return wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("page-1")));
	}

	public boolean isFilmDiplayed() {
		return this.getFilmPresent().isDisplayed();
	}

	public void removeFilmX() {
		driver.findElement(By.cssSelector(".wl-ribbon.poster.inWL")).click();
		driver.navigate().refresh();
	}

	public WebElement getEmptyWatchList() {
		return wdwait.until(ExpectedConditions.presenceOfElementLocated(By.className("empty-watchlist-text")));
	}

	public String textEmptyWatchList() {
		return this.getEmptyWatchList().getText();
	}

	public WebElement getImdbIcon() {
		return driver.findElement(By.id("home_img_holder"));
	}

	public void clickImdbIcon() {
		this.getImdbIcon().click();
	}

}
