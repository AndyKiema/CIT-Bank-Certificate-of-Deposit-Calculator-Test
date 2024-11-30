package tS_CIT_002;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.chrome.ChromeDriver;

public class TC_CIT_CDAMT_001 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
        ChromeDriver cd= new ChromeDriver();
        cd.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
        String testfilepath="System.getProperty(\"user.dir\")+\"\\\\Data\\\\Testdata.xlsx\")";
        String sheet="Sheet1";
        
	}

}
