package decorator;

public class SugerDecorator extends Decorator {
    public SugerDecorator(Drink drink) {
        super(drink);
    }

    public float cost() {
        return super.cost() + 1;
    }

    public String description() {
        return super.description() + "+糖";
    }

}