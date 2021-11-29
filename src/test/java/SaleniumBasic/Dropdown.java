package SaleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\selenium\\browser driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mimitmalout.ac.in/ApplyNow.aspx");
        Thread.sleep(1000);
        Select A=new Select(driver.findElement(By.name("ctl00$ContentPlaceHolder1$ddlcrse")));
        List<WebElement> dd_options=A.getOptions();
        for(WebElement e :dd_options) {
        	System.out.println(e.getText());
        	
        }
		//Airline.selectByVisibleText("MBA");
	
	/*List<WebElement>links=driver.findElements(By.tagName("a"));
	int count=links.size();
	System.out.println("total no of links"+count);
	
	for(WebElement link:links) {
		System.out.println(link.getText()  +  " - " +link.getAttribute("href"));
	}
}*/
}
}