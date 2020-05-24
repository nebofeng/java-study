package pers.nebo.designmode.singleton.lazy;

/**
 * @ auther fnb
 * @ email nebofeng@gmail.com
 * @ date  2020/5/24
 * @ des : 懒汉式  ，线程不安全 。
 */
public class Lazy_Singleton {

    private static  Lazy_Singleton  instance;
    //单例模式需要将构造方法 私有化
    private  Lazy_Singleton(){}

    public  static  Lazy_Singleton getInstance(){
        if(instance==null){
            instance=new Lazy_Singleton();
        }
        return  instance;
    }


}
