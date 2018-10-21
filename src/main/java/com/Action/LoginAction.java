package com.Action;

import com.google.gson.stream.JsonReader;

import Locator.LoginLocator;

public class LoginAction {
	
	public void login() {
LoginLocator locatr=new LoginLocator();
//locatr.username.sendKeys(earth.utility.JsonReader.getJsonValue("$.AdminCredentials.username"));
locatr.nextbtn.click();
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//getJsonValue("$.AdminCredentials.username")
}
}
