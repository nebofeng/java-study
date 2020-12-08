package pers.nebo.nio;

import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.security.PublicKey;
import java.util.Date;
import java.util.Iterator;

public class NIOTest {

    /**
     * 阻塞式网络通信：
     *
     * 1. 通道channel
     *  Java.nio.channels.Channel
     *    SockerChannel
     *    ServerSockerChannel
     *    DatagramChannel
     *  管道相关
     *   Pipe.SinkChannel
     *   Pipe.SourceChannel
     *
     *
     * 2.缓冲buffer:负责存储数据
     *
     * 3.Selector 是SelectableChannel的多路复用器，主要用于监控SelectableChannel的io状况
     *
     */


    @Test
    public  void  client(){
        //1 获取通道 默认阻塞
        try {
            SocketChannel socketChannel=SocketChannel.open(new InetSocketAddress("127.0.0.1",8989));

            //1.2 将阻塞套接字变为非阻塞

            socketChannel.configureBlocking(false);

            //2.创建缓冲区
            ByteBuffer buffer=ByteBuffer.allocate(1024);
            //3.发送数据到缓冲区

            buffer.put(new Date().toString().getBytes());

            //将缓冲区换为读模式
            buffer.flip();
            socketChannel.write(buffer);
            buffer.clear();
            //关闭通道
            socketChannel.close();
        } catch (IOException e) {

            e.printStackTrace();
        }


    }


    @Test
    public  void server(){
        try {
            //1.获取通道
            ServerSocketChannel socketChannel= ServerSocketChannel.open();
            //2.将阻塞的套接字改为非阻塞的
            socketChannel.configureBlocking(false);

            //3.绑定端口号

            socketChannel.bind(new InetSocketAddress(8989));
            //4.创建选择器对象

            Selector selector =Selector.open();

            //5. 将通道注册到选择器上，此时选择器开始监听这个通道的接收时间，如果有接收，接收准备就绪，才开始下一步操作

            socketChannel.register(selector, SelectionKey.OP_ACCEPT);

            //6. 通过轮询的方法获取选择器上监听的事件
            while (selector.select()>0){//如果大于0 ，至少有一个SelectionKey 准备就绪
                //7. 获取当前选择器中所有注册的选择键（已经就绪的监听事件）

                Iterator<SelectionKey> iterator=selector.selectedKeys().iterator();
               //迭代获取已经就绪的事件
                while (iterator.hasNext()){
                    //9. 获取已经就绪的事件
                    SelectionKey sk=iterator.next();
                    if(sk.isAcceptable()){
                        //调用accept
                        SocketChannel resultChannel=socketChannel.accept();
                        //10.将通道设置为非阻塞的
                        resultChannel.configureBlocking(false);

                        //11. 将该通道注册到选择器上，选择器能够监听这个通道，同样也需要完成注册
                        resultChannel.register(selector,SelectionKey.OP_READ);


                    }else if(sk.isReadable()){
                        //12 如果已经是可读状态，就开始读取数据
                       SocketChannel sChannel= (SocketChannel) sk.channel();
                       //读取数据,先创建缓冲区
                        ByteBuffer buffer=ByteBuffer.allocate(1024);
                        //13.
                        int len=0;
                        while ((len=sChannel.read(buffer))>0){
                            buffer.flip();
                            System.out.println(new String(buffer.array(),0,len));
                            buffer.clear();
                        }

                    }
                    //当selectKey使用完毕之后需要移除，否则一直有效
                    iterator.remove();

                }


            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
