package pers.nebo.exercises.niuke.hw;

/**
 * @ author fnb
 * @ email nebofeng@gmail.com
 * @ date  2020/1/15
 * @ des :
 */


import java.util.*;

/**
 题目描述
 数据表记录包含表索引和数值（int范围的整数），请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。

 输入描述:
 先输入键值对的个数
 然后输入成对的index和value值，以空格隔开

 输出描述:
 输出合并后的键值对（多行）

 示例1
 输入
 复制
 4
 0 1
 0 2
 1 2
 3 4
 输出
 复制
 0 3
 1 2
 3 4
 */


public class Q8 {
    public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            while (sc.hasNext()){
                Map<Integer, Integer> map = new HashMap<>();
                int num = sc.nextInt();
                while (num-- > 0) {
                    Integer key = sc.nextInt();
                    Integer value = sc.nextInt();
                    if (!map.containsKey(key)) {
                        map.put(key, value);
                    } else {
                        map.put(key, map.get(key) + value);
                    }
                }
                List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

                Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                        return o1.getValue() > o2.getValue() ? 1 : -1;
                    }
                });

                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i).getKey() + " " + list.get(i).getValue());
                }


            }



        }



}
