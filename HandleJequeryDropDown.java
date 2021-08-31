package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleJequeryDropDown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='comboTreeInputBox'][1]")).click();

		// selectChoicevalues(driver, "choice 1");
		selectChoicevalues(driver, "choice 2", "choice 2 3", "choice 6");

	}

	public static void selectChoicevalues(WebDriver driver, String... values) {
		List<WebElement> choiceList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));

		if (!values[0].equalsIgnoreCase("all")) {
			for (WebElement eachElement : choiceList) {
				String text = eachElement.getText();
				for (String value : values) {
					if (text.equals(value)) {
						eachElement.click();
						break;
					}
				}

			}
		} else {
			for (WebElement webElement : choiceList) {
				webElement.click();
			}
		}

	}

}
