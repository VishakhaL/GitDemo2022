package locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesRowColumnCount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishakha.lokhande\\eclipse-workspace\\SeleniumProject\\chromedriver.exe");  
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> rows=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr"));
		System.out.println("Rows:- "+rows.size());
		List<WebElement> columns=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th"));
		System.out.println("Columns:- "+columns.size());
		for(int i=0;i<rows.size();i++) {
			if(i==2) {
				String content=driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[2]")).getText();
				System.out.println(content);
			}
		}
		
	}

}
