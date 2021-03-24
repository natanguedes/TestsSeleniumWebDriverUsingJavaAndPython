import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	 
		System.setProperty("webdriver.chrome.driver", "E:/Natanael/tsi/3periodo/java/eclipse/driver/chromedriver.exe");
        WebDriver chrome = new ChromeDriver();
     /*  // chrome.get("https://accounts.google.com/signin/v2/sl/pwd?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false&flowName=GlifWebSignIn&flowEntry=AddSession&cid=0&navigationDirection=forward");
        	WebElement formEmail = chrome.findElement(By.name("identifier")); //busca pelo name	
        	formEmail.sendKeys("ngsneto@gmail.com");
        	(formEmail).click();
        	WebDriver driver = new FirefoxDriver();*/
        	chrome.manage().window().maximize();
        	String url = "https://accounts.google.com/signin";
        	chrome.get(url);
        	chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
        	WebElement email_phone = chrome.findElement(By.xpath("//input[@id='identifierId']"));
        	email_phone.sendKeys("ngsneto@gmail.com");
        	chrome.findElement(By.id("identifierNext")).click();
        	WebElement password = chrome.findElement(By.xpath("//input[@name='password']"));
        	WebDriverWait wait = new WebDriverWait(chrome, 20);
        	wait.until(ExpectedConditions.elementToBeClickable(password));
        	password.sendKeys("mysenh433");
        	chrome.findElement(By.id("passwordNext")).click();
        	/*
        	?((
        	WebElement whatsapp = chrome.findElement(By.name("entry.67561851"));
        	whatsapp.sendKeys("83647845441");
        	WebElement sobre = chrome.findElement(By.name("entry.2043112845"));
        	sobre.sendKeys("sou natanael");
        	Select formRadio = new Select(chrome.findElement(By.id("//*[@id=\"mG61Hd\"]/div/div[2]/div[2]/div[4]/div[2]/div/content/div/label[3]/div/div[1]/div[3]/div")));
             ((WebElement) formRadio).click();    
*/
             
	}

}



