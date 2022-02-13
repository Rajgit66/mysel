package scripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basep.baseclass;


public class scenario1 extends baseclass {
	
	public static WebDriver driver ;
	
	
	public void verifyheadline() {
		
	
		WebElement headline1 = driver.findElement(By.partialLinkText("Headline"));
		String text1 = headline1.getText();
		
		String actual1 ="Half a v million";
		actual1.length();
		
		if(text1.equalsIgnoreCase(actual1))
		{
			System.out.println("the headline is valid");
		}
			else
			{
				System.out.println("the headline is invalid");
			}
			
			String wind = driver.getWindowHandle();
			 Set<String> allwindh = driver.getWindowHandles();
			 Iterator<String> it = allwindh.iterator();
			 
			 while(it.hasNext()) {
				 String cwin =it.next();
				 if(!wind.equalsIgnoreCase(cwin))
					 
				 {
					 driver.switchTo().window(cwin);
					 WebElement w= driver.findElement(null);
					 
					 
					 
					 
					 
				 }
			 }
			 
		}
	}

