package pers.nebo.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @auther nebofeng@gmail.com
 * @date 2018/9/22 18:38
 * @des java 线程池: java 线程池 有三种。
 */
public class ThreadPoolExecutorDemo  {

/**
 *
 * 将 Runnable 对象加入 线程池管理器，（ThreadPool） 然后剩余的事情由ThreadPool完成。
 * 线程状态： 新建，就绪，运行，阻塞。         死亡状态。
 *                                  等待阻塞
 *                                  同步阻塞
 *                                  其他阻塞
 *  实现方式： 继承Thread ，实现 Runnable
 *  Java通过Executors提供四种线程池，分别为：
 *
 * newCachedThreadPool创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
 * newFixedThreadPool 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
 * newScheduledThreadPool 创建一个定长线程池，支持定时及周期性任务执行。
 * newSingleThreadExecutor 创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行
 * 本文来自 徐昊Xiho 的CSDN 博客 ，全文地址请点击：https://blog.csdn.net/u011974987/article/details/51027795?utm_source=copy
 *
 * ---------------------
 *
 * Executors 调用方法 ，返回 ExecutorService 实体类。
 *
 * submit与execute区别：
 *          execute 没有返回值
 *          submit 有返回值。
 * execute只能接受Runnable类型的任务
 *
 *                         submit不管是Runnable还是Callable类型的任务都可以接受，但是Runnable返回值均为void，所以使用Future的get()获得的还是null
 *
 * ---------------------
 *
 * 本文来自 cpf2016 的CSDN 博客 ，全文地址请点击：https://blog.csdn.net/cpf2016/article/details/50150205?utm_source=copy
 *
 */

public static void main(String[] args) {
	 ExecutorService executorService = Executors.newSingleThreadExecutor();
}

}
