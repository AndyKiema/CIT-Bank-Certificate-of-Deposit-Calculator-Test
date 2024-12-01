# CIT-Bank-Certificate-of-Deposit-Calculator-Test

## Overview
This project tests the functionality of the **CIT Bank Certificate of Deposit (CD) Calculator** to ensure it accurately calculates the final amount based on user inputs.

## Features Tested
- Calculation of final amount based on:
  - Principal amount
  - Duration in months
  - Interest rate
  - Compounding frequency (Daily, Monthly, Quarterly, Semi-Annually and Annually)
- Input validation for:
  - Negative and zero values for principal, monthly period and interest rate
  - Non-numeric data(Alphabetic and special characters)

## Bug Identified
- **Issue with Semi-Annual Frequency**:
  The calculator displays an incorrect amount for semi-annual compounding. This issue has been logged for further investigation and resolution.

## Technologies Used
- **Selenium with Java** for test script development.

## How to Run Tests
1. **Clone the Repository:**
   ```bash
   git clone https://github.com/AndyKiema/CIT-Bank-Certificate-of-Deposit-Calculator-Test.git
   ```
2. **Navigate to the Project Directory:**
   ```bash
   cd CIT-Bank-Certificate-of-Deposit-Calculator-Test
   ```
3. **Run the Tests:**
   - If automated tests are included, use the provided test runner (e.g., JUnit, TestNG, etc.).
   - For manual tests, execute the steps detailed in the `TestCase_Documentation` file.

## Project Structure
- **/test-cases:** Contains detailed test cases and expected outcomes.
- **/results:** Stores test execution results and identified bugs.
- **README.md:** Documentation for the project.

## Known Bugs
| Bug ID | Description                               | Status       |
|--------|-------------------------------------------|--------------|
| #001   | Incorrect amount calculation for semi-annual frequency | Open         |

## Contributing
Contributions to enhance testing coverage or fix identified issues are welcome. To contribute:
1. Fork the repository.
2. Create a new branch for your feature or fix.
3. Submit a pull request with a clear description of the changes.

## License
This project is licensed under the MIT License. See the `LICENSE` file for more details.


