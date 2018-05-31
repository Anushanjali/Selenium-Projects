package RegistrationForm.MavenEcomrs.BasePage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage 
{
	public static WebDriver driver;
	public static final String path="./Selenium.properties"; // created altr 
	
	
	public static String getData(String key) throws Exception	 
	{
		File f=new File(path);         //latr
		FileInputStream fis= new FileInputStream(f);  // latr
		Properties p=new Properties(); //latr
		p.load(fis);   //latr
		
		return p.getProperty(key); // Lattr
	}
	
	public static int randomNumber() //this usd to take the gmail accountandomly by systm
	{
		Random r=new Random();
		int random = r.nextInt(9999);
		return random;
	}
	 public void elementVisible(long time,WebElement element)   // waitng can b takn by systm 
	 {
		 WebDriverWait wait=new WebDriverWait(driver,time);
		 wait.until(ExpectedConditions.visibilityOf(element));
	 }
	
	 public void electOption(WebElement element,  int option)
	 {
		 /**
		  * @author aanu
		  * @param elemet
		  * @param option
		  */
		 Select sel=new Select(element);
		 sel.selectByIndex(option);
	 }
	 
	
	
	
	
	public static void browserLaunch(String browser,String url)  	// by passing parameters

	{
		if(browser.equalsIgnoreCase("CHROME"))
		{
	
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
			driver=new ChromeDriver();
	}
		else if(browser.equalsIgnoreCase("FIREFOX"))
			{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
					driver=new FirefoxDriver();
			}
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//Drivers//IEDriverServer.exe");
					driver=new InternetExplorerDriver();
		}
		driver.get(url);// using thes we can go to the ink dats all
	//driver.manage().window().maximize();
		
		String log4jConfPath="log4j.properties"; 	// server
		PropertyConfigurator.configure(log4jConfPath);	 ///server
		
}}
