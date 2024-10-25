package learningSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchgmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
	        
	        // Create an instance of ChromeDriver
	        WebDriver driver = new ChromeDriver();
	       //driver.manage().window().maximize();        //purpose is the maximize the browser window
	       //driver.manage().window().fullscreen();       // purpose to convert browser window in full screen
	        
	       // Dimension d = new Dimension(300,650);
	       // driver.manage().window().setSize(d);          //Purpose to resize specified browser window into specified size
	        
	        // Navigate to Gmail
	        driver.get("https://omayo.blogspot.com/");         // Whatever url u pass to the get command that will open in browser
	        
	       // driver.findElement(By.id("ta1"));
	       // driver.findElement(By.id("radio1")).click();       //Performing click operation
	        driver.findElement(By.linkText("compendiumdev")).click();
		
		
	}
 
}
