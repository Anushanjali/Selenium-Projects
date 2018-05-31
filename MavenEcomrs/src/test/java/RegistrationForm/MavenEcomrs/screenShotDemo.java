package RegistrationForm.MavenEcomrs;

import org.testng.annotations.Test;

import RegistrationForm.MavenEcomrs.BasePage.BasePage;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class screenShotDemo extends BasePage
{

WebDriver driver;
	
	@BeforeMethod
	@Parameters("browser")
	 public void startProcess(String browser) throws Exception
		{
			 browserLaunch(browser,getData("checkboxurl"));
		 }

	
	@Test
	public void testMultiFrame() throws InterruptedException, IOException
	{
		Date dt=new Date();
		DateFormat dateFormat=new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//FileUtils is a predefined class in java & copyFile is a predefined method
		FileUtils.copyFile(scrFile,new File("C:\\Users\\Ravi Kanth\\Desktop\\"+dateFormat.format(dt)+".png"));
	}
	
	@AfterMethod
	public void teradown()
	{
		driver.quit();
	}
	
}
