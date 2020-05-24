package pers.nebo.designmode.singleton.dcl;

/**
 * @ auther fnb
 * @ email nebofeng@gmail.com
 * @ date  2020/5/24
 * @ des :
 */
public class DCL_Singleton {

    public  static  volatile  DCL_Singleton dcl_singleton;

    private  DCL_Singleton(){}

    public  static  DCL_Singleton getInstance(){
        if(dcl_singleton==null){
            synchronized (DCL_Singleton.class){
                if(dcl_singleton==null){
                    dcl_singleton=new DCL_Singleton();
                }
            }

        }
        return  dcl_singleton;
    }



}
