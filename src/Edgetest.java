import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edgetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      WebDriver driver=new EdgeDriver();
      driver.get("https://www.cricbuzz.com/");
      System.out.println(driver.getCurrentUrl());
      System.out.println(driver.getTitle());
      
      WebDriver driver1=new ChromeDriver();
      driver1.get("https://www.cricbuzz.com/");
      System.out.println(driver1.getCurrentUrl());
      System.out.println(driver1.getTitle());
  
	}

}
