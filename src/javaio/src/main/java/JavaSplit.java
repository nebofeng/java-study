/**
 * 测试java分割
 */
public class JavaSplit {

    public static void main(String[] args) {
        String demo ="est1   user    web     20180625        logtest";
        String[] parm=demo.split(" \\s+");
        for(int i=0;i<parm.length;i++){
            System.out.println("="+parm[i]+"=");
        }

        String a = parm[3].substring(0,4);
        String b = parm[3].substring(4,6);
        System.out.println(b);

    }
}
