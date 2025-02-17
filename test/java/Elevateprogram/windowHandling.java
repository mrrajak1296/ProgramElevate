package Elevateprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandling {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		String win=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
		Thread.sleep(2000);
		driver.switchTo().window(win);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href=\"http://elementalselenium.com/\"]")).click();
		driver.switchTo().window(win);
		

	}

}
