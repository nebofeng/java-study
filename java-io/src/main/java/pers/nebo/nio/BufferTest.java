package pers.nebo.nio;
import org.junit.Test;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public class BufferTest {
    /**
     * 管理方式大致相同，可以通过allocate() 获取缓冲区
     * 缓冲区提供了两个核心方法: put() 存入数据到缓冲区，get() 获取缓冲区的数据
     *
     * 2. 直接缓冲区和非直接缓冲区
     *
     * 非直接缓冲区： 通过allocate() 方法 分配缓冲区 ，将缓冲区建立在JVM的内存中
     * 直接缓冲区：  通过 allocateDirect方法分配缓冲区 ，将缓冲区建立在物理内存中， 效率更高。
     */

    @Test
    public  void test3(){
        //分配直接缓冲区
        ByteBuffer buffer=ByteBuffer.allocateDirect(1024);

        ByteBuffer buffer1=ByteBuffer.allocate(1024);
        System.out.println(buffer.isDirect());
        System.out.println(buffer1.isDirect());


    }


    @Test
    public  void test2(){

        String str="abcde";
        ByteBuffer buffer=ByteBuffer.allocate(1024);
        buffer.put(str.getBytes());
        buffer.flip();

        byte[] dst=new byte[buffer.limit()];
        buffer.get(dst,0,2);
        System.out.println(new String(dst,0,2));
        getBufferInfo(buffer);

        buffer.mark();

        //继续读取数据
        buffer.get(dst,2,2);
        System.out.println(new String(dst,2,2));
        getBufferInfo(buffer);
        //reset  恢复到 mark 位置


        System.out.println("---------------reset-----------");
        buffer.reset();
        getBufferInfo(buffer);

        //判断 缓冲区当中是否 还有剩余的数据

        System.out.println("----remaining-----");
        if(buffer.hasRemaining()){
            System.out.println(buffer.remaining());
        }


    }





    @Test
    public   void test1() {
        //1.创建缓冲区
        ByteBuffer buffer=ByteBuffer.allocate(1024);
        System.out.println("===========allocate================");
        getBufferInfo(buffer);

        //2. 通过put方法 ，向缓冲区存入数据

        String str="test";
        System.out.println("-----put------");
        buffer.put(str.getBytes());
        getBufferInfo(buffer);

        //3.通过get 方法 获取缓冲区的数据，前提是切换缓冲区的模式

        buffer.flip();
        System.out.println("-----flip------");
        getBufferInfo(buffer);

        //4 .获取数据

        byte[] dst=new byte[buffer.limit()];
        buffer.get(dst);
        System.out.println(new String(dst,0,dst.length));
        System.out.println("-----get------");
        getBufferInfo(buffer);

        //rewind() 可重复读
        buffer.rewind();
        System.out.println("------rewind");
        getBufferInfo(buffer);

    }

    public  static void   getBufferInfo(Buffer buffer){
        System.out.println(buffer.position());
        System.out.println(buffer.limit());
        System.out.println(buffer.capacity());

    }


}
