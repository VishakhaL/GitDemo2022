package testprogram;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderMakeMyTrip {

	public static void main(String[] args) {
		////div[@class='DayPicker-Month'][1]
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishakha.lokhande\\eclipse-workspace\\SeleniumProject\\chromedriver.exe");  
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut']")).click();
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		//click on date label
		driver.findElement(By.xpath("//div[@class='fsw_inputBox dates inactiveWidget ']/label")).click();
				
		while(!driver.findElement(By.xpath("//div[@class='DayPicker-Month'][1]")).getText().contains("May")) {
			//click on next month arrow
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		
		}
		List<WebElement> days=driver.findElements(By.xpath("//div[@class='DayPicker-Day']/div[@class='dateInnerCell']/p"));
		for(int i=0;i<days.size();i++) {
			String daysText = driver.findElements(By.xpath("//div[@class='DayPicker-Day']/div[@class='dateInnerCell']/p")).get(i).getText();
			System.out.println(daysText);
			if(daysText.equals("5")) {
				driver.findElements(By.xpath("//div[@class='DayPicker-Day']/div[@class='dateInnerCell']/p")).get(i).click();
				break;
			}
		}
		
			
	}

}
