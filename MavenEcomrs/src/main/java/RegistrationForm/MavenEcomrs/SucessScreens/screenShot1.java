package RegistrationForm.MavenEcomrs.SucessScreens;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.sun.jna.platform.FileUtils;
import RegistrationForm.MavenEcomrs.BasePage.BasePage;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class screenShot1 extends BasePage
{

	public static void main(String[] args) throws IOException 
	{
		
				 
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:\\Users\\aanu\\Desktop\\gmail.jpeg"));
		
	}
}
