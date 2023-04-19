package demo_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginFromTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		//01.https://www.linkedin.com/
		//02 Maximize the window
		//03.Get Title
		//04.Goto form section and put email
		//05.Goto form section and put password
		//06.Click submit button
		//07.Get error message
		
				
		
		//00. Configuration Chrome web driver
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//01.goto https://www.linkedin.com/
		driver.get("https://www.linkedin.com/");
		
		//02 Maximize the window
		driver.manage().window().maximize();
				
		//02.Get Title
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		//02.1 sleep browser and this add the exception in main method
		Thread.sleep(5000);
		
		//Goto form section and put email
		driver.findElement(By.xpath("//*[@id=\"session_key\"]")).sendKeys("Your Email");
		
		//Goto Password section and put password
		driver.findElement(By.xpath("//*[@id=\"session_password\"]")).sendKeys("Your Password");
		
		//Click submit button
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div/div/form/div[2]/button")).click();
		
		//get error message
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.linkedin.com/feed/?trk=homepage-basic_sign-in-submit"))
		{
			System.out.println("Successfully Log In Your Account");
		}
		else 
		{
			System.out.println("You Can't Log In Your Account");
		}
		
		driver.close();
				
	}

}
