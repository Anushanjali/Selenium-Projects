package RegistrationForm.MavenEcomrs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import RegistrationForm.MavenEcomrs.BasePage.BasePage;

public class radioButton extends BasePage{
	@BeforeClass
	@Parameters("browser")
	 public void startProcess(String browser) throws Exception
	{
		 browserLaunch(browser,getData("radiourl"));
	 }

	@Test
	public void test()    
	{

		WebElement radio=driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
		List<WebElement> rbutton=radio.findElements(By.name("group2"));
		for(int i=0;i<rbutton.size();i++)
		{
			System.out.println(rbutton.get(i).getAttribute("value")+ "----" + rbutton.get(i).getAttribute("checked"));
		}
	}
 


	@AfterClass
	public void endProcess()
	{
	 
	}

	}