package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getData {
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
	}

}
