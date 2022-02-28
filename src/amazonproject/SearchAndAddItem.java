package amazonproject;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAndAddItem {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishakha.lokhande\\eclipse-workspace\\SeleniumProject\\chromedriver.exe");  
        WebDriver driver=new ChromeDriver();
       	driver.get("https://www.amazon.in/");
       	driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id(("twotabsearchtextbox"))).sendKeys("dresses for women",Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//div[@class='a-section aok-relative s-image-tall-aspect']")).click();
		Set<String> st = driver.getWindowHandles();
		Iterator<String> it= st.iterator();
		String parentWindow= it.next();
		String childWindow=it.next();
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		driver.findElement(By.id("add-to-cart-button")).click();
		//driver.quit();
		
	}

}
