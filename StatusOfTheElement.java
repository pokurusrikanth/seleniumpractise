package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusOfTheElement {
	@Test
	public void element_Status() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://frontend.nopcommerce.com");
		driver.switchTo().frame(0);
		WebElement searchbar = driver.findElement(By.xpath("//input[@id='small-searchterms']"));

		if (searchbar.isDisplayed()) {
			System.out.println("seearch bar is displayed");
			if (searchbar.isEnabled()) {
				System.out.println("search bar is enabled");
				if (!searchbar.isSelected()) {
					System.out.println("search bar is not selected");
				}
			}
		}

	}

}
