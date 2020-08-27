# sample jdk 14, maven built app

Welcome!

### Goal

Define a simple password validator in Java. 

Feel free to use any class provided in the standard jdk 14 libs. I don't want to focus on syntax and put excessive pressure on getting the app to compile. 

The intent of this little exercise is to use this project as a way to focus our time. Create an avenue to discuss approaches to coding and even write a little code while we're at it ;)

### classes provided

#### ./main/java/dtci/PasswordPattern.java 

defines a simple pojo and should not define implementations of valid password patterns, is how values should be parsed and used by the Validator. 

#### ./main/java/dtci/PasswordValidator.java

class to be modified to implement password validation.

#### ./main/java/dtci/Main.java 

demonstrate and execute the validator.  

#### ./test/java/dtci/PasswordValidatorTest.java 

Document and define all tests for the app here. It is not necessary to implement the tests.     

As time permits, I'd like to have discussion on how to modify to approach, redefine the pattern, PasswordPattern values and min counts.
