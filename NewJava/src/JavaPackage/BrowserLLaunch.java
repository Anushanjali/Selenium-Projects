package JavaPackage;

import org.openqa.selenium.By;

//	import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserLLaunch extends BasePage
{
	public static void main(String[] args) throws Exception 
	{
		//browserLaunch("CHROME", "https://www.amazon.in");
		browserLaunch(getData("browser"),getData("hdfcurl")); // 27th
		
		driver.manage().window().maximize(); //28th
		
		String title = driver.getTitle(); // 28th
		System.out.println(title); //28th
		
		String url = driver.getCurrentUrl(); //28
		System.out.println(url);
		
		driver.manage().deleteAllCookies(); //28th  to dlt al the cookies wat evr to b remved
		
		
		driver.navigate().back();
		Thread.sleep(4000); // waitng tym while navigate
		
		driver.navigate().forward();
		Thread.sleep(4000);
	
		driver.navigate().refresh();
		
	/*	for(int i=1;i<2;i++)
		{
			((RemoteWebDriver)driver).executeScript("widow.scrollBy(0,100)");
			Thread.sleep(2000);s
		} */
		
		driver.findElement(By.id("loginsubmit")).click();
		Thread.sleep(2000);
		
	   // driver.quit(); // done wch are done manually by the wrbdirver only 
		driver.close();
		
		 // latr need to instal fire bug and firepath in firefox browser
	}
	
}
