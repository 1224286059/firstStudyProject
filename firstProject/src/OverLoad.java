/**
 * @author XiangChen
 * @create 2023-09-18 10:11
 */
public class OverLoad {
    public void test(String[] msg){
        System.out.println("含字符串数组参数的test方法 ");
    }
    public void test1(String book){
        System.out.println("****与可变形参方法构成重载的test1方法****");
    }
    public void test1(String ... books){
        System.out.println("****形参长度可变的test1方法****");
    }
}
