package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindows {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Set<String> winHandles = driver.getWindowHandles();
		Object[] handles = winHandles.toArray();

		// driver.switchTo().window(handles[0].toString());
		// driver.switchTo().window(handles[1].toString());
		/*
		 * Iterator<String> iterator = winHandles.iterator(); String id1 =
		 * iterator.next(); String id2 = iterator.next(); driver.switchTo().window(id2);
		 * System.out.println(driver.getTitle()); driver.switchTo().window(id1);
		 * System.out.println(driver.getTitle());
		 */
		List<String> allhandles = new ArrayList<String>(winHandles);
		driver.switchTo().window(allhandles.get(1));
		driver.switchTo().window(allhandles.get(0));
	}

}
