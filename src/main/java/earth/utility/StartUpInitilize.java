package earth.utility;

import org.openqa.selenium.WebDriver;

public class StartUpInitilize {

	private static WebDriver driver;
	private static String envName;
	
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public String getEnvName() {
		return envName;
	}
	public void setEnvName(String envName) {
		// this is accepting value from base class initilize.setEnvName(envName);
		this.envName = envName;
	}
	
	
}
