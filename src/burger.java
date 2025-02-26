public class burger {

    // variables ingredient, type, price, size (number),
    String ingredient;
    String type;
    double price;
    int size;
    boolean isGreasy;
    public burger(double xprice){
        ingredient = "cheese, tomato, onion, ketchup";
        type = "in and out";
        price = xprice;
        size = 4;
        isGreasy = true;
    }

    public void printinfo(){
        System.out.println("ingredient: " + ingredient);
        System.out.println("type: "+type);
        System.out.println("price: " +price);
        System.out.println("size: " + size);
        System.out.println("is Greasy: " + isGreasy);
    }

}

