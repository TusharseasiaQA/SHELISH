package SaleniumBasic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		    	System.setProperty("webdriver.chrome.driver","E:\\selenium\\browser driver\\chromedriver.exe");
		
	     WebDriver driver=new ChromeDriver();
		driver.get("https://in.linkedin.com/in/shelishgarg");
		driver.manage().window().maximize();
		
		TakesScreenshot srshot=(TakesScreenshot) driver;
		File SrFile=srshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SrFile, new File("F:\\workspace\\screenshot.png"));
		System.out.println("hello");
	}

}
