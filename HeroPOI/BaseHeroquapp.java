package HeroPOI;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import HeroPOI.LogInPageHeroquapp;
import HeroPOI.LogOutPageHeroquapp;

public class BaseHeroquapp {

	public static WebDriver driver;
	public static LogInPageHeroquapp logInPageHeroquapp;
	public LogOutPageHeroquapp logOutPageHeroquapp;
	public String homeUrl;
	public ExcelHeroquapp excelHeroquapp;
	public static WebDriverWait wdwait;

	@BeforeClass
	public void setUp() throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		logInPageHeroquapp = new LogInPageHeroquapp(driver, wdwait);
		logOutPageHeroquapp = new LogOutPageHeroquapp(driver);
		excelHeroquapp = new ExcelHeroquapp("C:\\Users\\PC\\Desktop\\TestData1.xlsx");
		homeUrl = excelHeroquapp.getStringData("LoginTest", 1, 0);
		wdwait = new WebDriverWait(driver, 20);
	}

	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
