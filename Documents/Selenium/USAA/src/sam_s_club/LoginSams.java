package sam_s_club;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSams {
	WebDriver driver=new ChromeDriver();
	public void login() {
		driver.get("https://samsclub.qa.truecardev.com/samsclub-landing.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("IRMA");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Merina");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9898902861");
		driver.findElement(By.xpath("//input[@placeholder='ZIP Code']")).sendKeys("73301");
		driver.findElement(By.xpath("//button[@id='validateMembershipInfo']")).click();
		
	}
	
	public void windowHandels(String url) throws Exception {
		driver.get(url);
		String parent=driver.getWindowHandle();
		Set<String> allWindows=driver.getWindowHandles();
		int count=allWindows.size();
		System.out.println("We have total number "+count+" of tabs" );
		for(String child:allWindows) {
			if(!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				System.out.println("Current windo/tabs is "+driver.getTitle());
				driver.close();
				Thread.sleep(3000);
			}
		}
		/*ArrayList<String> tabs=new ArrayList<>(allWindows);
		tabs.get(0);
		driver.switchTo().window(tabs.get(0));*/
	}
	
	public void captureingScreenshots() {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshot=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File("/Users/novateur2017-2/Documents/Selenium/USAA/CapturedScreenshots/"+System.currentTimeMillis()+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch blocksS
			e.printStackTrace();
		}
		driver.quit();
	}
	public void newCarSearch() {
		driver.findElement(By.xpath("//span[@id='select2-new-car-make-selector-container']")).click();
	}
	public static void main(String[] args) {
		System.setProperty("webdriver.chroime.driver", "/Users/novateur2017-2/Documents/Selenium/Browser Drivers/chromedriver");
LoginSams obj=new LoginSams();
obj.login();
obj.captureingScreenshots();	
try {
	obj.windowHandels("www.google.com");
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
}
