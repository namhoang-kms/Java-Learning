package java_examples.java_exercises;

public class PasswordChecker01 {

    // Main method to test the PasswordChecker class
    public static void main(String[] args) {
        String password = "StrongPassword@123";
        if (isStrongPassword(password)) {
            System.out.println("The password is strong.");
        } else {
            System.out.println("The password is not strong.");
        }
    }

    // Method to check if a password is strong
    public static boolean isStrongPassword(String password) {
        boolean isStrongPassword = false;
        if (meetLength(password) && containsSpecialChar(password) && containsUppercaseChar(password) && containsLowercaseChar(password) && containsDigit(password)) {
            isStrongPassword = true;
        }
        if (containsInvalidChar(password)) {
            isStrongPassword = false;
        }
        return isStrongPassword;
    }

    // Method to check if the password meets the length requirement
    public static boolean meetLength(String password) {
        if (password.length() < 8) {
            return false;
        }
        return true;
    }

    // Method to check if the password contains a special character
    private static boolean containsSpecialChar(String password) {
        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);
            switch (character) {
                case '@':
                case '#':
                case '$':
                case '%':
                    return true;
            }
        }
        return false;
    }

    // Method to check if the password contains an uppercase character
    private static boolean containsUppercaseChar(String password) {
        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);
            if (Character.isUpperCase(character)) {
                return true;
            }
        }
        return false;
    }

    // Method to check if the password contains a lowercase character
    private static boolean containsLowercaseChar(String password) {
        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);
            if (Character.isLowerCase(character)) {
                return true;
            }
        }
        return false;
    }

    // Method to check if the password contains a digit
    private static boolean containsDigit(String password) {
        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);
            if (Character.isDigit(character)) {
                return true;
            }
        }
        return false;
    }

    // Method to check if the password contains an invalid character
    private static boolean containsInvalidChar(String password) {
        if (password.contains(" ")){
            return true;
        }
        return false;
    }
}