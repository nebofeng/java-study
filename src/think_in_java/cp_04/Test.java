package think_in_java.cp_04;

class A  
{ 
A(){System.out.println("我是无参构造方法");} 
A(String s){System.out.println("我是构造方法 "+s);} 
} 
public class Test 
{ 
public static void main(String[] args)  
{ 
A[] c=new A[4]; 

c[0]=new A("1"); 
c[1]=new A("2"); 
c[2]=new A("3"); 
c[3]=new A("4"); 
} 

//不错，如果给S初始化就更好了
} 