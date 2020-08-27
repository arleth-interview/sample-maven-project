package dtci;

public class Main {
    public static void main(String...args) {
        // create a password validator, overall length must be greater tha 8
        // at least one number
        // at least one ascii character
        // at least one "specialChar" of !@#$%^&*()-_
        // other chars rejected
        PasswordValidator app = new PasswordValidator(8, new PasswordPattern[] {
         new PasswordPattern("number", 1, "at least one numer"), 
         new PasswordPattern("ascii", 2, "at least 2 ascii characters"),
         new PasswordPattern("specialChar", 1, "at least one char of !@#$%^&*()-_")
        });

        System.out.println("valid password " + app.validate("why_hello-there1"));
        System.out.println("invalid password " + app.validate("why hello there!"));
    }


}