package Elevateprogram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo {
WebDriver driver = new ChromeDriver();
	

	@BeforeClass
	public void openApp() throws InterruptedException {
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(priority = 1)
	public void firstnameandLastname() throws InterruptedException {
		//user name
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Anil");
		
		Thread.sleep(2000);
		//password
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Rakak");
		//login button
		driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("QA Team");
			
	}
	@Test(priority = 2)
	public void emailphonegender() {
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("anil12@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		
	}
	@Test(priority = 3)
	
	public void hobbesect() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='msdd']")).sendKeys("Hindi");
		driver.findElement(By.xpath("//select[@id='Skills']"));
	}
	
	@Test(priority=4)
	public void skillect() {
	WebElement drop =	driver.findElement(By.xpath("//select[@id='Skills']"));

		Select select =new Select(drop);
		select.selectByVisibleText("Software");
		WebElement drop1 = driver.findElement(By.xpath("//select[@id='countries']"));
		Select coun = new Select(drop1);
		coun.selectByVisibleText("Select Country");
	}
	
	@Test(priority=5)
	public void country() {
	WebElement drop2 =	driver.findElement(By.xpath("//span[@role='combobox']"));

		Select select =new Select(drop2);
		select.selectByVisibleText("India");
		WebElement drop3 = driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select coun = new Select(drop3);
		
	}
		@Test(priority=6)
		public void dateofbrith() {
			WebElement drop3 = driver.findElement(By.xpath("//select[@id='yearbox']"));
			Select year = new Select(drop3);
		year.selectByVisibleText("1998");
		WebElement drop4 = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select month = new Select(drop4);
		month.selectByValue("March");
		WebElement drop5 = driver.findElement(By.xpath("//select[@id='daybox']"));
		Select date = new Select(drop5);
		date.selectByVisibleText("11");
	}
		
		@Test(priority=7)
		public void password() {
			driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("anil@#12");
			driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("anil@#12");

			
			
		}
		
		@Test(priority=8)
		public void file() {
			driver.findElement(By.xpath("//input[@id='imagesrc']")).sendKeys("C:\\Users\\PC\\Desktop\\abc\\Unit 4  Asyncs\\New Text Document.txt");
			
			
		}
		@Test(priority=9)
		public void button() {
			driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
			
		}	
		

}
