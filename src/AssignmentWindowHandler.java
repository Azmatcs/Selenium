import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentWindowHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");

		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();

		Set<String> win = driver.getWindowHandles();
		Iterator<String> it = win.iterator();
		String P = it.next();
		String ch = it.next();

		driver.switchTo().window(ch);
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());

		driver.switchTo().window(P);
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());

	}

}
