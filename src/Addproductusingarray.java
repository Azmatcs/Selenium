import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addproductusingarray {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		String[] itemneed = {"Cucumber","Brocolli" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		List<WebElement> prod = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i=0; i<prod.size(); i++) {

			String name = prod.get(i).getText();
			List<String> itemneedList = Arrays.asList(itemneed);
			int j=0;
			if(itemneedList.contains(name)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==2)
				{break;}
			}

		}

	}

}
