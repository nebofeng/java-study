package niuke.jianzhiofficer;

public class JumpFloor {



}
 class SolutionJumpFloor {
    public int Fibonacci(int n) {
			if(n==1){
                return 1 ;
            }else if(n==2){
                return 1;
            }else if(n<0){
                return 0;
            }
            else{
               return Fibonacci(n-1)+Fibonacci(n-2);
           }
        
    }
    
    public int Fibonacci1(int n) {
        int a=1,b=1,c=0;
        if(n<0){
            return 0;
        }else if(n==1||n==2){
            return 1;
        }else{
            for (int i=3;i<=n;i++){
                c=a+b;
                b=a;
                a=c;
            }
            return c;
        }
    }
 
    
}