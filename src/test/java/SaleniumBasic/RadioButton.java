package SaleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\selenium\\browser driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		WebElement radioopt1=driver.findElement(By.id("vfb-7-1"));
		WebElement radioopt2=driver.findElement(By.id("vfb-7-2"));
		
		radioopt1.click();
		
		System.out.println(radioopt1.isSelected());
		System.out.println(radioopt2.isSelected());
		
		radioopt2.click();
		System.out.println(radioopt1.isSelected());
		System.out.println(radioopt2.isSelected());
		//Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
