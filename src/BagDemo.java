public class BagDemo {
    public static void main(String[] args) {
        ShoppingCart<String> shoppingCart = new ShoppingCart<>();
        testAdd(shoppingCart);
        displayBag(shoppingCart);
    }

    private static void testAdd(ShoppingCart<String> shoppingCart) {
        shoppingCart.add("Apples");
        shoppingCart.add("Bananas");
        shoppingCart.add("Oranges");
        // Add more items as needed
    }

    private static void displayBag(ShoppingCart<String> shoppingCart) {
        System.out.println("Shopping Cart contains the following items:");
        String[] items = shoppingCart.toArray(new String[0]); // Pass an empty array of type String
        for (String item : items) {
            System.out.println(item);
        }
    }
}