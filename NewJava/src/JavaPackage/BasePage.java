package JavaPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

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
	//	driver.manage().window().maximize();
		
}}
