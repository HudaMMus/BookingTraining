package PageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFilters {
	public WebDriver driver;
	public SearchFilters (WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver,this);	
	}
	
	@FindBy (xpath="//*[@id='ss']")
	public WebElement DestinationTxt;
	
	@FindBy (xpath="//*[@id='frm']/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/span[2]")
	public WebElement DesSelect;
	
	@FindBy (xpath="//div[contains(@class, 'b-datepicker')][@data-mode='checkin']")
	public WebElement DateSelect;
	
	@FindBy (css=".bui-calendar__content")
	public WebElement calender;
	
	@FindBy (xpath="/html/body/div[3]/div/div/div[2]/form/div[1]/div[2]/div[2]/div/div/div[2]")
	public WebElement NextMonth;
	
	@FindBy (xpath="//*[@id='frm']/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/table/tbody/tr[5]/td[3]")
	public WebElement FromDate;
	
	@FindBy (xpath="//*[@id='frm']/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/table/tbody/tr[5]")
	public WebElement ToDate;
	///html/body/div[3]/div/div/div[2]/form/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/table/tbody/tr[6]/td[4]
	@FindBy (xpath="//*[@id='xp__guests__toggle']/span[2]")
	public WebElement Accommodation;
	
	@FindBy (xpath= "//*[@id='xp__guests__inputs-container']/div/div/div[2]/div/div[2]/button[2]/span")
	public WebElement ChildNo;
	
	@FindBy (xpath= "//*[@id='frm']/div[1]/div[4]/div[2]/button/span[1]")
	public WebElement SearchBtn;
	
}
