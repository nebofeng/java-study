package pers.nebo.exercises.niuke.jianzhiofficer;

import java.util.Stack;

public class StackInorderToQuene {
	
	
	
    
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
     
    public void push(int node) {
        stack1.push(node);
    }
     
    public int pop() {
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
//        int [] array = null;
////        int c=array.length;
//        String s=null;
//        s.length();
        int first=stack2.pop();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return first;
    }
}
