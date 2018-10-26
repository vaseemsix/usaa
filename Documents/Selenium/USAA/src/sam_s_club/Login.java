
package sam_s_club;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.chrome.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Login {
	
	WebDriver driver=new ChromeDriver();
	
	public String[] testData(String[] str) throws Exception {
		str=new String[3];
		File src=new File("/Users/novateur2017-2/Documents/Selenium/TestData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		System.out.println(sheet1.getSheetName());
		str[0] =sheet1.getRow(1).getCell(1).getStringCellValue();
		str[1]=sheet1.getRow(1).getCell(2).getStringCellValue();
		str[2]=sheet1.getRow(1).getCell(3).getStringCellValue();
		str[3]=sheet1.getRow(1).getCell(4).getStringCellValue();
		return str;
	}
	
	public  void newCarSearch(String firstname, String lastName, String phone, String zipcode) throws Exception {
		
		driver.get("https://samsclub.qa.truecardev.com/samsclub-landing.html");
		driver.findElement(By.name("firstName")).sendKeys(firstname);
		driver.findElement(By.name("lastName")).sendKeys(lastName);
		driver.findElement(By.name("phone")).sendKeys(phone);
		driver.findElement(By.name("zipcode")).sendKeys(zipcode);
		driver.findElement(By.id("validateMembershipInfo")).click();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String expectedurl="https://samsclub.qa.truecardev.com/main.html";
		if (url== expectedurl) {
			String result="Actul is expected";
			System.out.println(result);
		}
		driver.close();
	}
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "/Users/novateur2017-2/Documents/Selenium/Browser Drivers/chromedriver");
	Login obj=new Login();
	System.out.println(obj.testData(args));
	}	
}
