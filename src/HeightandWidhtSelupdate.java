
import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
		import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
		import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;
public class HeightandWidhtSelupdate {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

		
				WebDriver driver=new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/angularpractice/");
				driver.switchTo().newWindow(WindowType.TAB);
				
				Set<String> han=driver.getWindowHandles();
				Iterator<String> it=han.iterator();
				String p=it.next();
				String ch=it.next();
				 driver.switchTo().window(ch);
				 driver.get("https://courses.rahulshettyacademy.com/courses/");
				 driver.switchTo().window(p);
				WebElement name=driver.findElement(By.name("name"));
				name.sendKeys("Selenium");
				File src=name.getScreenshotAs(OutputType.FILE);
				File Des=new File("logo.png");
				Files.copy(src, Des);
				System.out.println(name.getRect().getDimension().getHeight());
				System.out.println(name.getRect().getDimension().getWidth());

			}

		



}
