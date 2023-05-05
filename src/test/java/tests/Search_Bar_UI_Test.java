

package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import actions.Search_Bar_Actions;
import base_configuration.Base_file;
import ui_elements.Login_Pop_Up_UI;
import ui_elements.Search_Bar_UI;

public class Search_Bar_UI_Test extends Base_file{

	Login_Pop_Up_UI login_page;
	Search_Bar_UI search_ui3;
	Homepage_Test homepage_test;
	Search_Bar_Actions search_bar_actions;
	//	Search_Test search_Test=new Search_Test();

	@BeforeClass
	public void setup1() throws InterruptedException {
		homepage_test= new Homepage_Test();
		homepage_test.setup();
		login_page = new Login_Pop_Up_UI();
		search_bar_actions = new Search_Bar_Actions();
		search_ui3 = new Search_Bar_UI();
	}

	@Test(priority = 1)
	public void Internship_Search_Page_Visibility() throws InterruptedException { 
		search_bar_actions.internships_drop_down_list();
		String title = driver.getTitle();
		assertEquals(title.contains(prop.getProperty("internship_search_title")),true);	
		driver.navigate().to(prop.getProperty("url"));
	}
	@Test(priority = 2)
	public void Internship_City_Visibility() throws InterruptedException { 
		search_bar_actions.internship_popular_city();
		String title = driver.getTitle();
		assertEquals(title.contains(prop.getProperty("internship_city")),true);	
		driver.navigate().to(prop.getProperty("url"));
	}
	@Test(priority = 3)
	public void Internship_Categories_Visibility() throws InterruptedException { 
		search_bar_actions.internship_categorie();
		String title = driver.getTitle();
		assertEquals(title.contains(prop.getProperty("internship_categories")),true);
		driver.navigate().to(prop.getProperty("url"));
	}
	@Test(priority = 4)
	public void Online_Traning_list_selection_Visibility() throws InterruptedException { 
		search_bar_actions.online_search_by_keywords();
		search_bar_actions.Machine_Learning_Course_Window();
		String title = driver.getTitle();
		assertEquals(title.contains(prop.getProperty("machine_learning_page_title")),true);
		driver.navigate().to(prop.getProperty("url"));
	}

	// today from here below  28 -04-2023
	@Test(priority = 5)
	public void Data_Science_Visibility() throws InterruptedException { 
		search_bar_actions.Data_Science_Course_from_drop_down();
		search_bar_actions.Data_Science_Window_Switch();
		String title = driver.getTitle();
		assertEquals(title.contains(prop.getProperty("data_science_page_title")),true);
		driver.navigate().to(prop.getProperty("url"));
	}
	@Test(priority = 6)
	public void Online_Popular_Traning_select_training_autocad_Visibility() throws InterruptedException { 
		search_bar_actions.Online_Popular_Tranning_Text();
		search_bar_actions.Autocad_Window_Switch();
		String s1 = driver.getTitle();
		assertEquals(s1.contains(prop.getProperty("auto_cad_page_title")),true);
		driver.navigate().to(prop.getProperty("url"));
	}
	@Test(priority = 7)
	public void Jobs_Drop_Down_List_Text_Search_Media_Visibility() throws InterruptedException { 
		search_bar_actions.Jobs_Drop_Down_Text();
		String Media_Job_Breadcrum = search_ui3.Jobs_Search_Breadcrum_Media().getText();
		//System.out.println(Media_Job_Breadcrum);
		assertEquals(Media_Job_Breadcrum,prop.getProperty("job_search_text_media_breadcrum"));
		driver.navigate().to(prop.getProperty("url"));
	}
	@Test(priority = 8)
	public void Jobs_Drop_Down_List_Popular_Locations_Visibility() throws InterruptedException { 
		search_bar_actions.Jobs_Drop_Down_popular_location();
		String Jobs_popular_locations = driver.getTitle();
		assertEquals(Jobs_popular_locations.contains(prop.getProperty("jobs_popular_location")),true);
		driver.navigate().to(prop.getProperty("url"));
	}
	@Test(priority = 9)
	public void Jobs_Drop_Down_List_Popular_Categories_Visibility() throws InterruptedException { 
		search_bar_actions.Jobs_Drop_Down_popular_Categories();
		String Jobs_popular_categories = driver.getTitle();
		//System.out.println(Jobs_popular_categories);
		assertEquals(Jobs_popular_categories.contains(prop.getProperty("jobs_popular_categories")),true);
		driver.navigate().to(prop.getProperty("url"));
	}


}