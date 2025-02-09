package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Poomani");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("M");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8903390209");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("P00mani@2025");
		
		WebElement dobDDdropdown = driver.findElement(By.xpath("//select[@id='day']"));
		Select dobDD = new Select(dobDDdropdown);
		dobDD.selectByValue("8");
		
		WebElement dobMMMdropdown = driver.findElement(By.xpath("//select[@id='month']"));
		Select dobMMM = new Select(dobMMMdropdown);
		dobMMM.selectByVisibleText("Mar");
		
		WebElement dobYYYYdropdown = driver.findElement(By.xpath("//select[@id='year']"));
		Select dobYYYY = new Select(dobYYYYdropdown);
		dobYYYY.selectByValue("1966");
		
		driver.findElement(By.xpath("//input[@id='sex'][1]")).click();
		
		driver.close();

	}

}
