package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker_DropDown {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();

		Select monthDrp = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));

		monthDrp.selectByVisibleText("May");

		Select yearDrp = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		yearDrp.selectByVisibleText("2022");
		List<WebElement> allcells = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		for (WebElement eachcell : allcells) {
			if (eachcell.getText().equalsIgnoreCase("18")) {
				eachcell.click();
				Thread.sleep(3000);
				// driver.findElement(By.xpath("//button[text()='Done']")).click();
				break;

			}
		}

	}

}
