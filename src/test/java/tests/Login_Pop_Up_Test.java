package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import actions.Login_Pop_Up_Action;
import base_configuration.Base_file;
import ui_elements.Homepage_UI;
import ui_elements.Login_Pop_Up_UI;

public class Login_Pop_Up_Test extends Base_file{
	

	Login_Pop_Up_UI login_page;
	Login_Pop_Up_Action login_pop_up_actions;
	Homepage_Test homepage_test;

	@BeforeClass
	public void setup1() throws InterruptedException {
		homepage_test= new Homepage_Test();
		homepage_test.setup();
		login_pop_up_actions = new Login_Pop_Up_Action();
		login_page = new Login_Pop_Up_UI();
	}
	//	@Test(priority = 0)
	//	//Login with valid credentials//
	//	public void Login_with_valid_credentials() throws InterruptedException { 
	//		// 
	//		homepage_test.login_button();
	//		login_pop_up_actions.valid_login();
	//		Thread.sleep(5000);
	//		assertEquals(driver.getCurrentUrl(), prop.getProperty("dashboard_url"));	
	//	}
	//@Test(priority = 1)
	//Login with valid credentials//
	//public void log_out() throws InterruptedException { 
	// 
	//		homepage_test.login_button();
	//		login_pop_up_ui.valid_login();
	//		assertEquals(driver.getCurrentUrl(), prop.getProperty("dashboard_url"));
	//login_pop_up_ui.logout();
	@Test(priority = 1)
	public void login_with_invalid_username() throws InterruptedException {  
		// here i am validating the invalid username login message & functionality
		homepage_test.login_button();
		login_pop_up_actions.invalid1_login();
		String invalid_email_error = login_page.invalidEmail_Message().getText();
		System.out.println(invalid_email_error);
		assertEquals(invalid_email_error, prop.getProperty("email_error_message"));
		driver.navigate().refresh();
	}
	@Test(priority = 2)
	public void login_with_uname_invalid_password() throws InterruptedException {  // 
		homepage_test.login_button();
		login_pop_up_actions.invalid2_login();
		Thread.sleep(5000);
		String warning_message = login_page.wrong_credentialsWarning().getText();
		System.out.println(warning_message);
		assertEquals(warning_message.contains(prop.getProperty("email_password_warning")),true);
		Thread.sleep(2000);
		login_page.wrong_credentialsWarning_close_button().click();
		driver.navigate().refresh();
	}
	@Test(priority = 3)
	public void login_with_empty_credentials() throws InterruptedException {  // 
		homepage_test.login_button();
		login_pop_up_actions.invalid3_login();
		String email_warning_message = login_page.Blank_Email_Error_Message().getText();
		System.out.println("Email Field Warining Message:"+email_warning_message);
		assertEquals(email_warning_message.contains(prop.getProperty("blank_email_msg")),true);

		String password_warning_message = login_page.Blank_password_Error_Message().getText();
		System.out.println("Password Field Warining Message:"+password_warning_message);
		assertEquals(password_warning_message.contains(prop.getProperty("blank_password_msg")),true);
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
	@Test(priority = 4)
	public void login_with_invalid_uname_and_password() throws InterruptedException {  // 
		homepage_test.login_button();
		login_pop_up_actions.invalid4_login();
		String invalid_mesage = login_page.invalidEmail_Message().getText();
		System.out.println(invalid_mesage);
		assertEquals(invalid_mesage.contains(prop.getProperty("email_error_message")),true);
		driver.navigate().refresh();
	}
	@Test(priority = 5)
	public void login_with_valid_uname_with_blank_password() throws InterruptedException {  // 
		homepage_test.login_button();
		login_pop_up_actions.invalid5_login();
		String password_warning_message = login_page.Blank_password_Error_Message().getText();
		System.out.println("Password Field Warining Message:"+password_warning_message);
		assertEquals(password_warning_message.contains(prop.getProperty("blank_password_msg")),true);
		driver.navigate().refresh();
	}
	@Test(priority = 6)
	public void login_with_blank_uname_with_valid_password() throws InterruptedException {  // 
		homepage_test.login_button();
		login_pop_up_actions.invalid6_login();
		String email_warning_message = login_page.Blank_Email_Error_Message().getText();
		System.out.println("Email Field Warining Message:"+email_warning_message);
		assertEquals(email_warning_message.contains(prop.getProperty("blank_email_msg")),true);
		driver.navigate().refresh();
	}
	@Test(priority = 7)
	public void login_with_invalid_uname_with_blank_password() throws InterruptedException {  // 
		homepage_test.login_button();
		login_pop_up_actions.invalid7_login();
		String email_warning_message = login_page.Blank_Email_Error_Message().getText();
		System.out.println("Email Field Warining Message:"+email_warning_message);
		assertEquals(email_warning_message.contains(prop.getProperty("email_error_message")),true);


		String password_warning_message = login_page.Blank_password_Error_Message().getText();
		System.out.println("Password Field Warining Message:"+password_warning_message);
		assertEquals(password_warning_message.contains(prop.getProperty("blank_password_msg")),true);
		driver.navigate().refresh();
	}
	@Test(priority = 8)
	public void login_with_blank_uname_with_invalid_password() throws InterruptedException {  // 
		homepage_test.login_button();
		login_pop_up_actions.invalid8_login();
		String email_warning_message = login_page.Blank_Email_Error_Message().getText();
		System.out.println("Email Field Warining Message:"+email_warning_message);
		assertEquals(email_warning_message.contains(prop.getProperty("blank_email_msg")),true);
		driver.navigate().refresh();
	}
	@Test(priority = 9)
	public void login_button() throws InterruptedException {  // 
		homepage_test.login_button();
		login_pop_up_actions.invalid2_login();
		Thread.sleep(5000);
		String warning_message = login_page.wrong_credentialsWarning().getText();
		System.out.println(warning_message);
		assertEquals(warning_message.contains(prop.getProperty("email_password_warning")),true);
		Thread.sleep(2000);
		login_page.wrong_credentialsWarning_close_button().click();
		driver.navigate().refresh();
	}
	

}

