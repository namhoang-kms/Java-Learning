package java_examples.thaochi_clair;

class Fruit {
     protected String fruitColor = "red";
     String fruitFavor = "sweet";
     int fruitNumber = 2;

    public static void main(String[] args) {
//        Fruit myFruitObj = new Fruit();
//        System.out.println(myFruitObj.fruitColor);
//        Strawberry myStrawberryObj = new Strawberry("sweet & sour");
//        System.out.println(myStrawberryObj.fruitFavor);

        Banana myBananaObj = new Banana();
        System.out.println(myBananaObj.getFruitColor());
        myBananaObj.setFruitColor("green");
        System.out.println(myBananaObj.getFruitColor());

//        Mango myMangoObj = new Mango();
//        System.out.println(myMangoObj.fruitNumber);
//        Coconut myCoconutObj = new Coconut();
//        System.out.println(myCoconutObj.fruitColor);
    }
}
