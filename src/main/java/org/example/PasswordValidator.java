package org.example;

public class PasswordValidator {
    public static boolean hasMinLength(String password, int min) {
        return password.length() >= min;
    }


    public static boolean containsDigit(String password) {
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (c >= '0' && c <= '9') {
                return true;
            }
        }
        return false;
    }

    public static boolean containsUpperAndLower(String password) {
        boolean hasUpper = false;
        boolean hasLower = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                hasUpper = true;
            }
            if (c >= 'a' && c <= 'z') {
                hasLower = true;
            }

            if (hasUpper && hasLower) return true;
        }
        return false;
    }

    // Small internal List
    public static boolean isCommonPassword(String password) {
        String[] commonPasswords = {"password", "Passwort1", "123456789", "Hallo"};

        String lowerPassword = password.toLowerCase();

        for (String p : commonPasswords) {
            if (lowerPassword.equals(p.toLowerCase())) return true;
        }
        return false;
    }

    // Bonus:
    public static boolean containsSpecialChar(String password, String allowed) {
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            for (int j = 0; j < allowed.length(); j++) {
                if (c == allowed.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    // Optional Overview
    // uses the above checks
    public static boolean isValid(String password) {
        if (password == null || password.isEmpty()) return false;

        // password has to have at least one letter
        boolean containsLetter = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if ((c >= 'A' && c <= 'Z') ||(c >= 'a' && c <= 'z')) {
                containsLetter = true;
                break;
            }
        }
        if (!containsLetter) return false;

        // hasMinLength must always be true,
        int min = 8; // password must have at least 8 characters
        if (!hasMinLength(password, min)) return false;

        // Password is valid if at least 3 of 4 criteria are met
        int counter = 0;
        if (containsDigit(password)) {
            counter++;
        }
        if (containsUpperAndLower(password)) {
            counter++;
        }
        if (!isCommonPassword(password)) {
            counter++;
        }
        String allowed = "^°*+#'-_.:,;!\\\"§$%&/()=";
        if (containsSpecialChar(password, allowed)) {
            counter++;
        }
        return counter >= 3;
    }
}
