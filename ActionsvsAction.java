package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsvsAction {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Women']"))).perform();
		Action action = act.moveToElement(driver.findElement(By.xpath("//a[text()='Women']"))).build();
	}

}
