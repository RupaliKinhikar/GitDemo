

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugestedDropDown56 {
           public static void main(String[] args) throws InterruptedException {

			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Rupali\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			//Thread.sleep(6000L);
			// we type ind to search
			driver.findElement(By.id("autosuggest")).sendKeys("Ind");
			Thread.sleep(3000);
			
			//we are getting list of options 
			List<WebElement> options = driver.findElements(By.cssSelector("li[class= 'ui-menu-item'] a"));
			
			//iterate through list using enhance for loop
			for (WebElement option : options) {
				
				if (option.getText().equalsIgnoreCase("India")){
					
					  option.click();
					  break;
					  					
				}
				
			}
	}
}
