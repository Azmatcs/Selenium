package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent {
	ExtentReports extent;
	@BeforeTest
	public void config() {
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter Report=new ExtentSparkReporter(path);
		Report.config().setReportName("Azmat Automation");
		Report.config().setDocumentTitle("Test Result");
		
		//ExtentReports
		extent=new ExtentReports();
		extent.attachReporter(Report);
		extent.setSystemInfo("Tester","Azmat");
	}

	@Test
	
	public void ExtentR()
	{
		extent.createTest("Demo");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		extent.flush();
	}
}
