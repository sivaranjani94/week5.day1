package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseService {
public ChromeDriver driver;
	
	@BeforeMethod
	public void login() throws InterruptedException {
      WebDriverManager.chromedriver().setup();
		
		//Launch the Driver
		
		 driver=new ChromeDriver();
		
		//Load the URL
		
		driver.get("https://dev75371.service-now.com/navpage.do");
		
		//Maximise the Browser
		
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame("gsft_main");
		//Enter userName and password and click Login
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("siva@555");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		driver.switchTo().defaultContent();
		//Search “incident “ Filter Navigator
		driver.findElement(By.xpath("//input[@id='filter']")).sendKeys("incident",Keys.ENTER);
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void close() {
		driver.close();
}
}
