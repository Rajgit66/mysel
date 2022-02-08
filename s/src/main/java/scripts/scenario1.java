package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basep.baseclass;


public class scenario1 extends baseclass {
	
	public static WebDriver driver ;
	
	
	public void verifyheadline() {
		
	
		WebElement headline1 = driver.findElement(By.partialLinkText("Headline "));
		String text1 = headline1.getText();
		
		String actual1 ="Half a million ";
		
		if(text1.equalsIgnoreCase(actual1))
		{
			System.out.println("the headline is valid");
		}
			else
			{
				System.out.println("the headline is invalid");
			}
			
			
		}
	}

