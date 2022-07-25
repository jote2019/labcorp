package com.lapCorpTaskTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import cucumber.api.java.en.*;



@Test
public class stepDefinition  extends baseClass{
	
	
	@Given("user launches {url} website")
	 public  void user_openApp1(String url)  {
		driver.get(url);
	} 
     
	@When("user click on careers link")
	 public  void user_clicksOnCareerLink( )  {
	WebElement career=	driver.findElement(By.xpath("//div[@id='login-container']//a[@class='no-ext ext']"));
		career.click();
		
	} 

	@And("user search for {str0}")
	 public  void user_openApp(String str0)  {
		WebElement searchArea=	driver.findElement(By.xpath("//div[@class='au-target input-group dropdown-open']//div[@class='job-filter ph-suggestion-focus-block ph-search-group']//div//input[@id='typehead']"));
		searchArea.sendKeys(str0);
		
		WebElement searchButton=	driver.findElement(By.xpath("//div[@class='ph-global-search-v3-default-theme8 ph-widget-target au-target au-target']//span[@class='au-target input-group-btn']//i[@class='icon icon-search-icon']"));
		searchButton.click();
		
	} 
	
	@And("user click on QA Automation Developer")
	 public  void user_(String str0 ) {
		WebElement job=	driver.findElement(By.xpath("//div[@class='job-title']//span[1][contains(text(),' Automation Developer')]"));
	     job.click();
		
		
	} 
	
	@Then("user verified job title and job location and job id")
	 public  void user_VerifiedJobTitleLocationAndId()  {
		WebElement title=	driver.findElement(By.xpath("//h1[@class='job-title']"));
	     Assert.assertEquals(title, "QA Test Automation Developer");
	     
	     WebElement location=	driver.findElement(By.xpath("//div[@class='job-info au-target']//section//span[contains(text(),'Location')]"));
	     Assert.assertEquals(location, " Durham, North Carolina, United States of America");
	     WebElement jobId=	driver.findElement(By.xpath("//div[@class='job-info au-target']//section//span//b[contains(text(),'Job Id') ]"));
	     Assert.assertEquals(jobId, " 21-90223_RM");
	   
	} 
	
	@And("user verified first suggested tool as selenium")
	 public  void user_verifiedSuggestedToolAsSElenium()  {
		 WebElement suggestedTool=	driver.findElement(By.xpath("//p[contains(text(),': Selenium')]"));
	     Assert.assertEquals(suggestedTool, "selenium");
	   
	
		
}
	@And("user verified the third requirement as 5+ years")
	 public  void user_verifiedThirdRequirementAs5Yrs()  {
		List<WebElement> requirement=	driver.findElements(By.xpath("//ul[4]//li//p"));
		
		for(int i=0; i<=requirement.size(); i++) {
			String thirdREq=requirement.get(2).getText();
	     Assert.assertEquals(thirdREq.contains("selenium"), "selenium");
	   
	
		}	
}	
	@And("user verified the first sentence third paragraph The right candidate")
	 public  void user_verifiedFirstSentenceThirdParagraph()  {
		 WebElement rightCandidate=	driver.findElement(By.xpath("//p[contains(text(),'Advance your Information Technology (IT) career at')]"));
	     Assert.assertEquals(rightCandidate.getText().contains("The right candidate"), "selenium");
	
	
		//div[@class='jd-info au-target']
}	 
	@When("user click on Apply now")
	 public  void user_clickOnApplyNowButton()  {
		 WebElement applyNowButton=	driver.findElement(By.xpath("//a[@aria-label='Apply for COVAGLOBAL2190223RMEXTERNALENGLOBAL']//ppc-content[contains(text(),'Apply Now')]"));
		 Assert.assertEquals(applyNowButton.getText(), "Apply Now");
	
	
		
}
	@Then("user verified job title and job location and job id")
	 public  void user_verifiedJobTitleLocationANDID()  {
		// to verify this step it need another scenario or account creation or login
	
	
	
}	 
	@When("user click on return to search page")
	 public  void user_clickOnRetutrnTosearchPage()  {
		 WebElement returnToSearchPage=	driver.findElement(By.xpath("//li[@class='job-map']//a[@aria-label='Job Map']"));
		 returnToSearchPage.click();
	
		//li[@class='job-map']//a[@aria-label='Job Map']
	
}	 @Then("user is on the search for job page")
public  void user_verifiedSearchForJobPage()  {
	WebElement SearchPage=	driver.findElement(By.xpath("//li[@class='job-map']//a[@aria-label='Job Map']"));
	Assert.assertEquals(SearchPage.getText(), "Job Search");



}	

}	 
