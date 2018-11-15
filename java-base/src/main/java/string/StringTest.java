package string;

/**
 * @auther nebofeng
 * @email nebofeng@gmail.com
 * @date 2018/11/15
 * @des :
 */
public class StringTest {
    public static void main(String[] args) {

        String s = "Helloword";
        String s1 = "Helloword";
        System.out.println(s1.equals(s));
        System.out.println(s1.equals(new String("Helloword")));

    }
}
