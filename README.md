# CIT-Bank-Certificate-of-Deposit-Calculator-Test

## Overview
This project tests the functionality of the **CIT Bank Certificate of Deposit (CD) Calculator** to ensure it accurately calculates the final amount based on user inputs.
The calculator can be found here: https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator

## Features Tested
- Calculation of final amount based on:
  - Principal amount
  - Duration in months
  - Interest rate
  - Compounding frequency (Daily, Monthly, Quarterly, Semi-Annually and Annually)
- Input validation for:
  - Negative and zero values for principal, monthly period and interest rate
  - Non-numeric data(Alphabetic and special characters)

## Formula Used 

The calculator test relies on the following formula to calculate the maturity amount:

A = P * (1 + (r / n)) ^ (n * t/12)

**Where:**
- **A** = The maturity amount (final amount after interest)
- **P** = Initial deposit amount (principal)
- **r** = Annual interest rate
- **n** = Number of compounding periods per year
- **t** = Time the money is deposited for, in months

**The number of compounding periods(n) for each compounding frequency is as follows:**
- **Daily** = 365
- **Monthly** = 12
- **Quarterly** = 4
- **Semi-Annually** = 2
- **Annually** = 1


## Bug Identified
- **Issue with Semi-Annual Frequency**:
  The calculator displays an incorrect amount when compounding semi-annually. This issue has been logged for further investigation.

## Technologies Used
- **Selenium with Java** for test script development.
- **Eclipse IDE** programming software.

## How to Run Tests
1. **Clone the Repository:**
   ```bash
   git clone https://github.com/AndyKiema/CIT-Bank-Certificate-of-Deposit-Calculator-Test.git
   ```
2. **Navigate to the Project Directory:**
   ```bash
   cd C:\Projectpath
   ```
3. **Run the Tests**

## Contributing
Contributions to enhance testing coverage or fix identified issues are welcome. To contribute:
1. Fork the repository.
2. Create a new branch for your feature or fix.
3. Submit a pull request with a clear description of the changes.

## License
This project is licensed under the MIT License. See the `LICENSE` file for more details.


