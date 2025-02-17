package Elevateprogram;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserRegistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/scholarship-application-form/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement firstname = driver.findElement(By.id("billing_first_name"));
		firstname.sendKeys("Anil");
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("Rajak");
		
		WebElement email = driver.findElement(By.cssSelector("[name=\"user_email\"]"));
		email.sendKeys("abcd@gmail.com");
		
		WebElement pass = driver.findElement(By.cssSelector("[name=\"user_pass\"]"));
		pass.sendKeys("abcd@12345");
		
		driver.findElement(By.xpath("//input[@id=\"phone_1665649999\"]")).sendKeys("1234567890");
		
		driver.findElement(By.xpath("//input[@id=\"input_box_1665650019\"]")).sendKeys("QA Team");
		
		driver.findElement(By.xpath("//input[@id=\"input_box_1665650800\"]")).sendKeys("72%");
		Thread.sleep(2000);
		
	    WebElement file= driver.findElement(By.xpath("//div[@id='ur_file_1665650758']"));
	   // file.click();
	    file.sendKeys("C:\\Users\\PC\\Desktop\\abc\\Unit 3\\ab.txt");
	    
	    driver.findElement(By.xpath("//input[@id='radio_1665650146_No']")).click();
	    driver.findElement(By.xpath("//input[@id='radio_1665650248677_No']")).click();

	    driver.findElement(By.xpath("//input[@id='radio_1665650336584_No']")).click();

	    driver.findElement(By.xpath("//input[@id='radio_1665650410019_No']")).click();
	    driver.findElement(By.xpath("//input[@id='radio_1665650493372_Yes']")).click();

	    driver.findElement(By.xpath("//input[@id='privacy_policy_1665650619']")).click();
	    driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
	    
	    driver.findElement(By.xpath("//div[@id='ur_file_1665650528']//div[@class='dz-message ']")).sendKeys("C:\\Users\\PC\\Documents\\New folder (2)\\New Text Document.txt");


	    


	}

}
