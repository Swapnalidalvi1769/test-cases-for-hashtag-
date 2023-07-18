package hashtag1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Careers_page_TC002 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co=new ChromeOptions();
 		co.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
 		co.addArguments("start-maximized");
 		WebDriver driver=new ChromeDriver(co);
 		
 		//TEST CASE TC002
 		//to open the link
 		driver.navigate().to("https://www.hashtag-ca.com/careers/apply?jobCode=QAE001");
 		
 		driver.findElement(By.xpath("//button[@class='speak-btn btn-header-2 btn-white btn btn-outline-success my-2 my-sm-0']")).click();
 		Thread.sleep(2000);
 		driver.close();

	}

}
