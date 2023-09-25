/**
 * @author XiangChen
 * @create 2023-09-18 14:53
 */
public class Person {
    String name;
    char sex;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name,char sex,int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

}

class Student extends Person{

    long number;
    int math;
    int english;
    int computer;

    public Student(String name, char sex, int age, long number, int math, int english, int computer) {
        super(name, sex, age);
        this.number = number;
        this.math = math;
        this.english = english;
        this.computer = computer;
    }

    public Student(String name, char sex, int age) {
        super(name, sex, age);
    }
}