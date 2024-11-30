package tS_CIT_002;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC_CIT_CDAMT_001 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
        ChromeDriver cd= new ChromeDriver();
        cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        cd.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
        cd.manage().window().maximize();
        String tfilepath=System.getProperty("user.dir")+ "\\Data\\Testdata.xlsx";
        String sheet="Sheet1";
        int rows=Testingutilityfile.getRowCount(tfilepath, sheet);
        for(int i=1; i<=rows; i++) {
        	String depamt=Testingutilityfile.getCellData(tfilepath,sheet,i,0);
        	String monthlength=Testingutilityfile.getCellData(tfilepath,sheet,i,1);
        	String intrate=Testingutilityfile.getCellData(tfilepath, sheet, i, 2);
        	String compfreq= Testingutilityfile.getCellData(tfilepath, sheet, i, 5);
        	String totamt= Testingutilityfile.getCellData(tfilepath, sheet, i, 6);
        	
        	//System.out.println(3200);
        	WebElement initial=cd.findElement(By.xpath("//*[@id=\"mat-input-0\"]"));
        	initial.clear();
        	initial.sendKeys(depamt.trim());
        	
        	WebElement length=cd.findElement(By.xpath("//*[@id=\"mat-input-1\"]"));
        	length.clear();
        	length.sendKeys(monthlength.trim());
        	
        	WebElement interest=cd.findElement(By.xpath("//*[@id=\"mat-input-2\"]"));
        	interest.clear();
        	interest.sendKeys(intrate.trim());
        	
        	cd.findElement(By.xpath("//*[@id=\"lEcE7Em2UkSqUmHuYCEnK\"]/div/div/div/div/app-cd-calculator/div/div[1]/form/div/div[4]/mat-form-field/div/div[1]/div")).click();
        	 cd.findElement(By.xpath("//*[@id=\"mat-option-"+compfreq.trim()+"\"]/span")).click();
        	cd.findElement(By.xpath("//*[@id=\"CIT-chart-submit\"]/div")).click();
        	
        /* WebElement reflectedamt=cd.findElement(By.xpath("//*[@id=\"displayTotalValue\"]"));
         js.executeScript("arguments[0].scrollIntoView(true);", reflectedamt);
       	  if(reflectedamt.toString().equals(totamt)) {
       		  System.out.println("Test passed");
       		  Testingutilityfile.setCellData(tfilepath, sheet, i, 7,"Passed");
       	  }
       	  else {
       		  System.out.println("Test failed");
       		  Testingutilityfile.setCellData(tfilepath, sheet, i, 7,"Failed");
       	  }*/

        }
	}

}
