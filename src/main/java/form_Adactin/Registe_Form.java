package form_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registe_Form {
	public WebDriver driver;
	public Registe_Form(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public WebElement getLoc() {
		return loc;
	}
	public WebElement getHotldp() {
		return hotldp;
	}
	public WebElement getRomtydp() {
		return romtydp;
	}
	public WebElement getNormnodp() {
		return normnodp;
	}
	public WebElement getChkin() {
		return chkin;
	}
	public WebElement getChkout() {
		return chkout;
	}
	public WebElement getAdultromdp() {
		return adultromdp;
	}
	public WebElement getChildrom() {
		return childrom;
	}
	public WebElement getSerbtn() {
		return serbtn;
	}
	@FindBy(id="location")private WebElement loc;
	@FindBy(id="hotels")private WebElement hotldp;
	@FindBy(id="room_type")private WebElement romtydp;
	@FindBy(id="room_nos")private WebElement normnodp;
	@FindBy(xpath="//*[@id=\'datepick_in\']")private WebElement chkin;
	@FindBy(xpath="//*[@id=\'datepick_out\']")private WebElement chkout;
	@FindBy(id="adult_room")private WebElement adultromdp;
	@FindBy(id="child_room")private WebElement childrom;
	@FindBy(id="Submit")private WebElement serbtn;
	
}
