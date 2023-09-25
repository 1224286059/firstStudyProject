import java.util.Scanner;
import java.util.Vector;

/**
 * @author XiangChen
 * @create 2023-09-18 20:16
 */
public class ScoreTest {

    public static void main(String[] args) {
        //实例化Scanner，从键盘获取值
        Scanner scanner = new Scanner(System.in);
        Vector v = new Vector();

        int maxScore = 0;
        for(;;){
            System.out.println("请输入学生成绩（输入负数代表输入结束）");
            int score = scanner.nextInt();
            if(score < 0){
                break;
            } else if (score>100) {
                System.out.println("输入数据非非法，请重新输入");
                continue;
            }
            //jdk1.5之前
//            Integer inScore = new Integer(score);
//            v.addElement(inScore);
            //jdk1.5之后
            v.addElement(score);//自动装箱
            if(maxScore < score){
                maxScore = score;
            }
        }

        //便利Vector,得到每个学生成绩，并于最大成绩比较，得到每个学生的等级
        char level;
        for(int i = 0;i < v.size();i++){
            Object obj = v.elementAt(i);
            //jdk1.5之前
//            Integer inScore = (Integer) obj;
//            int score = inScore.intValue();
            //jdk1.5之后
            Integer inScore = (Integer) obj;
            int score = inScore;
            int dis = maxScore - score;
            if(dis <= 10){
                level = 'A';
            } else if (dis <= 20) {
                level = 'B';
            }else if(dis <= 30){
                level = 'C';
            }else level = 'D';
            System.out.println("student" + i + "score is " + score + ",level is " + level);


        }

    }
}
