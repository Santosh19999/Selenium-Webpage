package Selenium_Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Web_page {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().window().maximize();
		WebElement we=driver.findElement(By.xpath("//h1[@class='display-6']"));
		 String first_name= we.getText();
		    System.out.println(first_name);
		    if (first_name.equals("web form"))
		    {
		        System.out.println("Test case pass");
			}
		    else {
		    	System.out.println("Test case Fail");
		    }
		    
		    
		    driver.findElement(By.id("my-text-id")).sendKeys("Hello");
		    driver.findElement(By.name("my-password")).sendKeys("Hellow123");
		    
		    driver.findElement(By.linkText("Return to index")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.linkText("click_rtl.html")).click();
		    Thread.sleep(3000);
		    driver.navigate().back();
		    Thread.sleep(3000);
		    driver.navigate().back();
		    
		   // WebElement we1=driver.findElement(By.name("my-select"));
		    Select se1=new Select(driver.findElement(By.name("my-select")));
			se1.selectByVisibleText("Two");
			driver.findElement(By.name("my-file")).sendKeys("C:\\Users\\santo\\Desktop");
			driver.findElement(By.id("my-check-1")).click();
			driver.findElement(By.id("my-radio-1")).click();
			driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();

	}

}
