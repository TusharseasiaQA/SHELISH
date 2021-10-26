package SaleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\browser driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("shelishgarg@gmail.com");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("shelish123");
		driver.findElement(By.cssSelector("*[type='submit']")).click();
		
		//driver.findElement(By.cssSelector("#email")).sendKeys("shelishgarg@gmail.com");
		//driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("shelish123");
		//driver.findElement(By.cssSelector("#loginbutton")).click();
		
	
		
	//	driver.findElement(By.cssSelector("div>input[id = 'email']")).sendKeys("shellishgarg@gmail.com");
		//driver.findElement(By.cssSelector("div>input[id= 'pass']")).sendKeys("shelish123");
		//driver.findElement(By.cssSelector("div>*[type = 'submit']")).sendKeys("shelishgarg@gmail.com");
		

//		driver.findElement(By.cssSelector("div input[id = 'email']")).sendKeys("shellishgarg@gmail.com");
	//	driver.findElement(By.cssSelector("div input[id= 'pass']")).sendKeys("shelish123");
		//driver.findElement(By.cssSelector("div *[type = 'submit']")).sendKeys("shelishgarg@gmail.com");
		

		//driver.findElement(By.cssSelector("input[id = 'email']")).sendKeys("shellishgarg@gmail.com");
		//driver.findElement(By.cssSelector("input[id= 'pass']")).sendKeys("shelish123");
		//driver.findElement(By.cssSelector("*[type = 'submit']")).click();
		
		
		
		


	}

}
