package niuke.jianzhiofficer;

public class JumpFloorII {

	/*
	 在main方法外面创建 定义，声明的类 并不能在main方法里面调用方法
	 因为main是静态方法，而静态方法调用别的外部的类的时候，也需要是静态的。
	 * */
	private 	SolutionJumpFloorII solutionJumpFloorII2=new SolutionJumpFloorII();
	public static void main(String [] args){
		SolutionJumpFloorII solutionJumpFloorII=new SolutionJumpFloorII();
		System.out.println("answer"+solutionJumpFloorII.JumpFloorII(4) );
	}
	
	
	
}
class SolutionJumpFloorII {
    public int JumpFloorII(int target) {
       
    	return (int) Math.pow(  2, target-1);
    }
}