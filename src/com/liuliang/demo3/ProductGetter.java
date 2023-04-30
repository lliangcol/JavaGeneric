package com.liuliang.demo3;

import java.util.ArrayList;
import java.util.Random;

/**
 * <p>Description: 抽奖器</p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/4/30 - 10:48
 */
public class ProductGetter<T> {
    Random random = new Random();
    private T product;
    ArrayList<T> list = new ArrayList<>();

    public void addProduct(T product) {
        list.add(product);
    }

    public T getProduct() {
        product = list.get(random.nextInt(list.size()));
        return product;
    }
}
