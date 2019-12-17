package demo;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class sampleexcel extends xloperation {

   
	static
    WebDriver driver ;
    public void tests() throws Exception{

		
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
    	driver = new ChromeDriver();

        driver.get("http://www.gmail.com");
       sampleexcel.takeSnapShot(driver, "E:\\screenshot\\sony.jpg");
    
    }
    
    
    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
    	TakesScreenshot scrShot =((TakesScreenshot)webdriver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
                File DestFile=new File(fileWithPath);
                 FileUtils.copyFile(SrcFile, DestFile);
                 
            
         		
         		xloperation.writedata("sheet1", 1, 2, "100%");
         		
         		xloperation.writedata("sheet1", 1, 3, "SUCCESS1");
         
         		xloperation.writedata("sheet1", 2, 2, "100%");
         		
        		xloperation.writedata("sheet1", 2, 3, "SUCCESS2");
        		
         	System.out.println("successfully updated in excel");


                 {  
    for(;;)
	{
		Thread.sleep(10000);
	
	driver.navigate().refresh();
	 System.out.println("100%");
	
	 
		
	}
                 }
    }
                 
  
}
