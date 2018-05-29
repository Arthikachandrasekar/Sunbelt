package Test;

import java.util.Set;



public class IndustrySearch extends Browser{
	
	Report rpt = new Report();
	
	public void executeAll() throws Exception
	{
		industrySearch();
		resultPage();
		overviewPage();
		contactsPage();
		familyTreePage();
	}
		
		public void industrySearch() throws Exception{
			
			Thread.sleep(6000);
			if (findTheElement("xpath=//a[contains(text(),'WHOLESALE TRADE')]").isDisplayed()) 
	    	{
				click("xpath=//a[contains(text(),'WHOLESALE TRADE')]"); 
				rpt.createTest("SunBelt : Industry Search","Select Industry");
				rpt.Pass("Industry is selected");
				rpt.Category("SunBelt : Industry Search");
				String path = rpt.CaptureScreen(browser, "ValidMessage");
				rpt.imgPathPass(path);
				rpt.chkBugs(CommonUtils.getUserName());
				
	    	}
	    	else 
	    	{
				rpt.createTest("SunBelt : Industry Search","Select Industry");
				rpt.Fail("Industry is NOT selected");
				rpt.Category("SunBelt : Industry Search");
				String path = rpt.CaptureScreen(browser, "InvalidMessage");
				rpt.imgPathFail(path);
				rpt.chkBugs(CommonUtils.getUserName());
	    	}
			
			if (findTheElement("id=btn_submit").isDisplayed()) 
	    	{
				click("id=btn_submit"); 
				rpt.createTest("SunBelt : Industry Search","Click Preview Button");
				rpt.Pass("Preview Button is clicked");
				rpt.Category("SunBelt : Industry Search");
				String path = rpt.CaptureScreen(browser, "ValidMessage");
				rpt.imgPathPass(path);
				rpt.chkBugs(CommonUtils.getUserName());
				
	    	}
	    	else 
	    	{
	    		rpt.createTest("SunBelt : Industry Search","Click Preview Button");
				rpt.Pass("Preview Button is NOT clicked");
				rpt.Category("SunBelt : Industry Search");
				String path = rpt.CaptureScreen(browser, "InvalidMessage");
				rpt.imgPathFail(path);
				rpt.chkBugs(CommonUtils.getUserName());
	    	}
			
		}
		
