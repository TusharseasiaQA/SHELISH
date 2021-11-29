package SaleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	    public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\browser driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		
		driver.switchTo().alert().dismiss();
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().sendKeys("hi i am shelish");
		driver.switchTo().alert().accept();
		//Thread.sleep(4000);
		
		
	
		
		
		
		

	}

}
