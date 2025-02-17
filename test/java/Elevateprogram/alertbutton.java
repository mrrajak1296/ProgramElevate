package Elevateprogram;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertbutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
		
		driver.findElement(By.xpath("//button[normalize-space()='click the button to display a confirm box']")).click();
		driver.switchTo().alert().accept();
		String ans = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(ans);
		
		
	
	
	}

}
