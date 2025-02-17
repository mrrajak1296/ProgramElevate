package Elevateprogram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\PC\\Desktop\\abc\\Unit 4  Asyncs\\New Text Document.txt");
		driver.findElement(By.xpath("//input[@id='file-submit']")).click();
		System.out.println("File upload");
		Thread.sleep(3000);
		
		driver.get("https://the-internet.herokuapp.com/download");
		
		driver.findElement(By.xpath("//a[normalize-space()='Fee Receipt.pdf']")).click();
		System.out.println("File downloads");

	}

}
