package javaPrtc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
    static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		WebElement element=driver.findElement(By.id("day"));
		
		Select sc=new Select(element);
		sc.selectByIndex(24);
		
		
		WebElement ele=driver.findElement(By.id("month"));
		Select s=new Select(ele);
		s.selectByVisibleText("Aug");
		
		WebElement el=driver.findElement(By.id("year"));
		Select sel=new Select(el);
		sel.selectByVisibleText("2000");
		
		
		

	}

}
