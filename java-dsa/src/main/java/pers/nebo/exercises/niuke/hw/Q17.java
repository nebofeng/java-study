package pers.nebo.exercises.niuke.hw;

import java.util.*;

/**
 * @ author fnb
 * @ email nebofeng@gmail.com
 * @ date  2020/1/18
 * @ des :
 */


/**
*
like
god
internal
interval



*
* */
public class Q17 {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     Map<String,String> map=new HashMap<>();
     List<String> list =new ArrayList<>();
     while(sc.hasNext()){

         String line =sc.nextLine().trim();
         list.add(line);
         if(line.length()<=3){
             map.put(line,line);

         }else{
             String result =   String.valueOf(line.charAt(0))+(line.length()-2)+String.valueOf(line.charAt(line.length()-1));
             if(map.containsKey(result)){//如果包含了相同的key
                 String old = map.get(result);
                 int length=line.length();
                 for(int i=0;i<length;i++){//遍历两个字符串的 每个字符 ，找到不相同的第一个字符index
                     if(!(line.charAt(i)==old.charAt(i))){
                      if(i<line.length()-3){
                           // 0 1 2 3
                          String keyresult=result.substring(0,i+1)+(length-1-i)+result.substring(length-2,length-1);
                          String keyold=old.substring(0,i+1)+(length-1-i)+old.substring(length-2,length-1);
                          map.remove(result);
                          map.put(keyresult,result);
                          map.put(keyold,old);
                      }else{//输入完整的字符串
                          map.remove(result);
                          map.put(line,line);
                          map.put(old,old);
                      }
                     }
                 }


             }else{
                 map.put(result,line);
             }


         }



     }
     sc.close();
     for(int i=0;i<list.size();i++){
         for(Map.Entry entry:map.entrySet()){
             if(entry.getValue()==list.get(i)){
                 System.out.println(entry.getKey());
             }
         }

     }

    }


}
