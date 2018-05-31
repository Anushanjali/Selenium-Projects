package RegistrationForm.MavenEcomrs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import RegistrationForm.MavenEcomrs.BasePage.BasePage;

public class dropDown extends BasePage 
{
 
@BeforeClass
@Parameters("browser")
 public void startProcess(String browser) throws Exception
{
	 browserLaunch(browser,getData("bbcurl"));
 }

@Test
public void test()    
{

	 driver.findElement(By.xpath(".//*[@id='orb-nav-more']/a")).click();
	 WebElement item=driver.findElement(By.xpath(".//*[@id='orb-panel-more']/div"));
	 List<WebElement> items=item.findElements(By.tagName("a"));
	 
	 for(int i=0;i<items.size();i++)
	 {
		 String actual_value=items.get(i).getAttribute("innerHTML");
		 if(actual_value.contentEquals("Food"))
		 {
			 items.get(i).click();
			 break;
	
		 }}
	
		
}


@AfterClass
public void endProcess()
{
 
}

}