package pers.nebo.jvm.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther ningbo
 * @email  nebofeng@gmail.com
 * @date   2018/10/6
 * @des    :
 */
public class OOMTest {
    public static void main(String[] args) {
        List<Demo> demoList = new ArrayList<>();
        while (true){
            demoList.add(new Demo());
        }
        /*
          -XX:+HeapDumpOnOutOfMemoryError -Xms20m -Xmx20M
          其中生成的内存溢出镜像 会在项目的根目录下。
         */
    }
}
