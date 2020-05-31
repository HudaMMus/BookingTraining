package PageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landing {
	public WebDriver driver;
	public landing (WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver,this);	
	}
	
	@FindBy (xpath="//div/ul/li/a/div/span[contains(text(),'Register')]")
	public WebElement RegBtn;
	
	@FindBy (id="login_name_register")
	public WebElement Emailtxt;
	
	@FindBy (xpath="/html/body/div/div/div[2]/div/div[1]/div[2]/div/div/div/form/button/span")
	public WebElement GetstartedBtn;
	
	@FindBy (xpath="//*[@id='password']")
	public WebElement Pass;
	
	@FindBy (xpath="//*[@id='confirmed_password']")
	public WebElement ConfirmPass;
	
	@FindBy (xpath="//*[@class='bui-button bui-button--large bui-button--wide']/span")
	public WebElement CreatAccBtn;
	
	@FindBy (xpath="/html/body/div/div/div[1]/div/div/div[2]/a")
	public WebElement CloseCookie;
	

	@FindBy (xpath="//div/button[@class='modal-mask-closeBtn']")
	public WebElement CloseMsg;
}
