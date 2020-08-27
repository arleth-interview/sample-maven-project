package dtci;

//import java.util.*;
//import java.net.*;
//import java.util.concurrent.*;
//import java.io.*;

/**
 * arleth-interview
 * DTCI-interview1
 */
public class PasswordValidator {
    int minLength;
    PasswordPattern[] validPasswordPatterns;

    /**
     * password validator
     * 
     * @param minLen min length of password
     * @param code array of character patterns and minimum count to validate
     */
    public PasswordValidator(int minLen, PasswordPattern[] patterns) {
        this. minLength = minLen;
        this.validPasswordPatterns = patterns;
    }

    /**
     * validate if the string passed matches the rules defined for valid passwords
     * 
     * @param password ascii string to be validated
     * @return true if password matches all requirements
     */
    public boolean validate(String password) {
        if (password != null) {
            throw new UnsupportedOperationException();
        }
        return false;
    }

    // getter setters, hashcode, equals, toString

    public int getMinLength() {
        return this.minLength;
    }

    public void setMinLength(int len) {
        this.minLength = len;
    }

    public String toString() {
        return "why hello there -";
    }
}