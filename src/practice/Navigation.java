package practice;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	
	public static void main (String aa[]) {
		
	System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM FRAMEWORK\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://google.com");
	
	System.out.println(driver.getTitle());
	
	System.out.println(driver.getCurrentUrl());//to get current URL
	
	//System.out.println(driver.getPageSource());
	driver.get("http://yahoo.com");
	driver.navigate().back();
		
	
	
	}
}
