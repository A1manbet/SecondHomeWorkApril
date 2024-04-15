public class Pizza extends FastFood{

    private String cheese;

    public Pizza(String name, String sauce, String cheese) {
        super(name, sauce);
        this.cheese = cheese;
    }

    @Override
    public void print() {
        System.out.println("Фастфуд: " + getName() + ", " + "Соус: " + getSauce() + ", " + "Сыр: " + cheese);
    }
}
