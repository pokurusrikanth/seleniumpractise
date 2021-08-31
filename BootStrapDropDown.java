package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropDown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='dropdown']//a[text()='Select Product Type']")).click();
		List<WebElement> listbox = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));

	}

	public static void dropDown(List<WebElement> values, String options) {
		for (WebElement option : values) {
			if (option.getText().equalsIgnoreCase(options)) {
				option.click();
				break;
			}

		}

	}
}