package Test;


import java.io.File;
import java.io.IOException;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class Report {

	private static ExtentReports extent;
	private static ExtentTest test;
	private static ExtentHtmlReporter htmlReporter;
		
	private static String filePath = "C:\\Users\\User\\workspace\\SunBelt\\test-output\\myReport.html";
	public static WebDriver browser = BrowserFactory.getBrowser("browser","URL");
	static String imagePath="C:\\Users\\User\\workspace\\SunBelt\\Screenshots\\";
	
		
	private static long counter =0;
	BrowserFactory br = new BrowserFactory();
	public static ExtentReports GetExtent(){
		if (extent != null)
                    return extent; 
                extent = new ExtentReports();		
		extent.attachReporter(getHtmlReporter());
		return extent;
	}
 
	private static ExtentHtmlReporter getHtmlReporter() {
	
        htmlReporter = new ExtentHtmlReporter(filePath);
        htmlReporter.config().setChartVisibilityOnOpen(true);
        htmlReporter.config().setDocumentTitle("SunBelt");
        htmlReporter.config().setReportName("SunBelt : Regression Suite");
        return htmlReporter;
	}
		
	public static ExtentTest createTest(String name, String description){
		test = extent.createTest(name, description);
		return test;	
	}
	public static ExtentTest Pass(String Message)
	{
		test.pass(Message);
		test.assignCategory("SunBelt : Regression");
		return test;
	}
	public static  ExtentTest Fail(String FailMessage)
	{
		test.fail(FailMessage);
		test.assignCategory("SunBelt : Regression");
		test.warning(FailMessage);
		test.error(FailMessage);
		return test;
		
		
	}
	public static ExtentTest Skip(String SkipMessage)
	{
		test.skip(SkipMessage);
		test.assignCategory("SunBelt : Regression");
		
		return test;
	}

	public static ExtentTest Info(String InfoMessage)throws Exception
	{
		test.info(InfoMessage);
		return test;
	}
	public static ExtentTest imgPathPass(String path)throws Exception
	{
		test.pass("ScreenShot", MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		return test;
		
	}
	public static ExtentTest imgPathFail(String path)throws Exception
	{
		test.fail("ScreenShot", MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		return test;
		
		
	}
	
	public static ExtentTest Category(String Category)throws Exception
	{
		test.assignCategory(Category);
		return test;
	}
	
	public static ExtentTest chkBugs(String Bugs)throws Exception
	{
		test.assignAuthor(Bugs);
		return test;
	}
	public static ExtentTest chkdebug(String dbg)throws Exception
	{
		test.error(dbg);
		return test;
	}
	
	public static String CaptureScreen(WebDriver driver,String imgName)
	{

		try {
			TakesScreenshot oScn = (TakesScreenshot) driver;
			File oScnShot = oScn.getScreenshotAs(OutputType.FILE);
			String fileName = imagePath+imgName+(++counter)+".png";
			File oDest = new File(fileName);
			try
			{
				FileUtils.copyFile(oScnShot, oDest);
			} 
			catch (IOException e)
			{
				System.out.println(e.getMessage());
			}
			return fileName;
		} catch (Exception e) {
			e.printStackTrace();
			return "Screenshot Capture Failed";
	}
	
}
}