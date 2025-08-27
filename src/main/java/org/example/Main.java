package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(PasswordValidator.isValid("123&wT=gHg"));
        System.out.println();

        // password with < 8 characters
        String password = "123&wT=";
        System.out.println("Password with less than 8 characters:");
        System.out.println("Password \"" + password + "\" is "
                + PasswordValidator.isValid(password) + ".");
        System.out.println();

        // password without uppercase letter
        String passwordOne = "123&wt=ghg";
        System.out.println("Password without Uppercase Letter:");
        System.out.println("Password \"" + passwordOne + "\" is "
                            + PasswordValidator.isValid(passwordOne) + ".");
        System.out.println();

        // password without lowercase letter
        String passwordTwo = "123&WT=GHG";
        System.out.println("Password without Lowercase Letter:");
        System.out.println("Password \"" + passwordTwo + "\" is "
                            + PasswordValidator.isValid(passwordTwo) + ".");
        System.out.println();

        // password without digit
        String passwordThree = "AbC&wT=gHg";
        System.out.println("Password without Digit:");
        System.out.println("Password \"" + passwordThree + "\" is "
                + PasswordValidator.isValid(passwordThree) + ".");
        System.out.println();

        // password without special character
        String passwordFour = "1234wT5gHg";
        System.out.println("Password without Special Character:");
        System.out.println("Password \"" + passwordFour + "\" is "
                + PasswordValidator.isValid(passwordFour) + ".");
        System.out.println();

        // password without and letter (lowercase and uppercase)
        String passwordFive = "123&%7=3)(";
        System.out.println("Password without any letter whatsoever:");
        System.out.println("Password \"" + passwordFive + "\" is "
                + PasswordValidator.isValid(passwordFive) + ".");
        System.out.println();

        // password without uppercase and digit
        String passwordSix = "§$%&wt=ghg";
        System.out.println("Password without uppercase and digit:");
        System.out.println("Password \"" + passwordSix + "\" is "
                + PasswordValidator.isValid(passwordSix) + ".");
        System.out.println();
    }
}