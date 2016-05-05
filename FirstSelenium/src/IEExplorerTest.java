
import org.openqa.selenium.ie.InternetExplorerDriver;
public class IEExplorerTest {
 
	public static void main(String[] args) {
		 //Path to the folder where you have extracted the IEDriverServer executable
		 String service = "D:\\Selenium\\IEDriverServer_x64_2.26.2\\IEDriverServer.exe";
		 System.setProperty("webdriver.ie.driver", service);
 
		 InternetExplorerDriver  driver = new InternetExplorerDriver();
		 driver.get("http://www.google.com");
		 //driver.navigate().to("javascript:document.getElementById('overridelink').click()");  
		 driver.manage().window().maximize();
	}
}