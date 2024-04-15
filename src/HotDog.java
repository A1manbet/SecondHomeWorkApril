public class HotDog extends FastFood{

    private String sausage;

    public HotDog(String name, String sauce, String sausage) {
        super(name, sauce);
        this.sausage = sausage;
    }

    @Override
    public void print() {
        System.out.println("Фастфуд: " + getName() + ", " + "Соус: " + getSauce() + ", " + "Котлета: " + sausage);
    }
}
