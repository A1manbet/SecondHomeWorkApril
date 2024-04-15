public class Main {
    public static void main(String[] args) {

        FastFood burger = createObject("2");
        FastFood hotDog = createObject("3");
        FastFood pizza = createObject("4");

        FastFood[] fastFoods = {burger, hotDog, pizza};

        for (int i = 0; i < fastFoods.length; i++) {
                fastFoods[i].print();
        }



    }

    public static FastFood createObject(String className) {
        switch (className) {
            case "2":
                Burger burger = new Burger("Чизбургер", "Барбекю", "Куриная");
                return burger;
            case "3":
                HotDog hotDog = new HotDog("Хотдог", "Горчица", "Говядина");
                return hotDog;
            case "4":
                Pizza pizza = new Pizza("Пепперони", "Острый", "Мацарелла");
                return pizza;
            default:
                System.out.println("Неизвестный хавчик.");
                return null;
        }
    }
}