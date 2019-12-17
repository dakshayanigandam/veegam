package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {
	private static final TimeUnit Timeunit = null;

	@Test
	public void testlogin()
	{

	
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		c1.get("http://www.facebook.com");
 c1.findElement(By.name("email")).sendKeys("adakshayani@gmail.com");
 c1.findElement(By.xpath("//input[@type='password']")).sendKeys("raghusabitha");
 c1.findElement(By.xpath("//input[@value='Log In']")).click();

 
 
	}

	

}