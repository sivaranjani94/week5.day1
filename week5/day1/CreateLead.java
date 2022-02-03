package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead extends Baseclass {

	@Test(priority = 1)
	public void main() {
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("test leaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("sivaranjani");
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_lastName']")).sendKeys("malar");
		WebElement drop = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown = new Select(drop);
		int size = dropdown.getOptions().size();
		dropdown.selectByIndex(size-2);
		driver.findElement(By.className("smallSubmit")).click();

	}

}
