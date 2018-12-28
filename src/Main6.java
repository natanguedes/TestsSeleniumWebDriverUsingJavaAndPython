
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main6 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "E:/Natanael/tsi/3periodo/java/eclipse/driver/chromedriver.exe");
        WebDriver chrome = new ChromeDriver();
  		
        
		chrome.get("http://penta.ufrgs.br/edu/forms/tut212.html");
		
			
		List<WebElement> rdBtn_esporte = chrome.findElements(By.name("esporte")); //procura pelo nome
		
		
		boolean bValue = false;
		

		bValue = rdBtn_esporte.get(0).isSelected();
		

		if(bValue != true){
        rdBtn_esporte.get(3).click(); //futebol
		}else{
		
			rdBtn_esporte.get(0).click();
		}
		
		
		List<WebElement> rdBtn_radio = chrome.findElements(By.name("sexo")); //procura pelo nome
		
				boolean radioValue = false;
		
		
		radioValue = rdBtn_radio.get(1).isSelected();
		rdBtn_radio.get(1).click();
	
		
		
		List<WebElement> rdBtn_check = chrome.findElements(By.name("OPCAO")); //procura pelo nome
		
				boolean radioValue1 = false;
		
		
		radioValue1 = rdBtn_check.get(2).isSelected();
		rdBtn_check.get(2).click();
		
		
		WebElement oCheck  = chrome.findElement(By.cssSelector("input[type=\"submit\"]")); //Confere as respostas
		oCheck.click();
		
	}
}