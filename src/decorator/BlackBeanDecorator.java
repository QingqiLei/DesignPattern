package decorator;

public class BlackBeanDecorator extends Decorator {
    public BlackBeanDecorator(Drink drink) {
        super(drink);
    }

    public float cost(){return super.cost()+2;}
    public String description(){
        return super.description()+"+黑豆";
    }


}
