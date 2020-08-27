package dtci;

import java.util.*;
//import java.net.*;
//import java.util.concurrent.*;
//import java.io.*;

/**
 * arleth-interview
 * DTCI-interview1
 */
public class PasswordValidator {
    int minLength;
    List<PasswordPattern> validPasswordPatterns = new ArrayList<>();

    /**
     * password validator
     * 
     * @param minLen min length of password
     * @param patterns array of character patterns and minimum count to validate
     */
    public PasswordValidator(int minLen, PasswordPattern[] patterns) {
        this. minLength = minLen;
        if (patterns != null && patterns.length > 0) {
            this.validPasswordPatterns.addAll(Arrays.asList(patterns));
        }
    }

    /**
     * validate if the string passed matches the rules defined for valid passwords
     * 
     * @param password ascii string to be validated
     * @return true if password matches all requirements
     */
    public boolean validate(String password) {
        return false;
    }

    public void addPasswordPattern(PasswordPattern pattern) {
        this.validPasswordPatterns.add(pattern);
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