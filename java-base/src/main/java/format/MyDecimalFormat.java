package format;

import java.text.DecimalFormat;

/**
 * @ author fnb
 * @ email nebofeng@gmail.com
 * @ date  2019/10/3
 * @ des :
 */
public class MyDecimalFormat {

    public static void main(String[] args) {
        DecimalFormat df =new DecimalFormat();
        //位数不够的话补0
        df.applyPattern("00.000");
        System.out.println(df.format(447.89));
    }
}
