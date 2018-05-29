package Test;

import Test.CommonUtils;

public class Login extends Browser{
	
	Report rpt = new Report();
	String userName = "test2";
	String password="test2";
	
	public void loginSunBelt() throws Exception{
		
		if (findTheElement("id=login-username").isDisplayed()) 
    	{
			sendKeys("id=login-username",userName); //employee id
			rpt.createTest("SunBelt : Login","Enter User Name");
			rpt.Pass("User Name is entered");
			rpt.Category("SunBelt : Login");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
			
    	}
    	else 
    	{
			rpt.createTest("SunBelt : Login","Enter User Name");
			rpt.Fail("User Name NOT Entered");
			rpt.Category("SunBelt : Login");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
		}
    	
		if (findTheElement("id=login-password").isDisplayed()) 
    	{
			sendKeys("id=login-password",password); 
			rpt.createTest("SunBelt : Login","Enter Password");
			rpt.Pass("Password is Entered");
			rpt.Category("SunBelt : Login");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
			
    	}
    	else 
    	{
			rpt.createTest("SunBelt : Login","Enter Password");
			rpt.Fail("Password NOT Entered");
			rpt.Category("SunBelt : Login");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
		}

		if (findTheElement("xpath=//*[@class='col-md-4 col-xs-6']/button").isDisplayed()) 
    	{
    		click("xpath=//*[@class='col-md-4 col-xs-6']/button");
			rpt.createTest("SunBelt : Login","Click Login Button");
			rpt.Pass("Login Button is Clicked");
			rpt.Category("SunBelt : Login");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
			
    	}
    	else 
    	{
			rpt.createTest("SunBelt : Login","Click Login Button");
			rpt.Fail("Login Button NOT Clicked");
			rpt.Category("SunBelt : Login");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
		}
	}
	
	}
