package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import actions.Login_Pop_Up_Action;
import base_configuration.Base_file;
import ui_elements.Login_Pop_Up_UI;

public class Login_UI_Tests extends Base_file{

	Login_Pop_Up_UI login_page;
	Homepage_Test homepage_test;
	Login_Pop_Up_Action login_pop_up_actions;

	@BeforeClass
	public void setup1() throws InterruptedException {
		homepage_test= new Homepage_Test();
		homepage_test.setup();
		login_page = new Login_Pop_Up_UI();
		login_pop_up_actions = new Login_Pop_Up_Action();
	}

	@Test(priority = 1)
	public void Email_Field() throws InterruptedException { 
		homepage_test.login_button();
		assertEquals(login_page.Email().isDisplayed(), true);
	}
	@Test(priority = 2)
	public void Password_Field() throws InterruptedException {  

		assertEquals(login_page.Password().isDisplayed(), true);
	}
	@Test(priority = 3)
	public void Login_Button() throws InterruptedException {  

		assertEquals(login_page.Login_button().isDisplayed(), true);
	}
	@Test(priority = 4)
	public void Invalid_Email_Msg() throws InterruptedException {  

		login_pop_up_actions.invalid1_login();
		assertEquals(login_page.invalidEmail_Message().isDisplayed(), true);
		driver.navigate().refresh();
	}
	@Test(priority = 5)
	public void Wrong_Email_Password_Warnning() throws InterruptedException {  

		homepage_test.login_button();
		login_pop_up_actions.invalid1_login();
		assertEquals(login_page.invalidEmail_Message().isDisplayed(), true);
		driver.navigate().refresh();
	}
	@Test(priority = 6)
	public void Warning_Close_Button() throws InterruptedException {  

		homepage_test.login_button();
		login_pop_up_actions.invalid2_login();
		Thread.sleep(5000);
		assertEquals(login_page.wrong_credentialsWarning_close_button().isDisplayed(), true);
		login_page.wrong_credentialsWarning_close_button().click();
		driver.navigate().refresh();
	}
	@Test(priority = 7)
	public void Blank_Email_Error_Msg() throws InterruptedException {  

		homepage_test.login_button();
		login_pop_up_actions.invalid3_login();
		assertEquals(login_page.Blank_Email_Error_Message().isDisplayed(), true);
		driver.navigate().refresh();
	}
	@Test(priority = 8)
	public void Blank_Password_Error_Msg() throws InterruptedException {  
		homepage_test.login_button();
		login_pop_up_actions.invalid3_login();
		assertEquals(login_page.Blank_password_Error_Message().isDisplayed(), true);
		driver.navigate().refresh();
	}

}