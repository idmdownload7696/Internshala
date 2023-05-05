package ui_elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_configuration.Base_file;

public class Search_Bar_UI extends Base_file {


	@FindBy(xpath = "//div/a[@href='/internships/internship-in-mumbai?utm_campaign=HP_search_Mumbai']")
	WebElement popularcity_mumbai;

	@FindBy(xpath = "//div/a[@href='/internships/engineering-internship?utm_campaign=HP_search_Engineering']")
	WebElement internship_popular_categories;

	@FindBy(xpath = "//a[@class='chosen-single']")
	WebElement drop_down_icon;

	@FindBy(xpath = "//li[text()='Online Training']")
	WebElement online_traning_text;

	@FindBy(xpath = "//ul[@class='chosen-choices']")
	WebElement online2;


	@FindBy(xpath = "//input[@value='Choose from dropdown']")
	WebElement online_traning_searchbar;

	@FindBy(xpath = "(//li[@class='active-result'])[7]")
	WebElement data_science_list;

	@FindBy(xpath = "(//a[text()='AutoCAD'])[1]")
	WebElement online_popular_tranning;

	@FindBy(xpath = "//li[text()='Job']")
	WebElement jobs_text;

	@FindBy(xpath = "//input[@id='fresher_job_modal_search_input']")
	WebElement jobs_search_bar;

	@FindBy(xpath = "//div[@id='search_page_breadcrumbs']")
	WebElement jobs_search_breadcrum;

	@FindBy(xpath = "//a[@href='/jobs/jobs-in-hyderabad?utm_source=homepage_modal_job_search']")
	WebElement jobs_drop_down_popular_locations;

	@FindBy(xpath = "//a[@href='/jobs/humanities-jobs?utm_source=homepage_modal_job_search']")
	WebElement job_popular_categories;

	//li[@class='search-choice']


	public  Search_Bar_UI() {
		PageFactory.initElements(driver, this);	
	}


	public WebElement internship_mumbai() {
		return popularcity_mumbai;
	}
	public WebElement internship_categories() {
		return internship_popular_categories;
	}
	public WebElement Drop_Down_Icon() {
		return drop_down_icon;
	}
	public WebElement Online_Tranning() {
		return online_traning_text;
	}
	public WebElement Online_Tranning_Search_Bar() {
		return online_traning_searchbar;
	}
	public WebElement Online_Tranning_Search_Bar2() {
		return online2;
	}
	public WebElement Data_Science_OnlinElement_Tranning() {
		return data_science_list;
	}
	public WebElement Online_Popular_Tranning_Autocad() {
		return online_popular_tranning;
	}
	public WebElement Jobs_Text_Drop_Down() {
		return jobs_text;
	}
	public WebElement Jobs_Search() {
		return jobs_search_bar;
	}
	public WebElement Jobs_Search_Breadcrum_Media() {
		return jobs_search_breadcrum;
	}
	public WebElement Jobs_Drop_Down_Popular_Locations() {
		return jobs_drop_down_popular_locations;
	}
	public WebElement Jobs_Drop_Down_Popular_Categories() {
		return job_popular_categories;
	}

	//	public WebElement Online_Traning_Search() {
	//		return online_traning_search;
	//	}



}
