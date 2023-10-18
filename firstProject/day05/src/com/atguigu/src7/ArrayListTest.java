package src.com.atguigu.src7;

import org.junit.jupiter.api.Test;
import src.com.atguigu.java2.Person;

import java.util.*;

/**
 * Author: CodeChen
 * Date: 2023-10-17 15:23
 * Description:
 **/
public class ArrayListTest {
    @Test
    public void test1(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add(234);
        arrayList.add("Aa");
        arrayList.add(new Person("Tom",12));
        arrayList.add(345);
        System.out.println(arrayList);
        //add(index,Object ele);
        arrayList.add(1,"xiangchen");
        System.out.println(arrayList);
    }

    @Test
    public void test2(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(234);
        arrayList.add("Aa");
        arrayList.add(new Person("Tom",12));
        arrayList.add(123);
        arrayList.add(1);
        System.out.println(arrayList);

        //addAll(index,Collection coll):index默认为最后一个位置
        Collection coll = Arrays.asList("nihao","xiangchen");
        //add(index,Object ele);
        arrayList.addAll(0,coll);
        System.out.println(arrayList);

        //get(index)获取index位置上的值
        System.out.println(arrayList.get(5));

        //indexOf(元素)：获取元素在集合中的位置（位置从0开始记）
        System.out.println(arrayList.indexOf("xiangchen"));

        //lastIndexof(元素)：获取元素最后一次出现的位置
        System.out.println(arrayList.lastIndexOf(123));

        arrayList.remove("xiangchen");
        System.out.println(arrayList);
        arrayList.remove(1);
        arrayList.remove(1);
        System.out.println(arrayList);
    }

    //对于remove()方法中删除index位置上的元素或直接删除元素的优先级:对于存在数字的元素的集合，若remove()中的数字
    // 在idea中是优先代表index的。
    @Test
    public void test3(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(3);
        arrayList.add(234);
        arrayList.add("aa");
        arrayList.add(3);
        arrayList.add(new Person("Tom",12));
        arrayList.add(123);
        arrayList.add(1);

        System.out.println(arrayList);
        arrayList.remove(3);
        System.out.println(arrayList);
        arrayList.remove(3);
        System.out.println(arrayList);

        //set(index,Object obj):重某位置上的元素
        arrayList.set(0,"guy");
        System.out.println(arrayList);
        //subList(int fromIndex,int toIndex):获取子段
        System.out.println(arrayList.subList(0,2));
    }

    //循环操作的三种方式
    @Test
    public void test4(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add(456);
        arrayList.add("xiangchen");
        arrayList.add(new Person("chen",12));
        arrayList.add("das");

        //第一种方式iterator
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //第二种方式增强式for
        for(Object obj:arrayList){
            System.out.println(obj);
        }
        //第三种普通式for
        for (int i = 0; i < arrayList.size()-1;i++){
            System.out.println(arrayList.get(i));
        }



    }
}
