package pers.nebo.jvm.jconsole;

/**
 * @auther nebofeng
 * @email nebofeng@gmail.com
 * @date 2018/10/18
 * @des :
 */
public class DeadLock  implements  Runnable {
    private  Object obj1;
    private  Object obj2;

   public DeadLock(Object obj1,Object obj2){
       this.obj1=obj1;
       this.obj2=obj2;
   }
    @Override
    public void run() {
       synchronized (obj1){
           try {
               Thread.sleep(400);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           synchronized (obj2){
                System.out.println("hello ");
           }
       }
    }
}
