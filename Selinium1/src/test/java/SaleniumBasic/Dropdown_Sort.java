package SaleniumBasic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Sort {
	public static void main(String[] args) {


		System.setProperty("webdriver.gecko.driver","E:\\selenium\\browser driver\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mimitmalout.ac.in/ApplyNow.aspx");

Select options = new Select(driver.findElement(By.name("ctl00$ContentPlaceHolder1$ddlCourse2")));
        
        // Get all options from category dropdown
        List<WebElement> lists = options.getOptions();
        
        //Creating a List to store all dropdown values
        List OriginalList = new ArrayList();
        
        //Using for-each loop fetch all options one by one and get their values
        for(WebElement ele : lists) {
            
            OriginalList.add(ele.getText());
        }
        
        System.out.println("Options in dropdown: " +OriginalList);
        
        Collections.sort(OriginalList);
        System.out.println("Sorted List:" + OriginalList );
//        //Creating temp List - same copy of Original for comparing purpose
//        List templist = new ArrayList(OriginalList);
//        
//        System.out.println("Temp List: " + templist);
//        
//        //Sorting the Original List 
//        Collections.sort(OriginalList);
//        System.out.println("Sorted List:" + OriginalList );
//        
//        
//        // In IF Condition we will compare both List
//        if(OriginalList.equals(templist)) {
//            
//            System.out.println("List is Sorted");
//            
//        }else {
//            
//            System.out.println("List is unsorted");
//        }
//        
        driver.quit();
        
    }

}