public class Burger extends FastFood{

    private String kotleta;

    public Burger(String name, String sauce, String kotleta) {
        super(name, sauce);
        this.kotleta = kotleta;
    }

    @Override
    public void print() {
        System.out.println("Фастфуд: " + getName() + ", " + "Соус: " + getSauce() + ", " + "Котлета: " + kotleta);
    }
}
