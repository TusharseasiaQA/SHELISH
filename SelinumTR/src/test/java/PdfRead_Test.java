

	import java.io.File;
	import java.io.IOException;

	import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
	
	public class PdfRead_Test {
	    WebDriver driver;
	    @Test
	    public void Titletest() {
	    	 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	         Assert.assertEquals(driver.getTitle(), "Rediffmailmail");
	    }
	    @Test
	    public void remembermetest(){
	        boolean actualstatus=driver.findElement(By.id("remember")).isSelected();
	        Assert.assertEquals(actualstatus,true);

	    }
	    @BeforeTest
	    public void beforetest(){
			System.setProperty("webdriver.chrome.driver","E:\\selenium\\browser driver\\chromedriver.exe");
	driver=new ChromeDriver();
			driver.manage().window().maximize();

	    }
	    @AfterTest
	    public void aftertest(){
	        driver.quit();
	    }
	   
	    public void aftermethod(ITestResult result, String ScreenshotName) throws IOException {
	        if(result.getStatus()==ITestResult.FAILURE){
	        	TakesScreenshot src = (TakesScreenshot) driver;
				File sc = src.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(sc, new File("F:\\workspace\\screenshot.png"));
				System.out.println("Screenshot taken");
	        }
	    }
	}

