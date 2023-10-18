package src.com.atguigu.java1;

import org.junit.jupiter.api.Test;
import src.com.atguigu.java2.Person;

import java.util.*;

/**
 * Author: CodeChen
 * Date: 2023-10-17 21:40
 * Description:
 **/


public class CollectionTest {

    /*
    一. Set:存储无序的，不可重复的数据
    以HashSet为例：
    （1）无序性不代表随机性。存储的数据在底层数组中并非按照数组索引的顺序添加，而是根据的哈希值决定的
    （2）不可重复性：保证添加的元素按照元素添加equals()判断时，不能反悔true，相同的元素只能添加一个
        （若自写的类中没有重写HashCode就会重复添加。）
    二.添加元素的过程，HashSet为例：
    (1)我们向HashSet中添加元素a，首先调用元素a所在类的hashCode()方法，计算元素a的哈希值
    (2)此哈希值接着通过某种算法计算出HashSet底层数组中的存放位置（即索引位置），判断该位置上是否已有元素
        如果该位置上没有元素，则元素a添加成功 --->情况1
        如果该位置上有元素，则该位置上有其他元素b（或义链表形式存在的多个元素），则比较元素a和元素b的hash值
            如果hash值不相同，则元素a添加成功 --->情况2
            如果hash值相同，则需要调用元素a所在类的equals()方法：
                equals()返回true，元素添加失败
                equals()返回false，元素添加成功 --->情况3
         对于情况2和情况3而言，元素a与已存在指定索引位置上的元素以链表的方式存储
         jdk7：元素a放到数组中，指向原来的元素
         jdk8：原来的元素在数组中，指向元素a
         （七上八下）
     */
    @Test
    public void test1(){
        Set set = new HashSet();
        set.add(213);
        set.add("AA");
        set.add("CC");
        set.add(new User("xiangchen",12));
        set.add(new User("xiangchen",12));
        set.add(234);
        set.add(213);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    /*
    LinkedHashSet的使用
    （1）作为hashSet的子类，遍历其内部的数据时，可以按照添加的顺序进行
    （2）对于频繁的遍历操作，LinedHashSet效率高于HashSet
     */

    @Test
    public void test2(){
        Set set = new LinkedHashSet();
        set.add(213);
        set.add("AA");
        set.add("CC");
        set.add(new User("xiangchen",12));
        set.add(new User("xiangchen",12));
        set.add(234);
        set.add(213);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }


    /*
    TreeSet:
        （1）不能添加不同类的对象
        （2）两种排序方法：自然排序(实现Comparable接口)和定制排序
        （3）自然排序中，比较两个对象是否相同的标准为:compareTo()返回0，不再是equals().


     */
    @Test
    public void test3(){
        Set set = new TreeSet();
//        set.add(213);
//        set.add(12);
//        set.add(3);
//        set.add(20);
//        set.add(234);
        //其中User类继承了Comparable,重写了CompareTo方法，按照name的大小进行比较
        set.add(new User("xiangchen",12));
        set.add(new User("yundanqingfeng",12));
        set.add(new User("wanganshi",12));
        set.add(new User("lihua",12));
        set.add(new User("lihua",6));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    @Test
    public void test4(){
        Comparator comparator = new Comparator() {
            //按照年龄从小到大的顺序排列
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User){
                    User user1 = (User) o1;
                    User user2 = (User) o2;
                    return Integer.compare(user1.getAge(),user2.getAge());
                }else {
                    throw new RuntimeException("输入的数组类型不匹配");
                }
            }
        };

        TreeSet set = new TreeSet(comparator);
        set.add(new User("xiangchen",12));
        set.add(new User("yundanqingfeng",13));
        set.add(new User("wanganshi",14));
        set.add(new User("lihua",12));
        set.add(new User("lihua",6));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
