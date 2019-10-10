package math;

import java.text.DecimalFormat;

/**
 * @ author fnb
 * @ email nebofeng@gmail.com
 * @ date  2019/10/6
 * @ des :
 */
public class Xor {

    public static void main(String[] args) {
        getHashcode("13461804872","2019100123",100);
    }
    public static String getHashcode(String caller, String callTime, int partitions) {
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("00");
        int len = caller.length();
        //取出后四位电话号码
        String last4Code = caller.substring(len - 4);
        //取出时间单位,年份和月份.
        String mon = callTime.substring(0, 6);
        //
        System.out.println((Integer.parseInt(mon) ^ Integer.parseInt(last4Code)));
        int hashcode = (Integer.parseInt(mon) ^ Integer.parseInt(last4Code)) % partitions;
        return df.format(hashcode);
    }

}
