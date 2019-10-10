package charset;

import java.io.UnsupportedEncodingException;

/**
 * @ author fnb
 * @ email nebofeng@gmail.com
 * @ date  2019/10/9
 * @ des :
 */

public class TestUTF8 {
    public static void main(String[] args) throws Exception
    {
//        byte[][]
//                bytes = {
////              00110001
//                {(byte)0x31},
////               11000000 10110001
//                {(byte)0xC0,(byte)0xB1},
////             11100000 10000000 10110001
//                {(byte)0xE0,(byte)0x80,(byte)0xB1},
////              11110000 10000000 10000000 10110001
//                {(byte)0xF0,(byte)0x80,(byte)0x80,(byte)0xB1},
////              11111000 10000000 10000000 10000000 10110001
//                {(byte)0xF8,(byte)0x80,(byte)0x80,(byte)0x80,(byte)0xB1},
////             11111100 10000000 10000000 10000000 10000000 10110001
//                {(byte)0xFC,(byte)0x80,(byte)0x80,(byte)0x80,(byte)0x80,(byte)0xB1},
//        };
//        for (int i = 0; i < 6; i++) {
//            String str = new String(bytes[i],
//                    "UTF-8");
//            System.out.println("原数组长度：" +
//                    bytes[i].length +
//                    "转换为字符串：" +  str +
//                    "转回后数组长度：" +  str.getBytes("UTF-8").length);
//        }
//
//          test1();


        byte[] bytes2={(byte)0xC0,(byte)0xB1};
        System.out.println((byte)0xC0);
        System.out.println((byte)11000000);
        System.out.println((byte)0xC0==(byte)11000000);

        System.out.println(new String(bytes2));




    }


    static void test1(){

        byte[][] bytes = {

// 00110001

                {(byte)0x31},

// 11000000 10110001

                {(byte)0xC0,(byte)0xB1},

// 11100000 10000000 10110001

                {(byte)0xE0,(byte)0x80,(byte)0xB1},

// 11110000 10000000 10000000 10110001

                {(byte)0xF0,(byte)0x80,(byte)0x80,(byte)0xB1},

// 11111000 10000000 10000000 10000000 10110001

                {(byte)0xF8,(byte)0x80,(byte)0x80,(byte)0x80,(byte)0xB1},

// 11111100 10000000 10000000 10000000 10000000 10110001

                {(byte)0xFC,(byte)0x80,(byte)0x80,(byte)0x80,(byte)0x80,(byte)0xB1},

        };

        for (int i = 0; i < 6; i++) {

            String str = null;
            try {
                str = new String(bytes[i], "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            try {
                System.out.println("原数组长度：" + bytes[i].length +

                        "/t转换为字符串：" + str +

                        "/t转回后数组长度：" + str.getBytes("UTF-8").length);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

        }

    }
}