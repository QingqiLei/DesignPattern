package aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory implements InvocationHandler {
    private Object target;
    private Object advice;

    public void setTarget(Object target) {
        this.target = target;
    }

    public Object getAdvice() {
        return advice;
    }

    public void setAdvice(Advice advice) {
        this.advice = advice;
    }

    public IManager getProxy(){
        return (IManager) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);

    }

    public Object invoke(Object proxy, Method method, Object[] args)throws  Throwable{
        ((Advice)advice).beforeAdvice();
        Object obj = method.invoke(target, args);
        ((Advice)advice).afterAdvice();
        return obj;
    }
    public Object getTarget(){return target;}

}
