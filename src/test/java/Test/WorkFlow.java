package Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class WorkFlow extends BaseTest{
  
	@BeforeSuite
	  public void beforesuit() {
		  ChromeDriver.navigate("https://www.booking.com");
		  ChromeDriver.maximize();
	  }
	
	@Test (description="Test Registration",priority=1, enabled=false)
  public void Registration() throws Throwable {
		
		Land.RegBtn.click();
		Land.Emailtxt.sendKeys("testing98741@gmail.com");
		Land.GetstartedBtn.click();
		Land.CloseCookie.click();
		Thread.sleep(2000);
		Land.Pass.click();
		Land.Pass.sendKeys("12345678");
		Land.ConfirmPass.sendKeys("12345678");
		Land.CreatAccBtn.click();
		Thread.sleep(3000);
		Land.CloseMsg.click();
		
  }
	@Test (description="Enter Search Data",priority=1, enabled=true)
	  public void SearchData() throws Throwable {
		SearchF.DestinationTxt.sendKeys("Sharm El Sheikh");
		SearchF.DateSelect.click();
		SearchF.calender.click();
		SearchF.NextMonth.click();
		SearchF.NextMonth.click();
		SearchF.NextMonth.click();
		SearchF.FromDate.click();
		SearchF.ToDate.click();
		SearchF.Accommodation.click();
		SearchF.ChildNo.click();
		SearchF.SearchBtn.click();
   }
	@Test (description="Enter Search Data",priority=1, enabled=true)
	  public void search() throws Throwable{
		ChromeDriver.isTextFound("//div[@class='sr_item_content sr_item_content_slider_wrapper ']/div/div/div/h3/a/span","Suite at shores Amphoras Resort");
	}
	
}
