package Test;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Initiate {

	ExtentReports extent;
	ExtentTest test;
	public static WebDriver browser = BrowserFactory.getBrowser("browser","url");
	BrowserFactory br = new BrowserFactory();
	Report rpt = new Report();
	WebDriver wb;
		
	
	@BeforeClass
	public void Ini(){
		extent = Report.GetExtent();

	}
	@SuppressWarnings("static-access")
	@Parameters({"browser","url","Module"})
	@Test
	public void checkHome(String Browser, String Url,String Module)throws Exception
	{
		rpt.createTest("SunBelt", "Verify HomePage");
		br.getBrowser(Browser, Url);
		rpt.Pass("Browser that is passed as parameter from Jenkins is :"+Browser);
		rpt.Pass("URL that is passed as parameter from Jenkins is :"+Url);
		
		
		if (Module != null) 
		{
			
			if ("Login".equalsIgnoreCase(Module)) {
				login();
			} 
			
			else if("IndustrySearch".equalsIgnoreCase(Module))
			{
				industrySearch();
			}
			
			else if("CompanySearch".equalsIgnoreCase(Module))
			{
				companySearch();
			}
			
			else if("DNUS_Upload".equalsIgnoreCase(Module))
			{
				uploadDNUSNumberFile();
			}
			
			else if("Logout".equalsIgnoreCase(Module)){
				logout();
			}
			
			else if("All Modules".equalsIgnoreCase(Module))
			{
				login();
				industrySearch();	
//				companySearch();
				uploadDNUSNumberFile();
//				logout();
			}	
		}
	}
	
	
	public void login()throws Exception
	{
		Login login=new Login();
		login.loginSunBelt();
	}
	
	public void industrySearch()throws Exception
	{
		IndustrySearch industrysearch=new IndustrySearch();
		industrysearch.executeAll();
	}
	
	public void companySearch()throws Exception
	{
		CompanySearch countrysearch=new CompanySearch();
		countrysearch.executeAll();
	}
	
	public void uploadDNUSNumberFile() throws Exception
	{
		DNUS_Upload uploadtextfile=new DNUS_Upload();
		uploadtextfile.uploadDNUSNumber();
	}
	
	public void logout() throws Exception
	{
		Logout logout=new Logout();
		logout.logout();
	}
	
	public void checkFail()throws Exception
	{
		rpt.createTest("Testing - Fail Criteria for Circuit City","Checked");
		rpt.Fail("Testing Fail - CIRCUIT CITY");
	
	}
	
	public void skipTest()
	{	
		rpt.createTest("SkipTest","Skipped");
		rpt.Skip("Test Skipped");
	}
		
	@AfterTest
	public void publishReport()throws Exception
	{
		extent.flush();
		
	}

}
