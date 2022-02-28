package testprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishakha.lokhande\\eclipse-workspace\\SeleniumProject\\chromedriver.exe");  
        
        // Instantiate a ChromeDriver class.     
   WebDriver driver=new ChromeDriver();  
     
      // Launch Website  
  driver.get("https://www.amazon.in/");
  driver.get("https://www.amazon.in/");
//  driver.navigate().to("https://www.javatpoint.com/selenium-webdriver-navigation-commands");
  driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
  
     
    //Maximize the browser  
     driver.manage().window().maximize();  
     driver.quit();
     
         
       

	}

}
