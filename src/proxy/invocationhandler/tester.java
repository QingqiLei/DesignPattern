package proxy.invocationhandler;

import org.junit.jupiter.api.Test;

public class tester {

    @Test
    public void testProxy(){
        PersonProxy pp = new PersonProxy();

        Hotel hotel = new Person();
        Hotel proxy = (Hotel)pp.bind(hotel);
        proxy.reserve();

        Subject subject = new Person();
        Subject proxy1 =  (Subject)pp.bind(subject);
        proxy1.shopping();
        System.out.println("+++++++++");

        Person p = new Person();
        ((Subject)pp.bind(p)).shopping();
        ((Hotel)pp.bind(p)).reserve();

    }
}
