import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 
		 driver.findElement(By.id("divpaxinfo")).click();
		 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 
		 Thread.sleep(2000);
		 
		 int i=1;
		 while(i<6)
		 {
		 driver.findElement(By.id("hrefIncAdt")).click();
		 
		
	
		 i++;
		
	
		 }
		 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 driver.findElement(By.id("btnclosepaxoption")).click();
		 driver.close();
	}
	

}
