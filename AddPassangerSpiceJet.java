import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddPassangerSpiceJet {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Rupali\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.spicejet.com/");
			Thread.sleep(5000L);

			//Thread.sleep(6000);

			driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();

			Thread.sleep(5000);
			
			WebElement Adults = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']"));
			    
			Select adultsdrp = new Select(Adults);
			Thread.sleep(6000);
			for(int i=0;i<=5;i++)
			{
				adultsdrp.selectByIndex(i);
			}
			//adultsdrp.selectByValue("2");
			//Thread.sleep(2000);
			//adultsdrp.selectByIndex(5);
}

}