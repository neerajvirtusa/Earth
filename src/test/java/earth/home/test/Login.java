package earth.home.test;
import earth.utility.JsonReader;

import org.testng.annotations.Test;

import com.Action.LoginAction;

import earth.utility.ReadProperties;
import earth.utility.StartUpInitilize;

public class Login extends BaseTemplate{
	
	/*@Test
	public void test(){
		ReadProperties readProp = new ReadProperties();
		StartUpInitilize initilize = new StartUpInitilize();
		System.out.println("---------------My Test-----------"+readProp.getProperties("userName")+ initilize.getDriver().getCurrentUrl());
	System.out.println(JsonReader.getJsonValue("$.AdminCredentials.username"));*/
	
	@Test
	public void testlogic()
	{
		LoginAction action=new LoginAction();
		action.login();
	}
	}
	
	


