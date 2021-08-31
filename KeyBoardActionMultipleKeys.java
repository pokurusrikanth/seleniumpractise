package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardActionMultipleKeys {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://text-compare.com/");
		driver.manage().window().maximize();
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"inputText1\"]"));
		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"inputText2\"]"));
		element1.sendKeys("we are in automation");

		Actions act = new Actions(driver);
		// ctrl+a
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();

		// ctrl+c

		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

		// ctrl+v
		act.sendKeys(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

		if (element1.getAttribute("value").equalsIgnoreCase(element2.getAttribute("value"))) {
			System.out.println("values are matched");
		} else {
			System.out.println("values are not matched");
		}

	}

}