		public void resultPage() throws Exception{
			
			if (findTheElement("xpath=(//a[contains(@href, '#')])[3]").isDisplayed()) 
	    	{
				click("xpath=(//a[contains(@href, '#')])[3]"); 
				rpt.createTest("SunBelt : Industry Search","Click Download Button");
				rpt.Pass("Download Button is clicked");
				rpt.Category("SunBelt : Industry Search");
				String path = rpt.CaptureScreen(browser, "ValidMessage");
				rpt.imgPathPass(path);
				rpt.chkBugs(CommonUtils.getUserName());
				
	    	}
	    	else 
	    	{
	    		rpt.createTest("SunBelt : Industry Search","Click Download Button");
				rpt.Pass("Download Button is NOT clicked");
				rpt.Category("SunBelt : Industry Search");
				String path = rpt.CaptureScreen(browser, "InvalidMessage");
				rpt.imgPathFail(path);
				rpt.chkBugs(CommonUtils.getUserName());
	    	}
			
			if (findTheElement("id=selectedexport").isDisplayed()) 
	    	{
				click("xpath=(//input[@type='checkbox'])[3]");
				click("id=selectedexport"); 
				rpt.createTest("SunBelt : Industry Search","Click Download Selected Button");
				rpt.Pass("Download Selected Button is clicked");
				rpt.Category("SunBelt : Industry Search");
				String path = rpt.CaptureScreen(browser, "ValidMessage");
				rpt.imgPathPass(path);
				rpt.chkBugs(CommonUtils.getUserName());
				
	    	}
	    	else 
	    	{
	    		rpt.createTest("SunBelt : Industry Search","Click Download Selected Button");
				rpt.Pass("Download Selected Button is NOT clicked");
				rpt.Category("SunBelt : Industry Search");
				String path = rpt.CaptureScreen(browser, "InvalidMessage");
				rpt.imgPathFail(path);
				rpt.chkBugs(CommonUtils.getUserName());
	    	}
	    			
	    			if (findTheElement("id=fullexport").isDisplayed()) 
	    	    	{
	    				click("id=fullexport"); 
	    				rpt.createTest("SunBelt : Industry Search","Click Download ALL Button");
	    				rpt.Pass("Download ALL Button is clicked");
	    				rpt.Category("SunBelt : Industry Search");
	    				String path = rpt.CaptureScreen(browser, "ValidMessage");
	    				rpt.imgPathPass(path);
	    				rpt.chkBugs(CommonUtils.getUserName());
	    				
	    	    	}
	    	    	else 
	    	    	{
	    	    		rpt.createTest("SunBelt : Industry Search","Click Download ALL Button");
	    				rpt.Pass("Download ALL Button is NOT clicked");
	    				rpt.Category("SunBelt : Industry Search");
	    				String path = rpt.CaptureScreen(browser, "InvalidMessage");
	    				rpt.imgPathFail(path);
	    				rpt.chkBugs(CommonUtils.getUserName());
	    	    	}
	    			
//	    			if (findTheElement("id=back").isDisplayed()) 
//	    	    	{
//	    				click("id=back"); 
//	    				rpt.createTest("SunBelt : Industry Search","Click Back Button");
//	    				rpt.Pass("Back Button is clicked");
//	    				rpt.Category("SunBelt : Industry Search");
//	    				String path = rpt.CaptureScreen(browser, "ValidMessage");
//	    				rpt.imgPathPass(path);
//	    				rpt.chkBugs(CommonUtils.getUserName());
//	    				
//	    	    	}
//	    	    	else 
//	    	    	{
//	    	    		rpt.createTest("SunBelt : Industry Search","Click Back Button");
//	    				rpt.Pass("Back Button is NOT clicked");
//	    				rpt.Category("SunBelt : Industry Search");
//	    				String path = rpt.CaptureScreen(browser, "InvalidMessage");
//	    				rpt.imgPathFail(path);
//	    				rpt.chkBugs(CommonUtils.getUserName());
//	    	    	}
//
//	    			industrySearch();

			
			if (findTheElement("link=Cape Cod Staging & Equipment Corp").isDisplayed()) 
	    	{
				click("link=Cape Cod Staging & Equipment Corp"); 
				rpt.createTest("SunBelt : Industry Search","Click Company Name");
				rpt.Pass("Company Name is selected");
				rpt.Category("SunBelt : Industry Search");
				String path = rpt.CaptureScreen(browser, "ValidMessage");
				rpt.imgPathPass(path);
				rpt.chkBugs(CommonUtils.getUserName());
				
	    	}
	    	else 
	    	{
	    		rpt.createTest("SunBelt : Industry Search","Click Company Name");
				rpt.Pass("Company Name is NOT selected");
				rpt.Category("SunBelt : Industry Search");
				String path = rpt.CaptureScreen(browser, "InvalidMessage");
				rpt.imgPathFail(path);
				rpt.chkBugs(CommonUtils.getUserName());
	    	}
		
		}
		
