
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Switchto {
	
 public static String driverPath = "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe";
//public static WebDriver driver;
 
 public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		System.out.println("launching browser");
		//System.setProperty("webdriver.IE.driver", ".\\IEDriverServer_x64_3.3.0\\IEDriverServer.exe");
		//InternetExplorerDriver driver= new InternetExplorerDriver();

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\training02\\Desktop\\Dhanush\\jars\\chromedriver_win32\\chromedriver.exe");
		//driver=new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\training02\\Desktop\\Dhanush\\jars\\geckodriver-v0.15.0-win64\\geckodriver.exe");
	/*	FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");*/
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.seleniumhq.org//download");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Robot r = new Robot();                          
		r.keyPress(KeyEvent.VK_CONTROL); 
		r.keyPress(KeyEvent.VK_T); 
		r.keyRelease(KeyEvent.VK_CONTROL); 
		r.keyRelease(KeyEvent.VK_T);

		Thread.sleep(6000);
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
	    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(0));
	}
}
