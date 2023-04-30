package com.liuliang.demo2;

/**
 * <p>Description: 泛型类</p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/4/30 - 10:15
 */
public class Main {
    public static void main(String[] args) {
        // 创建对象时指定具体的类型，Java 7 之后，可以省略后面的类型
        Generic<String> genericStr = new Generic<>("hello");
        System.out.println(genericStr);
        System.out.println(genericStr.getKey());
        genericStr.setKey("world");
        System.out.println(genericStr.getKey());

        Generic<Integer> genericInt = new Generic<>(123);
        System.out.println(genericInt);
        System.out.println(genericInt.getKey());
        genericInt.setKey(456);
        System.out.println(genericInt.getKey());

        // 创建对象时不指定具体的类型，将按照 Object 处理
        Generic generic = new Generic("hello");
        System.out.println(generic);
        Object key1 = generic.getKey();
        System.out.println(key1);
        generic.setKey(123);
        Object key2 = generic.getKey();
        System.out.println(key2);

        /*
          泛型类不支持基本数据类型，如 Generic<int> genericInt = new Generic<>(123);
          但可以使用包装类，如 Generic<Integer> genericInt = new Generic<>(123);

          泛型类的类型参数只能是类类型，不能是简单类型
         */

        /*
          运行时的类对象是相同的，都是 Generic
         */
        System.out.println(genericStr.getClass());
        System.out.println(genericInt.getClass());
        System.out.println(generic.getClass());
    }
}
