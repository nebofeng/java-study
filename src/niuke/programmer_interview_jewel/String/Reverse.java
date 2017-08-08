package niuke.programmer_interview_jewel.String;

public class Reverse {
	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.reverseString("adaaaadwtrdfv"));
	}
}
class Solution{
	public String reverseString(String iniString) {
        // write code here
 char [] arrayiniString=iniString.toCharArray();
 for(int i=0;i<arrayiniString.length;i++){
	 System.out.println(arrayiniString[i]);
 }
  System.out.println("arrayiniString.length"+arrayiniString.length+"iniString"+iniString.length());
  System.out.println(arrayiniString.toString());
  System.out.println(new String(arrayiniString));
	for(int i=0;i<iniString.length()/2;i++){
		char t=iniString.charAt(i);
		System.out.println(t);
		arrayiniString[i] = arrayiniString[iniString.length() - i - 1]; 
      arrayiniString[iniString.length() - i - 1]=t;
	}
	return new String(arrayiniString);

}
}