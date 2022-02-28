package locators;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartUsingArrayList {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
        String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		addItems(driver,itemsNeeded);	
	}
	
	public static  void addItems(WebDriver driver,String[] itemsNeeded)
	{
	int j=0;
	List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
	for(int i=0;i<products.size();i++) {
		String[] name= products.get(i).getText().split("-");
		//Brocolli - 1 Kg- after spilit Brocolli  and  1 Kg
		//System.out.println(name);
		String formattedName=name[0].trim();
		System.out.println(formattedName);
		//format it to get actual vegetable name

		//convert array into array list for easy search
		//  check whether name you extracted is present in arrayList or not-

		List itemsNeededList = Arrays.asList(itemsNeeded);
		if(itemsNeededList.contains(formattedName))
		{
		j++;
		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		if(j==itemsNeeded.length)

		{

		break;

		}
		}
	}
		
	}

}
