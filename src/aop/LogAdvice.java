package aop;

import java.text.SimpleDateFormat;

public class LogAdvice implements  Advice{
    @Override
    public void beforeAdvice() {


        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-LL-dd hh:mm:ss:SSSS zzzz");
        System.out.println("start: "+dateFormat.format(System.currentTimeMillis()));
    }

    @Override
    public void afterAdvice() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-LL-dd hh:mm:ss:SSSS zzzz");
        System.out.println("end: "+dateFormat.format(System.currentTimeMillis()));
    }
}