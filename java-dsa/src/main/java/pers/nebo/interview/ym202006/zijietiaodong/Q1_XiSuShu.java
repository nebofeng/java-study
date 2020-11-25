package pers.nebo.interview.ym202006.zijietiaodong;
/**
 * 
 * @author fnb
 * @date 2020-06-07
 * @des:  一个整数的二进制包含两个连续的1 则为稀疏数 。输入一个数 ，判断是否为稀疏 是 返回 true ，不是返回false
 *
 */
public class Q1_XiSuShu {
	public static void main(String[] args) {
		System.out.print(isXishu(4));
	}
	
	public static boolean isXishu(int source) {
		 
	 /**
	  如果有两个连续的位为1，原数和移为后的数“位与”操作，就是会发生这两个连续的1进行“位与操作”，则结果中必出现至少一个位为1 (1&1 == 1)，结果不为零；
            如果没有至少两个连续的位为1，则1的两边都是0，原数和移为后的数“位与”操作，就是1与两边的0进行“位与操作”，则所有的1都变成了0 (1&0 == 0)，结果必为零；		
	  */
		return !((source & source<<1) == 0);
	}
	

}
