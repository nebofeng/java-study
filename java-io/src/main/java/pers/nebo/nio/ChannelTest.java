package pers.nebo.nio;

import org.junit.Test;

 import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ChannelTest {
    String filePath="F:\\Video\\美剧\\神秘博士第10季\\神秘博士.doctor.who.2005.s10e09.中英字幕.bd-hr.aac.720p.x264-人人影视.mp4";
    String filetest1="F:\\Video\\美剧\\神秘博士第10季\\神秘博士.doctor.who.2005.s10e09.中英字幕.bd-hr.aac.720p.x264-人人影视.mp4_1";
    String filetest2="F:\\Video\\美剧\\神秘博士第10季\\神秘博士.doctor.who.2005.s10e09.中英字幕.bd-hr.aac.720p.x264-人人影视.mp4_2";

    /**
     * 500m 左右，基于 通道需要 3s左  右
     *     基于内存映射文件需要1.6s
     */

    /**
     * 基于内存映射文件
     */
    @Test
    public void  test2(){
        //使用直接缓冲区完成文件的拷贝 （基于内存映射文件）

        try {
            Long sTime=System.currentTimeMillis();
            FileChannel inChannel =FileChannel.open(Paths.get(filePath), StandardOpenOption.READ);
            FileChannel outChannel =FileChannel.open(Paths.get(filetest2),StandardOpenOption.READ,StandardOpenOption.WRITE,StandardOpenOption.CREATE);

            //进行内存映射文件

            MappedByteBuffer inMappedBuff=inChannel.map(FileChannel.MapMode.READ_ONLY,0,1024);

            MappedByteBuffer outMappedBuff=outChannel.map(FileChannel.MapMode.READ_WRITE,0,1024);

            //对缓冲区域进行数据的读写操作

            byte[] dst= new byte[inMappedBuff.limit()];

            inMappedBuff.get(dst);
            outMappedBuff.put(dst);

            //回收资源
            inChannel.close();
            outChannel.close();
            System.out.println("end "+(System.currentTimeMillis()-sTime));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



    /**
     * 使用通道
     * @throws IOException
     */
    @Test
    public  void test1() throws IOException {
        Long sTime=System.currentTimeMillis();
        //1. 创建输入输出流
        FileInputStream fileInputStream=new FileInputStream(filePath);
        FileOutputStream fileOutputStream=new FileOutputStream(filetest1);



        //2。 通过流对象获取通道Channel

        FileChannel inChannel = fileInputStream.getChannel();
        FileChannel outChannel =fileOutputStream.getChannel();

        //3. 创建指定大小的缓冲去对相同
        ByteBuffer buffer=ByteBuffer.allocate(1024);


        //4. 将通道中的数据写入缓冲区 ，
        while (inChannel.read(buffer)!=-1){
            buffer.flip();
            //5. 将缓冲区中的数据写出到通道
            outChannel.write(buffer);
            //清空缓冲区
            buffer.clear();
        }

        //6.回收资源
        if(outChannel!=null){
            try {
                outChannel.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        if(inChannel!=null){
            try {
                inChannel.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        if(fileOutputStream!=null){
            try {
                fileOutputStream.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        if(fileInputStream!=null){
            try {
                fileInputStream.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        System.out.println("end "+(System.currentTimeMillis()-sTime));

    }
}
