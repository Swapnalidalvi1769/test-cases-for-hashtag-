package hashtag2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Contact_us_page_TC003_1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co=new ChromeOptions();
 		co.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
 		co.addArguments("start-maximized");
 		WebDriver driver=new ChromeDriver(co);
 		
 		//TEST CASE TC003
 		//to open the link
 		driver.navigate().to("https://www.hashtag-ca.com/careers/apply?jobCode=QAE001");
 		
 		driver.findElement(By.xpath("//button[@class='speak-btn btn-header-2 btn-white btn btn-outline-success my-2 my-sm-0']")).click();
 		Thread.sleep(2000);
 		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,1200)");
		
		driver.findElement(By.name("firstname")).sendKeys("swapnali");
	    driver.findElement(By.name("secondname")).sendKeys("dalvi");
	    driver.findElement(By.name("email")).sendKeys("swapnalid121996@gmail.com");
	    driver.findElement(By.xpath("//input[@class=' form-control']")).sendKeys("9595925719");
	    driver.findElement(By.name("message")).sendKeys("hguygd j,haidhau hjdsadgaysgd hbausydgyausgd hgdasyudgayusdguay");
	    driver.findElement(By.name("//button[@type='submit']")).click();
	    Thread.sleep(2000);
 		
 		driver.close();

	}

}
