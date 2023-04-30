package com.liuliang.demo10;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * <p>Description: 泛型与数组</p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/4/30 - 21:35
 */
public class Main {
    public static void main1(String[] args) {
        // 可以声明带泛型的数组引用，但是不能直接创建带泛型的数组对象
        //ArrayList<String>[] arrayLists = new ArrayList<String>[10]; // 编译错误
        ArrayList<String>[] arrayLists = new ArrayList[10]; // 正确

        // 不能直接暴露泛型数组引用的对象，因为会破坏泛型的类型检查
        ArrayList[] lists = new ArrayList[10];
        ArrayList<String>[] stringArrayLists = lists;

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);

        lists[0] = integerArrayList;
        String s = stringArrayLists[0].get(0);// java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
        System.out.println(s);
    }

    public static void main(String[] args) {
        Fruit<String> fruit = new Fruit<>(String.class, 7);
        fruit.put(0, "苹果");
        fruit.put(1, "西瓜");
        fruit.put(2, "香蕉");
        fruit.put(3, "橘子");
        fruit.put(4, "葡萄");
        fruit.put(5, "梨");
        fruit.put(6, "桃子");

        System.out.println("fruits = " + Arrays.toString(fruit.getArray()));
    }
}
