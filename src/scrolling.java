import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

public class scrolling {

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
		driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys("Grand");
		driver.findElement(By.xpath("//button[@class='searchResultsPage-form-submit']")).click();
		if (driver.findElement(By.xpath("//*[contains(text(), 'Grand')]")) != null) {
			System.out.println("validation passed");
		}
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)");
		driver.findElement(By.xpath("//a[@href='/about-us/events/?query=&facet=Store%20opening']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/about-us/events/?query=&facet=Community%20event']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/about-us/events/?query=&facet=Networking%20event']")).click();

		/*
		 * driver.findElement(By.cssSelector("#search-field")).sendKeys("brand")
		 * ; searchbox.clear(); Thread.sleep(2000); searchbox.sendKeys("brand");
		 */
	}
}
