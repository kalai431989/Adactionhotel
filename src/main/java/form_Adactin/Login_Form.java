package form_Adactin;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Form {
	public WebDriver driver;

@FindBy(id="username")private WebElement name;
@FindBy(id="password")private WebElement paswd;
@FindBy(id="login")private WebElement clklogin;
public Login_Form(WebDriver driver2) {
	
	this.driver=driver2;
	PageFactory.initElements(driver,this);
}

public WebElement getName() {
	return name;
}
public WebElement getPaswd() {
	return paswd;
}
public WebElement getClklogin() {
	return clklogin;
}

}
