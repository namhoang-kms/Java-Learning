package java_examples.thaochi_clair;

public class leapyear {
    public static void main (String[] args) {
        int clairYear = 2024;
        if (clairYear%4 == 0) {
            System.out.println("Ố năm nay năm nhuận ớ");
        } else if (clairYear%4 == 1 || clairYear%4 == 2 || clairYear%4 ==3) {
            System.out.println("nam nay nam thuong 365 ngay hoy ne`");
        } else {
            System.out.println("Nhập năm zô để test xem tui tính năm nhuận có chuẩn hăm nạh ");
        }
    }
    
}
