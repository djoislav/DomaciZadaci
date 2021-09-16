package SeleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Domaci1609 {

	// Napisati program koji ucitava https://practicetestautomation.com/ stranicu,
	// klikne na "Practice" i
	// klikne na "Test login page",
	// popunjava username i password (student/Password123),
	// loguje se na stranicu klikom na dugme Submit
	// i zatim se odjavljuje klikom na dugme Logout.
	// Na kraju zatvoriti program.

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://practicetestautomation.com/");
		WebElement practice = driver.findElement(By.cssSelector("#menu-item-20"));
		practice.click();

		WebElement testLogin = driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div[1]/div[1]/p/a"));
		testLogin.click();

		WebElement userBox = driver.findElement(By.id("username"));
		userBox.clear();
		userBox.sendKeys("student");
		WebElement passBox = driver.findElement(By.id("password"));
		passBox.clear();
		passBox.sendKeys("Password123");
		WebElement submit = driver.findElement(By.id("submit"));
		submit.click();
		WebElement logOut = driver.findElement(By.cssSelector(".wp-block-button__link.has-text-color.has-background.has-very-dark-gray-background-color"));
		logOut.click();
		driver.close();

	}

}
