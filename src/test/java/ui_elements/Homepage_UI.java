package ui_elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_configuration.Base_file;


public class Homepage_UI extends Base_file{
	
	@FindBy(className  =  "navbar-brand")
	WebElement logo;

	@FindBy(id =  "internships_new_superscript")
	WebElement internships_drop_down;
	
	@FindBy(xpath="//div[@class='heading_6']")
	WebElement internship_first_time_offer;
	
	@FindBy(id =  "close_popup")
	WebElement pop_up_close;
	
	@FindBy(id =  "trainings_dropdown_link")
	WebElement course_drop_down;
	
	@FindBy(id =  "jobs_new_superscript")
	WebElement jobs_drop_down;
	
	@FindBy(xpath="//button[@class='btn btn-secondary home_page_login_button']")
	WebElement login_button;
	
	@FindBy(xpath = "//*[@id=\"login-modal\"]/div/div/div[1]/button")	
	WebElement login_popup;
	
	@FindBy(xpath = "//li//button[contains(text(),'Register')]")	
	WebElement register_button;
	
	@FindBy(xpath = "(//a[@class='dropdown-item item_link'])[1]")
	WebElement register_button_drop_down;
	
	@FindBy(xpath  =  "//div[@id='search']")
	WebElement search_bar;
	@FindBy(xpath  =  "//h6[text()='I am looking for']")
	WebElement search_bar_text;
	
	@FindBy(id =  "internship_modal_search_input")
	WebElement serachbar_with_key;
	
	@FindBy(xpath = "//button[@id='internship_search_button']")
	WebElement serach_button;
	
	@FindBy(xpath = "//*[@id=\"internships\"]/div/p/a")
	WebElement view_all_intern;
	
	@FindBy(className = "google_content")
	WebElement google_signup;
	
	@FindBy(xpath = "//h1[@class='heading heading_4_6']")
	WebElement search_page_heading;
	
	

	public  Homepage_UI() {
		PageFactory.initElements(driver, this);	
	}
	public WebElement google_account_login() {
		return google_signup;
	}
	
	public WebElement brand_logo() {
		return logo;
	}

	public WebElement internship_drop_down_button() {
		return internships_drop_down;
	}
	public WebElement internship_first_time_offers() {
		return internship_first_time_offer;
	}
	
	public WebElement closing_pop_up() {
		return pop_up_close;
	}
	
	public WebElement course_drop_down_button() {
		return course_drop_down;
	}
	public WebElement jobs_dropdown() {
		return jobs_drop_down;
	}
	public WebElement login() {
		return login_button;
	}
	public WebElement login_popup() {
		return login_popup;
	}
	
	public WebElement register_button() {
		return register_button;
	}
	
	public WebElement register_button_drop_down_text() {
		return register_button_drop_down;
	}
	public WebElement search_bar() {
		return search_bar;	
	}
	public WebElement search_page_heading_text() {
		return search_page_heading;	
	}
	public WebElement search_bar_looking_for_text() {
		return search_bar_text;
		
	}
	
	//h6[text()='I am looking for']
	
	public WebElement search_bar_data() {
		return serachbar_with_key;
		
	}
	
	public WebElement search_btn() {
		return serach_button;
		
	}
	public WebElement view_all_internships_text() {
		return view_all_intern;
		
	}
	

	/// from popular cities cards ////////
	
	@FindBy(xpath = "//*[@id=\"internships\"]//div[@class='work_from_home_img']")
	WebElement work_from_home;
	
	@FindBy(xpath = " //input[@id='work_from_home']")
	WebElement work_from_home_check_box_btn;
	
	
	@FindBy(xpath = "//*[@id=\"internships\"]//div[@class='delhi_ncr_img']")
	WebElement delhi_ncr;
	@FindBy(xpath = "//*[@id=\"internships\"]//div[@class='bangalore_img']")
	WebElement banglore;
	@FindBy(xpath = "//*[@id=\"internships\"]//div[@class='mumbai_img']")
	WebElement mumbai;
	@FindBy(xpath = "//*[@id=\"internships\"]//div[@class='hyderabad_img']")
	WebElement hydrabad;
	@FindBy(xpath = "//*[@id=\"internships\"]//div[@class='chennai_img']")
	WebElement chenni;
	@FindBy(xpath = "//*[@id=\"internships\"]//div[@class='kolkata_img']")
	WebElement kolkata;
	@FindBy(xpath = "//*[@id=\"internships\"]//div[@class='international_img']")
	WebElement international;
	
	@FindBy(xpath =  "//h2[@id='open_content_collapse']")
	
	WebElement wrok_from_home_descri;
	
	public WebElement workfromhome_desc() {
		return wrok_from_home_descri;			
	}
	
	public WebElement workfromhome() {
		return work_from_home;			
	}
	
	public WebElement workfromhome_check_box_button() {
		return work_from_home_check_box_btn;			
	}
	public WebElement Delhi_ncr() {
		return delhi_ncr;			
	}
	public WebElement Banglore() {
		return banglore;			
	}
	public WebElement Mumbai() {
		return mumbai;			
	}
	public WebElement Hydrabad() {
		return hydrabad;			
	}
	public WebElement chenni() {
		return chenni;			
	}
	public WebElement Kolkata() {
		return kolkata;			
	}
	public WebElement Internationl() {
		return international;			
	}
}


