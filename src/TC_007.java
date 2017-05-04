import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TC_007{

	public static void main(String[] args) throws InterruptedException {
		String driverpath = "C:\\Program Files\\Mozilla Firefox\\firefox.exe";

		System.out.println("launching browser");
		DesiredCapabilities cap=DesiredCapabilities.firefox();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dhanusha\\Dhanush Project learnings\\Dhanush\\Jars\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		FirefoxProfile profile = new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true);
		profile.setAssumeUntrustedCertificateIssuer(false);
		WebDriver driver = new FirefoxDriver(cap);
		driver.manage().window().maximize();
		driver.get("https://www.metrobankonline.co.uk/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@id='js-mbCookieNotice-button']")).click();
		driver.findElement(By.xpath("//a[@href='/about-us/']")).click();
		Thread.sleep(3001);
		driver.findElement(By.xpath("//a[@href='/about-us/events/']")).click();
		
		
		
		
	}
}