package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassTwo {
	public static void  main(String[] args)
	{
		 WebDriverManager.chromedriver().setup();
		// WebDriverManager.edgedriver().setup();
		 //WebDriverManager.firefoxdriver().setup();
		 //WebDriverManager.operadriver().setup();
		 //WebDriverManager.safaridriver().setup();
		 
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps");
		 driver.manage().window().maximize();
		 //driver.close();
		 
		 WebElement elementUsername = driver.findElement(By.id("username"));
		 elementUsername.sendKeys("Demosalesmanager");
		 
		 WebElement elementPassword = driver.findElement(By.id("password"));
		 elementPassword.sendKeys("crmsfa");
		 
		 WebElement enterClick = driver.findElement(By.className("decorativeSubmit"));
		 enterClick.click();
		 
		 WebElement elementWelcome = driver.findElement(By.tagName("h2"));
		 String text = elementWelcome.getText();
		 System.out.println(text);
		 
		 WebElement enterClick1 = driver.findElement(By.linkText("CRM/SFA"));
		 enterClick1.click();
		 
		 WebElement enterClick2 = driver.findElement(By.linkText("Leads"));
		 enterClick2.click();
		 
		 WebElement enterClick3 = driver.findElement(By.linkText("Create Lead"));
		 enterClick3.click();
		 
		 WebElement elementUsername1 = driver.findElement(By.id("createLeadForm_companyName"));
		 elementUsername1.sendKeys("test keys");
		 
		 WebElement elementUsername2 = driver.findElement(By.id("createLeadForm_firstName"));
		 elementUsername2.sendKeys("test");
		 
		 WebElement elementUsername3 = driver.findElement(By.id("createLeadForm_lastName"));
		 elementUsername3.sendKeys("one");
		 
		 WebElement elementIndex1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		 Select dropdown = new Select(elementIndex1);
		 dropdown.selectByIndex(5);
		 
		 WebElement elementVisible = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		 Select dropdown2 = new Select(elementVisible);
		 dropdown2.selectByVisibleText("Car and Driver"); 	
		 
		 WebElement elementValue= driver.findElement(By.id("createLeadForm_industryEnumId"));
		 Select value = new Select(elementValue);
		 value.selectByValue("IND_SOFTWARE");
		 
		 WebElement elementValue5= driver.findElement(By.className("smallSubmit"));
		 elementValue5.click();
		 }}
		 
		 
		 
		 
		 
		 
		 
		
