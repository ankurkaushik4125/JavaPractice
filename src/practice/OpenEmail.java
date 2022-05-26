package practice;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenEmail {

	public static void main(String aa[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM FRAMEWORK\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	driver.get("https://gmail.com/");

	driver.findElement(By.id("identifierId")).sendKeys("ankurkaushik4125@gmail.com");

	
	driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/span")).click();

	driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Password");

	driver.findElement(By.className("CwaK9")).click();

	// System.out.println("Title of Page: " + driver.getCurrentUrl());

	List<WebElement> unreademail = driver.findElements(By.className("zE"));



	System.out.println("Total No. of Unread Mails: " + unreademail.size());

	// real logic starts here

	for(int i=0;i<unreademail.size();i++){

	System.out.println(unreademail.get(i).getText());

	}

	unreademail.get(0).click();

	Thread.sleep(3000);

	driver.close();
}
}

