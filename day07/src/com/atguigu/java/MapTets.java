package src.com.atguigu.java;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Author: CodeChen
 * Date: 2023-10-19 16:08
 * Description:
 **/
public class MapTets {

    @Test
    public void test1(){
        Map map = new HashMap();
        map.put("AA",23);
        map.put("CC",21);
        map.put("DD",22);
        //修改操作
        map.put("DD",23);
        map.put(123,123);
        System.out.println(map);
        //putAll(Map)
        Map map1 = new HashMap();
        map1.put("asd",123);
        map1.put("asf",1);
        map.putAll(map1);
        System.out.println(map);
        //remove(key):返回的是删除key对应的value
        Object value = map.remove("CC");
        System.out.println(value);
        System.out.println(map);

        //clear(),与map = null操作不同
        map.clear();
        System.out.println(map.size());
        System.out.println(map);
    }

    @Test
    public void test2(){
        Map map = new HashMap();
        map.put("AA",23);
        map.put("CC",21);
        map.put("DD",22);

        //get(key)
        System.out.println(map.get("AA"));
        //containsKey(key)
        System.out.println(map.containsKey("CC"));
        //containsValue(value)
        System.out.println(map.containsValue(23));

    }

    @Test
    public void test3(){
        Map map = new HashMap();
        map.put("AA",23);
        map.put("CC",21);
        map.put("DD",22);
        //遍历获得key的Set
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //遍历所有的value
        for (Object value : map.values()) {
            System.out.println(value);
        }

        //遍历所有的key-value
        Set set1 = map.entrySet();
        Iterator iterator1 = set1.iterator();
        while (iterator1.hasNext()){
            Object o = iterator1.next();
            //entrySet集合中的元素都是entry
            Map.Entry entry = (Map.Entry)o;
            System.out.println(entry.getKey() + "---->" + entry.getValue());
        }

    }
}
