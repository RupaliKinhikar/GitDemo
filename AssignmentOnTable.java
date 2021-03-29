import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Rupali\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);
		
		WebElement table = driver.findElement(By.cssSelector("div[class='left-align'] table"));
		
		int tablecount = table.findElements(By.xpath("//table[@id='product']/tbody/tr")).size();
		System.out.println("The number of column is " + tablecount);
		
		for(int i=0;i<tablecount;i++)
		{
			 System.out.println(table.findElements(By.xpath("//table[@id='product']/tbody/tr")).get(i).getText());
		}
		
		
		int rowcount =table.findElements(By.xpath("//table[@id='product']/tbody/tr/th")).size();
		System.out.println("The number of rows is " + rowcount);
		
		//System.out.println(table.findElement(By.xpath("//table[@id='product']/tbody/tr[3]")).getText());
		System.out.println(table.findElement(By.cssSelector("[id='product'] tr:nth-child(3) td:nth-child(1)")).getText());
		}
		

}


/*
 * Instructor example
User photo
Rahul Shetty
Complete the Assignment and Post the code here

import java.util.Iterator;



import java.util.List;



import java.util.Set;



import org.openqa.selenium.By;



import org.openqa.selenium.WebDriver;



import org.openqa.selenium.WebElement;



import org.openqa.selenium.chrome.ChromeDriver;



public class A3 {



public static void main(String[] args) {



// TODO Auto-generated method stub







System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");



WebDriver driver=new ChromeDriver();



driver.get("http://qaclickacademy.com/practice.php");



WebElement table=driver.findElement(By.id("product"));



System.out.println(table.findElements(By.tagName("tr")).size());



System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());



List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));



System.out.println(secondrow.get(0).getText());



System.out.println(secondrow.get(1).getText());



System.out.println(secondrow.get(2).getText());

}

}

*/
