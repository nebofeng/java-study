package pers.nebo.exercises.niuke.hw;

/**
 * @ author fnb
 * @ email nebofeng@gmail.com
 * @ date  2020/1/16
 * @ des :
 */


import java.util.Scanner;

/**
 题目描述
 王强今天很开心，公司发给N元的年终奖。王强决定把年终奖用于购物，他把想买的物品分为两类：主件与附件，附件是从属于某个主件的，下表就是一些主件与附件的例子：
 主件	附件
 电脑	打印机，扫描仪
 书柜	图书
 书桌	台灯，文具
 工作椅	无
 如果要买归类为附件的物品，必须先买该附件所属的主件。每个主件可以有 0 个、 1 个或 2 个附件。附件不再有从属于自己的附件。王强想买的东西很多，为了不超出预算，他把每件物品规定了一个重要度，分为 5 等：用整数 1 ~ 5 表示，第 5 等最重要。他还从因特网上查到了每件物品的价格（都是 10 元的整数倍）。他希望在不超过 N 元（可以等于 N 元）的前提下，使每件物品的价格与重要度的乘积的总和最大。
 设第 j 件物品的价格为 v[j] ，重要度为 w[j] ，共选中了 k 件物品，编号依次为 j 1 ， j 2 ，……， j k ，则所求的总和为：
 v[j 1 ]*w[j 1 ]+v[j 2 ]*w[j 2 ]+ … +v[j k ]*w[j k ] 。（其中 * 为乘号）
 请你帮助王强设计一个满足要求的购物单。

 输入描述:
 输入的第 1 行，为两个正整数，用一个空格隔开：N m
 （其中 N （ <32000 ）表示总钱数， m （ <60 ）为希望购买物品的个数。）

 从第 2 行到第 m+1 行，第 j 行给出了编号为 j-1 的物品的基本数据，每行有 3 个非负整数 v p q

 （其中 v 表示该物品的价格（ v<10000 ）， p 表示该物品的重要度（ 1 ~ 5 ）， q 表示该物品是主件还是附件。如果 q=0 ，表示该物品为主件，如果 q>0 ，表示该物品为附件， q 是所属主件的编号）


 输出描述:
 输出文件只有一个正整数，为不超过总钱数的物品的价格与重要度乘积的总和的最大值（ <200000 ）。
 示例1
 输入

 1000 5 800 2 0 400 5 1 300 5 1 400 3 0 500 2 0
 输出

 2200
 */
public class Q16 {
//    public static void main(String[] args) {
//
//        Scanner sc=new Scanner(System.in);
//        while(sc.hasNext()){
//
//            int money=sc.nextInt(); //总价格
//            int num=sc.nextInt();  //个数
//            int [] v=new int[num+1]; //价格
//            int [] p=new int[num+1];//重要度
//            int [] q=new int[num+1];// 主从配件标示
//
//            //初始化
//           for(int i=1;i<=num;i++){
//               p[i]=sc.nextInt();
//               v[i]=sc.nextInt()*p[i];
//               q[i]=sc.nextInt();
//
//           }
//           int[][] dp= new int[num+1][money+1];
//           for(int i=1;i<=num;i++){ //当个数为 i 个时候
//               for(int j=1;j<=money;j++){ // 总价为 j 的
//                                                         //最大价值
//                    if(q[i]==0){//如果是主配件
//                        if(j>=p[i]){ //当前的价格 ，大于等于这个主件的价格
//                            //如果 i 放入，则等于 i-1 件物品 价格为  j - p[i] 的时候 的最大价值+ 当前的价值
//                            //如果i 不放入，则等于 i-1 件物品 价格为 j的最大价值
//                            dp[i][j]=Math.max(dp[i-1][j-p[i]]+v[i],dp[i-1][j]);
//                        }else{//当前的价格比总量大，则无法放入
//                            dp[i][j]=dp[i-1][j];
//
//                        }
//
//
//                    }else{//为从配件
//                        //当前价格，大于等于附件+对应主件的价格
//                        if(j>=p[i]+p[q[i]]){
//                            //不放入，则是为 1-1 ，价格为 j的 最大价值 ，加入 则为 当前附件价值 + i-1 价格为(j减去主件-附件) j-p[i] -p[q[i]]
//                            dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-p[i]-p[q[i]]]+v[i]);
//                        }else{
//                            dp[i][j]=dp[i-1][j];
//                        }
//
//
//                    }
//
//               }
//
//           }
//            System.out.println(dp[num][money]);
//
//
//        }
//
//
//    }



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                int N = scanner.nextInt();
                int m = scanner.nextInt();
                int[] price = new int[m];
                int[] value = new int[m];
                int[] ZhuFu = new int[m];
                for (int i = 0; i < m; i++) {
                    price[i] = scanner.nextInt();
                    value[i] = scanner.nextInt() * price[i];   //定义 价值=重要度*价格
                    ZhuFu[i] = scanner.nextInt();
                }
                //采用动态规划
                int[][] dp = new int[m + 1][N + 1];  //dp[i][j]表示用j钱购买i件物品的总价值
                for (int i = 1; i <= m; i++) {
                    for (int j = 1; j <= N; j++) {
                        if (ZhuFu[i - 1] == 0) {  //表示为主件
                            if (j >= price[i - 1]) {
                                dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - price[i - 1]] + value[i - 1]);    //分别表示不买第i件和买第i件物品之后的最大价值
                            } else {
                                dp[i][j] = dp[i - 1][j];
                            }
                        } else {    //表示为附件，附件需要购买主件
                            if (price[i - 1] + price[ZhuFu[i - 1] - 1] <= j) {
                                dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - price[i - 1] - price[ZhuFu[i - 1] - 1]] + value[i - 1]);
                            } else {
                                dp[i][j] = dp[i - 1][j];
                            }
                        }
                    }
                }
                System.out.println(dp[m][N]);
            }

        }
}
