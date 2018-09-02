package pers.nebo;

/**
 * 测试java分割
 */
public class JavaSplit {

    public static void main(String[] args) {
        String day="2018/08/16";
       String [] date=day.split("/");

       System.out.println( date[0]+date[1]+date[2] );
//         String demo ="est1   user    web     20180625        logtest";
//        String[] parm=demo.split(" \\s+");
//        for(int i=0;i<parm.length;i++){
//            System.out.println("="+parm[i]+"=");
//        }
//
//        String a = parm[3].substring(0,4);
//        String b = parm[3].substring(4,6);
//        System.out.println(b);

    }
}
