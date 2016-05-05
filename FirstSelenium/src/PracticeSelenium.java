import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class PracticeSelenium {
public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.ie.driver", "D://Selenium//IEDriverServer_x64_2.26.2//IEdriverServer.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.policybazaar.com");
	driver.findElement(By.className("term")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("select_4")).click();
	driver.findElement(By.id("select_option_12")).click();
	Select dropdownTwo = new Select(driver.findElement(By.id("select_6")));
	dropdownTwo.selectByIndex(3);
	
	Select dropdownThree = new Select(driver.findElement(By.id("select_8")));
	dropdownThree.selectByIndex(3);
	
	driver.findElement(By.className("md-raised md-primary md-button md-default-theme")).click();
}
}
