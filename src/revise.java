import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class revise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		

	}

}
