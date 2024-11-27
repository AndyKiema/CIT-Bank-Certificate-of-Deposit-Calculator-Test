package tS_CIT_001;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_CIT_Input_003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChromeDriver cd= new ChromeDriver();
	     cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     cd.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
	     cd.manage().window().maximize();
	     WebElement thirdinput=cd.findElement(By.xpath("//*[@id=\"mat-input-2\"]"));
	     thirdinput.clear();
	     thirdinput.sendKeys("abcD&@");
	     cd.findElement(By.xpath("//*[@id=\"CIT-chart-submit\"]/div")).click();
	}

}
