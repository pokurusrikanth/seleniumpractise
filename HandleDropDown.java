package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		WebElement dropDwnElement = driver.findElement(By.xpath("//select[@name='country_id']"));
		Select dropDown = new Select(dropDwnElement);
		dropDown.selectByVisibleText("Denmark");
		// selecting using value
		dropDown.deselectByValue("3");
		// select by using index
		dropDown.selectByIndex(2);

		List<WebElement> allOptoins = dropDown.getOptions();

		for (WebElement option : allOptoins) {
			if (option.getText().equalsIgnoreCase("Denmark")) {
				option.click();
				break;
			}
		}

	}

}
