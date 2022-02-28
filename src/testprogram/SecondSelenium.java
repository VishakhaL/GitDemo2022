package testprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 class SecondSelenium {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishakha.lokhande\\eclipse-workspace\\SeleniumProject\\chromedriver.exe");  
        
        // Instantiate a ChromeDriver class.     
   WebDriver driver=new ChromeDriver();  
     
      // Launch Website  
   driver.navigate().to("https://www.google.com/");  
     
    //Maximize the browser  
     driver.manage().window().maximize();  
	}

}
