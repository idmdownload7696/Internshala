package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import actions.Search_Bar_Actions;
import base_configuration.Base_file;
import ui_elements.Homepage_UI;
import ui_elements.Search_Bar_UI;


public class Search_Bar_Test extends Base_file{

	Homepage_UI homepage;
	Search_Bar_Actions search_actions;
	Homepage_Test homepage_test;
	Search_Bar_UI search_ui2;

	@BeforeClass
	public void setup5() throws InterruptedException {

		homepage_test= new Homepage_Test();
		homepage_test.setup();
		search_ui2 = new Search_Bar_UI();
		search_actions = new Search_Bar_Actions();
		homepage= new Homepage_UI();
	}

	@Test(priority = 1)
	public void internship_search() throws InterruptedException {
		search_actions.internships_drop_down_list();
		String search_Internship_Title = driver.getTitle();
		//	System.out.println(search_Internship_Title);
		assertEquals(search_Internship_Title.contains(prop.getProperty("web_development_internship_search")),true);
		driver.navigate().to(prop.getProperty("url"));

	}
	@Test(priority = 2)
	public void internship_city() throws InterruptedException {
		search_actions.internship_popular_city();
		String City_Internship_Title = driver.getTitle();
		//System.out.println(City_Internship_Title);
		assertEquals(City_Internship_Title, prop.getProperty("internship_city"));
		driver.navigate().to(prop.getProperty("url"));
	}
	@Test(priority = 3)
	public void internship_categories() throws InterruptedException {
		search_actions.internship_categorie();
		String Cateogry_Internship_Title = driver.getTitle();
		//System.out.println(Cateogry_Internship_Title);
		assertEquals(Cateogry_Internship_Title, prop.getProperty("internship_categories"));
		driver.navigate().to(prop.getProperty("url"));
	}
	@Test(priority = 4)
	public void Online_Traning_list_selection() throws InterruptedException {
		search_actions.online_search_by_keywords();
		search_actions.Machine_Learning_Course_Window();
		String machin_learning_window_title= search_actions.title1;
		assertEquals(machin_learning_window_title,prop.getProperty("machine_learning_page_title"));
		driver.navigate().to(prop.getProperty("url"));

	}
	@Test(priority = 5)
	public void Data_Science() throws InterruptedException {
		search_actions.Data_Science_Course_from_drop_down();
		search_actions.Data_Science_Window_Switch();
		String data_science_window_title= search_actions.title2;
		assertEquals(data_science_window_title,prop.getProperty("data_science_page_title"));
		driver.navigate().to(prop.getProperty("url"));


		///// today test case from blow ones	28-04-2023
	}
	@Test(priority = 6)
	public void Online_Popular_Traning_select_training_autocad() throws InterruptedException {
		search_actions.Online_Popular_Tranning_Text();
		search_actions.Autocad_Window_Switch();
		String Autocad_page_Title = driver.getTitle();
		//System.out.println(Autocad_page_Title);
		assertEquals(Autocad_page_Title,prop.getProperty("autocad_tranning_page_title"));
		driver.navigate().to(prop.getProperty("url"));

	}
	@Test(priority = 7)
	public void Jobs_Drop_Down_List_Text_Search_Media() throws InterruptedException {
		search_actions.Jobs_Drop_Down_Text();
		Thread.sleep(3000);
		String Media_Job_Breadcrum = search_ui2.Jobs_Search_Breadcrum_Media().getText();
		//System.out.println(Media_Job_Breadcrum);
		assertEquals(Media_Job_Breadcrum,prop.getProperty("job_search_text_media_breadcrum"));
		driver.navigate().to(prop.getProperty("url"));
	}
	@Test(priority = 8)
	public void Jobs_Drop_Down_List_Popular_Locations() throws InterruptedException {
		search_actions.Jobs_Drop_Down_popular_location();
		String Jobs_popular_locations = driver.getTitle();
		//System.out.println(Jobs_popular_locations);
		assertEquals(Jobs_popular_locations.contains(prop.getProperty("jobs_popular_location")),true);
		driver.navigate().to(prop.getProperty("url"));
	}
	@Test(priority = 9)
	public void Jobs_Drop_Down_List_Popular_Categories() throws InterruptedException {
		search_actions.Jobs_Drop_Down_popular_Categories();
		String Jobs_popular_categories = driver.getTitle();
		//System.out.println(Jobs_popular_categories);
		assertEquals(Jobs_popular_categories.contains(prop.getProperty("jobs_popular_categories")),true);
		driver.navigate().to(prop.getProperty("url"));
	}






}