package java_examples.java_exercises;

public class PasswordChecker02 {

    // Main method to test the PasswordChecker class
    public static void main(String[] args) {
        String password = "StrongPassword123@";
        if (isStrongPassword(password)) {
            System.out.println("The password is strong.");
        } else {
            System.out.println("The password is not strong.");
        }
    }

    // Method to check if a password is strong
    public static boolean isStrongPassword(String password) {
        // Check the length of the password
        if (password.length() < 8) {
            return false;
        }

        // Flags to track if different types of characters are found
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        // Check each character in the password
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            // Check for uppercase letter
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            }
            // Check for lowercase letter
            else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            }
            // Check for digit
            else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
            // Check for special character
            else if (isSpecialChar(ch)) {
                hasSpecialChar = true;
            }
            // If an invalid character is encountered, immediately return false
            else {
                return false;
            }
        }

        // Check if all types of characters have been found
        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
    }

    // Method to check if a character is a special character
    private static boolean isSpecialChar(char ch) {
        // Check if the character is a special character
        switch (ch) {
            case '@':
            case '#':
            case '$':
            case '%':
                return true;
            default:
                return false;
        }
    }
}