package java_examples.thaochi_clair;

public class monthsInStringclass {

    public static void main(String[] args) {

        String[] monthsInString = {"Oct", "Nov", "May", "Jun", "Jul", "Aug", "Sep", "Dec", "Jan", "Feb", "Mar", "Apr"};
        case1(monthsInString);
        case2(monthsInString);
    }

    static void case1(String[] monthsInString) {
        for (String month : monthsInString) {
            switch (month) {
                case "Oct":
                    System.out.println(10);
                    break;
                case "Nov":
                    System.out.println(11);
                    break;
                case "May":
                    System.out.println(5);
                    break;
                case "Jun":
                    System.out.println(6);
                    break;
                case "Jul":
                    System.out.println(8);
                    break;
                case "Aug":
                    System.out.println(9);
                    break;
                case "Sep":
                    System.out.println(12);
                    break;
                case "Dec":
                    System.out.println(1);
                    break;
                case "Jan":
                    System.out.println(2);
                    break;
                case "Feb":
                    System.out.println(3);
                    break;
                case "Mar":
                    System.out.println(4);
                    break;
                default:
                    System.out.println("Default month");
            }
        }
    }

        static void case2 (String[]monthsInString){
            for (String month : monthsInString) {
                if (month == "Oct") {
                    System.out.println(10);
                } else if (month.equals("Nov")) {
                    System.out.println(11);
                } else if (month == "May") {
                    System.out.println(5);
                } else if (month == "Jun") {
                    System.out.println(6);
                } else if (month == "Jul") {
                    System.out.println(7);
                } else if (month == "Aug") {
                    System.out.println(8);
                } else if (month == "Sep") {
                    System.out.println(9);
                } else if (month == "Dec") {
                    System.out.println(12);
                } else if (month == "Jan") {
                    System.out.println(1);
                } else if (month == "Feb") {
                    System.out.println(2);
                } else if (month == "Mar") {
                    System.out.println(3);
                } else if (month == "Apr") {
                    System.out.println(4);
                } else {
                    System.out.println("12 months");
                }
            }
        }
    }
