package tS_CIT_002;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_CIT_CDAMT_002_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver cd= new ChromeDriver();
	    cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    cd.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
	    cd.manage().window().maximize();
	       

	    WebElement initialamount=cd.findElement(By.xpath("//*[@id=\"mat-input-0\"]"));
	    initialamount.clear();
	    initialamount.sendKeys("-20400");
	        
	    WebElement cdlength= cd.findElement(By.xpath("//*[@id=\"mat-input-1\"]"));
	    cdlength.clear();
	    cdlength.sendKeys("-28");
	       
	    WebElement intrate= cd.findElement(By.xpath("//*[@id=\"mat-input-2\"]"));
	    intrate.clear();
	    intrate.sendKeys("-45");
	        
	    cd.findElement(By.xpath("//*[@id=\"mat-select-value-1\"]")).click();
	    cd.findElement(By.xpath("//*[@id=\"mat-option-4\"]/span")).click();
	    cd.findElement(By.xpath("//*[@id=\"CIT-chart-submit\"]/div")).click();
	        
	    String reflectedcdamt=cd.findElement(By.xpath("//*[@id=\"displayTotalValue\"]")).getText();
	    String expectedamt="$48,546.23";
	    System.out.println(reflectedcdamt);
	    System.out.println(expectedamt);
	    if(reflectedcdamt.equals(expectedamt)) {
	       System.out.println("Test passed");
	    }
	    else {
	        System.out.println("Test failed");
	    }
	}

}
