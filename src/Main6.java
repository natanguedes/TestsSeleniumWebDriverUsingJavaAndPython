
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main6 {

	public static void main(String[] args) {
		// Create a new instance of the FireFox driver

		System.setProperty("webdriver.chrome.driver", "E:/Natanael/tsi/3periodo/java/eclipse/driver/chromedriver.exe");
        WebDriver chrome = new ChromeDriver();
  		
		// Put an Implicit wait, 
//		chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Launch the URL
		chrome.get("http://penta.ufrgs.br/edu/forms/tut212.html");
		
		// Step 3 : Select the deselected Radio button (female) for category Sex (Use IsSelected method)
		// Storing all the elements under category 'Sex' in the list of WebLements	
		List<WebElement> rdBtn_esporte = chrome.findElements(By.name("esporte")); //procura pelo nome
		
		// Create a boolean variable which will hold the value (True/False)
		boolean bValue = false;
		
		// This statement will return True, in case of first Radio button is selected
		bValue = rdBtn_esporte.get(0).isSelected();
		
		// This will check that if the bValue is True means if the first radio button is selected
		if(bValue != true){
			// This will select Second radio button, if the first radio button is selected by default
			rdBtn_esporte.get(3).click(); //futebol
		}else{
			// If the first radio button is not selected by default, the first will be selected
			rdBtn_esporte.get(0).click();
		}
		
		
		// Step 3 : Select the deselected Radio button (female) for category Sex (Use IsSelected method)
		// Storing all the elements under category 'Sex' in the list of WebLements	
		List<WebElement> rdBtn_radio = chrome.findElements(By.name("sexo")); //procura pelo nome
		
		// Create a boolean variable which will hold the value (True/False)
		boolean radioValue = false;
		
		// This statement will return True, in case of first Radio button is selected
		radioValue = rdBtn_radio.get(1).isSelected();
		rdBtn_radio.get(1).click();
	/*	
		// This will check that if the bValue is True means if the first radio button is selected
		if(radioValue != true){
			// This will select Second radio button, if the first radio button is selected by default
			rdBtn_radio.get(3).click(); //futebol
		}else{
			// If the first radio button is not selected by default, the first will be selected
			rdBtn_radio.get(0).click();
		}
		*/
	}
}