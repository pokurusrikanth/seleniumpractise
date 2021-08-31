package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auto_Suggest_DropDown_BingSearch {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
		List<WebElement> elements = driver.findElements(By.xpath("//li[@class='sa_sg']//span"));
		System.out.println(elements.size());
		for (WebElement eachElement : elements) {
			if (eachElement.getText().equalsIgnoreCase("selenium webdriver")) {
				eachElement.click();
				break;
			}
		}

		driver.close();
	}

}
