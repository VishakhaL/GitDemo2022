package locators;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GridDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishakha.lokhande\\eclipse-workspace\\SeleniumProject\\chromedriver.exe");  
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		int totalSum=0;
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		for(int i=0;i<values.size();i++) {
			String number=values.get(i).getText();
			totalSum=totalSum+Integer.parseInt(number);
		}
		System.out.println(totalSum);
		String totalSumText=driver.findElement(By.cssSelector(".totalAmount")).getText();
		String[] totalSumText1=totalSumText.split(":");
		String totalSumText2=totalSumText1[1].trim();
		int totalSum1=Integer.parseInt(totalSumText2);
		System.out.println(totalSum1);
		assertEquals(totalSum, totalSum1,"Sum Matches");
	}

}
