import org.junit.Test;

/**
 * @author XiangChen
 * @create 2023-09-25 11:19
 *
 *
 */
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
    }
}
