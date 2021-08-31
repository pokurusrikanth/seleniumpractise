package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium {

@Test	
public void how_To_Launch_Browser() {	
	
	
	WebDriverManager.chromedriver().setup();	
	WebDriver driver=new ChromeDriver();	
	
	driver.get("https://frontend.nopcommerce.com");
	
	
	System.out.println("Title of the page : "+driver.getTitle());
	System.out.println("Url of the page : "+driver.getCurrentUrl());
	System.out.println("source code of the page : "+driver.getPageSource());
}
	
	
	
	
	
}
