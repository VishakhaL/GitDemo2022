package testprogram;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment1Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishakha.lokhande\\eclipse-workspace\\SeleniumProject\\chromedriver.exe");  
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("checkBoxOption2")).click();
		String checkBoxValue = driver.findElement(By.xpath("//label[@for='benz']")).getText();
		System.out.println(checkBoxValue);
		
		WebElement selectBox = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select sel = new Select(selectBox);
		sel.selectByVisibleText(checkBoxValue);
		
		driver.findElement(By.id("name")).sendKeys(checkBoxValue);
		
		driver.findElement(By.id("alertbtn")).click();
		
		Alert alt= driver.switchTo().alert();
		String altText= alt.getText();
		
		if(altText.contains(checkBoxValue))
		   System.out.println("Alert message success");

		   else

		    System.out.println("Something wrong with execution");

		/*
		 * System.out.println(altText); String[] altTextArray1=altText.split(",");
		 * String altTextArray2 = altTextArray1[0]; String[] secondPart=
		 * altTextArray2.split(" "); System.out.println(secondPart[1]);
		 */
		alt.accept();
		
		}

}
