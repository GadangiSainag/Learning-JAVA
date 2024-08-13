public class Item {
    private String name;
    private int quantity;

    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    int getQuantity() {
        return quantity;
    }

    String getName() {
        return this.name;
    }
}