package Instructions;

public class writingtestcases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Please take note that you are dealing with a functionality
		/*Writing test scenarios and cases for Selenium functional test cases involves a structured approach to ensure clarity and coverage of the application being tested. Here's a detailed guide to writing test scenarios and test cases for the Certificate of Deposit Calculator page, as mentioned earlier:

		1. Understand the Requirements
		Before writing test cases, gather all the requirements for the functionality you are testing. For the Certificate of Deposit Calculator, the requirements might include:

		Fields for input like deposit amount, term, interest rate, etc.
		Correct calculations for maturity value.
		Error handling for invalid inputs.
		
		NOTES
		Verify input fields	- if they only accept numerical values. Will i get an error message if i dont input numerical values? Will I get an error message if I leave them empty?									
        Verify Cerificate of deposit amount	- come up with table of data								
        During the edge test case step, first get the cd value before inputing zero. Then compare it with the value you will get after inputing zero 
		Create two files of data, test data file and negative test data file	
		Use ECP test design technique
		Create a new package for each test scenario and a new class for each test case			
	    Create a properties file to hold the url of the webpage
	    Why Not Use the Same Website for Expected Results?								
		Circular Dependency: If there is an issue or bug in the website's calculation logic, it will affect both your test data and the results. This makes it impossible to identify the error.								
		Lack of Validation: Using the same system to produce both the actual and expected results doesn't validate whether the system works correctly; it only shows consistency.								
		Add new test data file to eclipse*/		
	}

}
