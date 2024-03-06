public class testProduct {
    public static void main(String[] args) {
        Product p1 = new Product("Notebook", 1350.75, 0.25);

        double finalPrice = p1.valueWithDescount();
        System.out.printf("Final Price: $%.2f.", finalPrice);
    }
}
