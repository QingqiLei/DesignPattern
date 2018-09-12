package aop;


import java.io.*;

public class Tester {

    public static void main(String[] args) {

        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("aop/bean.properties");

//        File file = new File("src/aop/bean.properties"); // here is the difference of the format of path
//        System.out.println(file.exists());

        BeanFactory beanFactory = new BeanFactory(inputStream);
        ProxyFactory proxyFactory = (ProxyFactory) beanFactory.getBean("bean");
        IManager proxy = proxyFactory.getProxy();


        proxy.add("I am a cat. so cute! ~.~");


    }


}
