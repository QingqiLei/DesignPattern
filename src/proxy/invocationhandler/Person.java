package proxy.invocationhandler;

public class Person implements Subject, Hotel {

    @Override
    public void reserve() {
        System.out.println("付款，买到心仪的商品");
    }

    @Override
    public void shopping() {
        System.out.println("预定付款，打飞机飞往目的地");
    }
}
