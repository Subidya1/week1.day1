package week2.day2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Subidya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pradhan");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("subidya.s.pradhan@gmail.com");
		driver.findElement(By.xpath("//input[@id='reg_passwd__']")).sendKeys("subidya_123");
		
        WebElement DateDropdown = driver.findElement(By.xpath("//select[@id='birthday_day']"));
		Select date = new Select(DateDropdown);
		date.selectByValue("05");
		
		
		WebElement MonthDropdown = driver.findElement(By.xpath("//select[@id='birthday_month']"));
		Select month =  new Select(MonthDropdown);
		month.selectByValue("11");
		
		WebElement YearDropdown = driver.findElement(By.xpath("//select[@id='birthday_year']"));
		Select year = new Select(YearDropdown);
		year.selectByValue("1984");
		
		driver.findElement(By.xpath("//label[@for='Female']")).click();
		
		driver.close();
	}

}
