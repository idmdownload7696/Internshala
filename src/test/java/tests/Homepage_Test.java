package tests;


import static org.testng.Assert.*;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base_configuration.Base_file;
import ui_elements.Homepage_UI;

public class Homepage_Test extends Base_file{

	Homepage_UI homepage;

	@BeforeClass
	public void setup() throws InterruptedException {
		initialization();
		homepage= new Homepage_UI();
	}

	@Test(priority = 0)
	public void site_url_verification() throws InterruptedException {  //here i am verifying the home page title//
		//		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		assertEquals(url, "https://internshala.com/");
	}

	@Test(priority = 1)
	public void logo_verification() throws InterruptedException {  //brand logo verification//
		//		Thread.sleep(2000);
		assertEquals(homepage.brand_logo().isDisplayed(), true);

	}
	@Test(priority = 2)
	public void intership_drop_down_button() throws InterruptedException {  // verifying intership drop down
		//		Thread.sleep(2000);
		homepage.internship_drop_down_button().click();
		String title = driver.getTitle();
		assertEquals(title,prop.getProperty("internship_page_title"));
		Thread.sleep(5000);
	}
	@Test(priority = 3, dependsOnMethods = "intership_drop_down_button")
	public void close_pop_up() throws InterruptedException {  // closing pop up
		Thread.sleep(2000);
		String offer_text = homepage.internship_first_time_offers().getText();
		System.out.println(offer_text);
		assertEquals(offer_text, "First time user offer");
		homepage.closing_pop_up().click();
		driver.navigate().to(prop.getProperty("url"));
		Thread.sleep(2000);
	}

	@Test(priority = 4)
	public void course_drop_down() throws InterruptedException {  // verifying courses drop down
		//		Thread.sleep(2000);
		String parentwindowhandle = driver.getWindowHandle();
		//		driver.getTitle();
		System.out.println("parent"+parentwindowhandle);
		homepage.course_drop_down_button().click();
		Set<String> handles = driver.getWindowHandles();
		for (String course_window : handles) {
			if (!course_window.equals(parentwindowhandle)) {
				driver.switchTo().window(course_window);

			}}
		String title1 = driver.getTitle();
		System.out.println(title1);
		assertEquals(title1, "Online Courses & Summer Training - Internshala Trainings");
		Thread.sleep(2000);
		driver.switchTo().window(parentwindowhandle);	
	}

	@Test(priority = 5)
	public void jobs_dropdown_button() throws InterruptedException {
		Thread.sleep(2000);
		homepage.jobs_dropdown().click();
		driver.getTitle();
		System.out.println(driver.getTitle());
		assertEquals(driver.getTitle(), "Job Vacancies - Job Search - Job Opportunities | Internshala");
		driver.navigate().to(prop.getProperty("url"));

	}

	@Test(priority = 6)
	public void login_button() throws InterruptedException {
		Thread.sleep(2000);
		homepage.login().click();
		homepage.google_account_login().getText();
		String google_text = homepage.google_account_login().getText();
		assertEquals(google_text, "Login with Google");
	}

	@Test(priority = 7,dependsOnMethods = "login_button")
	public void login_pop_up() throws InterruptedException {
		Thread.sleep(2000);
		homepage.login_popup().click();
		Thread.sleep(2000);

		assertEquals(homepage.google_account_login().isDisplayed(), false);

	}
	@Test(priority = 8)
	public void register() throws InterruptedException {
		homepage.register_button().click();
		String reg_btn_drop_down_text =  homepage.register_button_drop_down_text().getText();
		assertEquals(reg_btn_drop_down_text, "As a student");
	}

