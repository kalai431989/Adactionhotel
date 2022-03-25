
package com.Baseclass;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
	public static WebDriver driver; //----->null
	public static String vil;
	public static WebDriver browser_Configuration(String data) { // driver return type: webdriver
		if(data.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
		
		}
		else if(data.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		}
		driver.manage().window().maximize();
		return driver;
	}
	

public static void getUrl(String url){
	driver.get(url);

}

	//Username
public static void inputValue(WebElement inputval,String value) {
		
		inputval.sendKeys(value);
	}
//Password
	public static void inputValuePasswd(WebElement login,String passwd) {
		
		login.sendKeys(passwd);
	}

//Login btn
	public static void clickOnElement(WebElement login) {
		
		login.click();
	}
	
	//Dropdown
public static void dropdown(String type,WebElement element,String value){
	
	Select s=new Select(element);
	if(type.equalsIgnoreCase("byValue")) {
		
		s.selectByValue(value);
	}
	else if(type.equalsIgnoreCase("byText")) {
		
		s.selectByVisibleText(value);
	}
	else if(type.equalsIgnoreCase("byIndex")) {
	int index= Integer.parseInt(value);
	s.selectByIndex(index);
}
	
}
public static void takeScreenShot(TakesScreenshot element) throws IOException  {
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File scr=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("D:\\FebProject\\Pic\\hotelbooking.png");
FileHandler.copy(scr, dest);
}
public static String textdata(String path,int Rows,int cells) throws IOException
{
	File f=new File(path);
	FileInputStream fis=new FileInputStream(f);
	Workbook wb=new XSSFWorkbook(fis);
	Sheet sheetAt=wb.getSheetAt(0);
	
		Row r=sheetAt.getRow(Rows);
		
			Cell cell=r.getCell(cells);
			CellType type=cell.getCellType();
			cell.getCellType();
			
			
			
			if(type.equals(CellType.STRING)) {
			 vil=cell.getStringCellValue();
			
			}
			else if(type.equals(CellType.NUMERIC)) {
				double number=cell.getNumericCellValue();
				int val=(int)number;
				vil=String.valueOf(val);
		}

			wb.close();
			return vil;
	
}
	
}
	



		





	


