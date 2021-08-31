package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckDropDownSorted {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		// driver.findElement(By.xpath("//div[@class='jq-selectbox__trigger'][1]")).click();
		WebElement dropDown = driver.findElement(By.xpath("//select[@name='category_id']"));

		Select drpselect = new Select(dropDown);

		List<WebElement> options = drpselect.getOptions();
		ArrayList<String> originalList = new ArrayList<String>();
		ArrayList<String> tempararyList = new ArrayList<String>();

		for (WebElement option : options) {
			originalList.add(option.getText());
			tempararyList.add(option.getText());

		}
		System.out.println("perminant list : " + originalList);
		System.out.println("temparary list : " + tempararyList);
		Collections.sort(tempararyList);
		System.out.println("perminant list : " + originalList);
		System.out.println("temparary list : " + tempararyList);
		if (originalList.equals(tempararyList)) {
			System.out.println("options are sorted");
		} else {
			System.out.println("options are not sorted");
		}

		driver.close();
	}

}
