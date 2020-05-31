package PageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelPage {
	public WebDriver driver;
	public HotelPage (WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver,this);	
	}
	
	@FindBy (xpath= "//*[@id='earch_results_table']/div[4]/nav/ul/li[3]/a")
	public WebElement NextpageBtn;
	
	@FindBy (xpath= "//div[@class='sr_item_content sr_item_content_slider_wrapper ']/div/div/div/h3/a/span[contains(text(),'Albatros Aqua Park Sharm El Sheikh - Families and Couples Only')]")
	public WebElement HotelName;

}
