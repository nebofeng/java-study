package pers.nebo.exercises.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。请你合并所有重叠的区间，并返回 一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间 。



 示例 1：

 输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
 输出：[[1,6],[8,10],[15,18]]
 解释：区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 示例 2：

 输入：intervals = [[1,4],[4,5]]
 输出：[[1,5]]
 解释：区间 [1,4] 和 [4,5] 可被视为重叠区间。
 示例 3：

 输入：intervals = [[4,7],[1,4]]
 输出：[[1,7]]
 解释：区间 [1,4] 和 [4,7] 可被视为重叠区间。
 *
 */

public class Q56_Merge {
    public static  int [][] merge(int [][] intervals){
        /*思路：
           1. 排序
           2. 然后排序


        */
        List<int[]>  result = new ArrayList<>() ;

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                return  o1[0]-o2[0];
            }
        });
        result.add(intervals[0]);
        //遍历排序后的数组
        for(int i=1;i<intervals.length;i++){
            int last_result_index = result.size()-1;

            if (intervals[i][0]>result.get(last_result_index)[1]){
                result.add(intervals[i]);
                //如果 start小于等于之前的end,就比较两个end
            }else{
                // 两个end 大的值是结尾
                int max_end =Math.max(result.get(last_result_index)[1],intervals[i][1]);
                //如果start 大于等于 之前的end, 则两个都添加

                result.set(last_result_index,new int[]{ result.get(last_result_index)[0],max_end});
            }



        }
       return result.toArray(new int[result.size()][]);

    }
    public static void main(String[] args) {

    }
}
