package pers.nebo.jvm.obinit;

import java.util.Date;

/**
 * @auther nebofeng
 * @email nebofeng@gmail.com
 * @date 2018/10/11
 * @des :
 */
public class User {
    private String name;
    private int age;
    private boolean flag;
    private Date date;


     User(){
         System.out.println("USER CRATE ");
     }
    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", flag=" + flag +
                ", date=" + date +
                '}';
    }
}
