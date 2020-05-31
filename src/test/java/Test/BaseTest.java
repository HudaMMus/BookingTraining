package Test;

import DriveDef.chrome;
import PageModel.HotelPage;
import PageModel.SearchFilters;
import PageModel.landing;

public class BaseTest {
  public chrome ChromeDriver = new chrome();
  public landing Land = new landing(ChromeDriver.driver);
  public SearchFilters SearchF = new SearchFilters(ChromeDriver.driver);
  public HotelPage Hotel = new HotelPage (ChromeDriver.driver);
  
}
