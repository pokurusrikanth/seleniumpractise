package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenShots {

	public static void main(String[] args) throws IOException {

		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
		 * ChromeDriver(); driver.get("http://demo.nopcommerce.com/");
		 * driver.manage().window().maximize(); TakesScreenshot ts = (TakesScreenshot)
		 * driver; // File src = ;
		 * FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new
		 * File(".\\Images\\homepage1.png"));
		 */
		// screen shot of a page/portion of a page
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(
				By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[1]/a/img"));
		File src = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(".\\Images\\newportion.png"));
	}

}
