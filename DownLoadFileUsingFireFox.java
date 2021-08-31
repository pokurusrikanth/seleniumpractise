package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownLoadFileUsingFireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// FirefoxOptions fos = new FirefoxOptions();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("http://demo.automationtesting.in/FileDownload.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"textbox\"]")).sendKeys("automation testing");
		driver.findElement(By.xpath("//*[@id=\"createTxt\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"link-to-download\"]")).click();

	}

}
