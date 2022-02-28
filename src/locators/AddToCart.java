package locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishakha.lokhande\\eclipse-workspace\\SeleniumProject\\chromedriver.exe");  
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		String itemExpected="Brocolli";
				
		List<WebElement> lst = driver.findElements(By.xpath("//h4[@class='product-name']"));
		for(int i=0;i<lst.size();i++) {
			String itemActual=lst.get(i).getText();
			if(itemActual.contains(itemExpected)) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}
	}
}