package RegistrationForm.MavenEcomrs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import RegistrationForm.MavenEcomrs.BasePage.BasePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class checkBox extends BasePage {
 

@BeforeClass
@Parameters("browser")
 public void startProcess(String browser) throws Exception
{
	 browserLaunch(browser,getData("checkboxurl"));
 }

@Test
public void test()    
{

	List<WebElement> check=driver.findElements(By.xpath("//td[@class='table5']/input[@type='checkbox']"));
	for(int i=0;i<check.size();i++)
	{
		System.out.println(check.get(i).getAttribute("value")+"--"+check.get(i).getAttribute("checked"));
		//System.out.println(check.get(i).isSelected());
	}
}


@AfterClass
public void endProcess()
{
 
}

}