package src.com.atguigu.java1;

import java.util.Objects;

/**
 * Author: CodeChen
 * Date: 2023-10-17 22:40
 * Description:
 **/
public class User implements Comparable{
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    //姓名从小到大排列，若name相同，对age进行比较
    @Override
    public int compareTo(Object o) {
        if (o instanceof User){
            User user = (User) o;
//            return -this.name.compareTo(user.name);
            int compare = this.name.compareTo(user.name);
            if (compare != 0){
                return compare;
            }else return Integer.compare(this.age,user.age);
        }else {
            throw new RuntimeException("输入类型不匹配");
        }
    }
}
