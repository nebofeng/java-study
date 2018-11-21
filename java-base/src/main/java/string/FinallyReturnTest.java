package string;

/**
 * @auther nebofeng
 * @email nebofeng@gmail.com
 * @date 2018/11/21
 * @des :
 */
public class FinallyReturnTest {
    public static void main(String[] args) {
        Test t = new Test();
        t=test(t);
        System.out.println(t.b);
        Integer c = new Integer(0);
        c=testint(500,1);
        System.out.println(test(t));
        System.out.println(testint(5,1));


       System.out.println(c);
    }
     static Test test(Test t){
          try {
            t.a=1;
            t.b=2;
            return t;
          }finally {
            t.b=3;
          }
      }

      static Integer testint(Integer a, Integer b){
        Integer  c ;
        try{
            c=a+b ;
            return System.identityHashCode(c);
        }finally {
            c=a-b;
            System.out.println(c+"==========");
        }
      }

    static class Test{
        private  int a;
        private  int b;
    }
    /***

      思考：
       如果 finally中 修改了return 的值。


      1. 基本数据类型
      以修改前的为主
      2.对象
      以修改后的为准。

      原因：
       return 的时候返回的是这个方法 栈（每一个方法都是一个虚拟机栈）  中的数据。
      finally 如果已经修改 。 但是这个方法已经返回。所以就算修改。也不能修改已经存在这个栈中的 基本数据类型。
      但是可以修改 reference （对象在堆中，这个栈中记录，并返回的是 reference （对象在堆中的位置。 所以尽管已经返回了这个方法栈，但是还可以对这个引用进行修改。））
      如果是integer对象（integer对象在jvm中的位置是作为基本数据类型存储的）

     testint 最后返回
     首先我们知道，finally语句是一定会执行，但他们的执行顺序是怎么样的呢？他们的执行顺序如下：
         1、执行：expression，计算该表达式，结果保存在操作数栈顶；
         2、执行：操作数栈顶值（expression的结果）复制到局部变量区作为返回值； testint 这里是一个数值。 test这里是一个对象。
         3、执行：finally语句块中的代码；
         4、执行：将第2步复制到局部变量区的返回值又复制回操作数栈顶；
         5、执行：return指令，返回操作数栈顶的值；
    // TODO: 为什么 Integer 返回的是值，对象类型返回的是 内存地址
     *
     */

}
