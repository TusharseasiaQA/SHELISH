package SaleniumBasic;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_fetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","E:\\selenium\\browser driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mimitmalout.ac.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int count=links.size();
		System.out.println("total no of links"+count);
		
		for(WebElement link:links) {
			System.out.println(link.getText()  +  " - " +link.getAttribute("href"));
		}
		
	}

}
