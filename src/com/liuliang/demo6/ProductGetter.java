package com.liuliang.demo6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * <p>Description: 抽奖器</p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/4/30 - 10:48
 */
public class ProductGetter<T> {
    static Random random = new Random();
    private T product;
    ArrayList<T> list = new ArrayList<>();

    public void addProduct(T product) {
        list.add(product);
    }

    public T getProduct() {
        product = list.get(random.nextInt(list.size()));
        return product;
    }

    /**
     * 泛型方法
     * 只有泛型方法支持 static 修饰符
     *
     * @param list 传入的集合
     * @param <T>  泛型
     * @return 集合中的一个元素
     */
    public static <T> T getProduct(List<T> list) {
        return list.get(random.nextInt(list.size()));
    }

    public static <T> void print(T... t) {
        for (T t1 : t) {
            System.out.println(t1);
        }
    }
}
