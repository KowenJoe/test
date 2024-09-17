package com.nemo.singleton;

public class Singleton {
    /**
     * 这种方法通过将对象的实例设置为静态的方式，
     * 保证了该对象的实例，永远只有一份,且该对象的创建在类加载的时候
     * 就会立即创建在jvm内存中的方法区，
     * 在程序运行期间永久存在，所以当我们的对象太大的时候就会造成一种资源的浪费。
     */
    /*private Singleton() {
    }

    //在成员位置创建该类的对象
    private static Singleton instance = new Singleton();
    //对外提供静态方法获取该对象
    public static Singleton getInstance() {
        return instance;
    }*/

    //双重检查
    private Singleton() {
    }
    //使用volatile修饰，禁止重排序
    private static volatile Singleton instance;

    //对外提供静态方法获取该对象
    public static Singleton getInstance() {
//第一次判断，如果instance不为null，不进入抢锁阶段，直接返回实例
        if (instance == null) {
            synchronized (Singleton.class) {
//抢到锁之后再次判断是否为null
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }


}
