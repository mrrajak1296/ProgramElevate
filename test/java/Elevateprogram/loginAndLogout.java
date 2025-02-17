package Elevateprogram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginAndLogout {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Login 
		driver.findElement(By.cssSelector("[name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.cssSelector("[name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
		
		//Logout
		
		driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]")).click();
		driver.findElement(By.xpath("(//a[@class=\"oxd-userdropdown-link\"])[4]")).click();
		

	}

}
