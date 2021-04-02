package coreJava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Automatiopn {

	public static void main(String[] args) {
		WebDriver driver= new  ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("gopi");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("ginni");
		WebElement addElement= driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
		addElement.sendKeys("2-133");
		Actions builder = new Actions(driver);        
		builder.sendKeys(Keys.ENTER);
		Actions actions= new Actions(driver);
		WebElement dstElement=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
		WebElement sorcElemente = driver.findElement(By.linkText("WebTable"));
		actions.clickAndHold(sorcElemente).pause(4000).moveToElement(dstElement).pause(4000);
		actions.release();
		actions.perform();
	}

}
