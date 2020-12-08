package pers.nebo.nio;

import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class BlockingNIOTest {
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
    public  void client(){
        String filePath="F:\\Video\\美剧\\神秘博士第10季\\神秘博士.doctor.who.2005.s10e09.中英字幕.bd-hr.aac.720p.x264-人人影视.mp4";
        try {
            //1.获取通道
            SocketChannel sChannel=SocketChannel.open(new InetSocketAddress("127.0.0.1",9898));

            // 创建文件通道
            FileChannel fileChannel=FileChannel.open(Paths.get(filePath), StandardOpenOption.READ);

            //2.分配指定大小的缓冲区
            ByteBuffer buffer=ByteBuffer.allocate(1024);

            //3. 发送数据需要读取文件
            while (fileChannel.read(buffer)!=-1){
                buffer.flip();
                sChannel.write(buffer);
                buffer.clear();

            }
            //4. 关闭通道

            fileChannel.close();
            sChannel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Test
    public  void server(){
        //1. 获取通道


        try {
            ServerSocketChannel serverSocketChannel=  ServerSocketChannel.open();

            //2. 绑定端口

            serverSocketChannel.bind(new InetSocketAddress(9898));

            //3. 等待客户端连接，当连接测成功，就会得到一个连接通道

            SocketChannel socketChannel=serverSocketChannel.accept();

            //4. 创建缓冲区

            ByteBuffer buffer=ByteBuffer.allocate(1024);

            FileChannel fileChannel=FileChannel.open(Paths.get("./test"),StandardOpenOption.WRITE,StandardOpenOption.CREATE);
            //5.接收客户端的数据，并且存储到本地
            while (socketChannel.read(buffer)!=-1){
                buffer.flip();
                fileChannel.write(buffer);
                buffer.clear();

            }

            fileChannel.close();
            socketChannel.close();
            buffer.clear();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
