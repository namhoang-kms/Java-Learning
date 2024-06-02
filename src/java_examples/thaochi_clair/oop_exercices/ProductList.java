package java_examples.thaochi_clair.oop_exercices;

public class ProductList {
    String productName;
    double productPrice;
    int productQuantity;
    int adjustIncreaseNumber;
    int adjustDecreaseNumber;

    public double getTotalProductPrice() { return
            productPrice*productQuantity;
    }
    public int quantityIncrease(int adjustIncreaseNumber) { return
            productQuantity + adjustIncreaseNumber;

    }
    public int quantityDecrease(int adjustDecreaseNumber) { return
            productQuantity - adjustDecreaseNumber;

    }

    @Override
    public String toString() {
        return "ProductMain{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productQuantity=" + productQuantity +
                '}';
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

//    public int getAdjustIncreaseNumber() { return adjustIncreaseNumber; }
//
//    public void setAdjustIncreaseNumber(int adjustIncreaseNumber) { this.adjustIncreaseNumber = adjustIncreaseNumber;}
//
//    public int getAdjustDecreaseNumber() { return adjustDecreaseNumber; }
//
//public void setAdjustDecreaseNumber( int adjustDecreaseNumber) { this.adjustDecreaseNumber = adjustDecreaseNumber;}
//
}

