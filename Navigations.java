package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigations {

	@Test
	public void navigations() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.get("https://www.snapdeal.com");

		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();

	}

}
