package SaleniumBasic;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Login {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\browser driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB");
		//System.setProperty("webdriver.gecko.driver","E:\\selenium\\browser driver\\geckodriver.exe");
		//WebDriver driver1=new FirefoxDriver();
		//driver1.get("https://www.google.com");
		//System.setProperty("webdriver.edge.driver","E:\\selenium\\browser driver\\msedgedriver.exe");
		//WebDriver driver2=new EdgeDriver();
		//driver2.get("https://www.facebook.com");

//	WebElement usern=driver.findElement(By.id("email"));
	//usern.sendKeys("shelishgarg");

//	WebElement pwd=driver.findElement(By.name("pass"));
	//pwd.sendKeys("test");
		
		
	//	System.out.println(driver.getPageSource());
		//System.out.println("URL:"+driver.getPageSource());
		//System.out.println("Title:"+driver.getTitle());
		
		
	/*
	 * driver.findElement(By.name("q")).sendKeys("hyr tutorials");
	 * driver.findElement(By.name("btnK")).submit();
	 * 
	 * 
	 * driver.navigate().to("https://www.facebook.com/r.php?locale=en_GB");
	 * driver.findElement(By.name("firstname")).sendKeys("shelish");
	 * driver.navigate().refresh(); Thread.sleep(2000); driver.navigate().back();
	 * Thread.sleep(2000); driver.navigate().forward();
	 */
		//String firstwindow=driver.getWindowHandle();
		//Thread.sleep(3000);
	//	driver.findElement(By.linkText("Already have an account?")).click();
		
		/*
		 * Set<String> windows = driver.getWindowHandles(); Iterator<String> itr =
		 * windows.iterator(); while(itr.hasNext()) { String window=itr.next();
		 * driver.switchTo().window(window);
		 * if(driver.getTitle().equals("Log in to Facebook1")){ driver.close(); } }
		 */
		// Thread.sleep(3000);
		// driver.switchTo().window(firstwindow);
	
	//	 driver.findElement(By.name("email")).sendKeys("shelish");
		 
	
	
 
	//driver2.findElement(By.linkText("forgotten password")).click();
	//driver2.findElement(By.partialLinkText("forgotten")).click();
	
//	String currentURL=driver.getPageSource();
	//System.out.println(currentURL);
	
	//String title=driver.getTitle();
	//System.out.println(title);
	
	


	
	
	
	}
}
	
