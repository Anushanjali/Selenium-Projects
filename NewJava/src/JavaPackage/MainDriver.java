package JavaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainDriver extends BasePage
{

	public static void main(String[] args) throws Exception 
	{
	
		browserLaunch(getData("browser"),getData("epelliurl"));
		driver.findElement(By.xpath("//input[contains(@id,'reg_name')]"))..sendKeys("ravi");}
	}
		
	/*	WebElement loc = driver.findElement(By.id("reg_name"));
		loc.sendKeys("ravi");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("reg_name")).clear();
		
		//.findElement(By.className("form-control_main dfocus")).sendKeys("oracle");
	//driver.findElement(By.className("form-control_main")).sendKeys("9999999999");
		driver.findElement(By.xpath(".//*[@id='reg_name']")).sendKeys("oracle");
		driver.findElement( By.linkText("Pellipandiri Branches")).click();
		driver.findElement(By.partialLinkText("Pellipandiri ")).click();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0; i<links.size();i++)
		{
			if(!links.get(i).getText().isEmpty())
			{
				System.out.println(links.get(i).getText());  */
			
		
	


	

