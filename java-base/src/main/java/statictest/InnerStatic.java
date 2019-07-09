package statictest;

import com.sun.jmx.snmp.tasks.ThreadService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ auther fnb
 * @ email nebofeng@gmail.com
 * @ date  2019/7/9
 * @ des : 验证static 内部类与普通类初始化一致
 */
public class InnerStatic {
    public static void main(String[] args) {
        ExecutorService threadService = Executors.newFixedThreadPool(100);
        for (int i = 0; i <100 ; i++) {
            threadService.submit(new Test("aa"+i));
        }
        threadService.shutdown();
    }

    public static void  P(String aa){
        System.out.println(aa);

    }

    static class Test extends Thread{
        public String aa;
        Test(String aa){
            this.aa=aa;

        }
        @Override
        public void run() {
            P(Thread.currentThread().getId()+"=="+aa);
        }
    }

}
