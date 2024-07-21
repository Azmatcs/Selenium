
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    WebElement e= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	     Select dd=new Select(e);
	     dd.selectByIndex(3);
	     System.out.println(dd.getFirstSelectedOption().getText());
	     Thread.sleep(2000);
	     
	 //  Value is an attribute
	     dd.selectByValue("AED");
	     System.out.println(dd.getFirstSelectedOption().getText());
	   
	     dd.selectByVisibleText("INR");
	     System.out.println(dd.getFirstSelectedOption().getText());
	 
	   
	    
	}

}
