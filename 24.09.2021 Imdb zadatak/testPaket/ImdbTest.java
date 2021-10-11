package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.ImdbBase;

public class ImdbTest extends ImdbBase {

	@BeforeMethod
	public void setUpPage() {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.imdb.com");

	}

	@Test(priority = 10)
	public void verifyUserMustSignInBeforeAddFilmsToWatchList() {
		Assert.assertEquals(homePageImdb.getHomePageTitle(),
				"IMDb: Ratings, Reviews, and Where to Watch the Best Movies & TV Shows");
		homePageImdb.clickOnAddFilm();
		Assert.assertEquals(imdbSignIn.getTitlePage(), "Sign in with IMDb - IMDb");
		Assert.assertTrue(imdbSignIn.getSignInOptions().isDisplayed());
		System.out.println("When we click on add film, options for Sign in are displayed");
	}

	@Test(priority = 20)
	public void verifyIfUserCanAddFilmInWatchList() {

		homePageImdb.clickWachlist();
		// Moramo da se ulogujemo da bi dodavali u watchlistu
		imdbSignIn.clickImdbSignIn();
		// Unesite vas mail i password !!!
		// Nalog koji unesete mora da ima praznu Watchlistu!!!!
		signUp.insertEmail("Mail@Address");
		signUp.insertPassword("Enter Password");
		signUp.clickSubmit();
		// Wachlist is empty
		Assert.assertEquals(watchList.textEmptyWatchList(), "Your Watchlist is empty");
		watchList.clickImdbIcon();
		// Dodamo film u watchlistu
		homePageImdb.clickOnAddFilm();
		// Vracamo se na watchlist stranu i proveravamo da li je film prisutan
		homePageImdb.clickWachlist();
		Assert.assertTrue(watchList.isFilmDiplayed());
		System.out.println("Film is in watchlisti");
		// remove film i refresh
		watchList.removeFilmX();
		// Provera da li je lista sada prazna
		Assert.assertEquals(watchList.textEmptyWatchList(), "Your Watchlist is empty");
		System.out.println("Watchlist is empty");

	}

	@AfterMethod
	public void deleteCookies() {
		driver.manage().deleteAllCookies();
	}

}
