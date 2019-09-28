package pers.nebo.memana;

/**
 * @auther nebofeng
 * @email nebofeng@gmail.com
 * @date 2018/10/24
 * @des :final 内存分析
 *
 */
public class FinalMemAna {
    private int a;
    private final int b;
    private FinalMemAna finalMemAna;

    //类初始化过程中初始化  ; 代码块， 构造方法。
    public FinalMemAna(){
        a=10;
        b=20;
    }
    {

    }

    //类加载过程中初始化
    static{

    }

    private void w(){
       finalMemAna = new FinalMemAna();
    }

    private void r(){
        int temp1 = finalMemAna.a;
        int temp2= finalMemAna.b;

    }

}
