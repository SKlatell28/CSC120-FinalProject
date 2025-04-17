public class Building {
    protected String name;
    protected String owner;

    /*constructor*/
    public Building(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public static void main(String[] args) {
        System.out.println("------------------------------------");
        System.out.println("Test of Building constructor/methods");
        System.out.println("------------------------------------");

        Building Cafe = new Building("Cafe", "Harry");
        System.out.println(Cafe);
    }
}

