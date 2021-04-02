package coreJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddro {

	public static void main(String[] args) {
		
				System.setProperty("webdriver.chrome.driver", "C:/~/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				//driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
				// navigate to url
				driver.get("https:///chercher.tech/practice/drag-drop-example");
				//find the source element
				WebElement source = driver.findElement(By.xpath("//img"));
				WebElement target = driver.findElement(By.id("div2"));
				// Create an object for Actions class
				Actions act = new Actions(driver);
				// perform drag and drop
				act.dragAndDrop(source, target).perform();
			}
		

	}


