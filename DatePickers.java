package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickers {
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.redbus.in");
		driver.manage().window().maximize();
		String yr = "2022";
		String month = "july";
		String dt = "30";
		driver.findElement(By.xpath("(//input[@id='onward_cal'])")).click();

		while (true) {

			String text = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			// String dateText = text.getText();
			String[] monthyr = text.split(" ");
			String mon = monthyr[0];
			String year = monthyr[1];
			if (mon.equalsIgnoreCase(month) && year.equals(yr))
				break;
			else
				driver.findElement(By.xpath("//button[normalize-space()='>']")).click();

		}

		List<WebElement> allCells = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
		for (WebElement eachcell : allCells) {
			String dttext = eachcell.getText();
			if (dttext.equalsIgnoreCase(dt)) {
				eachcell.click();
				break;
			}

		}
	}

}
