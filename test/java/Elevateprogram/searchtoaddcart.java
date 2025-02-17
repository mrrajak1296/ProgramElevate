package Elevateprogram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchtoaddcart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.cssSelector("input[placeholder='Search']"));
		ele.sendKeys("Samsung Galaxy Tab");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		driver.findElement(By.xpath("//div[@class='product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12']//button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='shopping cart']")).click();
		
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		
		
		
		

	}

}
