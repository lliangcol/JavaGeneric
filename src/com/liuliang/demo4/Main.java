package com.liuliang.demo4;

/**
 * <p>Description: </p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/4/30 - 16:44
 */
public class Main {
    public static void main(String[] args) {
        ChildFirst<String> childFirst = new ChildFirst<>();
        childFirst.setValue("Hello World");
        System.out.println(childFirst.getValue());

        ChildSecond childSecond = new ChildSecond();
        childSecond.setValue(100);
        System.out.println(childSecond.getValue());
    }
}
