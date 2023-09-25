package com.stgui.java;

/**
 * @author XiangChen
 * @create 2023-09-18 15:06
 */
public class Mankind {
    int sex;
    int salary;

    void manOrWoman(){
        if(sex == 1){
            System.out.println("man");
        } else if (sex == 0) {
            System.out.println("woman");
        }
    }

    void employeed(){
        if(salary == 0){
            System.out.println("no job");
        } else {
            System.out.println("job");
        }
    }
}
