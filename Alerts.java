package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		// Alert window with ok button
		/*
		 * driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click()
		 * ; Thread.sleep(3000);
		 * 
		 * driver.switchTo().alert().accept();
		 */
		// Alert window with ok and cancel button
		/*
		 * driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click
		 * (); Thread.sleep(3000); //driver.switchTo().alert().dismiss();
		 * driver.switchTo().alert().accept();
		 */

		// Alert window with input button
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert alerts = driver.switchTo().alert();

		System.out.println("alert text :" + alerts.getText());
		alerts.sendKeys("Welcome to alert");
		alerts.accept();

	}

}
