package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SizeAndLocationOfElement {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
		Dimension size = element.getSize();

		//

		int width = size.getWidth();
		int height = size.getHeight();
		System.out.println(width);
		System.out.println(height);

		// location
		int xy = element.getLocation().getX();
		int z = element.getLocation().getY();
		System.out.println(xy);
		System.out.println(z);
		// location
		int di = element.getRect().getX();
		int di1 = element.getRect().getY();
		System.out.println(di);
		System.out.println(di1);

	}

}
