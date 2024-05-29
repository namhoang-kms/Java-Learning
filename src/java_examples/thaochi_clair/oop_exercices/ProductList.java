package java_examples.thaochi_clair.oop_exercices;

public class ProductList {
    String productName;
    double productPrice;
    int productQuantity;

    public double getTotalProductPrice() { return
            productPrice*productQuantity;
    }
    public int quantityIncrease() { return
            productQuantity + 1;

    }
    public int quantityDecrease() { return
            productQuantity - 1;

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
}

