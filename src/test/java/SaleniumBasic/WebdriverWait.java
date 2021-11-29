package SaleniumBasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		System.setProperty("webdriver.chrome.driver","E:\\selenium\\browser driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.findElement(By.id("email")).sendKeys("shellishgarg@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("shelish123");
	    driver.findElement(By.name("loginn")).click();
	   // driver.findElement(By.className("Button_button_co9Na")).click();
	    		
	    
//		   WebDriverWait wait=new WebDriverWait(driver, 10);
			  
		   // String text=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(//"*[@id="root"]/div/div/div/div/h1"))));
		    //System.out.println(text);

	    
	    
	    
}
}