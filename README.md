# SauceDemo Website Login Tests

# Test Scenarios and Test Cases

    @AllEmpty
    Scenario Outline: Empty Username & Empty Password
      Given User at home page
      When Click login button
      Then Check "<error>" message about username
      Examples:
      |error                    |
      |Username is required     |
    @EmptyPassword
    Scenario Outline: Empty Password
      Given User at home page
      When Write "<username>" for username field
      When Click login button
      Then Check "<error>" message about password
      Examples:
      |username     ||error                   |
      |sdadasda     ||Password is required    |
    @EmptyUsername
    Scenario Outline: Empty Username
      Given User at home page
      When Write "<password>" for password field
      When Click login button
      Then Check "<error>" message about username
      Examples:
        |password     ||error                   |
        |rtrtpvtr     ||Username is required    |
    @FalseLogin
    Scenario Outline: Correct Username & False Password
      Given User at home page
      When Write correct "<username>" for username field
      When Write false "<password>" for password field
      When Click login button
      Then Check "<error>" message about correct username and false password
      Examples:
      |username             ||password         ||error                                                           |
      |standard_user        ||123456789        ||Username and password do not match any user in this service     |
    @FalseLogin
    Scenario Outline: Correct Password & False Username
      Given User at home page
      When Write false "<username>" for username field
      When Write correct "<password>" for password field
      When Click login button
      Then Check "<error>" message about correct username and false password
      Examples:
        |username            ||password        ||error                                                           |
        |standard_user55     ||secret_sauce    ||Username and password do not match any user in this service     |
    @SuccessLogin
    Scenario Outline: Correct Password & Correct Username
      Given User at home page
      When Write correct "<username>" for username field
      When Write correct "<password>" for password field
      When Click login button
      Then Check the url to understand success login
      Examples:
        |username            ||password        |
        |standard_user       ||secret_sauce    |
        

## Used Technologies

Selenium WebDriver, Cucumber BDD, TestNG

  
## Demo
![saucedemo](https://github.com/aliturkmen4/SauceTest/assets/84051961/bcc417ec-0b9f-43fa-a81e-1bec30ba8fa7)
**Yapılan Login Testlerinin Demosu**
