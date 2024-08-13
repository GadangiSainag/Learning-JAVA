public class Weapon extends Item{
    private String type;

    public Weapon(String type,String name, int quantity) {
        super(name, quantity);
        this.type = type;
    }

}
