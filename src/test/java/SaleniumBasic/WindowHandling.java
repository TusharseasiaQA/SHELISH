package SaleniumBasic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","E:\\selenium\\browser driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/login.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#login_link > a._97w5")).click();
		
		Set<String>wb =driver.getWindowHandles();
		Iterator<String>it=wb.iterator();
		String pid=it.next();
		String cid=it.next();
		driver.switchTo().window(cid);
		
		String gt=driver.findElement(By.cssSelector("#u_9_g_BQ")).getText();
		System.out.println(gt);
		String emailid=gt.split("at")[1].trim().split(" ")[0];
		System.out.println(emailid);
		
		
	}

}
