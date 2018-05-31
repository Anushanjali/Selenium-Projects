package RegistrationForm.MavenEcomrs.PageUI;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import RegistrationForm.MavenEcomrs.BasePage.BasePage;

public class CustomerRegistration extends BasePage
{
	
	public static final Logger log= Logger.getLogger(CustomerRegistration.class.getName()); //latr
	
	//cusomer regisration properties//
	
	@FindBy(linkText="Sign in") public WebElement signIn;
	@FindBy(id="email_create")  WebElement email;
	@FindBy(id="SubmitCreate")  WebElement submit;
	 
	@FindBy(xpath="//h1[text()='Create an account']") WebElement verifyAccount;

	
	
	
	@FindBy(id="id_gender2")  WebElement mrs;
	@FindBy(id="customer_firstname")  WebElement firstname;
	@FindBy(id="customer_lastname")  WebElement lastname;
	@FindBy(id="passwd")  WebElement passwd ;
	@FindBy(id="days")  WebElement days;
	@FindBy(id="months")  WebElement months;
	@FindBy(id="years")  WebElement years;
	@FindBy(id="address1")  WebElement address1;
	@FindBy(id="city")  WebElement city;
	@FindBy(id="id_state")  WebElement state;   
	@FindBy(id="postcode")  WebElement postcode;
	@FindBy(id="id_country")  WebElement country;
	@FindBy(id="phone_mobile")  WebElement mobilenum;
	@FindBy(id="submitAccount")  WebElement register;
	@FindBy(xpath="//h1[text()='My account']")  WebElement myAccount ;
	

   public CustomerRegistration(WebDriver driver) //latr wen we write driver in dat pag
   {
		
	   PageFactory.initElements(driver,this );	
	   }

public void  customerRegistration()
   {
	   try {
		signIn.click();
		log.info("Clicked on signIn using with Object - "+signIn.toString());
		   //email.sendKeys("mark1111ddd@gmail.com");
		 email.sendKeys(getData("firstname"),getData("lastName")+randomNumber()+getData("domain"));
		 log.info("Entered username as : -" + email.getAttribute("value") +  "using with object - "+email.toString());
		 
		 submit.click();
		   
		   email.sendKeys(getData("firstname"),getData("lastName")+randomNumber()+getData("domain"));
		   elementVisible(60, verifyAccount); //instead of thread we are using this 
		   
		  // Thread.sleep(5000);
		  // Assert.assertEquals("Create an account", verifyAccount.getText());
		   Assert.assertTrue(verifyAccount.getText().equalsIgnoreCase("Create an account"));
		   mrs.click();
		   firstname.sendKeys(getData("firstname"));
		   lastname.sendKeys(getData("lastname"));
		   passwd.sendKeys(getData("passwd"));
		  selectOption(days, 2);
		   selectOption(months, 2);
		   selectOption(years, 1);
		   
		   address1.sendKeys("hyd");
		   city.sendKeys("hgbd");
		   state.sendKeys("califoria");
		   postcode.sendKeys("00000");
		   country.sendKeys("india");
		   mobilenum.sendKeys("9848022338");
		   register.click();
		  // Assert.assertEquals("myaccount",myAccount.getText());
		   Assert.assertTrue(myAccount.getText().equalsIgnoreCase("myaccount"));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	   	
   }

private void selectOption(Object day, int i) {
	// TODO Auto-generated method stub
	
}
}
