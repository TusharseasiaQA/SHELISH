package SaleniumBasic;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Permission {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		HashMap<String,Integer> conentSettings =new HashMap<String,Integer>();
		HashMap<String,Object> profile =new HashMap<String,Object>();
		HashMap<String,Object> prefs =new HashMap<String,Object>();
		
		//conentSettings.put("notifications", 1);
		//conentSettings.put("geolocation", 2);
		conentSettings.put("media_stream", 2);
		profile.put("managed_default_content_settings",conentSettings);
		prefs.put("profile", profile);
		options.setExperimentalOption("prefs", prefs);
	
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\browser driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://mictests.com/");
		Thread.sleep(5000);
		driver.findElement(By.id("mic-launcher")).click();
		
		
		
	}

}
