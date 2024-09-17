package com.nemo.demo1;

public class User extends People{
    public String name;
    private int age;

    private static int staticFiled = 10;
    private String sex;
    protected String protectedFiled;

    static  {
        System.out.println("静态方法被执行");
    }

    public User() {

    }

    public User(String name,String sex) {
        this.name = name;
        this.sex = sex;
    }

    private void privateMethod() {
        System.out.println("我是私有方法");
    }
    public void publicMethod() {
        System.out.println("我是公有方法");
    }
}
