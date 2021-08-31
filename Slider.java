package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		WebElement startbutton = driver.findElement(By.xpath("//body/div[2]/div[2]/span[1]"));

		System.out.println("location of the element : " + startbutton.getLocation());
		System.out.println("Size of the element : " + startbutton.getSize());
		Actions act = new Actions(driver);
		act.dragAndDropBy(startbutton, 200, 0).perform();

		System.out.println("location of the element : " + startbutton.getLocation());
		System.out.println("Size of the element : " + startbutton.getSize());

		WebElement secondElement = driver.findElement(By.xpath("//body/div[2]/div[2]/span[2]"));
		System.out.println(secondElement.getLocation());
		act.dragAndDropBy(secondElement, -100, 0).build().perform();
		System.out.println(secondElement.getLocation());

	}

}
