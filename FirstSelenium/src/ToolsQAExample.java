import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class ToolsQAExample {
public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.ie.driver", "D://Selenium//IEDriverServer_x64_2.26.2//IEdriverServer.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.toolsqa.com");
	Actions action = new Actions(driver);
	WebElement element=driver.findElement(By.xpath("//span[text()='Tutorials']"));
	action.moveToElement(element);
	Thread.sleep(5000);
	WebElement elementTwo=driver.findElement(By.xpath("//span[text()='TRAININGS']"));
	action.moveToElement(elementTwo);
	Thread.sleep(2000);
	action.moveToElement(element);
	Thread.sleep(2000);
	WebElement elementThree=driver.findElement(By.xpath("//span[text()='TestNG']"));
	action.moveToElement(elementThree).perform();
}
}