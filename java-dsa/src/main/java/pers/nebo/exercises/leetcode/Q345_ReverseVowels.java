package pers.nebo.exercises.leetcode;

public class Q345_ReverseVowels {

    public String reverseVowels(String s) {
        char [] tmpchar=s.toCharArray();
        int start=0;
        int end=tmpchar.length-1;
        while (start<end){
            //从首尾同时开始遍历
            int i;
            int j;
            for( i=start;i<end;i++){
                if(isY(tmpchar[i])){
                    break;
                }
            }
            start=i+1;

            for(j=end;j>=start;j--){
                if(isY(tmpchar[j])){
                    break;
                }
            }
            end=j-1;
            char tmp=tmpchar[i];
            tmpchar[i]=tmpchar[j];
            tmpchar[j]=tmp;



        }

        return  String.valueOf(tmpchar);



    }
    public  static  boolean isY(char tmp){
        String result="aeiou";
        return  result.contains(String.valueOf(tmp).toLowerCase());

    }
}
