# SauceDemo-Login
**Test automation framework for testing the login functionality using Cucumber, selenium, maven, and testng**

### Test casses covered in the framwork

|ID|Description|Steps|Expected results| 
|:--------:|:--------:|:--------:|:--------:| 
|Login_001|Login with a valid user|Login using any of the provided users in the login page|user should be redirected to the inventory page| 
|Login_002|Login with a lockedout user|Login using the user "locked_out_user" and valid password|an error message should appear stating "this user has been locked out"| 
|Login_003|Login without sending any credentials|click the login button with both username and password fields empty|an error message should appear stating "Username is required"| 
|Login_004|Login with invalid username|click the login button after entering an invalid username with a valid password|an error message should appear stating "Username and password do not match any user in this service"| 
|Login_005|Login with invalid password|click the login button after entering a valid username and an invalid password|an error message should appear stating "Username and password do not match any user in this service"| 
|Login_006|Login without sending password|click the login button after entering a valid username and leaving the password field empty|an error message should appear stating "Password is required"| 
|Login_007|Login without sending username|click the login button after entering a valid password and leaving the username field empty|an error message should appear stating "Username is required"|

for more details about the testcases and the used test data check the feature file "login.feature"
