package pers.nebo.exercises.leetcode;

import org.junit.Test;

import java.util.Arrays;

/**

 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

 请注意 ，必须在不复制数组的情况下原地对数组进行操作。



 示例 1:

 输入: nums = [0,1,0,3,12]
 输出: [1,3,12,0,0]
 示例 2:

 输入: nums = [0]
 输出: [0]


 提示:

 1 <= nums.length <= 104
 -231 <= nums[i] <= 231 - 1

 */
public class Q283_MoveZeroes {

    /**
     *
     * @param index 往到最后的的位置，
     * @param source 原始数组
     *
     */
    public static void moveItems(int index,int[] source){
        int tmp = source[index];
        for(int i=index; i<source.length-1 ;i++){
            source[i]=source[i+1];
        }
        source[source.length-1]= tmp ;

    }

    /**
     * 思路： 1个指针从前往后遍历，1个指针从后往前
     *         需要往后移动的元素，移动之后，后面的指针往前移动，直到两个指针相遇，
     * @param sources
     * @return
     */
    public static int[] moveZeroes(int[] sources){
        int i=0;
        int j=sources.length-1;
        while(i<j){
            if (sources[i] == 0){
                moveItems(i,sources);
                j--;
            }else{
                i++;
            }
        }
        return  sources;
    }

    /**
     * 思路：把所有非零的元素，移动到前面，后面都补0即可
     *  从前往后用2个指针遍历，
     *      指针1 ： 代表当前数组的index，
     *      指针2：  非零元素的index,   非零一定在所有元素的头部。所以直接覆盖即可。
     *          移动指针1,如果遇到了非 0， 指针2 移动
     *                  如果遇到了 0， 指针2 不动，
     *
     *      直到
     * @param sources
     * @return
     */
    public  static  int[] moveZeroes2(int[] sources){

        int nonZeroIndex =0 ;

        for(int i=0;i<sources.length;i++) {
            if (sources[i] != 0) {
                sources[nonZeroIndex] = sources[i];
                nonZeroIndex++;
            }
        }
        for(int i=nonZeroIndex;i<sources.length;i++){
            sources[i] =0;
        }
        return sources;

    }



    public static void main(String [] args) {
        System.out.println(Arrays.toString(moveZeroes(new int[]{0,0,1})));

    }



}
