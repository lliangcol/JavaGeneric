package com.liuliang.demo1;

import java.util.ArrayList;

/**
 * <p>Description: 泛型产生的背景</p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/4/30 - 9:44
 */
public class Main {
    public static void main1(String[] args) {
        /*
          1. 泛型的作用
          Java 推出泛型以前，构建一个元素类型为 Object 的集合，可以存放任意类型的对象
          但是在取出元素时，需要强制类型转换，这样会带来两个问题：
          1. 需要强制类型转换
          2. 不能保证类型安全
         */
        var list = new ArrayList();
        list.add("hello");
        list.add(100);
        list.add(true);

        for (Object o : list) {
            // Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
            // 异常发生在运行时
            String s = (String) o;
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        /*
          2. 泛型的作用
          1. 可以在编译时检查类型安全
          2. 可以避免强制类型转换
         */
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        /*
          1. 在编译时，就会报错
          2. 不能添加非 String 类型的元素
          list.add(100); // 编译时报错
          list.add(true); // 编译时报错
         */
        for (String s : list) {
            System.out.println(s);
        }
    }
}
