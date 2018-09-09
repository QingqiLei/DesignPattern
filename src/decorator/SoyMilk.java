package decorator;



public class SoyMilk implements Drink {

    @Override
    public float cost() {
        return 10;
    }

    @Override
    public String description() {
        return "纯豆浆";
    }
}
