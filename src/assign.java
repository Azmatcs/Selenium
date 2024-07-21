import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assign {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	WebElement z=	driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select s1=new Select(z);
		s1.selectByIndex(1);
        System.out.println(z.getText());
        System.out.println(s1.getFirstSelectedOption().getText());
		
		
		

	}

}
