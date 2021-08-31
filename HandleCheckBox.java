package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckBox {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();

		// select Specific Check Box
		// driver.findElement(By.xpath("//input[@id='monday']")).click();
		// select all the check box

		/*
		 * List<WebElement> checkboxes = driver
		 * .findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		 * 
		 * 
		 * for (WebElement eachbox : checkboxes) { eachbox.click(); }
		 */

		// select check box by choice
		/*
		 * driver.findElements(By.
		 * xpath("//input[@type='checkbox' and contains(@id,'day')]")); for (WebElement
		 * eachbox : checkboxes) { String id = eachbox.getDomAttribute("id"); if
		 * (id.equals("sunday") || id.equals("monday")) { eachbox.click(); }
		 * 
		 * 
		 * 
		 * 
		 * }
		 */

		List<WebElement> checkboxes = driver
				.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		int checkbox = checkboxes.size();
		for (int i = 5; i < checkbox; i++) {
			checkboxes.get(i).click();
		}
	}

}
