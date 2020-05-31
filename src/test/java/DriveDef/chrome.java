package DriveDef;

import java.io.File;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class chrome {
	
    //edit path to the path which you locate the project folders
	public WebDriver driver;
	public File file = new File("C://Users//Houda//Downloads//Task//Drivers//Chrome//chromedriver.exe");
	
	public chrome(){
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		this.driver = new ChromeDriver();
	}
	
	public void navigate(String URL){
		 this.driver.navigate().to(URL);
	     }
	public void maximize()
	     {
	    	 this.driver.manage().window().maximize();
	     }

	public void findHotel() throws Throwable{
		driver.findElements(By.xpath("//div[@class='sr_item_content sr_item_content_slider_wrapper ']/div/div/div/h3/a/span[contains(text(),'Albatros Aqua Park Sharm El Sheikh - Families and Couples Only')]"));
	}
	
	public void next(){
		driver.findElement(By.xpath("//*[@id='earch_results_table']/div[4]/nav/ul/li[3]/a")).click();
		}
	
	public void scrolling() throws Throwable{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, 7000)");
		Thread.sleep(5000);
	}
	
	public boolean isTextFoundInList(List<WebElement> elements , String text){
		for (WebElement el: elements){
			if(el.getText().contains(text)){
				return true;
			}	
		}
		return false;
	}
	public boolean isTextFound(String xpath , String text) throws Throwable{
	Thread.sleep(3000);
	List<WebElement> elements= driver.findElements(By.xpath(xpath)); // element
	if(!this.isTextFoundInList(elements, text)){
		 try{
			 driver.findElement(By.xpath("//*[@id='search_results_table']/div[4]/nav/ul/li[contains(@class ,'bui-pagination__next-arrow') and not( contains(@class, 'bui-pagination__item--disabled'))]")).click();
			 this.isTextFound(xpath, text);
	        }
	        catch(NoSuchElementException e){
	            return false;
	        }
		}
	return true;
}
}
