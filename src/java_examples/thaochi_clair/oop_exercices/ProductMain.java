package java_examples.thaochi_clair.oop_exercices;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {
        myMethodProduct();
    }

    static void myMethodProduct() {
        ProductList myProductObj = new ProductList();

        Scanner myScannerObj = new Scanner(System.in);
        System.out.println("Please input your Product Name: ");
//        String productName = myScannerObj.nextLine();
        myProductObj.setProductName(myScannerObj.nextLine());
        System.out.println("Please input your Product Price: ");
        double productPrice = myScannerObj.nextDouble();
        myProductObj.setProductPrice(productPrice);
        System.out.println("Please input your Product Quantity: ");
        int productQuantity = myScannerObj.nextInt();
        myProductObj.setProductQuantity(productQuantity);
        System.out.println("Please input your increase number to adjust: ");
        int adjustIncreaseNumber = myScannerObj.nextInt();
        System.out.println(myProductObj.quantityIncrease(adjustIncreaseNumber));
        System.out.println("Please input your decrease number to adjust: ");
        int adjustDecreaseNumber = myScannerObj.nextInt();
        System.out.println(myProductObj.quantityDecrease((adjustDecreaseNumber)));

        System.out.println(myProductObj.toString());
        System.out.println(myProductObj.getTotalProductPrice());
    }

}