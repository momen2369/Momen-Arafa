# SauceDemo-Login
- Test automation framework for testing the login functionality using Cucumber, selenium, maven, testng, with POM design pattern.
- The selenium version used is <4.9.1> with the selenium web driver manger integrated to it, so there will be no need to setup any kind of driver and the framwork will run according to the local web driver version.
- The framework support reporting, a cucumber report is generated after running tests from the test runner class.

## Demo
[Demo Video](https://drive.google.com/file/d/1BlJd6uyd2KlZ00-MEx2FvBM28_cFJPfo/view?usp=sharing)


## Test casses covered in the framwork

|ID|Description|Steps|Expected results| 
|:--------:|:--------:|:--------:|:--------:| 
|Login_001|Login with a valid user|Login using any of the provided users in the login page|user should be redirected to the inventory page| 
|Login_002|Login with a locked out user|Login using the user "locked_out_user" and valid password|an error message should appear stating "this user has been locked out"| 
|Login_003|Login without sending any credentials|click the login button with both username and password fields empty|an error message should appear stating "Username is required"| 
|Login_004|Login with invalid username|click the login button after entering an invalid username with a valid password|an error message should appear stating "Username and password do not match any user in this service"| 
|Login_005|Login with invalid password|click the login button after entering a valid username and an invalid password|an error message should appear stating "Username and password do not match any user in this service"| 
|Login_006|Login without sending password|click the login button after entering a valid username and leaving the password field empty|an error message should appear stating "Password is required"| 
|Login_007|Login without sending username|click the login button after entering a valid password and leaving the username field empty|an error message should appear stating "Username is required"|

for more details about the test cases and the used test data check the feature file "login.feature".


## Steps to run
1. Clone the repository to your local machine.
2. Open your IDE and import the cloned project into your workspace.
3. run using either the feature file directly or using the test runner class.

   


