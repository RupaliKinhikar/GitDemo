

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class ActionClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Rupali\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/ref=ap_frn_logo");
		Actions a = new Actions(driver);
		
		// clicking on text box,making text in capital letter and send text double click on it
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		
		// mouse over  and right click ie contextClick()
		
		
		WebElement mouse = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		a.moveToElement(mouse).contextClick().build().perform();
		
	}

}
