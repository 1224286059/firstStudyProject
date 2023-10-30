import org.junit.Test;

/**
 * @author XiangChen
 * @create 2023-09-25 11:19
 *
 *
 */

class Person1{
    String name = "Tom";
}
public class StringTest {
 /*
    String类：字符串，必须使用“”引起来使用
    1.String声明为final，因此不能被继承
    2.String实现了Serializable接口，表示支持序列化
            实现了Comparable接口：比较字符串大小
    3.String实现了final char[] value用于存储字符串数据
    4.String：代表不可变的字符序列：简称：不可变性

  */
    @Test
    public void test1(){
        String s1 = "abc";
        String s2 = "abc";
        s1 = "hello";

        System.out.println(s1);
        System.out.println(s2);

        s1 += " xiangchen";
        System.out.println(s1);

    }

    @Test
    public void test2(){
        String s1 = "abc";
        String s2 = "abc";

        System.out.println(s1 == s2);

        String s3 = new String("bcd");
        String s4 = new String("bcd");
        System.out.println(s3 == s4);

        Person1 p1 = new Person1();
        String s5 = "Tom";
        System.out.println(s5 == p1.name);
    }
}
