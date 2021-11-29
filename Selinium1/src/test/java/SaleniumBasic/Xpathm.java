package SaleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\selenium\\browser driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		driver.manage().window().maximize();
		//relative xpath
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shellishgarg@gmail.com");
	    driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("shelish123");
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		
		//absolute xpath
	 //  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/form/div/div[1]/input")).sendKeys("shelishgarg@gmail.com");
	   //driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/form/div/div[2]/div/div/input")).sendKeys("shelish123");
//	   driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/form/div/div[3]/button")).click();


	   //or & and
	    //driver.findElement(By.xpath("//input[@name='email'  or  @id='email']")).sendKeys("shellishgarg@gmail.com");
		//driver.findElement(By.xpath("//input[@name='pass'  or  @id='pass']")).sendKeys("shelish123");
		//driver.findElement(By.xpath("//*[@id='loginbutton' or   @name='login']")).click();
		
		//contains with attribute
		//driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("shelishgarg@gmail.com");
		//driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("shelish123");
		//driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
		
		//start_with
		//driver.findElement(By.xpath("//input[starts-with(@id,'email')]")).sendKeys("shelishgarg@gmail.com");
		//driver.findElement(By.xpath("//input[starts-with(@id,'pass')]")).sendKeys("shelish123");
		//driver.findElement(By.xpath("//input[starts-with(@name,'loginbutton')]")).click();
       
		//contain with  text method
		
		
		
	} 

}
