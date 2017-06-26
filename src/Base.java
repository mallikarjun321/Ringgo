import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
	
	  public static final String USERNAME = "terryhogan1";
	  public static final String AUTOMATE_KEY = "xPLXAw3zEx8pp7e6faTC";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	public static void main(String[] args) throws MalformedURLException {
		/*System.setProperty("webdriver.gecko.driver", "C:\\Repository\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();*/
		  DesiredCapabilities caps = new DesiredCapabilities();
		    caps.setCapability("browserName", "iPhone");
		    caps.setCapability("platform", "MAC");
		    caps.setCapability("device", "iPhone 6S");
		    caps.setCapability("browserstack.debug", "true");
		    caps.setCapability("build", "First build");

		    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://myRingGoTest:W4t3Rf4lls@myrgo-preprod.ctt.co.uk/register");
		Alert al = driver.switchTo().alert();
		al.accept();
		System.out.println(driver.findElement(By.linkText("Home")).getText());
		driver.findElement(By.xpath(".//*[@id='field-Member_CLI']")).sendKeys("07787447898");
		driver.findElement(By.id("field-Member_CLI_confirm")).sendKeys("07787447898");
		//new Select(driver.findElement(By.id(""))).selectByVisibleText("");
	}
}
