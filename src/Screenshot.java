import org.openqa.selenium.OutputType;
		import org.openqa.selenium.TakesScreenshot;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.chrome.ChromeOptions;
		import java.io.File;
import java.io.IOException;

import com.google.common.io.Files;
public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		


		
				// TODO Auto-generated method stub
				
				ChromeOptions option=new ChromeOptions();
				
				option.setAcceptInsecureCerts(true);
				
				WebDriver driver=new ChromeDriver(option);
				driver.manage().window().maximize();
				//driver.manage().deleteAllCookies();
				//driver.manage().deleteCookieNamed("");
				driver.get("https://expired.badssl.com/");
				File SourceFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File DestFile=new File("D://screenshot.png");
				Files.copy(SourceFile,DestFile);
				//Files.copy(SourceFile,"");
	}

}
