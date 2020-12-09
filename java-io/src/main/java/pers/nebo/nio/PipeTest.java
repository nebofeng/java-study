package pers.nebo.nio;

import org.junit.Test;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;

public class PipeTest {

    /**
     * channel 是双向的，
     * pipe是单向的 source -》sink
     */
    @Test
    public  void  test1(){
        try {
            //1. 获取管道

            Pipe pipe=Pipe.open();

            //2. 创建缓冲区

            ByteBuffer buffer =ByteBuffer.allocate(1024);
            //获取sink通道
            Pipe.SinkChannel sinkChannel=pipe.sink();

            buffer.put("通过单向管道发送的数据".getBytes());
            buffer.flip();
            sinkChannel.write(buffer);

            //3. 读取缓冲区的数据

            Pipe.SourceChannel sourceChannel=pipe.source();
            //4. 读取sourceChannel 中的数据放到缓冲区中

            buffer.flip();

            int len=sourceChannel.read(buffer);
            System.out.println(new String(buffer.array(),0,len));
            sourceChannel.close();
            sinkChannel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
