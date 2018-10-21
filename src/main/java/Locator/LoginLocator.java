package Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import earth.utility.StartUpInitilize;

public class LoginLocator {

	
		public LoginLocator() {

			StartUpInitilize initilize=new StartUpInitilize();
			PageFactory.initElements(initilize.getDriver(), this);
			
			
		}
		@FindBy(xpath= "//input[@class='phone-no '] ")
		public WebElement username;

		@FindBy(xpath="//input[@id='login-signin']")
		public WebElement nextbtn;

		
}
