import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Globo {

	private static boolean notBValue;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	 
		System.setProperty("webdriver.chrome.driver", "E:/Natanael/tsi/3periodo/java/eclipse/driver/chromedriver.exe");
        WebDriver chrome = new ChromeDriver();
  
        	chrome.manage().window().maximize();
        	String url = "https://www.globo.com";
        	chrome.get(url);
        	chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
          	WebElement nome = chrome.findElement(By.name("q"));
        	nome.sendKeys("esporte");
               	chrome.findElement(By.cssSelector("#glb-topo > div > div > div.home-header__actions > div.home-header__search > form > button")).click();
            chrome.findElement(By.cssSelector("#content > div > div > ul > li.widget.widget--card.widget--navigational > div > a")).click();
      // String a =  chrome.getTitle();
        //	System.out.println(a);*/
        	
	}
	
}



