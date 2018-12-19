import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	 
		System.setProperty("webdriver.chrome.driver", "E:/Natanael/tsi/3periodo/java/eclipse/driver/chromedriver.exe");
        WebDriver chrome = new ChromeDriver();
  
        	chrome.manage().window().maximize();
        	String url = "https://accounts.google.com/ServiceLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false&flowName=GlifWebSignIn&flowEntry=AddSession";
        	chrome.get(url);
        	chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
        	WebElement email_phone = chrome.findElement(By.xpath("//input[@id='identifierId']"));
        	email_phone.sendKeys("myemail@gmail.com");
        	chrome.findElement(By.id("identifierNext")).click();
        	WebElement password = chrome.findElement(By.xpath("//input[@name='password']"));
        	WebDriverWait wait = new WebDriverWait(chrome, 20);
        	wait.until(ExpectedConditions.elementToBeClickable(password));
        	password.sendKeys("mysenh433");
        	chrome.findElement(By.id("passwordNext")).click();
 
             
	}

}



