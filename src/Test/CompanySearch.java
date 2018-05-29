package Test;

import java.util.Set;

public class CompanySearch extends Browser {
Report rpt = new Report();
String companyName="Microsoft";
	
	public void executeAll() throws Exception
	{
		companySearch();
		resultPage();
		overviewPage();
		contactsPage();
		familyTreePage();
	}
	
	public void companySearch() throws Exception{
		
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
		
		Thread.sleep(2000);
		if (findTheElement("xpath=//input[@id='company_name']").isDisplayed()) 
    	{
			sendKeys("xpath=//input[@id='company_name']",companyName); 
			rpt.createTest("SunBelt : Company Search","Enter Company Name");
			rpt.Pass("Company Name is entered");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
			
    	}
    	else 
    	{
			rpt.createTest("SunBelt : Company Search","Enter Company Name");
			rpt.Fail("Company Name is NOT entered");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
    	}
		
		if (findTheElement("xpath=//button[@type='submit']").isDisplayed()) 
    	{
			click("xpath=//button[@type='submit']"); 
			rpt.createTest("SunBelt : Company Search","Click Search Button");
			rpt.Pass("Search Button is clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
			
    	}
    	else 
    	{
			rpt.createTest("SunBelt : Company Search","Click Search Button");
			rpt.Fail("Search Button is NOT clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
    	}
		}
	public void resultPage() throws Exception{
		
		if (findTheElement("id=exportbutton").isDisplayed()) 
    	{
			click("xpath=(//input[@type='checkbox'])[7]");
			click("id=exportbutton"); 
			rpt.createTest("SunBelt : Company Search","Click Download Button in Company Search Results page");
			rpt.Pass("Download Button is clicked in Company Search Results page");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
			
    	}
    	else 
    	{
			rpt.createTest("SunBelt : Company Search","Click Download Button in Company Search Results page");
			rpt.Fail("Download Button is NOT clicked in Company Search Results page");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
    	}
		
		if (findTheElement("id=companyrecreate").isDisplayed()) 
    	{
			click("id=companyrecreate"); 
			rpt.createTest("SunBelt : Company Search","Click Back Button in Company Search Results page");
			rpt.Pass("Back Button is clicked in Company Search Results page");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
			
    	}
    	else 
    	{
			rpt.createTest("SunBelt : Company Search","Click Back Button in Company Search Results page");
			rpt.Fail("Back Button is NOT clicked in Company Search Results page");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
    	}
		
		if (findTheElement("xpath=//button[@type='submit']").isDisplayed()) 
    	{
			click("xpath=//button[@type='submit']"); 
			rpt.createTest("SunBelt : Company Search","Click Search Button");
			rpt.Pass("Search Button is clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
			
    	}
    	else 
    	{
			rpt.createTest("SunBelt : Company Search","Click Search Button");
			rpt.Fail("Search Button is NOT clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
    	}
		
		if (findTheElement("id=poptest").isDisplayed()) 
    	{
			click("id=poptest"); 
			rpt.createTest("SunBelt : Company Search","Click Filter Button in Company Search Results page");
			rpt.Pass("Search Button is clicked in Company Search Results page");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
			
    	}
    	else 
    	{
			rpt.createTest("SunBelt : Company Search","Click Search Button in Company Search Results page");
			rpt.Fail("Search Button is NOT clicked in Company Search Results page");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
    	}
		
		if (findTheElement("id=hide-branch").isDisplayed()) 
    	{
			click("id=hide-branch"); 
			rpt.createTest("SunBelt : Company Search","Click Hide Branches filter option");
			rpt.Pass("Hide Branches filter option is clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
			
    	}
    	else 
    	{
			rpt.createTest("SunBelt : Company Search","Click Hide Branches filter option");
			rpt.Fail("Hide Branches filter option is NOT clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
    	}
		
		if (findTheElement("id=refresh").isDisplayed()) 
    	{
			click("id=refresh"); 
			rpt.createTest("SunBelt : Company Search","Click Refresh Button");
			rpt.Pass("Refresh Button is clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
			
    	}
    	else 
    	{
			rpt.createTest("SunBelt : Company Search","Click Refresh Button");
			rpt.Fail("Refresh Button is NOT clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
    	}
		
		click("id=poptest");
		if (findTheElement("id=domestic-site").isDisplayed()) 
    	{
			click("id=hide-branch");
			click("id=domestic-site"); 
			rpt.createTest("SunBelt : Company Search","Click Domestic Ultimate Site filter option");
			rpt.Pass("Domestic Ultimate Site filter option is clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
			
    	}
    	else 
    	{
			rpt.createTest("SunBelt : Company Search","Click Domestic Ultimate Site filter option");
			rpt.Fail("Domestic Ultimate Site filter option is NOT clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
    	}
		
		if (findTheElement("id=refresh").isDisplayed()) 
    	{
			click("id=refresh"); 
			rpt.createTest("SunBelt : Company Search","Click Refresh Button");
			rpt.Pass("Refresh Button is clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
			
    	}
    	else 
    	{
			rpt.createTest("SunBelt : Company Search","Click Refresh Button");
			rpt.Fail("Refresh Button is NOT clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
    	}
		
		click("id=poptest");
		if (findTheElement("id=headquaters").isDisplayed()) 
    	{
			click("id=domestic-site"); 
			click("id=headquaters");
			rpt.createTest("SunBelt : Company Search","Click Headquaters Only filter option");
			rpt.Pass("Headquaters Only filter option is clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
			
    	}
    	else 
    	{
			rpt.createTest("SunBelt : Company Search","Click Headquaters Only filter option");
			rpt.Fail("Headquaters Only filter option is NOT clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
    	}
		
		if (findTheElement("id=refresh").isDisplayed()) 
    	{
			click("id=refresh"); 
			rpt.createTest("SunBelt : Company Search","Click Refresh Button");
			rpt.Pass("Refresh Button is clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
			
    	}
    	else 
    	{
			rpt.createTest("SunBelt : Company Search","Click Refresh Button");
			rpt.Fail("Refresh Button is NOT clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
    	}
		
		click("id=poptest");
		click("id=headquaters");
		click("id=domestic-site"); 
		click("id=refresh");
		
		if (findTheElement("link=Microsoft Corporation").isDisplayed()) 
    	{
			click("link=Microsoft Corporation"); 
			rpt.createTest("SunBelt : Company Search","Select Company Name");
			rpt.Pass("Company Name is selected");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
			
    	}
    	else 
    	{
    		rpt.createTest("SunBelt : Company Search","Select Company Name");
			rpt.Pass("Company Name is NOT selected");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
    	}
	}
	
	public void overviewPage() throws Exception{
		
		if (findTheElement("xpath=//i[@class='fa fa-download']").isDisplayed()) 
    	{
			click("xpath=//i[@class='fa fa-download']"); 
			rpt.createTest("SunBelt : Company Search","Click Download Button in Overview Page");
			rpt.Pass("Download Button in Overview Page is clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
			
    	}
    	else 
    	{
    		rpt.createTest("SunBelt : Company Search","Click Download Button in Overview Page");
			rpt.Pass("Download Button in Overview Page is NOT clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
    	}
		
		String DUNS_NumberInOverviewPage=getText("xpath=//*[@id='overview']/div[1]/div[2]/div/div[1]");
		if (findTheElement("xpath=//*[@id='overview']/div[1]/div[1]/h1/div/ul/li[2]/a/i").isDisplayed()) 
    	{
			click("xpath=//*[@id='overview']/div[1]/div[1]/h1/div/ul/li[2]/a/i"); 
			rpt.createTest("SunBelt : Company Search","Click Print Button in Overview Page");
			rpt.Pass("Print Button in Overview Page is clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
			
    	}
    	else 
    	{
    		rpt.createTest("SunBelt : Company Search","Click Print Button in Overview Page");
			rpt.Pass("Print Button in Overview Page is NOT clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
    	}
		
		Thread.sleep(5000);
		String DUNS_NumberInPrintPage=getTitle();
		if(DUNS_NumberInOverviewPage.contains(DUNS_NumberInPrintPage))
		{
			rpt.createTest("SunBelt : Company Search","Verify DUNS Number in Company Overview page and DUNS Number in Print Screen");
			rpt.Pass("DUNS Number in Company Overview page and DUNS Number in Print Screen are equal");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
		}
		else 
    	{
    		rpt.createTest("SunBelt : Company Search","Verify DUNS Number in Company Overview page and DUNS Number in Print Screen");
			rpt.Pass("DUNS Number in Company Overview page and DUNS Number in Print Screen are NOT equal");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
    	}
		
		Thread.sleep(2000);
		browser.navigate().back();
		
		if (findTheElement("link=Financial History").isDisplayed()) 
    	{
			click("link=Financial History"); 
			rpt.createTest("SunBelt : Company Search","Click Financial History tab");
			rpt.Pass("Financial History tab is clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
			
    	}
    	else 
    	{
    		rpt.createTest("SunBelt : Company Search","Click Financial History tab");
			rpt.Pass("Financial History tab is NOT clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
    	}
		
		if (findTheElement("id=finhistory").isDisplayed()) 
    	{
			rpt.createTest("SunBelt : Company Search","Verify Financial History section");
			rpt.Pass("Financial History section is displayed");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
			
    	}
    	else 
    	{
    		rpt.createTest("SunBelt : Company Search","Verify Financial History section");
			rpt.Pass("Financial History section is NOT displayed");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
    	}
		
		if (findTheElement("link=Hierarchy").isDisplayed()) 
    	{
			click("link=Hierarchy"); 
			rpt.createTest("SunBelt : Company Search","Click Hierarchy History tab");
			rpt.Pass("Hierarchy History tab is clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
			
    	}
    	else 
    	{
    		rpt.createTest("SunBelt : Company Search","Click Hierarchy History tab");
			rpt.Pass("Hierarchy History tab is NOT clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
    	}
		
		if (findTheElement("xpath=//*[@id='collapseThree']/div/div/table/tbody/tr[1]/td[3]/span/a/i").isDisplayed()) 
    	{
			click("xpath=//*[@id='collapseThree']/div/div/table/tbody/tr[1]/td[3]/span/a/i"); 
			rpt.createTest("SunBelt : Company Search","Click Parent print Button");
			rpt.Pass("Parent print Button is clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
			
    	}
    	else 
    	{
    		rpt.createTest("SunBelt : Company Search","Click Parent print Button");
			rpt.Pass("Parent print Button is NOT clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
    	}
		
		Thread.sleep(5000);
		String parentWindow = browser.getWindowHandle();
		Set<String> handles =  browser.getWindowHandles();
		for(String windowHandle  : handles)
		{
		    if(!windowHandle.equals(parentWindow))
		   {
		    	browser.switchTo().window(windowHandle);
		     String childWindowTitle = getTitle();
		     System.out.print(childWindowTitle);
		     browser.close(); 
		     browser.switchTo().window(parentWindow); 
		     String DUNS_Number=getText("xpath=//*[@id='collapseThree']/div/div/table/tbody/tr[1]/td[2]");
		     if(DUNS_Number.contains(childWindowTitle))
				{
					 rpt.createTest("SunBelt : Company Search","Verify DUNS Number in Parent section and DUNS Number in Print Screen");
						rpt.Pass("DUNS Number in Parent section and DUNS Number in Print Screen are equal - DUNS_Number : "+childWindowTitle+" ");
						rpt.Category("SunBelt : Company Search");
						String path = rpt.CaptureScreen(browser, "ValidMessage");
						rpt.imgPathPass(path);
						rpt.chkBugs(CommonUtils.getUserName());
				 }
				 else
				 {
					 rpt.createTest("SunBelt : Company Search","Verify DUNS Number in Parent section and DUNS Number in Print Screen");
						rpt.Pass("DUNS Number in Parent section and DUNS Number in Print Screen are NOT equal- DUNS_Number : "+childWindowTitle+"");
						rpt.Category("SunBelt : Company Search");
						String path = rpt.CaptureScreen(browser, "InvalidMessage");
						rpt.imgPathFail(path);
						rpt.chkBugs(CommonUtils.getUserName());
				 }
		    }
		}
		
		
		if (findTheElement("xpath=//*[@id='collapseThree']/div/div/table/tbody/tr[2]/td[3]/span/a/i").isDisplayed()) 
    	{
			click("xpath=//*[@id='collapseThree']/div/div/table/tbody/tr[2]/td[3]/span/a/i"); 
			rpt.createTest("SunBelt : Company Search","Click Domestic Parent print Button");
			rpt.Pass("Domestic Parent print Button is clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
			
    	}
    	else 
    	{
    		rpt.createTest("SunBelt : Company Search","Click Domestic Parent print Button");
			rpt.Pass("Domestic Parent print Button is NOT clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
    	}
		
		Thread.sleep(5000);
		String parentWindow1 = browser.getWindowHandle();
		Set<String> handles1 =  browser.getWindowHandles();
		for(String windowHandle  : handles1)
		{
		    if(!windowHandle.equals(parentWindow1))
		   {
		    	browser.switchTo().window(windowHandle);
		     String childWindowTitle = getTitle();
		     System.out.print(childWindowTitle);
		     browser.close(); 
		     browser.switchTo().window(parentWindow1); 
		     String DUNS_Number=getText("xpath=//*[@id='collapseThree']/div/div/table/tbody/tr[2]/td[2]");
		     if(DUNS_Number.contains(childWindowTitle))
				{
					 rpt.createTest("SunBelt : Company Search","Verify DUNS Number in Domestic Parent section and DUNS Number in Print Screen");
						rpt.Pass("DUNS Number in Domestic Parent section and DUNS Number in Print Screen are equal - DUNS_Number : "+childWindowTitle+" ");
						rpt.Category("SunBelt : Company Search");
						String path = rpt.CaptureScreen(browser, "ValidMessage");
						rpt.imgPathPass(path);
						rpt.chkBugs(CommonUtils.getUserName());
				 }
				 else
				 {
					 rpt.createTest("SunBelt : Company Search","Verify DUNS Number in Domestic Parent section and DUNS Number in Print Screen");
						rpt.Pass("DUNS Number in Domestic Parent section and DUNS Number in Print Screen are NOT equal- DUNS_Number : "+childWindowTitle+"");
						rpt.Category("SunBelt : Company Search");
						String path = rpt.CaptureScreen(browser, "InvalidMessage");
						rpt.imgPathFail(path);
						rpt.chkBugs(CommonUtils.getUserName());
				 }
		    }
		}
		
		if (findTheElement("xpath=//*[@id='collapseThree']/div/div/table/tbody/tr[3]/td[3]/span/a/i").isDisplayed()) 
    	{
			click("xpath=//*[@id='collapseThree']/div/div/table/tbody/tr[3]/td[3]/span/a/i"); 
			rpt.createTest("SunBelt : Company Search","Click Ultimate Parent print Button");
			rpt.Pass("Ultimate Parent print Button is clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
			
    	}
    	else 
    	{
    		rpt.createTest("SunBelt : Company Search","Click Ultimate Parent print Button");
			rpt.Pass("Ultimate Parent print Button is NOT clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
    	}
		
		Thread.sleep(5000);
		String parentWindow2 = browser.getWindowHandle();
		Set<String> handles2 =  browser.getWindowHandles();
		for(String windowHandle  : handles2)
		{
		    if(!windowHandle.equals(parentWindow2))
		   {
		    	browser.switchTo().window(windowHandle);
		     String childWindowTitle = getTitle();
		     System.out.print(childWindowTitle);
		     browser.close(); 
		     browser.switchTo().window(parentWindow2); 
		     String DUNS_Number=getText("xpath=//*[@id='collapseThree']/div/div/table/tbody/tr[3]/td[2]");
		     if(DUNS_Number.contains(childWindowTitle))
				{
					 rpt.createTest("SunBelt : Company Search","Verify DUNS Number in Ultimate Parent section and DUNS Number in Print Screen");
						rpt.Pass("DUNS Number in Ultimate Parent section and DUNS Number in Print Screen are equal - DUNS_Number : "+childWindowTitle+" ");
						rpt.Category("SunBelt : Company Search");
						String path = rpt.CaptureScreen(browser, "ValidMessage");
						rpt.imgPathPass(path);
						rpt.chkBugs(CommonUtils.getUserName());
				 }
				 else
				 {
					 rpt.createTest("SunBelt : Company Search","Verify DUNS Number in Ultimate Parent section and DUNS Number in Print Screen");
						rpt.Pass("DUNS Number in Ultimate Parent section and DUNS Number in Print Screen are NOT equal- DUNS_Number : "+childWindowTitle+"");
						rpt.Category("SunBelt : Company Search");
						String path = rpt.CaptureScreen(browser, "InvalidMessage");
						rpt.imgPathFail(path);
						rpt.chkBugs(CommonUtils.getUserName());
				 }
		    }
		
		}

	}
	
	public void contactsPage() throws Exception{
		if (findTheElement("id=tab_button_contact").isDisplayed()) 
		{
			click("id=tab_button_contact"); 
			rpt.createTest("SunBelt : Company Search","Click Contacts Tab");
			rpt.Pass("Contacts Tab is clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
	
		}
		else 
		{
			rpt.createTest("SunBelt : Company Search","Click Contacts Tab");
			rpt.Fail("Contacts Tab is NOT clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
		}

		if (findTheElement("xpath=//*[@id='accordion']/div[1]/div/div/ul/li/a/i").isDisplayed()) 
		{
			click("xpath=//*[@id='accordion']/div[1]/div/div/ul/li/a/i"); 
			rpt.createTest("SunBelt : Company Search","Click Print Button in Contacts Page");
			rpt.Pass("Print Button in Contacts Page is clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
		}
		else 
		{
			rpt.createTest("SunBelt : Company Search","Click Print Button in Contacts Page");
			rpt.Fail("Print Button in Contacts Page is NOT clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
		}
	browser.navigate().back();
}
	
	public void familyTreePage() throws Exception{
		
		if (findTheElement("id=tab_button_familytree").isDisplayed()) 
		{
			click("id=tab_button_familytree"); 
			rpt.createTest("SunBelt : Company Search","Click Family Tree Tab");
			rpt.Pass("Family Tree Tab is clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
	
		}
		else 
		{
			rpt.createTest("SunBelt : Company Search","Click Family Tree Tab");
			rpt.Fail("Family Tree Tab is NOT clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
		}
		
		if (findTheElement("xpath=//*[@id='tab_familytree']/div/div[1]/button[1]").isDisplayed()) 
		{
			click("xpath=//*[@id='tab_familytree']/div/div[1]/button[1]"); 
			rpt.createTest("SunBelt : Company Search","Click Collapse All Button");
			rpt.Pass("Collapse All Button is clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
	
		}
		else 
		{
			rpt.createTest("SunBelt : Company Search","Click Collapse All Button");
			rpt.Fail("Collapse All Button is NOT clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
		}
		
		if (findTheElement("xpath=//*[@id='tab_familytree']/div/div[1]/button[2]").isDisplayed()) 
		{
			click("xpath=//*[@id='tab_familytree']/div/div[1]/button[2]"); 
			rpt.createTest("SunBelt : Company Search","Click Expand All Button");
			rpt.Pass("Expand All Button is clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
	
		}
		else 
		{
			rpt.createTest("SunBelt : Company Search","Click Expand All Button");
			rpt.Fail("Expand All Button is NOT clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
		}
		
		if (findTheElement("xpath=//*[@id='tab_familytree']/div/div[1]/button[5]").isDisplayed()) 
		{
			click("xpath=//*[@id='tab_familytree']/div/div[1]/button[5]"); 
			rpt.createTest("SunBelt : Company Search","Click Alternative Button");
			rpt.Pass("Alternative Button is clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
	
		}
		else 
		{
			rpt.createTest("SunBelt : Company Search","Click Alternative Button");
			rpt.Fail("Alternative Button is NOT clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
		}
		
		if (findTheElement("xpath=//*[@id='tab_familytree']/div/div[1]/button[6]").isDisplayed()) 
		{
			click("xpath=//*[@id='tab_familytree']/div/div[1]/button[6]"); 
			rpt.createTest("SunBelt : Company Search","Click Minority Button");
			rpt.Pass("Minority Button is clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
	
		}
		else 
		{
			rpt.createTest("SunBelt : Company Search","Click Minority Button");
			rpt.Fail("Minority Button is NOT clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
		}
		
		if (findTheElement("xpath=//*[@id='tab_familytree']/div/div[1]/button[8]").isDisplayed()) 
		{
			click("xpath=//*[@id='tab_familytree']/div/div[1]/button[8]"); 
			rpt.createTest("SunBelt : Company Search","Click Download Button in Family Tree Page");
			rpt.Pass("Download Button in Family Tree Page is clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
	
		}
		else 
		{
			rpt.createTest("SunBelt : Company Search","Click Download Button in Family Tree Page");
			rpt.Fail("Download Button in Family Tree Page is NOT clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
		}
		
		if (findTheElement("xpath=//*[@id='tab_familytree']/div/div[1]/button[7]").isDisplayed()) 
		{
			click("xpath=//*[@id='tab_familytree']/div/div[1]/button[7]"); 
			rpt.createTest("SunBelt : Company Search","Click Print Button in Family Tree Page");
			rpt.Pass("Print Button in Family Tree Page is clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
	
		}
		else 
		{
			rpt.createTest("SunBelt : Company Search","Click Print Button in Family Tree Page");
			rpt.Fail("Print Button in Family Tree Page is NOT clicked");
			rpt.Category("SunBelt : Company Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
		}
		
		Thread.sleep(5000);
		String parentWindow = browser.getWindowHandle();
		Set<String> handles =  browser.getWindowHandles();
		for(String windowHandle  : handles)
		{
		    if(!windowHandle.equals(parentWindow))
		   {
		    	browser.switchTo().window(windowHandle);
		     String childWindowTitle = getTitle();
		     System.out.print(childWindowTitle);
		     browser.close(); 
		     browser.switchTo().window(parentWindow); 
		     String DUNS_Number=getText("xpath=//*[@id='familytree']/div/div[1]/div");
		     if(DUNS_Number.contains(childWindowTitle))
				{
					 rpt.createTest("SunBelt : Company Search","Verify DUNS Number in Family Tree Page and DUNS Number in Print Screen");
						rpt.Pass("DUNS Number in Family Tree Page and DUNS Number in Print Screen are equal - DUNS_Number : "+childWindowTitle+" ");
						rpt.Category("SunBelt : Company Search");
						String path = rpt.CaptureScreen(browser, "ValidMessage");
						rpt.imgPathPass(path);
						rpt.chkBugs(CommonUtils.getUserName());
				 }
				 else
				 {
					 rpt.createTest("SunBelt : Company Search","Verify DUNS Number in Family Tree Page and DUNS Number in Print Screen");
						rpt.Pass("DUNS Number in Family Tree Page and DUNS Number in Print Screen are NOT equal- DUNS_Number : "+childWindowTitle+"");
						rpt.Category("SunBelt : Company Search");
						String path = rpt.CaptureScreen(browser, "InvalidMessage");
						rpt.imgPathFail(path);
						rpt.chkBugs(CommonUtils.getUserName());
				 }
		    }
		}	
	}
	
	
}
	


