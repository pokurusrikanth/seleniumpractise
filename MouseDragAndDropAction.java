package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseDragAndDropAction {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		WebElement rome = driver.findElement(By.xpath("//div[text()='Rome'][2]"));
		WebElement italy = driver.findElement(By.xpath("//div[text()='Italy']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(rome, italy).build().perform();
		driver.close();
	}

}
