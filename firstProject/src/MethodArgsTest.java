/**
 * @author XiangChen
 * @create 2023-09-18 10:16
 */
public class MethodArgsTest {
    public static void main(String[] args) {
        MethodArgsTest m1 = new MethodArgsTest();
        m1.show(1);
        m1.show("hello");

    }

    public void show(int i){
        System.out.println("int");
    }
    public void show(String s){
        System.out.println("String");
    }

    public void show(String ... strs){
        System.out.println("String ... strs");
    }
}
