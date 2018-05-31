package RegistrationForm.MavenEcomrs.SucessScreens;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import RegistrationForm.MavenEcomrs.BasePage.BasePage;

public class screenShot2 extends BasePage
{

	public static void main(String[] args) throws IOException 
	{
		
		List<WebElement> links=driver.findElements(By.linkText("Rajanikanth"));
		if(links.size()==0)
		{
			File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("C:\\Users\\Ravi Kanth\\Desktop\\google.png"));
		}
	}
}
