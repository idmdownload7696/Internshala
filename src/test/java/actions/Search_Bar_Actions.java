package actions;



import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base_configuration.Base_file;
import ui_elements.Homepage_UI;
import ui_elements.Search_Bar_UI;

public class Search_Bar_Actions extends Base_file {

	//	Homepage homepage_ui;
	public String title1;
	public String title2;
	Search_Bar_UI search_ui = new Search_Bar_UI();
	Homepage_UI new_homepage_ui = new Homepage_UI();




	Actions actions = new Actions(driver);

	public void internships_drop_down_list() throws InterruptedException {
		new_homepage_ui.search_bar().click();
		new_homepage_ui.search_bar_data().sendKeys(prop.getProperty("web_development_internship_search"));
		//	new_homepage_ui.search_bar_data().sendKeys("Web Development");
		new_homepage_ui.search_btn().click();
		new_homepage_ui.closing_pop_up().click();

	}
	public void internship_popular_city() throws InterruptedException {
		new_homepage_ui.search_bar().click();
		search_ui.internship_mumbai().click();

	}
	public void internship_categorie() throws InterruptedException {
		new_homepage_ui.search_bar().click();
		search_ui.internship_categories().click();
		//		new_homepage_ui.closing_pop_up().click();

	}

	public void Iist_Drop_Down_Icon() throws InterruptedException {
		new_homepage_ui.search_bar().click();
		search_ui.Drop_Down_Icon().click();
		WebElement w1 = search_ui.Online_Tranning();
		actions.moveToElement(w1).click().perform();
		String online_traning_text = w1.getText();
		System.out.println(online_traning_text);

		//new_homepage_ui.closing_pop_up().click();
	}
	public void online_search_by_keywords() throws InterruptedException {
		new_homepage_ui.search_bar().click();
		search_ui.Drop_Down_Icon().click();
		//Thread.sleep(3000);
		WebElement w1 = search_ui.Online_Tranning();
		//Thread.sleep(3000);
		actions.moveToElement(w1).click().perform();
		//Thread.sleep(2000);
		search_ui.Online_Tranning_Search_Bar().click();
		//Thread.sleep(2000);
		search_ui.Online_Tranning_Search_Bar().sendKeys(prop.getProperty("machine_learning_online_traning_search"));
		//Thread.sleep(3000);
		search_ui.Online_Tranning_Search_Bar().sendKeys(Keys.ENTER);
		//		search_ui.Online_Tranning_Search_Bar().click();
		//Thread.sleep(1000);
	}

	public void Data_Science_Course_from_drop_down() throws InterruptedException {
		new_homepage_ui.search_bar().click();
		search_ui.Drop_Down_Icon().click();
		//Thread.sleep(3000);
		WebElement w1 = search_ui.Online_Tranning();
		//	Thread.sleep(3000);
		actions.moveToElement(w1).click().perform();
		Thread.sleep(3000);
		search_ui.Online_Tranning_Search_Bar().click();
		//Thread.sleep(3000);

		search_ui.Data_Science_OnlinElement_Tranning().click();
		//Thread.sleep(10000);
	}
	public void Machine_Learning_Course_Window() throws InterruptedException {
		String parentwindowhandle = driver.getWindowHandle();
		//		driver.getTitle();
		System.out.println("parent"+parentwindowhandle);
		Set<String> handles = driver.getWindowHandles();
		for (String course_window : handles) {
			if (!course_window.equals(parentwindowhandle)) {
				driver.switchTo().window(course_window);

			}}
		title1 = driver.getTitle();
		System.out.println(title1);	
	}
	public void Data_Science_Window_Switch() throws InterruptedException {
		String parentwindowhandle = driver.getWindowHandle();
		//		driver.getTitle();
		System.out.println("parent"+parentwindowhandle);
		Set<String> handles = driver.getWindowHandles();
		for (String course_window : handles) {
			if (!course_window.equals(parentwindowhandle)) {
				driver.switchTo().window(course_window);

			}}
		title2 = driver.getTitle();
		System.out.println(title2);	
	}
	public void Online_Popular_Tranning_Text() throws InterruptedException {
		new_homepage_ui.search_bar().click();
		search_ui.Drop_Down_Icon().click();
		//Thread.sleep(3000);
		WebElement w1 = search_ui.Online_Tranning();
		//Thread.sleep(3000);
		actions.moveToElement(w1).click().perform();
		//Thread.sleep(3000);
		search_ui.Online_Popular_Tranning_Autocad().click();	
	}
	public void Autocad_Window_Switch() throws InterruptedException {
		String parentwindowhandle = driver.getWindowHandle();
		//		driver.getTitle();
		System.out.println("parent"+parentwindowhandle);
		Set<String> handles = driver.getWindowHandles();
		for (String course_window : handles) {
			if (!course_window.equals(parentwindowhandle)) {
				driver.switchTo().window(course_window);

			}}

	}
	public void Jobs_Drop_Down_Text() throws InterruptedException {
		new_homepage_ui.search_bar().click();
		search_ui.Drop_Down_Icon().click();
		//Thread.sleep(3000);
		WebElement w1 = search_ui.Jobs_Text_Drop_Down();
		//Thread.sleep(3000);
		actions.moveToElement(w1).click().perform();
		//Thread.sleep(3000);
		search_ui.Jobs_Search().click();
		//Thread.sleep(3000);
		search_ui.Jobs_Search().sendKeys(prop.getProperty("job_search_text"));
		//Thread.sleep(3000);
		search_ui.Jobs_Search().sendKeys(Keys.ENTER);
		//new_homepage_ui.closing_pop_up().click();
	}
	public void Jobs_Drop_Down_popular_location() throws InterruptedException {
		new_homepage_ui.search_bar().click();
		search_ui.Drop_Down_Icon().click();
		//Thread.sleep(3000);
		WebElement w1 = search_ui.Jobs_Text_Drop_Down();
		//Thread.sleep(3000);
		actions.moveToElement(w1).click().perform();
		search_ui.Jobs_Drop_Down_Popular_Locations().click();
		//new_homepage_ui.closing_pop_up().click();
	}
	public void Jobs_Drop_Down_popular_Categories() throws InterruptedException {
		new_homepage_ui.search_bar().click();
		search_ui.Drop_Down_Icon().click();
		//Thread.sleep(3000);
		WebElement w1 = search_ui.Jobs_Text_Drop_Down();
		actions.moveToElement(w1).click().perform();
		search_ui.Jobs_Drop_Down_Popular_Categories().click();
		//new_homepage_ui.closing_pop_up().click();
	}






}


