package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {

		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Load the URL - get
		driver.get("https://en-gb.facebook.com/");

		// Maximize the browser
		driver.manage().window().maximize();

		// Add Implicit wait (will not wait entire 10sec)if loaded within 2 sec will
		// interact with the element
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Click on create new button
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

		// Enter the First name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Jana");

		// Enter the Surname
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ravichandran");

		// Enter the DOB
		// Find the drop down element
		WebElement sourceElement1 = driver.findElement(By.id("day"));
		// Select-Create an Object
		Select dropdown1 = new Select(sourceElement1);
		// Use the method to selectByVisibleText
		dropdown1.selectByVisibleText("29");

		// Find the drop down element
		WebElement sourceElement2 = driver.findElement(By.id("month"));
		// Select-Create an Object
		Select dropdown2 = new Select(sourceElement2);
		// Use the method to selectByVisibleText
		dropdown2.selectByVisibleText("Jul");

		// Find the drop down element
		WebElement sourceElement3 = driver.findElement(By.id("year"));
		// Select-Create an Object
		Select dropdown3 = new Select(sourceElement3);
		// Use the method to selectByVisibleText
		dropdown3.selectByVisibleText("1996");

		// Select the radio button
		driver.findElement(By.xpath("//input[@id='sex'][1]")).click();

		// Enter the Mobile number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9874563210");

		// Enter the Password
		driver.findElement(By.id("password_step_input")).sendKeys("qwerty@29");

		// Sign up with details
		//driver.findElement(By.xpath("//button[@type='submit'][1]")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

}
