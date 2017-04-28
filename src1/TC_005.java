import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

public class TC_005 {

	public static void main(String[] args) throws InterruptedException {
		String driverpath = "C:\\Program Files\\Mozilla Firefox\\firefox.exe";

		System.out.println("launching browser");
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\dhanusha\\Dhanush Project learnings\\Dhanush\\Jars\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.metrobankonline.co.uk/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@id='js-mbCookieNotice-button']")).click();
		driver.findElement(By.xpath("//a[@href='/about-us/']")).click();
		Thread.sleep(3001);
		driver.findElement(By.xpath("//a[@href='/about-us/events/']")).click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)");
		driver.findElement(By.xpath("//a[contains(text(),'Read more')]")).click();
		
		boolean r;
		if (r=driver.findElement(By.xpath("//div[@aria-label='Event Information']"))!= null)
		{
			System.out.println("valaidation passed content is there");
			Thread.sleep(4000);
		}
		else{
			driver.quit();
		}
		driver.findElement(By.xpath("//a[@href='https://rbhcharity.org/event/grand-canal-challenge/']")).click();
		
		
		
		
		
		
		
		
}
}