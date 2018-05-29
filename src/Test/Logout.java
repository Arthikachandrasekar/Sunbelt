package Test;

public class Logout extends Browser{
	
	Report rpt = new Report();
	
	public void logout() throws Exception{
		
	if (findTheElement("xpath=//a[contains(text(),'Logout')]").isDisplayed()) 
	{
		click("xpath=//a[contains(text(),'Logout')]");
		rpt.createTest("SunBelt : Logout","Click Logout Button");
		rpt.Pass("Logout Button is clicked");
		rpt.Category("SunBelt : Logout");
		String path = rpt.CaptureScreen(browser, "ValidMessage");
		rpt.imgPathPass(path);
		rpt.chkBugs(CommonUtils.getUserName());
	}
	else 
	{
		rpt.createTest("SunBelt : Logout","Click Logout Button");
		rpt.Fail("Logout Button is NOT clicked");
		rpt.Category("SunBelt : Logout");
		String path = rpt.CaptureScreen(browser, "InvalidMessage");
		rpt.imgPathFail(path);
		rpt.chkBugs(CommonUtils.getUserName());
	}
  }
}
