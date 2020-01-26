package pers.nebo.exercises.leetcode.topninterview;

/**
 * @ author fnb
 * @ email nebofeng@gmail.com
 * @ date  2020/1/26
 * @ des :
 * <p>
 * <p>
 * <p>
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * 你可以假设 nums1 和 nums2 不会同时为空。
 * 示例 1:
 * <p>
 * nums1 = [1, 3]
 * nums2 = [2]
 * <p>
 * 则中位数是 2.0
 * 示例 2:
 * <p>
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * <p>
 * 则中位数是 (2 + 3)/2 = 2.5
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Q4_MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] num1 = {1, 3};
        int[] num2 = {2};


        System.out.println(getmid(num1, num2));


    }


    //返回中间数值

    /**
     * @param nums1
     * @param nums2 如果是 总数为奇数个： 需要找到 len/2+1
     *              总数为偶数个： 需要找到 len/2  len/2+1，然后相加  / 2.0
     *              <p>
     *              所以 ：
     *              (len+1)/2        (len+2)/2           为奇数的时候。都是中间数
     *              为偶数的时候，为两个中间数字。
     */

    public static double getmid(int[] nums1, int[] nums2) {

        int size = nums1.length + nums2.length;

        int left = (size + 1) / 2;
        int right = (size + 2) / 2;


        if (nums1.length > nums2.length) {
            return (getKth(0, nums1.length, nums1, 0, nums2.length, nums2, left)
                    + getKth(0, nums1.length, nums1, 0, nums2.length, nums2, right)) / 2.0;
        }


        return (getKth(0, nums2.length, nums2, 0, nums1.length, nums1, left)
                + getKth(0, nums2.length, nums2, 0, nums1.length, nums1, right)) / 2.0;
    }

    public static int getKth(int left1, int right1, int[] nums1, int left2, int right2, int[] nums2, int k) {
        // nums1是长度比较大的
        int len1 = right1 - left1;
        int len2 = right2 - left2;

        //让 len1 的长度小于 len2，这样就能保证如果有数组空了，一定是 len1
        if (len1 > len2) {
            return getKth(left2, right2, nums2, left1, right1, nums1, k);
        }
        if (len1 == 0) {//如果 len1 为空 ，则 从len2中找到剩
            return nums2[left2 + k - 1];
        }

        if (k == 1) { //如果只找一个数，则比较两个数组的第一个，返回最小的。
            return Math.min(nums1[left1], nums2[left2]);
        }

        int i = left1 + Math.min(len1, k / 2) - 1;
        int j = left2 + Math.min(len2, k / 2) - 1;

        if (nums1[i] > nums2[j]) {
            return getKth(left1, right1, nums1, j + 1, right2, nums2, k - (j - left2 + 1));
        } else {
            return getKth(i + 1, right1, nums1, left2, right2, nums2, k - (i - left1 + 1));
        }


    }


}
