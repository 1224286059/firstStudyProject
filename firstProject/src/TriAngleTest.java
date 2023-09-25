/**
 * @author XiangChen
 * @create 2023-09-18 11:32
 */
public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle t1 = new TriAngle();
        t1.changeBase(2);
        t1.changeHeight(5);
        System.out.println(t1.getArea());
    }
}

class TriAngle{
    private double base;
    private double height;
    public TriAngle(){
        base = 0;
        height = 0;
    }
    public double getBase(){
        return base;
    }

    public double getHeight() {
        return height;
    }
    public  void changeBase(double b){
        base = b;
    }
    public void changeHeight(double h){
        height = h;
    }
    public double getArea(){
        return base*height*0.5;
    }
}
