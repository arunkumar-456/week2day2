package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumone {
	
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
		 driver.close();
	}
	
	

}
