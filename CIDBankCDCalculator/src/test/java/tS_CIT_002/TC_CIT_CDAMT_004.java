package tS_CIT_002;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_CIT_CDAMT_004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver cd= new ChromeDriver();
	    cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    cd.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
	    cd.manage().window().maximize();
	    String originalcd=cd.findElement(By.xpath("//*[@id=\"displayTotalValue\"]")).getText();
	    WebElement secondinput=cd.findElement(By.xpath("//*[@id=\"mat-input-1\"]"));
	    secondinput.clear();
	    secondinput.sendKeys("0");
	    cd.findElement(By.xpath("//*[@id=\"CIT-chart-submit\"]/div")).click();
	    String newcd=cd.findElement(By.xpath("//*[@id=\"displayTotalValue\"]")).getText();
	    System.out.println(originalcd);
	    System.out.println(newcd);
	    if(originalcd.equals(newcd)) {
	      System.out.println("Test passed");
	    }
	    else {
	    	 System.out.println("Test failed");
	    }
	}

}
