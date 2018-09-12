package aop;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class BeanFactory implements IManager{
    Properties prop = new Properties();
    public BeanFactory(InputStream in){
        try{
            prop.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Object getBean(String name){
        String className = prop.getProperty(name);
        Object bean = null;
        try{
            Class<?> aClass = Class.forName(className);
            bean = aClass.getConstructor().newInstance();


            System.out.println();

            IManager target = (IManager)Class.forName(prop.getProperty(name+".target")).getConstructor().newInstance();

            Object advice = Class.forName(prop.getProperty(name+".advice")).getConstructor().newInstance();


            BeanInfo beanInfo = Introspector.getBeanInfo(aClass);
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();

            for(PropertyDescriptor pd : propertyDescriptors){
                String propertyName = pd.getName();
                Method writeMethod = pd.getWriteMethod();

                if("target".equals(propertyName))
                    writeMethod.invoke(bean,target);
                if("advice".equals(propertyName))
                    writeMethod.invoke(bean,advice);
            }

        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InstantiationException | InvocationTargetException | IntrospectionException e) {
            e.printStackTrace();
        }
        return bean;
    }

    @Override
    public void add(String item) {

    }
}
