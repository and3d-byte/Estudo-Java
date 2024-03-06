public class Product {
    String name;
    double price;
    double descount;

    double valueWithDescount(){
        return price * (1 - descount);
    }

    Product(String initialName, double initialPrice, double initialDescount){
        name = initialName;
        price = initialPrice;
        descount = initialDescount;
    }
}
