import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prpductlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> Pro=driver.findElements(By.cssSelector("h4.product-name"));

		for(int i=0;i<Pro.size();i++)
			
		{
			
			String name=Pro.get(i).getText();
			if(name.contains("Cucumber"))
			{
				driver.findElements(By.xpath("//div[3]//div[3]//button[1]")).get(i).click();
				break;
			}
			
				
		}
		
for(int i=0;i<Pro.size();i++)
			
		{
			
			String name=Pro.get(i).getText();
			if(name.contains("Beetroot"))
			{
				driver.findElements(By.xpath("//div[3]//div[3]//button[1]")).get(i).click();
				break;
			}
		
	}}

}
