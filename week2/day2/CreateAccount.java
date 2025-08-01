package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {

		// Initialize the WebDriver (ChromeDriver).
		ChromeOptions options = new ChromeOptions();

		options.addArguments("guest");

		// Launch the browser
		ChromeDriver driver = new ChromeDriver(options);

		// Load the URL - get
		driver.get("http://leaftaps.com/opentaps");

		// Maximize the browser
		driver.manage().window().maximize();

		// Enter the user name
		driver.findElement(By.id("username")).sendKeys("DemoCSR");

		// Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click the Login button
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on the CRMSFA link
		driver.findElement(By.partialLinkText("CRM")).click();

		// Click on the Accounts link
		driver.findElement(By.linkText("Accounts")).click();

		// Click on the Create Account link
		driver.findElement(By.linkText("Create Account")).click();

		// Enter Account name
		driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester");

		// Find the dropdown element
		WebElement sourceElement = driver.findElement(By.name("industryEnumId"));
		// Select-Create an Object
		Select dropdown = new Select(sourceElement);
		// Use the method to Select
		dropdown.selectByVisibleText("Computer Software");

		// Find the dropdown element
		WebElement sourceElement1 = driver.findElement(By.name("ownershipEnumId"));
		// Select-Create an Object
		Select dropdown1 = new Select(sourceElement1);
		// Use the method to selectByVisibleText
		dropdown1.selectByVisibleText("S-Corporation");

		// Find the dropdown element
		WebElement sourceElement2 = driver.findElement(By.name("dataSourceId"));
		// Select-Create an Object
		Select dropdown2 = new Select(sourceElement2);
		// Use the method to selectByValue
		dropdown2.selectByValue("LEAD_EMPLOYEE");

		// Find the dropdown element
		WebElement sourceElement3 = driver.findElement(By.name("marketingCampaignId"));
		// Select-Create an Object
		Select dropdown3 = new Select(sourceElement3);
		// Use the method to selectByIndex
		dropdown3.selectByIndex(6);

		// Find the dropdown element
		WebElement sourceElement4 = driver.findElement(By.id("generalStateProvinceGeoId"));
		// Select-Create an Object
		Select dropdown4 = new Select(sourceElement4);
		// Use the method to selectByValue
		dropdown4.selectByValue("TX");

		// Add Implicit wait (will not wait entire 10sec)if loaded within 2 sec will
		// interact with the element
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Click on the Create Account button
		driver.findElement(By.className("smallSubmit")).click();

		// verify account name displayed
		driver.findElement(By.xpath("//input[contains(@value,'Selenium Automation Tester')]"));

		// Close the browser window
		driver.close();

	}

}
