package hashtag;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Careers_page_TC001_6 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		co.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(co);
		
		//TEST CASE TC001-(1)
		//to open the link
		driver.navigate().to("https://www.hashtag-ca.com/careers/apply?jobCode=QAE001");
		Thread.sleep(2000);
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.name("name")).sendKeys("swapnali gajanan dalvi");
	    driver.findElement(By.name("email")).sendKeys("swapnalid121996@gmail.com");
	    driver.findElement(By.name("phone")).sendKeys("9595979789090");
	    driver.findElement(By.xpath("//input[@type='file']"));
	    driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("as a tester I'm respoansible for test case design,execution and defect reporting on jira");
	    driver.findElement(By.xpath("//button[@class='btn form-button font-12 font-bold']")).click();
	    Thread.sleep(2000);
		driver.close();

	}

}
