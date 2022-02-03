package week5.day1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Contact extends Baseclass {

	
		@Test(priority = 0)
		public void f() throws InterruptedException {
			    
			    
				driver.findElement(By.linkText("Contacts")).click();
				driver.findElement(By.linkText("Create Contact")).click();
				driver.findElement(By.id("firstNameField")).sendKeys("Sivaranjani");
				driver.findElement(By.id("lastNameField")).sendKeys("Malar");
				WebElement drop = driver.findElement(By.id("createContactForm_generalCountryGeoId"));
				Select dropdown = new Select(drop);
				dropdown.selectByVisibleText("India");
				driver.findElement(By.id("createContactForm_birthDate")).sendKeys("12/10/2021");
				driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("SivaMalar555@gmail.com");
				
				driver.findElement(By.id("createContactForm_generalAddress1")).sendKeys("plot no:44,sivaramakrishnan nagar");
				driver.findElement(By.id("createContactForm_generalCity")).sendKeys("chennai");
				driver.findElement(By.id("createContactForm_generalPostalCode")).sendKeys("600056");
				//WebElement drop = driver.findElement(By.id("createContactForm_generalCountryGeoId"));
				//Select dropdown = new Select(drop);
				//dropdown.selectByVisibleText("India");
				Thread.sleep(5);
				WebElement pick = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
				Select pickup = new Select(pick);
				//pickup.selectByVisibleText("TAMILNADU");
				int size = pickup.getOptions().size();
				pickup.selectByIndex(size-5);
				
				driver.findElement(By.className("smallSubmit")).click();

	}

}