package java_examples.thaochi_clair;

public class Password {
    public static void main(String[] args) {
        String pwd = "Joblog           @";
        if (clairCheckLength(pwd)) {
            if (clairCheckUpperCase(pwd) && clairCheckLowerCase(pwd) && clairCheckDigit(pwd) && clairCheckSpecialCharacter(pwd) && !clairCheckSpace(pwd)) {
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

    static boolean clairCheckUpperCase(String pwd) {
        boolean containUpperCase = false;
        char letter;
        for (int i = 0; i <= pwd.length() -1; i++) {
            letter = pwd.charAt(i);
            if (Character.isUpperCase(letter)) {
                containUpperCase = true;
            }
        }
        return containUpperCase;
    }

    static boolean clairCheckLowerCase(String pwd) {
        boolean containLowerCase = false;
        char letter;
        for (int i = 0; i <= pwd.length() -1; i++) {
            letter = pwd.charAt(i);
            if (Character.isLowerCase(letter)) {
                containLowerCase = true;
            }
        }
        return containLowerCase;
    }

    static boolean clairCheckDigit(String pwd) {
        boolean containDigit = false;
        char letter;
        for (int i = 0; i <= pwd.length() -1; i++) {
            letter = pwd.charAt(i);
            if (Character.isDigit(letter)) {
                containDigit = true;
            }
        }
        return containDigit;
    }

    static boolean clairCheckSpecialCharacter(String pwd) {
        boolean containSpecialCharacter = false;
        char letter;
        for (int i = 0; i <= pwd.length() -1; i++) {
            letter = pwd.charAt(i);
            if (letter == '@' || letter == '!' || letter == '?') {
                containSpecialCharacter = true;
            }
        } return containSpecialCharacter;
    }
    static boolean clairCheckSpace(String pwd) {
        boolean containSpace = false;
        char letter;
        for (int i = 0; i <= pwd.length() -1; i++) {
            letter = pwd.charAt(i);
            if (letter == ' ') {
                containSpace = true;
            }
        }
        return containSpace;
    }

}
