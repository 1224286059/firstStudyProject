/**
 * @author XiangChen
 * @create 2023-09-18 18:27
 */

class Base{
    int count = 10;
    public void display(){
        System.out.println(this.count);
    }
}

class Sub extends Base{
    int count = 20;

    public void display() {
        System.out.println(this.count);
    }
}

public class FieldMethodTest {
    public static void main(String[] args) {
        Sub s = new Sub();
        System.out.println(s.count);
        s.display();
        Base b = s;
        System.out.println(s == b);
        System.out.println(b.count);
        b.display();
    }
}
