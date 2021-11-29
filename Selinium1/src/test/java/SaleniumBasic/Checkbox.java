package SaleniumBasic;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\browser driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		/*
		 * WebElement checkbox1=driver.findElement(By.id("vfb-6-0"));
		 * 
		 * checkbox1.click(); if(checkbox1.isSelected()) {
		 * System.out.println("1checkbox is toggled on"); } else {
		 * System.out.println("1checkbox is toggled off"); }
		 */
		
		//driver.findElement(By.cssSelector("input[value='checkbox1']")).click();
		//driver.findElement(By.cssSelector("input[value='checkbox2']")).click();
		//driver.findElement(By.cssSelector("input[value='checkbox3']")).click();
		
	//	WebElement wb1=driver.findElement(By.cssSelector("input[value='checkbox1']"));
		//wb1.click();
		//WebElement wb2=driver.findElement(By.cssSelector("input[value='checkbox2']"));
		//wb2.click();
		//WebElement wb3=driver.findElement(By.cssSelector("input[value='checkbox3']"));
		//wb3.click();
		
		List<WebElement> wb=driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println(wb.size());
		for(WebElement sr:wb)
		{
			sr.click();
		}
		Thread.sleep(1000);
		driver.quit();
		}
	

}
