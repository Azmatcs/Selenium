import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class drandrop {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://jqueryui.com/droppable/");
	driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
	driver.findElement(By.id("draggable")).click();
	WebElement source= driver.findElement(By.id("draggable"));
	WebElement target=driver.findElement(By.id("droppable"));
	Actions a= new Actions (driver);
	
	a.dragAndDrop(source,target).build().perform();
	

	}

}
