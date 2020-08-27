package dtci;

import java.util.regex.Pattern;

public class Main {
    public static void main(String...args) {
        /*
         create a password validator, overall length must be greater tha 8
         at least one number
         at least one ascii character
         at least one "specialChar" of !@#$%^&*()-_
         other chars rejected
        */
        PasswordValidator app = PasswordValidatorBuilder.builder(8, p -> {
            try { Pattern.compile(p.pattern); } catch (Exception ex) {
                throw new IllegalArgumentException(p.pattern + " is not a regular expression");
            }
            return p;
        }).
            pattern(new PasswordPattern("[0-9]", 1, "at least one numer")). 
            pattern(new PasswordPattern("[a-zA-Z]", 2, "at least 2 ascii characters")).
            pattern(new PasswordPattern("[!@#$%^&*-_()]", 1, "at least one char of !@#$%^&*()-_")).
        build();

        if (args == null || args.length ==0) {
            System.out.println("valid password " + app.validate("why_hello-there1"));
            System.out.println("invalid password " + app.validate("why hello there!"));
        } else {
            System.out.println("" + app.validate(args[0]));
        }
    }


}