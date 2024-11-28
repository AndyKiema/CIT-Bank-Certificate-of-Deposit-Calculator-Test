package tS_CIT_001;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_CIT_Input_002 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeDriver cd= new ChromeDriver();
	    cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    FileInputStream filepath=new FileInputStream(System.getProperty("user.dir")+"\\Data\\Properties");
	    Properties prp= new Properties();
	    prp.load(filepath);
	    cd.get(prp.getProperty("url"));
	    cd.manage().window().maximize();
	    WebElement secondinput=cd.findElement(By.xpath("//*[@id=\"mat-input-1\"]"));
	    secondinput.clear();
	    secondinput.sendKeys("abcD&@");
	    cd.findElement(By.xpath("//*[@id=\"CIT-chart-submit\"]/div")).click();
	}

}
