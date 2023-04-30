package com.liuliang.demo7;

/**
 * <p>Description: </p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/4/30 - 20:17
 */
public class Main {
    public static void main(String[] args) {
        Box<Number> box = new Box<>();
        box.setFirst(100);
        showBox1(box);

        Box<Integer> box1 = new Box<>();
        box1.setFirst(200);
        //showBox(box1);
        showBox2(box1);
        showBox3(box1);
    }

    public static void showBox1(Box<Number> box) {
        Number first = box.getFirst();
        System.out.println(first);
    }

    /**
     * 通配符
     * @param box
     */
    public static void showBox2(Box<?> box) {
        Object first = box.getFirst();
        // 除了写入 null 值外，不允许写入其它任何值
        //box.setFirst(null);
        System.out.println(first);
    }

    /**
     * 通配符上限
     * @param box
     */
    public static void showBox3(Box<? extends Number> box) {
        Number first = box.getFirst();
        // 除了写入 null 值外，不允许写入其它任何值
        //box.setFirst(null);
        System.out.println(first);
    }
}
