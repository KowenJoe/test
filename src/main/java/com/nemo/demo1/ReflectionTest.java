package com.nemo.demo1;

import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectionTest {
    @Autowired
    private User user;

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {

        Class<User> userClass = User.class;
        try {
            User nemo = userClass.getDeclaredConstructor(String.class, String.class).newInstance("nemo", "22");
            System.out.println("111:"+nemo.getClass());
            User user = new User();
            Class<? extends User> userClass1 = user.getClass();
            Class<?> userClass2 = Class.forName("com.nemo.demo1.User");
            System.out.println(userClass == userClass1);
            System.out.println(userClass1 == userClass2);

            Field name = userClass.getField("name");
            System.out.println("+++++++++");

            Field[] fields = userClass.getDeclaredFields();
            for (Field f : fields
            ) {
                System.out.println(f);
            }

            Constructor<?>[] constructors = userClass.getConstructors();
            for (Constructor constructor:constructors
                 ) {
                System.out.println(constructor);
            }

            System.out.println("获取构造方法");
            Constructor<User> constructor = userClass.getConstructor();
            System.out.println(constructor);
            //带参构造方法
            System.out.println("带参构造方法");
            Constructor<User> constructor2 = userClass.getConstructor( String.class, int.class,String.class);
            System.out.println(constructor2);

            System.out.println("空参创建对象");
//        第一种方法
            Object person = constructor.newInstance();
            System.out.println(person);
//        第二种方法
            Object person1 = userClass.newInstance();
            System.out.println(person1);

            System.out.println("带参创建对象");
            Object object = constructor2.newInstance("李四",20, "dsadsad");
            System.out.println(object);



        } catch (InstantiationException e) {
            System.out.println("111");
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            System.out.println("1112");
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            System.out.println("1113");
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            System.out.println("114");
            throw new RuntimeException(e);
        }

    }
}
