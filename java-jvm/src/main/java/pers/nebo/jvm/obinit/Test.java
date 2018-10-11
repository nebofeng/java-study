package pers.nebo.jvm.obinit;

/**
 * @auther nebofeng
 * @email nebofeng@gmail.com
 * @date 2018/10/11
 * @des :对象初始化值
 */
public class Test {
    /**
     USER CRATE
     User{name='null', age=0, flag=false, date=null}

     */
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.toString());
    }
}
