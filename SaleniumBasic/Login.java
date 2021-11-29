package SaleniumBasic;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver","E:\\selenium\\browser driver\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		//System.setProperty("webdriver.gecko.driver","E:\\selenium\\browser driver\\geckodriver.exe");
		//WebDriver driver1=new FirefoxDriver();
		//driver1.get("https://www.google.com");
		System.setProperty("webdriver.edge.driver","E:\\selenium\\browser driver\\msedgedriver.exe");
		WebDriver driver2=new EdgeDriver();
		driver2.get("https://www.google.com");
		String page_title=driver2.getTitle();	
		System.out.println("the page title is :"+page_title);

		
		  driver2.manage().window().maximize();
		  
		Assert.assertTrue(page_title.contains("Google"));

	
	driver2.switchTo().window("Google");
	driver2.quit();
	
	}
	
}