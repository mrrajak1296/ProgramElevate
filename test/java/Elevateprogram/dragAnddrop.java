package Elevateprogram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAnddrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		Actions action =new Actions(driver);
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement drag = driver.findElement(By.xpath("//div[@id='column-a']"));
		WebElement drop =driver.findElement(By.xpath("//div[@id='column-b']"));
		action.dragAndDrop(drag, drop).perform();
		

	}

}
