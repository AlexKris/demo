package com.example.demo.study.singleton;

/**
 * 单例
 * Singleton singleton = new Singleton();
 * 1.给singleton分配内存空间
 * 2.调用Singleton的构造函数等来初始化singleton
 * 3.将singleton对象指向分配的内存空间（执行完这步后singleton就不是null了）
 * 注意：重排序的优化，2、3顺序不能保证，即顺序为1、2、3或1、3、2，volatile修饰可以避免重排序
 */
public class Singleton {

    /**
     * 1 饿汉式
     * 类加载时实例化singleton
     */
//    private static Singleton singleton = new Singleton();
//
//    public static Singleton getInstance() {
//        return singleton;
//    }

    /**
     * 2 饿汉式变种
     * 类加载时实例化singleton
     */
//    private static Singleton singleton;
//
//    static {
//        singleton = new Singleton();
//    }
//
//    public static Singleton getInstance() {
//        return singleton;
//    }

    /**
     * 3 懒汉式
     * 懒加载，使用时实例化singleton
     */
//    private static Singleton singleton;
//
//    public static Singleton getInstance() {
//        if (singleton == null) {
//            singleton = new Singleton();
//        }
//        return singleton;
//    }

    /**
     * 4 懒汉式线程安全1
     */
//    private static Singleton singleton;
//
//    public static synchronized Singleton getInstance() {
//        if (singleton == null) {
//            singleton = new Singleton();
//        }
//        return singleton;
//    }

    /**
     * 5 懒汉式线程安全2
     */
//    private static Singleton singleton;
//
//    public static Singleton getInstance() {
//        if (singleton == null) {
//            synchronized (Singleton.class) {
//                singleton = new Singleton();
//            }
//        }
//        return singleton;
//    }

    /**
     * 6 懒汉式线程安全3双重检查模式
     * 延迟加载，效率高
     * 不能防止被反序列化，生成多个实例
     */
//    private static volatile Singleton singleton;
//
//    public static Singleton getInstance() {
//        if (singleton == null) {
//            synchronized (Singleton.class) {
//                if (singleton == null) {
//                    singleton = new Singleton();
//                }
//            }
//        }
//        return singleton;
//    }

    //

    /**
     * 7 静态内部类
     * jvm帮助保证线程安全，Singleton类装载时不会立即实例化singleton对象，调用getInstance方法时才回实例化
     * 延迟加载，效率高
     * 不能防止被反序列化，生成多个实例
     */
    private static class SingletonInstance {
        private static final Singleton singleton = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.singleton;
    }

    private Singleton() {
    }
}
