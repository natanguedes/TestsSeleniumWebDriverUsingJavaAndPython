import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	 
		System.setProperty("webdriver.chrome.driver", "/selenium/driver/chromedriver");
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://docs.google.com/forms/d/e/1FAIpQLSdv1qDnQxE0Or7JEOhOfL61b5BH-yAp_diYr8vUHWekN5_msg/viewform?vc=0&c=0&w=1");
        	WebElement formEmail = chrome.findElement(By.name("entry.1618569245")); //busca pelo name	
        	formEmail.sendKeys("ngsneto@gmail.com");
        	WebElement whatsapp = chrome.findElement(By.name("entry.67561851"));
        	whatsapp.sendKeys("83647845441");
        	WebElement sobre = chrome.findElement(By.name("entry.2043112845"));
        	sobre.sendKeys("sou natanael");
        	Select formRadio = new Select(chrome.findElement(By.name("/html/body[@class='freebirdLightBackground']/div[@class='freebirdFormviewerViewFormContentWrapper']/div[@class='freebirdFormviewerViewCenteredContent']/form[@id='mG61Hd']/div[@class='freebirdFormviewerViewFormCard exportFormCard']/div[@class='freebirdFormviewerViewFormContent ']/div[@class='freebirdFormviewerViewItemList']/div[@class='freebirdFormviewerViewItemsItemItem'][1]")));
          
	
	}

}



