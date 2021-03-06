package earth.home.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import earth.utility.ReadProperties;
import earth.utility.StartUpInitilize;

public class BaseTemplate {
	WebDriver driver;
	
	@BeforeTest
	@Parameters({"browser","envName"})
	public void launchBrowser(String browser, String envName){
		StartUpInitilize initilize = new StartUpInitilize();
		ReadProperties readProp = new ReadProperties();		
		initilize.setEnvName(envName);// this will set value to set mtd in pojo class
		System.out.println(initilize.getEnvName());
		
		switch(browser){		
		case "chrome" : 			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
			driver = new ChromeDriver();			
			break;			
			
		case "firefox" :
			System.setProperty("webdriver.chrome.driver", "F:/Auto/Driver/chromedriver_win32/chromedriver.exe");
			driver = new FirefoxDriver();
			break;
			
		default :
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
			driver = new ChromeDriver();		
		}	
				
		initilize.setDriver(driver);		
		driver.manage().window().maximize();
		driver.get(readProp.getProperties("url"));
	}
	
	
	@AfterTest
	public void cleanUp(){
		System.out.println("-----After Test----------");
		driver.close();
		
	}
	

}