	@Test(priority = 9)
	public void search_bar_label() throws InterruptedException {
		homepage.search_bar().click();
		String search_bar_text = homepage.search_bar_looking_for_text().getText();
		System.out.println(search_bar_text);
		assertEquals(search_bar_text, "I am looking for");
	}
	@Test(priority = 10, dependsOnMethods = "search_bar_label")
	public void search_bar_data_fill() throws InterruptedException {
		homepage.search_bar_data().sendKeys("Python");
		homepage.search_btn().click();
		String search_page_heading_text = homepage.search_page_heading_text().getText();
		System.out.println(search_page_heading_text);
		assertEquals(search_page_heading_text.contains("Python internships"),true);
		Thread.sleep(5000);
		driver.navigate().to(prop.getProperty("url"));
	}

	@Test(priority = 11)
	public void view_all_internships() throws InterruptedException {
		homepage.view_all_internships_text().click();
		String title = driver.getTitle();
		assertEquals(title,prop.getProperty("internship_page_title"));
		Thread.sleep(2000);
		driver.navigate().to(prop.getProperty("url"));
	}

	@Test(priority = 12)
	public void popularcities_jobs() throws InterruptedException {
		// work from home card
		homepage.workfromhome().click();
		Thread.sleep(2000);
		String title1 = driver.getTitle();
		WebElement checkbox = homepage.workfromhome_check_box_button();
		boolean selection = checkbox.isSelected();
		assertEquals(selection, true);
		driver.navigate().to(prop.getProperty("url"));
	}
	//		// 
	@Test(priority = 13)
	public void delhi_ncr_jobs() throws InterruptedException {
		homepage.Delhi_ncr().click();
		Thread.sleep(2000);
		String title2 = driver.getTitle();
		System.out.println(title2);
		assertEquals(title2, "Internship | Summer Internship 2023 | Internship in India");
		driver.navigate().to(prop.getProperty("url"));	
	}
	@Test(priority = 14)
	public void banglore_jobs() throws InterruptedException {
		homepage.Banglore().click();
		Thread.sleep(2000);
		String title3 = driver.getTitle();
		System.out.println(title3);
		assertEquals(title3, "Internship in Bengaluru | Internship | Internshala");
		driver.navigate().to(prop.getProperty("url"));	
	}
	@Test(priority = 15)
	public void mumbai_jobs() throws InterruptedException {
		homepage.Mumbai().click();
		Thread.sleep(2000);
		String title4 = driver.getTitle();
		System.out.println(title4);
		assertEquals(title4, "Internship in Mumbai | Internshala");
		driver.navigate().to(prop.getProperty("url"));	
	}
	@Test(priority = 16)
	public void hydrabad_jobs() throws InterruptedException {
		homepage.Hydrabad().click();
		Thread.sleep(2000);
		String title5 = driver.getTitle();
		System.out.println(title5);
		assertEquals(title5, "Internship in Hyderabad | Internshala");
		driver.navigate().to(prop.getProperty("url"));	
	}
	@Test(priority = 17)
	public void chenni_jobs() throws InterruptedException {
		homepage.chenni().click();
		Thread.sleep(2000);
		String title6 = driver.getTitle();
		System.out.println(title6);
		assertEquals(title6, "Internship in Chennai | Internship | Internshala");
		driver.navigate().to(prop.getProperty("url"));	
	}
	@Test(priority = 18)
	public void kolkata_jobs() throws InterruptedException {
		homepage.Kolkata().click();
		Thread.sleep(2000);
		String title7 = driver.getTitle();
		System.out.println(title7);
		assertEquals(title7, "Internship in Kolkata | Internshala");
		driver.navigate().to(prop.getProperty("url"));	
	}

	@Test(priority = 19)
	public void international_jobs() throws InterruptedException {
		homepage.Internationl().click();
		Thread.sleep(2000);
		String title8 = driver.getTitle();
		System.out.println(title8);
		assertEquals(title8, "International Internships | Foreign Internships for Indian Students");
		driver.navigate().to(prop.getProperty("url"));	
	}

}





//	
//	@AfterClass
//	public void driver_close() {
//		driver.close();
//
//	}
