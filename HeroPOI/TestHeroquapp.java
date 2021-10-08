package HeroPOI;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import HeroPOI.BaseHeroquapp;

public class TestHeroquapp extends BaseHeroquapp {

	@BeforeMethod
	public void pageSetUp() {
		driver.manage().window().maximize();
		driver.navigate().to(homeUrl);
	}

	@Test(priority = 10)
	public void successfulLogIn() {

		String username = excelHeroquapp.getStringData("LoginTest", 1, 1);
		String password = excelHeroquapp.getStringData("LoginTest", 1, 3);
		String button = excelHeroquapp.getStringData("LoginTest", 2, 7);
		String text = excelHeroquapp.getStringData("LoginTest", 1, 6);

		logInPageHeroquapp.insertUsername(username);
		logInPageHeroquapp.insertPassword(password);
		logInPageHeroquapp.pressLoginButton();

		Assert.assertTrue(logOutPageHeroquapp.getLogoutButton().isDisplayed());
		Assert.assertEquals(logOutPageHeroquapp.getLogoutButton().getText(), button);
		Assert.assertTrue(logOutPageHeroquapp.successfulLogInText().contains(text));

	}

	@Test(priority = 20)
	public void incorrectUsername() throws InterruptedException {
		for (int i = 1; i < excelHeroquapp.getLastRowNumber(); i++) {

			String username = excelHeroquapp.getStringData("LoginTest", i, 2);
			String password = excelHeroquapp.getStringData("LoginTest", 1, 3);
			String textUsername = excelHeroquapp.getStringData("LoginTest", 2, 5);

			logInPageHeroquapp.insertUsername(username);
			logInPageHeroquapp.insertPassword(password);
			logInPageHeroquapp.pressLoginButton();
			// logInPage.waiter(logInPage.getErrorText());
			wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("flash")));
			Assert.assertTrue(logInPageHeroquapp.textMessageLogIn().contains(textUsername) );
			try {
				Assert.assertFalse(logOutPageHeroquapp.getLogoutButton().isDisplayed());
			} catch (Exception NoSuchElement) {

			}

		}

	}

	@Test(priority = 30)
	public void incorrectPassword() {
		logInPageHeroquapp.insertUsername("student");
		logInPageHeroquapp.insertPassword("123");
		logInPageHeroquapp.pressLoginButton();
	}

	@AfterMethod
	public void deleteCookies() {
		driver.manage().deleteAllCookies();
	}
}
