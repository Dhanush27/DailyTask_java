import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class validation1 {

	public static void main(String[] args) throws InterruptedException {
		String driverpath="C:\\Program Files\\Mozilla Firefox\\firefox.exe";
		System.out.println("launching browser");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dhanusha\\Dhanush Project learnings\\Dhanush\\Jars\\geckodriver-v0.16.1-win64\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.metrobankonline.co.uk/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@id='js-mbCookieNotice-button']")).click();
		driver.findElement(By.xpath("//a[@href='/about-us/']")).click();
		Thread.sleep(3001);
		driver.findElement(By.xpath("//a[@href='/about-us/events/']")).click();
		Thread.sleep(2000);
		List<WebElement> ele=	driver.findElements(By.xpath("//div[@class='searchResult searchResult_halfWidth searchResult_withButton']"));
        ele.listIterator();
		driver.findElements(By.xpath("//div[@class='searchResult searchResult_halfWidth searchResult_withButton']")).listIterator();
		//System.out.println(ele);
		driver.findElements(By.xpath("//h3[contains(text(),'Store opening')]")).listIterator();
			}
		}
