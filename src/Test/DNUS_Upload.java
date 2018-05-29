package Test;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.security.KeyPair;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DNUS_Upload extends Browser {
	
	Report rpt = new Report();
	
	public void executeAll() throws Exception
	{
		uploadDNUSNumber();

	}
	
	public void uploadDNUSNumber() throws Exception{
		
		if (findTheElement("link=Company Search").isDisplayed()) 
    	{
			click("link=Company Search"); 
			rpt.createTest("SunBelt : Company Search","Click Company Search Button");
			rpt.Pass("Company Search Button is clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
    	}
    	else 
    	{
			rpt.createTest("SunBelt : Company Search","Click Company Search Button");
			rpt.Fail("Company Search Button is NOT clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
    	}
		
		if (findTheElement("xpath=//span[text()='Upload DUNS Number']").isDisplayed()) 
    	{
			WebElement uploadElement = findTheElement("xpath=//input[@class='upload']");
			uploadElement.click();
			String file = "C:\\Users\\User\\workspace\\SunBelt\\5 DUNS.txt";
			StringSelection select = new StringSelection(file);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
	        rpt.createTest("SunBelt : Company Search","Upload DNUS Number text file");
			rpt.Pass("DNUS Number text file is uploaded");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
    	}
    	else 
    	{
			rpt.createTest("SunBelt : Company Search","Upload DNUS Number text file");
			rpt.Fail("DNUS Number text file is NOT uploaded");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
			
		}
	}
}
