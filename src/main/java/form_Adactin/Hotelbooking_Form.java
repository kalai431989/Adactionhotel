package form_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotelbooking_Form {
	public WebDriver driver;
	public Hotelbooking_Form(WebDriver driver) {
     this.driver=driver;
     PageFactory.initElements(driver, this);
	}
	
	public WebElement getSelbtn() {
		return selbtn;
	}
	public WebElement getContbtn() {
		return contbtn;
	}
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getBaddrs() {
		return baddrs;
	}
	public WebElement getCno() {
		return cno;
	}
	public WebElement getCcrdtype() {
		return ccrdtype;
	}
	public WebElement getEdate() {
		return edate;
	}
	public WebElement getEyear() {
		return eyear;
	}
	public WebElement getCcvno() {
		return ccvno;
	}

	public WebElement getBokbtn() {
		return bokbtn;
	}

	
	@FindBy(id="radiobutton_0")private WebElement selbtn;
	@FindBy(id="continue")private WebElement contbtn;
	@FindBy(id="first_name")private WebElement fname;
	@FindBy(id="last_name")private WebElement lname;
	@FindBy(id="address")private WebElement baddrs;
	@FindBy(id="cc_num")private WebElement cno;
	@FindBy(id="cc_type")private WebElement ccrdtype;
	@FindBy(id="cc_exp_month")private WebElement edate;
	@FindBy(id="cc_exp_year")private WebElement eyear;
	@FindBy(id="cc_cvv")private WebElement ccvno;
	@FindBy(id="book_now")private WebElement bokbtn;
	
}
