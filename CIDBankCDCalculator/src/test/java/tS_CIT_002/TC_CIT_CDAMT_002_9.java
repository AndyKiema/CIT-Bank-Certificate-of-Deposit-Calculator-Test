package tS_CIT_002;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_CIT_CDAMT_002_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver cd= new ChromeDriver();
	    cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    cd.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
	    cd.manage().window().maximize();
	       

	    WebElement initialamount=cd.findElement(By.xpath("//*[@id=\"mat-input-0\"]"));
	    initialamount.clear();
	    initialamount.sendKeys("-49300");
	        
	    WebElement cdlength= cd.findElement(By.xpath("//*[@id=\"mat-input-1\"]"));
	    cdlength.clear();
	    cdlength.sendKeys("-57");
	       
	    WebElement intrate= cd.findElement(By.xpath("//*[@id=\"mat-input-2\"]"));
	    intrate.clear();
	    intrate.sendKeys("-100");
	        
	    cd.findElement(By.xpath("//*[@id=\"mat-select-value-1\"]")).click();
	    cd.findElement(By.xpath("//*[@id=\"mat-option-4\"]/span")).click();
	    cd.findElement(By.xpath("//*[@id=\"CIT-chart-submit\"]/div")).click();
	        
	    String reflectedcdamt=cd.findElement(By.xpath("//*[@id=\"displayTotalValue\"]")).getText();
	    String expectedamt="$1,236,474.18";
	    String correctamt="$1,326,598.18";
	    System.out.println(reflectedcdamt);
	    System.out.println(expectedamt);
	    if(reflectedcdamt.equals(expectedamt)) {
		  System.out.println("Test passed");
		}
		else if(reflectedcdamt.equals(correctamt)){
		  System.out.println("Test failed, but correct amount displayed");
		}
		else {
		  System.out.println("Test failed");
		}
	}

}
