package java_examples.thaochi_clair;

public class PasswordOptimized {
    public static void main(String[] args) {
        String pwd = "Joblog5435435@";
        if (clairCheckLength(pwd)) {
            if (clairCheckHowStrong(pwd)) {
                System.out.println("Strong password.");
            } else {
                System.out.println("Length ok but not strong enough.");
            }
        } else {
            System.out.println("Weak password.");
        }
    }

    static boolean clairCheckLength(String pwd) {
        if (pwd.length() >= 8) {
            return true;
        } else {
            return false;
        }
    }

    static boolean clairCheckHowStrong(String pwd) {
        boolean containUpperCase = false;
        boolean containLowerCase = false;
        boolean containDigit = false;
        boolean containSpace = false;
        boolean containSpecialCharacter = false;
        char letter;
        for (int i = 0; i <= pwd.length() - 1; i++) {
            letter = pwd.charAt(i);
            if (Character.isUpperCase(letter)) {
                containUpperCase = true;
            }
            if (Character.isLowerCase(letter)) {
                containLowerCase = true;
            }
            if (Character.isDigit(letter)) {
                containDigit = true;
            }
            if (letter == ' ') {
                containSpace = true;
            }
            if (letter == '@' || letter == '!' || letter == '?') {
                containSpecialCharacter = true;
            }

        }
        return containUpperCase && containLowerCase && containDigit && containSpecialCharacter && !containSpace;
    }

}
