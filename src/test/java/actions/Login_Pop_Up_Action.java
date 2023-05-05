package actions;


import org.openqa.selenium.interactions.Actions;

import ui_elements.Login_Pop_Up_UI;

public class Login_Pop_Up_Action extends Login_Pop_Up_UI{
	Login_Pop_Up_UI login_ui = new Login_Pop_Up_UI();
	Actions action = new Actions(driver);

	public void valid_login() throws InterruptedException {
		
		login_ui.Email().sendKeys(prop.getProperty("valid_username"));   // both valid uname & password
		login_ui.Password().sendKeys(prop.getProperty("valid_password"));
		login_ui.Login_button().click();
	}
	//	public void logout() throws InterruptedException {
	//
	//		action.moveToElement(login_ui.Profile_icon()).perform();
	//		Thread.sleep(15000);
	//		login_ui.More_Text().click();
	//		login_ui.Logout_link_Text();
	//	}
	public void invalid1_login() {									// invalid uname and valid password
		login_ui.Email().sendKeys(prop.getProperty("invalid_username"));
		login_ui.Password().sendKeys(prop.getProperty("valid_password"));
		login_ui.Login_button().click();
	}
	public void invalid2_login() throws InterruptedException {    // valid uname and invalid password
		login_ui.Email().sendKeys(prop.getProperty("valid_username"));
		login_ui.Password().sendKeys(prop.getProperty("invalid_password"));
		login_ui.Login_button().click();	
	}
	public void invalid3_login() throws InterruptedException {
		login_ui.Email().sendKeys("");
		login_ui.Password().sendKeys(""); // empty credentials
		login_ui.Login_button().click();	
	}
	public void invalid4_login() throws InterruptedException {
		login_ui.Email().sendKeys(prop.getProperty("invalid_username")); // both invalid uname & password
		login_ui.Password().sendKeys(prop.getProperty("invalid_password"));
		login_ui.Login_button().click();	
	}
	public void invalid5_login() throws InterruptedException {
		login_ui.Email().sendKeys(prop.getProperty("valid_username")); // valid uname & blank password
		login_ui.Password().sendKeys("");
		login_ui.Login_button().click();	
	}
	public void invalid6_login() throws InterruptedException {
		login_ui.Email().sendKeys(""); // blank uname & valid password
		login_ui.Password().sendKeys(prop.getProperty("valid_password"));
		login_ui.Login_button().click();	
	}
	public void invalid7_login() throws InterruptedException {
		login_ui.Email().sendKeys(prop.getProperty("invalid_username")); // invalid uname & blank password
		login_ui.Password().sendKeys("");
		login_ui.Login_button().click();	
	}
	public void invalid8_login() throws InterruptedException {
		login_ui.Email().sendKeys(""); // blank uname & invalid password
		login_ui.Password().sendKeys(prop.getProperty("invalid_password"));
		login_ui.Login_button().click();	
	}
//	public void Login_Button() throws InterruptedException {
//		login_ui.Email().sendKeys(""); // login button is clickable or not 
//		login_ui.Password().sendKeys(prop.getProperty("invalid_password"));
//		assertEquals(login_ui.Login_button().isSelected(), true);
//		login_ui.Login_button().click();	
//	}



}
