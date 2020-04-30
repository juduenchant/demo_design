package com.example.demo;

public class Sigle {
    public static void main(String[] args) {
        EHanShi e = EHanShi.getEhanshi();
        LanHanShi l = LanHanShi.getLanHanShi();
    }
}
/**
 * 单例设计模式之饿汉式
 * 1.私有化构造函数
 * 2.声明本类的引用类型变量，并且使用该变量指向本类对象
 * 3.提供一个公共静态的方法获取本类的对象
 */
class EHanShi{

    //私有化构造函数
    private EHanShi(){}
    //声明本类的引用类型变量，并且使用该变量指向本类对象
    private static EHanShi ehanshi = new EHanShi();
    //提供一个公共静态的方法获取本类的对象
    public static EHanShi getEhanshi(){
        System.out.println("这里是饿汉式");
        return ehanshi;
    }
}

/**
 * 单例设计模式之懒汉式
 * 1.私有化构造函数
 * 2.声明本类的引用类型变量，但不要创建对象
 * 3.提供静态公共的方法获取本类的对象，获取之前先判断是否已经创建了本类对象，如果已经创建了，那么直接返回对象即可，如果还没创建，那么先创建本类的对象，然后再返回。
 */
class LanHanShi {
    //1,私有构造函数
    private LanHanShi(){}
    //2,声明一个本类的引用
    private static LanHanShi lanHanShi;
    //3,对外提供公共的访问方法
    public static LanHanShi getLanHanShi() {
        if(lanHanShi == null)
            lanHanShi = new LanHanShi();
        System.out.println("这里是懒汉式");
        return lanHanShi;
    }
}

