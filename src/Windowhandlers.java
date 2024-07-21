import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandlers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String>it=window.iterator();
		String parentid=it.next();
		
		String childid=it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String Ausername=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0].trim();
		System.out.println(Ausername);
		
		 driver.switchTo().window(parentid);
		 
		 driver.findElement(By.id("username")).sendKeys(Ausername);
		 driver.findElement(By.id("password")).sendKeys("learning");
		 driver.findElement(By.id("terms")).click();
		 driver.findElement(By.id("signInBtn")).click();
		 
		
	}

}
