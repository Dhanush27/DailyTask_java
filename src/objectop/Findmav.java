package objectop;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.SessionNotCreatedException;
public class Findmav {
	 public static String driverPath = "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe";

	public static void main(String[] args) throws InterruptedException {
		System.out.println("launching browser");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\training02\\Desktop\\Dhanush\\jars\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();

	
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().wait();
		WebElement fkart;
		fkart=driver.findElement(By.xpath("//img[@src='//img1a.flixcart.com/www/linchpin/fk-cp-zion/img/fk-logo_9fddff.png']"));
		if(fkart.isDisplayed())
		{
			System.out.println("validation passed");
		}
		else
		{
			System.out.println("validation fails");
			driver.quit();
		}
		Assert.assertEquals(driver.findElement(By.xpath("//a[text()='Log In']"))," Log In");
		System.out.println("Log in passed");
	driver.findElement(By.xpath("//a[@class='_2etDcX _2487fi']")).click();
WebElement image;

	image=driver.findElement(By.xpath("//img[@alt='Flipkart TV Days']"));
	if(image.isDisplayed())
	{
		image.click();
				
	}
	else{
		driver.findElement(By.xpath("//a[@class='_2etDcX _2487fi']")).click();
	}
		
}}
