import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AmazoniOS {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.amazon.in/mobiles-accessories/b/ref=nav_shopall_sa_menu_mobile_all_mobiles?ie=UTF8&node=1389401031");
	Thread.sleep(6000);
	driver.findElement(By.xpath("//div[@id='FGContainer_d8656ac2d99688e40de72b10b64426bf']/div/div[2]/ul/li[3]/div/ul/li[2]/a")).click();
}
}
