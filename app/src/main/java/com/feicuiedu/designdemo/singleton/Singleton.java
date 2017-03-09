package com.feicuiedu.designdemo.singleton;

/**
 * Created by gqq on 2017/3/9.
 */

// 单例：私有的构造方法，共有的创建方法
public class Singleton {

//     饿汉式
//    private Singleton mSingleton = new Singleton();
//
//    // 私有的构造方法
//    private Singleton() {
//    }
//
//    // 共有的创建方法
//    public static Singleton newInstance(){
//        return mSingleton;
//    }

//    懒汉式
    private volatile static Singleton mSingleton ;

    // 私有的构造方法
    private Singleton() {
    }

    // 共有的创建方法
    public static Singleton newInstance(){
        if (mSingleton==null){
            synchronized (Singleton.class) {
                mSingleton = new Singleton();
            }
        }
        return mSingleton;
    }
}
