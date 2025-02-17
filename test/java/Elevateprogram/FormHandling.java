package Elevateprogram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormHandling {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("India");
		
		WebElement ele= driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		
		Select select = new Select(ele);
		select.selectByVisibleText("Option2");
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		

	}

}
