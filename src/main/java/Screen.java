
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
 driver.get("https://www.facebook.com/");
 
 
	}

}
