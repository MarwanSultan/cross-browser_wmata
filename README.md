
### 5. **Installation & Setup**
- **Prerequisites:**
  - Java 11 or later  
  - Maven installed  
  - Chrome, Firefox, and Microsoft Edge installed  
  - Corresponding browser drivers available in system `PATH` or project directory

- **Steps to Set Up the Project:**
  1. Clone the repository:
     ```sh
     git clone https://github.com/MarwanSultan/cross-browser_wmata.git
     ```
  2. Navigate to the project directory:
     ```sh
     cd cross-browser_wmata
     ```
  3. Install dependencies:
     ```sh
     mvn clean install
     ```
  4. Run the tests:
     ```sh
     mvn test
     ```

### 6. **How to Use**
- Modify `testng.xml` to include or exclude specific browser tests.  
- Run tests across different browsers by adjusting the configuration in the base class or by passing system properties.  
- Results will be generated in the `test-output` folder by default.  
- You can extend reporting capabilities using tools like Extent Reports or Allure.

### 7. **Contributing**
- Fork the repository  
- Create a feature branch (`feature-branch-name`)  
- Commit your changes and push them  
- Create a Pull Request  

### 8. **License**
- This project is licensed under the **MIT License**

### 9. **Author**
- **Marwan Sultan**  
- LinkedIn: [linkedin.com/in/marwansultan](https://www.linkedin.com/in/marwansultan/)  
- Email: marwan.sultan@gmail.com
