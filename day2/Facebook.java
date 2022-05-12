package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public Facebook() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().fullscreen();
		
		
		driver.findElement(By.id("email")).sendKeys("8610047537");
		driver.findElement(By.id("pass")).sendKeys("Rubika");
		driver.findElement(By.id("loginbutton")).click();
			
		
	

	}

}
