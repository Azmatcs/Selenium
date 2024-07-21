import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Loginpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");

        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
        WebDriverWait w= new WebDriverWait(driver, Duration.ofMillis(7000));
        w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
        
        driver.findElement(By.id("okayBtn")).click();
       WebElement opt= driver.findElement(By.cssSelector("select[class='form-control']"));
        
        Select s=new Select(opt);
        s.selectByIndex(1);
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));

        List <WebElement> prod = driver.findElements(By.cssSelector(".card-footer .btn-info"));

        for(int i =0;i<prod.size();i++)

        {

        prod.get(i).click();

        }

        driver.findElement(By.partialLinkText("Checkout")).click();}
	

}

