package RegistrationForm.MavenEcomrs;

import org.testng.annotations.Test;

import RegistrationForm.MavenEcomrs.BasePage.BasePage;
import RegistrationForm.MavenEcomrs.PageUI.CustomerRegistration;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;

public class TC001_CustomerRegistration extends BasePage
{
	public static final Logger log= Logger.getLogger(TC001_CustomerRegistration.class.getName()); //latr
	
 
	
	CustomerRegistration register;
	 @BeforeClass
	 @Parameters("browser")
	  public void startProcess(String browser) throws Exception
	 {
		 browserLaunch(browser,getData("ecmrsurl"));
	  }
	
	@Test
  public void login() 
	{
		log.info("========Starting TC001_CustomerRegistration Test========="); //latr
		
		
		register=new CustomerRegistration(driver);
		register.customerRegistration();
		
		
		log.info("========Ending TC001_CustomerRegistration Test======= ");	//latr
		
		
			
  }
 

  @AfterClass
  public void endProcess()
  {
	  
  }

}
