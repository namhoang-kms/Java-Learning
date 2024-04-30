package thaochi_clair;

public class oddevennumber {
    public static void main (String[] args) {
        int clairNumber = 0;
        if (clairNumber%2 != 0) {
            System.out.println("So le ne`");
        } else if (clairNumber%2 == 0 && clairNumber != 0) {
            System.out.println("So chan o'");
        } else if (clairNumber%2 == 0 && clairNumber == 0) {
            System.out.println("Dich thi la so 0 oy -(:p)- ");
        } else {
            System.out.println("Nhap so hui nho'. Nhap bay la tui hong hiu dau o' ~~!");
        }
    }
}
