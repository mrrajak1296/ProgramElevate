package Elevateprogram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class createdaccount {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.cssSelector("[name=\"firstname\"]")).sendKeys("Anil");
		driver.findElement(By.cssSelector("[name=\"lastname\"]")).sendKeys("Rajak");
		
		WebElement day = driver.findElement(By.id("day"));
		Select select = new Select(day);
		select.selectByVisibleText("11");
		
		WebElement month = driver.findElement(By.id("month"));
		Select select1 = new Select(month);
		
		select1.selectByVisibleText("Mar");
		
		WebElement year = driver.findElement(By.id("year"));
		Select select2 = new Select(year);
		select2.selectByValue("1998");
		
		
		driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		
		driver.findElement(By.cssSelector("[name=\"reg_email__\"]")).sendKeys("abcd@gmail.com");
		
		driver.findElement(By.cssSelector("#password_step_input")).sendKeys("abc@12345");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[1]")).click();
		

	}

}
