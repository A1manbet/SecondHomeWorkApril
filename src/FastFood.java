public abstract  class FastFood implements Printable{
    private String name, sauce;

    public FastFood(String name, String sauce) {
        this.name = name;
        this.sauce = sauce;
    }

    public String getName() {
        return name;
    }

    public String getSauce() {
        return sauce;
    }
}
