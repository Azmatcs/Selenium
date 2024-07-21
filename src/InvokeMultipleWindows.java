import java.awt.Window;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeMultipleWindows {

	public static void main(String[] args) {
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
		
		

	}

}
