import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class linkcount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 WebDriver driver=new ChromeDriver();
 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
 System.out.println(driver.findElements(By.tagName("a")).size());
 
 WebElement footer=driver.findElement(By.id("gf-BIG"));
 System.out.println(footer.findElements(By.tagName("a")).size());
  
 WebElement columndriver=footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
 System.out.println(columndriver.findElements(By.tagName("a")).size());
 for (int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
 {
	String click= Keys.chord(Keys.CONTROL,Keys.ENTER);
	 columndriver.findElements(By.tagName("a")).get(i).sendKeys(click);
	 Thread.sleep(5000);
 } 
	 Set <String> window=driver.getWindowHandles();
	Iterator<String> it= window.iterator();
	
	while(it.hasNext())
			{
		driver.switchTo().window(it.next());
	System.out.println(driver.getTitle());
		
			}
	 																						
	 
 } 
	}