		public void overviewPage() throws Exception{
			
			if (findTheElement("xpath=//i[@class='fa fa-download']").isDisplayed()) 
	    	{
				click("xpath=//i[@class='fa fa-download']"); 
				rpt.createTest("SunBelt : Industry Search","Click Download Button in Overview Page");
				rpt.Pass("Download Button in Overview Page is clicked");
				rpt.Category("SunBelt : Industry Search");
				String path = rpt.CaptureScreen(browser, "ValidMessage");
				rpt.imgPathPass(path);
				rpt.chkBugs(CommonUtils.getUserName());
				
	    	}
	    	else 
	    	{
	    		rpt.createTest("SunBelt : Industry Search","Click Download Button in Overview Page");
				rpt.Pass("Download Button in Overview Page is NOT clicked");
				rpt.Category("SunBelt : Industry Search");
				String path = rpt.CaptureScreen(browser, "InvalidMessage");
				rpt.imgPathFail(path);
				rpt.chkBugs(CommonUtils.getUserName());
	    	}
			
			String DUNS_NumberInOverviewPage=getText("xpath=//*[@id='overview']/div[1]/div[2]/div/div[1]");
			if (findTheElement("xpath=//div[@id='overview']/div/div/h1/div/ul/li[2]/a/i").isDisplayed()) 
	    	{
				click("xpath=//div[@id='overview']/div/div/h1/div/ul/li[2]/a/i"); 
				rpt.createTest("SunBelt : Industry Search","Click Print Button in Overview Page");
				rpt.Pass("Print Button in Overview Page is clicked");
				rpt.Category("SunBelt : Industry Search");
				String path = rpt.CaptureScreen(browser, "ValidMessage");
				rpt.imgPathPass(path);
				rpt.chkBugs(CommonUtils.getUserName());
				
	    	}
	    	else 
	    	{
	    		rpt.createTest("SunBelt : Industry Search","Click Print Button in Overview Page");
				rpt.Pass("Print Button in Overview Page is NOT clicked");
				rpt.Category("SunBelt : Industry Search");
				String path = rpt.CaptureScreen(browser, "InvalidMessage");
				rpt.imgPathFail(path);
				rpt.chkBugs(CommonUtils.getUserName());
	    	}

			Thread.sleep(5000);
			String DUNS_NumberInPrintPage=getTitle();
			if(DUNS_NumberInOverviewPage.contains(DUNS_NumberInPrintPage))
			{
				rpt.createTest("SunBelt : Industry Search","Verify DUNS Number in Company Overview page and DUNS Number in Print Screen");
				rpt.Pass("DUNS Number in Company Overview page and DUNS Number in Print Screen are equal");
				rpt.Category("SunBelt : Industry Search");
				String path = rpt.CaptureScreen(browser, "ValidMessage");
				rpt.imgPathPass(path);
				rpt.chkBugs(CommonUtils.getUserName());
			}
			else 
	    	{
	    		rpt.createTest("SunBelt : Industry Search","Verify DUNS Number in Company Overview page and DUNS Number in Print Screen");
				rpt.Pass("DUNS Number in Company Overview page and DUNS Number in Print Screen are NOT equal");
				rpt.Category("SunBelt : Industry Search");
				String path = rpt.CaptureScreen(browser, "InvalidMessage");
				rpt.imgPathFail(path);
				rpt.chkBugs(CommonUtils.getUserName());
	    	}
			
			Thread.sleep(2000);
			browser.navigate().back();
		
		
		if (findTheElement("link=Financial History").isDisplayed()) 
    	{
			click("link=Financial History"); 
			rpt.createTest("SunBelt : Industry Search","Click Financial History tab");
			rpt.Pass("Financial History tab is clicked");
			rpt.Category("SunBelt : Industry Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
			
    	}
    	else 
    	{
    		rpt.createTest("SunBelt : Industry Search","Click Financial History tab");
			rpt.Pass("Financial History tab is NOT clicked");
			rpt.Category("SunBelt : Industry Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
    	}
		
		if (findTheElement("id=collapseTwo").isDisplayed()) 
    	{
			rpt.createTest("SunBelt : Industry Search","Verify Financial History section");
			rpt.Pass("Financial History section is displayed");
			rpt.Category("SunBelt : Industry Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
			
    	}
    	else 
    	{
    		rpt.createTest("SunBelt : Industry Search","Verify Financial History section");
			rpt.Pass("Financial History section is NOT displayed");
			rpt.Category("SunBelt : Industry Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
    	}
		
		if (findTheElement("link=Hierarchy").isDisplayed()) 
    	{
			click("link=Hierarchy"); 
			rpt.createTest("SunBelt : Industry Search","Click Hierarchy History tab");
			rpt.Pass("Hierarchy History tab is clicked");
			rpt.Category("SunBelt : Industry Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
			
    	}
    	else 
    	{
    		rpt.createTest("SunBelt : Industry Search","Click Hierarchy History tab");
			rpt.Pass("Hierarchy History tab is NOT clicked");
			rpt.Category("SunBelt : Industry Search");
			String path = rpt.CaptureScreen(browser, "InvalidMessage");
			rpt.imgPathFail(path);
			rpt.chkBugs(CommonUtils.getUserName());
    	}
		
		
		if (findTheElement("xpath=//*[@id='collapseThree']/div/div/table/tbody/tr[1]/td[3]/span/a/i").isDisplayed()) 
    	{
			click("xpath=//*[@id='collapseThree']/div/div/table/tbody/tr[1]/td[3]/span/a/i"); 
			rpt.createTest("SunBelt : Industry Search","Click Parent print Button");
			rpt.Pass("Parent print Button is clicked");
			rpt.Category("SunBelt : Industry Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
			
    	}
    	else 
    	{
    		rpt.createTest("SunBelt : Industry Search","Click Parent print Button");
			rpt.Pass("Parent print Button is NOT clicked");
			rpt.Category("SunBelt : Industry Search");
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
					 rpt.createTest("SunBelt : Industry Search","Verify DUNS Number in Parent section and DUNS Number in Print Screen");
						rpt.Pass("DUNS Number in Parent section and DUNS Number in Print Screen are equal - DUNS_Number : "+childWindowTitle+" ");
						rpt.Category("SunBelt : Industry Search");
						String path = rpt.CaptureScreen(browser, "ValidMessage");
						rpt.imgPathPass(path);
						rpt.chkBugs(CommonUtils.getUserName());
				 }
				 else
				 {
					 rpt.createTest("SunBelt : Industry Search","Verify DUNS Number in Parent section and DUNS Number in Print Screen");
						rpt.Pass("DUNS Number in Parent section and DUNS Number in Print Screen are NOT equal- DUNS_Number : "+childWindowTitle+"");
						rpt.Category("SunBelt : Industry Search");
						String path = rpt.CaptureScreen(browser, "InvalidMessage");
						rpt.imgPathFail(path);
						rpt.chkBugs(CommonUtils.getUserName());
				 }
		    }
		}
		    
		
		if (findTheElement("xpath=//*[@id='collapseThree']/div/div/table/tbody/tr[2]/td[3]/span/a/i").isDisplayed()) 
    	{
			click("xpath=//*[@id='collapseThree']/div/div/table/tbody/tr[2]/td[3]/span/a/i"); 
			rpt.createTest("SunBelt : Industry Search","Click Domestic Parent print Button");
			rpt.Pass("Domestic Parent print Button is clicked");
			rpt.Category("SunBelt : Industry Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
			
    	}
    	else 
    	{
    		rpt.createTest("SunBelt : Industry Search","Click Domestic Parent print Button");
			rpt.Pass("Domestic Parent print Button is NOT clicked");
			rpt.Category("SunBelt : Industry Search");
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
					 rpt.createTest("SunBelt : Industry Search","Verify DUNS Number in Domestic Parent section and DUNS Number in Print Screen");
						rpt.Pass("DUNS Number in Domestic Parent section and DUNS Number in Print Screen are equal - DUNS_Number : "+childWindowTitle+" ");
						rpt.Category("SunBelt : Industry Search");
						String path = rpt.CaptureScreen(browser, "ValidMessage");
						rpt.imgPathPass(path);
						rpt.chkBugs(CommonUtils.getUserName());
				 }
				 else
				 {
					 rpt.createTest("SunBelt : Industry Search","Verify DUNS Number in Domestic Parent section and DUNS Number in Print Screen");
						rpt.Pass("DUNS Number in Domestic Parent section and DUNS Number in Print Screen are NOT equal- DUNS_Number : "+childWindowTitle+"");
						rpt.Category("SunBelt : Industry Search");
						String path = rpt.CaptureScreen(browser, "InvalidMessage");
						rpt.imgPathFail(path);
						rpt.chkBugs(CommonUtils.getUserName());
				 }
		    }
		}
		    
		    
		if (findTheElement("xpath=//*[@id='collapseThree']/div/div/table/tbody/tr[3]/td[3]/span/a/i").isDisplayed()) 
    	{
			click("xpath=//*[@id='collapseThree']/div/div/table/tbody/tr[3]/td[3]/span/a/i"); 
			rpt.createTest("SunBelt : Industry Search","Click Ultimate Parent print Button");
			rpt.Pass("Ultimate Parent print Button is clicked");
			rpt.Category("SunBelt : Industry Search");
			String path = rpt.CaptureScreen(browser, "ValidMessage");
			rpt.imgPathPass(path);
			rpt.chkBugs(CommonUtils.getUserName());
			
    	}
    	else 
    	{
    		rpt.createTest("SunBelt : Industry Search","Click Ultimate Parent print Button");
			rpt.Pass("Ultimate Parent print Button is NOT clicked");
			rpt.Category("SunBelt : Industry Search");
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
					 rpt.createTest("SunBelt : Industry Search","Verify DUNS Number in Ultimate Parent section and DUNS Number in Print Screen");
						rpt.Pass("DUNS Number in Ultimate Parent section and DUNS Number in Print Screen are equal - DUNS_Number : "+childWindowTitle+" ");
						rpt.Category("SunBelt : Industry Search");
						String path = rpt.CaptureScreen(browser, "ValidMessage");
						rpt.imgPathPass(path);
						rpt.chkBugs(CommonUtils.getUserName());
				 }
				 else
				 {
					 rpt.createTest("SunBelt : Industry Search","Verify DUNS Number in Ultimate Parent section and DUNS Number in Print Screen");
						rpt.Pass("DUNS Number in Ultimate Parent section and DUNS Number in Print Screen are NOT equal- DUNS_Number : "+childWindowTitle+"");
						rpt.Category("SunBelt : Industry Search");
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
				rpt.createTest("SunBelt : Industry Search","Click Contacts Tab");
				rpt.Pass("Contacts Tab is clicked");
				rpt.Category("SunBelt : Industry Search");
				String path = rpt.CaptureScreen(browser, "ValidMessage");
				rpt.imgPathPass(path);
				rpt.chkBugs(CommonUtils.getUserName());
		
			}
			else 
			{
				rpt.createTest("SunBelt : Industry Search","Click Contacts Tab");
				rpt.Fail("Contacts Tab is NOT clicked");
				rpt.Category("SunBelt : Industry Search");
				String path = rpt.CaptureScreen(browser, "InvalidMessage");
				rpt.imgPathFail(path);
				rpt.chkBugs(CommonUtils.getUserName());
			}
	
			if (findTheElement("xpath=//div[@id='accordion']/div/div/div/ul/li/a/i").isDisplayed()) 
			{
				click("xpath=//div[@id='accordion']/div/div/div/ul/li/a/i"); 
				rpt.createTest("SunBelt : Industry Search","Click Print Button in Contacts Page");
				rpt.Pass("Print Button in Contacts Page is clicked");
				rpt.Category("SunBelt : Industry Search");
				String path = rpt.CaptureScreen(browser, "ValidMessage");
				rpt.imgPathPass(path);
				rpt.chkBugs(CommonUtils.getUserName());
		
			}
			else 
			{
				rpt.createTest("SunBelt : Industry Search","Click Print Button in Contacts Page");
				rpt.Fail("Print Button in Contacts Page is NOT clicked");
				rpt.Category("SunBelt : Industry Search");
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
				rpt.createTest("SunBelt : Industry Search","Click Family Tree Tab");
				rpt.Pass("Family Tree Tab is clicked");
				rpt.Category("SunBelt : Industry Search");
				String path = rpt.CaptureScreen(browser, "ValidMessage");
				rpt.imgPathPass(path);
				rpt.chkBugs(CommonUtils.getUserName());
		
			}
			else 
			{
				rpt.createTest("SunBelt : Industry Search","Click Family Tree Tab");
				rpt.Fail("Family Tree Tab is NOT clicked");
				rpt.Category("SunBelt : Industry Search");
				String path = rpt.CaptureScreen(browser, "InvalidMessage");
				rpt.imgPathFail(path);
				rpt.chkBugs(CommonUtils.getUserName());
			}
			
			if (findTheElement("xpath=//div[@id='tab_familytree']/div/div/button").isDisplayed()) 
			{
				click("xpath=//div[@id='tab_familytree']/div/div/button"); 
				rpt.createTest("SunBelt : Industry Search","Click Collapse All Button");
				rpt.Pass("Collapse All Button is clicked");
				rpt.Category("SunBelt : Industry Search");
				String path = rpt.CaptureScreen(browser, "ValidMessage");
				rpt.imgPathPass(path);
				rpt.chkBugs(CommonUtils.getUserName());
		
			}
			else 
			{
				rpt.createTest("SunBelt : Industry Search","Click Collapse All Button");
				rpt.Fail("Collapse All Button is NOT clicked");
				rpt.Category("SunBelt : Industry Search");
				String path = rpt.CaptureScreen(browser, "InvalidMessage");
				rpt.imgPathFail(path);
				rpt.chkBugs(CommonUtils.getUserName());
			}
			
			if (findTheElement("xpath=//div[@id='tab_familytree']/div/div/button[2]").isDisplayed()) 
			{
				click("xpath=//div[@id='tab_familytree']/div/div/button[2]"); 
				rpt.createTest("SunBelt : Industry Search","Click Expand All Button");
				rpt.Pass("Expand All Button is clicked");
				rpt.Category("SunBelt : Industry Search");
				String path = rpt.CaptureScreen(browser, "ValidMessage");
				rpt.imgPathPass(path);
				rpt.chkBugs(CommonUtils.getUserName());
		
			}
			else 
			{
				rpt.createTest("SunBelt : Industry Search","Click Expand All Button");
				rpt.Fail("Expand All Button is NOT clicked");
				rpt.Category("SunBelt : Industry Search");
				String path = rpt.CaptureScreen(browser, "InvalidMessage");
				rpt.imgPathFail(path);
				rpt.chkBugs(CommonUtils.getUserName());
			}
			
			if (findTheElement("xpath=//*[@id='tab_familytree']/div/div[1]/button[5]").isDisplayed()) 
			{
				click("xpath=//*[@id='tab_familytree']/div/div[1]/button[5]"); 
				rpt.createTest("SunBelt : Industry Search","Click Alternative Button");
				rpt.Pass("Alternative Button is clicked");
				rpt.Category("SunBelt : Industry Search");
				String path = rpt.CaptureScreen(browser, "ValidMessage");
				rpt.imgPathPass(path);
				rpt.chkBugs(CommonUtils.getUserName());
		
			}
			else 
			{
				rpt.createTest("SunBelt : Industry Search","Click Alternative Button");
				rpt.Fail("Alternative Button is NOT clicked");
				rpt.Category("SunBelt : Industry Search");
				String path = rpt.CaptureScreen(browser, "InvalidMessage");
				rpt.imgPathFail(path);
				rpt.chkBugs(CommonUtils.getUserName());
			}
			
			if (findTheElement("xpath=//*[@id='tab_familytree']/div/div[1]/button[6]").isDisplayed()) 
			{
				click("xpath=//*[@id='tab_familytree']/div/div[1]/button[6]"); 
				rpt.createTest("SunBelt : Industry Search","Click Minority Button");
				rpt.Pass("Minority Button is clicked");
				rpt.Category("SunBelt : Industry Search");
				String path = rpt.CaptureScreen(browser, "ValidMessage");
				rpt.imgPathPass(path);
				rpt.chkBugs(CommonUtils.getUserName());
		
			}
			else 
			{
				rpt.createTest("SunBelt : Industry Search","Click Minority Button");
				rpt.Fail("Minority Button is NOT clicked");
				rpt.Category("SunBelt : Industry Search");
				String path = rpt.CaptureScreen(browser, "InvalidMessage");
				rpt.imgPathFail(path);
				rpt.chkBugs(CommonUtils.getUserName());
			}
			
			if (findTheElement("xpath=//*[@id='tab_familytree']/div/div[1]/button[8]").isDisplayed()) 
			{
				click("xpath=//*[@id='tab_familytree']/div/div[1]/button[8]"); 
				rpt.createTest("SunBelt : Industry Search","Click Download Button in Family Tree Page");
				rpt.Pass("Download Button in Family Tree Page is clicked");
				rpt.Category("SunBelt : Industry Search");
				String path = rpt.CaptureScreen(browser, "ValidMessage");
				rpt.imgPathPass(path);
				rpt.chkBugs(CommonUtils.getUserName());
		
			}
			else 
			{
				rpt.createTest("SunBelt : Industry Search","Click Download Button in Family Tree Page");
				rpt.Fail("Download Button in Family Tree Page is NOT clicked");
				rpt.Category("SunBelt : Industry Search");
				String path = rpt.CaptureScreen(browser, "InvalidMessage");
				rpt.imgPathFail(path);
				rpt.chkBugs(CommonUtils.getUserName());
			}
			
			if (findTheElement("xpath=//*[@id='tab_familytree']/div/div[1]/button[7]").isDisplayed()) 
			{
				click("xpath=//*[@id='tab_familytree']/div/div[1]/button[7]"); 
				rpt.createTest("SunBelt : Industry Search","Click Print Button in Family Tree Page");
				rpt.Pass("Print Button in Family Tree Page is clicked");
				rpt.Category("SunBelt : Industry Search");
				String path = rpt.CaptureScreen(browser, "ValidMessage");
				rpt.imgPathPass(path);
				rpt.chkBugs(CommonUtils.getUserName());
		
			}
			else 
			{
				rpt.createTest("SunBelt : Industry Search","Click Print Button in Family Tree Page");
				rpt.Fail("Print Button in Family Tree Page is NOT clicked");
				rpt.Category("SunBelt : Industry Search");
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
						 rpt.createTest("SunBelt : Industry Search","Verify DUNS Number in Family Tree Page and DUNS Number in Print Screen");
							rpt.Pass("DUNS Number in Family Tree Page and DUNS Number in Print Screen are equal - DUNS_Number : "+childWindowTitle+" ");
							rpt.Category("SunBelt : Industry Search");
							String path = rpt.CaptureScreen(browser, "ValidMessage");
							rpt.imgPathPass(path);
							rpt.chkBugs(CommonUtils.getUserName());
					 }
					 else
					 {
						 rpt.createTest("SunBelt : Industry Search","Verify DUNS Number in Family Tree Page and DUNS Number in Print Screen");
							rpt.Pass("DUNS Number in Family Tree Page and DUNS Number in Print Screen are NOT equal- DUNS_Number : "+childWindowTitle+"");
							rpt.Category("SunBelt : Industry Search");
							String path = rpt.CaptureScreen(browser, "InvalidMessage");
							rpt.imgPathFail(path);
							rpt.chkBugs(CommonUtils.getUserName());
					 }
			    }
			}	
}
}
