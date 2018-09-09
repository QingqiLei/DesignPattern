package decorator;

public class Test {
    public static void main(String[] args){
        Drink drink = new SoyMilk();

        SugerDecorator sugar = new SugerDecorator(drink);
        BlackBeanDecorator bean = new BlackBeanDecorator(sugar);
        System.out.println("你点的豆浆是："+bean.description());
        System.out.println("一共花了"+bean.cost()+"元");

//        OutputStream out = new FileOutputStream("xxx");    out 相当于 豆浆
//        BufferedOutputStream bos = new BufferedOutputStream(out);
//        PrintStream ps = new PrintStream(bos);
//        ps.print(..);
    }
}
