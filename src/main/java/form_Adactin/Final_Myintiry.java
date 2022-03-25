package form_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Final_Myintiry {
	public WebDriver driver;
public WebElement getMyitinbtn() {
		
		return myitibtn;
}
	
public Final_Myintiry(WebDriver driver) {
	
this.driver=driver;
PageFactory.initElements(driver, this);
	}
	
@FindBy(id="my_itinerary")private WebElement myitibtn;

	
}



