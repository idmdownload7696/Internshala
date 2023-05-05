package ui_elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_configuration.Base_file;

public class Login_Pop_Up_UI extends Base_file {

	public  Login_Pop_Up_UI() {
		PageFactory.initElements(driver, this);	
	}

	@FindBy(xpath="//input[@type='email']")
	WebElement email;

	@FindBy(xpath="//input[@type='password']")
	WebElement password;

	@FindBy(id = "modal_login_submit")
	WebElement login_btn;

	@FindBy(xpath="//div[@class='profile_icon_right']")
	WebElement profile_icon;

	@FindBy(xpath=("//a[@class='dropdown-click'])[2]"))
	WebElement more_text;

	@FindBy(xpath="(//a[@href='/logout'])[2])")
	WebElement logout_link_text;

	@FindBy(xpath="//label[@id='modal_email-error']")
	WebElement invalid_email_error;

	@FindBy(xpath="(//div[@class='text-message body-main small-device-text-center'])[1]")
	WebElement password_email_warning;

	@FindBy(xpath="(//a[@class='btn btn-primary modal_primary_btn close_action'])[1]")
	WebElement password_email_warning_close;

	@FindBy(xpath="//label[@id='modal_email-error']")
	WebElement blank_email_error_msg;

	@FindBy(xpath="//label[@id='modal_password-error']")
	WebElement blank_password_error_msg;
	
	
	// captch unwanted close path=(//a[@class='btn btn-primary modal_primary_btn close_action'])[1]




	public WebElement Email() {
		return email;
	}
	public WebElement Password() {
		return password;
	}
	public WebElement Login_button() {
		return login_btn;
	}
	public WebElement Profile_icon() {
		return profile_icon;
	}
	public WebElement More_Text() {
		return more_text;
	}
	public WebElement Logout_link_Text() {
		return logout_link_text;
	}
	public WebElement invalidEmail_Message() {
		return invalid_email_error;
	}
	public WebElement wrong_credentialsWarning () {
		return password_email_warning;
	}
	public WebElement wrong_credentialsWarning_close_button () {
		return password_email_warning_close;
	}
	public WebElement Blank_Email_Error_Message () {
		return blank_email_error_msg;
	}
	public WebElement Blank_password_Error_Message () {
		return blank_password_error_msg;
	}
	
	}
