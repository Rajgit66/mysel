package basep;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import lombok.extern.log4j.Log4j;

/**
 * Hello world!
 *
 */
public class baseclass 
{
	
	public static WebDriver driver ;
	//public static Logger log;
	
    public static void main( String[] args ) throws InterruptedException, IOException
    
  
    {
    	excel1();
     	System.out.println( "Hello World!" );
       // System.setProperty("log4j.configurationFile","C://Users//ADMIN//eclipse-workspace//s/target/log4j2.xml");

        System.setProperty("webdriver.chrome.driver", "C://Users//ADMIN//eclipse-workspace//s//chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println( "Hello World2" );

       //log.info("chrome opened");
        driver.manage().window().maximize();
       // log.info("chrome maximized");
        Thread.sleep(3000);

        driver.navigate().to("https://www.ajio.com/");
       
       // Screenshot();
      // log.info("myntra opened");
        driver.findElement(By.name("searchVal")).click();
        driver.findElement(By.name("searchVal")).sendKeys("loafers");
        driver.findElement(By.name("searchVal")).submit();
        //Screenshot();
        

       
        }
    	public static void Screenshot() {
    		 try {
    		Date d = new Date();
            System.out.println(d.toString());
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-mm-dd-hh-ss");
            File  file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file, new File("C:\\Users\\ADMIN\\eclipse-workspace\\s\\target\\screenshots\\"+sd.format(d)+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block	
			e.printStackTrace();
	        System.out.println("The Screenshot is captured.");

		}    
        
    		
    }
    	public static void excel1() throws IOException 
		{
			
    		

			
			}
 		}
    

