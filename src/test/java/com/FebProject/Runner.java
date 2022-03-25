package com.FebProject;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.Baseclass.Base_Class;
import com.Baseclass.POM_Class;

public class Runner extends Base_Class {
	
public static WebDriver driver=browser_Configuration("Chrome");
	
	public static POM_Class pom=new POM_Class(driver);
	
	public static Logger loggg=Logger.getLogger(Runner.class);
	public static void main(String[] args) throws Throwable {
		PropertyConfigurator.configure("log4j.properties");
		getUrl("https://adactinhotelapp.com/");
		loggg.info("welcome my hotel");
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		inputValue(pom.getLog().getName(),textdata("C:\\Users\\ELCOT\\Desktop\\Adactintestcase.xlsx",11,5));
		inputValuePasswd(pom.getLog().getPaswd(),textdata("C:\\Users\\ELCOT\\Desktop\\Adactintestcase.xlsx",12,5));
		clickOnElement(pom.getLog().getClklogin());
		loggg.error("Login successfully");
		dropdown("byText",pom.getReg().getLoc(),textdata("C:\\Users\\ELCOT\\Desktop\\Adactintestcase.xlsx",15,5));
		dropdown("byIndex",pom.getReg().getHotldp(),textdata("C:\\Users\\ELCOT\\Desktop\\Adactintestcase.xlsx",16,5));
		dropdown("byValue",pom.getReg().getRomtydp(),textdata("C:\\Users\\ELCOT\\Desktop\\Adactintestcase.xlsx",17,5));
		dropdown("byIndex",pom.getReg().getNormnodp(),textdata("C:\\Users\\ELCOT\\Desktop\\Adactintestcase.xlsx",18,5));
		inputValue(pom.getReg().getChkin(),"9-03-2022");
		inputValue(pom.getReg().getChkout(),"10-03-2022");
		dropdown("byIndex",pom.getReg().getAdultromdp(),textdata("C:\\Users\\ELCOT\\Desktop\\Adactintestcase.xlsx",21,5));
		dropdown("byIndex",pom.getReg().getChildrom(),textdata("C:\\Users\\ELCOT\\Desktop\\Adactintestcase.xlsx",22,5));
		clickOnElement(pom.getReg().getSerbtn());
		clickOnElement(pom.getHot().getSelbtn());
		clickOnElement(pom.getHot().getContbtn());
		inputValue(pom.getHot().getFname(),textdata("C:\\Users\\ELCOT\\Desktop\\Adactintestcase.xlsx",28,5));
		inputValue(pom.getHot().getLname(),textdata("C:\\Users\\ELCOT\\Desktop\\Adactintestcase.xlsx",29,5));
		inputValue(pom.getHot().getBaddrs(),textdata("C:\\Users\\ELCOT\\Desktop\\Adactintestcase.xlsx",30,5));
		inputValue(pom.getHot().getCno(),textdata("C:\\Users\\ELCOT\\Desktop\\Adactintestcase.xlsx",31,5));
		dropdown("byIndex",pom.getHot().getCcrdtype(),textdata("C:\\Users\\ELCOT\\Desktop\\Adactintestcase.xlsx",32,5));
		dropdown("byIndex",pom.getHot().getEdate(),textdata("C:\\Users\\ELCOT\\Desktop\\Adactintestcase.xlsx",33,5));
		dropdown("byIndex",pom.getHot().getEyear(),textdata("C:\\Users\\ELCOT\\Desktop\\Adactintestcase.xlsx",34,5));
		inputValue(pom.getHot().getCcvno(),textdata("C:\\Users\\ELCOT\\Desktop\\Adactintestcase.xlsx",35,5));
		
		clickOnElement(pom.getHot().getBokbtn());
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		clickOnElement(pom.getFin().getMyitinbtn()); 
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		Robot rob=new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		TakesScreenshot ts=(TakesScreenshot)driver;
		takeScreenShot(ts);
        driver.close();
	}
}
