package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.ImdbSignin;

import pages.ImdbWatchlistPage;
import pages.HomePageImdb;
import pages.SignInPageImdb;

public class ImdbBase {
	/*
	 * Napraviti program koji ce proveriti da li funkcionise dodavanje filmova u
	 * Watchlistu na sajtu IMDB (edited) Podrazumeva se da koristite POM, prvo
	 * prodjite manuelno, pogledajte sta sve treba da se radi, razmislite kako da
	 * budete sigurni da je film dodat (slicno kao sto smo radili korpu za Amazon
	 * zadatak), proverite manuelno da li korisnik mora da se uloguje ili moze da
	 * bude izlogovan itd
	 * 
	 * https://www.imdb.com/
	 */

	public WebDriver driver;
	public WebDriverWait wdwait;
	public HomePageImdb homePageImdb;
	public ImdbSignin imdbSignIn;
	public SignInPageImdb signUp;
	public ImdbWatchlistPage watchList;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		wdwait = new WebDriverWait(driver, 6);
		homePageImdb = new HomePageImdb(driver, wdwait);
		imdbSignIn = new ImdbSignin(driver);
		signUp = new SignInPageImdb(driver);
		watchList = new ImdbWatchlistPage(driver, wdwait);
	}

	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
