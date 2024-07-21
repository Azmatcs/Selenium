import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Dropdownupdated {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(4000);
		
		for(int i=0;i<5;i++)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		Thread.sleep(2000);
		
		int i=1;
		while(i<4)
		{
			driver.findElement(By.id("hrefIncChd")).click();
			i++;
			
		}
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		Thread.sleep(3000);
		
		for(int j=1; j<5;j++) {
			
			driver.findElement(By.id("hrefIncInf")).click();
			
		}
		
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("btnclosepaxoption")).click();
		driver.close();
	}

}
