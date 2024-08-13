import java.util.ArrayList;

public class Inventory {
    private String inventoryName;
    private ArrayList<Item> item;

    Inventory( String inventoryName) {
        item = new ArrayList<Item>();
        this.inventoryName = inventoryName;
    }

    void addItem(Item x) {
        item.add(x);
    }

    void removeItem(Item x) {
        item.remove(x);
    }

    void displayInventory() {
        if (item.isEmpty()) {
            System.out.println("No items present, Add items");
        } else {
            System.out.println("---------- "+inventoryName+"'s Inventory"+ " ----------");
            for (Item value : item) {
                System.out.println("Item : " + value.getName() + "\t" + "Quantity : " + value.getQuantity());
            }
        }
    }
}
