package com.liuliang.demo5;

/**
 * <p>Description: </p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/4/30 - 16:57
 */
public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        String appleKey = apple.getKey();
        System.out.println(appleKey);

        Pair<String, Integer> pair = new Pair<>("Hello World", 100);
        String key = pair.getKey();
        Integer value = pair.getValue();
        System.out.println("key = " + key);
        System.out.println("value = " + value);
    }
}
