package java_examples.thaochi_clair;

public class GradesPrint {
    public static void main(String[] args) {
        int[] grades = {8, 5, 6, 10, 9, 4, 5, 9, 8, 7, 3};
        tinhHocLuc(grades);
    }

    static void tinhHocLuc(int[] grades) {
        for (int note : grades) {
            switch (note) {
                case 8:
                    System.out.println("Học Lực Khá Giỏi");
                    break;
                case 5:
                    System.out.println("Học Lực TB");
                    break;
                case 6:
                    System.out.println("Học Lực TB Khá");
                    break;
                case 10:
                    System.out.println("Học Lực Xuất Sắc");
                    break;
                case 9:
                    System.out.println("Học Lực Giỏi");
                    break;
                case 4:
                    System.out.println("Học Lực Yếu");
                    break;
                case 7:
                    System.out.println("Học Lực Khá");
                    break;
                case 3:
                    System.out.println("Học Lực Yếu Kém");
                    break;
                default:
                    System.out.println("Học Lực của X");
            }
        }
    }
}
//Hãy in ra học lực tương ứng:
//        3 -> Học Lực Yếu Kém
//        4 -> Học Lực Yếu
//        5 -> Học Lực TB
//        6 -> Học Lực TB Khá
//        7 -> Học Lực Khá
//        8 -> Học Lực Khá Giỏi
//        9 -> Học Lực Giỏi
//        10 -> Học Lực Xuất Sắc