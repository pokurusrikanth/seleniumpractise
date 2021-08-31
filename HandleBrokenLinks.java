package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrokenLinks {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.linkcity.com/");

		List<WebElement> alllinks = driver.findElements(By.tagName("a"));

		for (WebElement link : alllinks) {

			String url = link.getAttribute("href");
			if (url.isEmpty() || url == null) {
				continue;
			}

			URL ur = new URL(url);
			HttpURLConnection http = (HttpURLConnection) ur.openConnection();
			// http.connect();
			int response = http.getResponseCode();
			if (response >= 400) {
				// int brokenlink = 0;
				// brokenlink++;
				System.out.println("link is broke:       " + url + response);
			} else {
				System.out.println("link is good:     " + url + response);
			}

		}

	}

}
