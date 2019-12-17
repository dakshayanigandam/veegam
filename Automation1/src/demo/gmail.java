package demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class gmail {
	@Test
	public void testlogin()
	{

	
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		c1.get("https://www.gmail.com");
	
	}

	

}
