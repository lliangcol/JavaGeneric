package com.liuliang.demo9;

import java.util.List;

/**
 * <p>Description: 有限制类型擦除：将 T 变为上限类型</p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/4/30 - 21:16
 */
public class Erasure1<T extends Number> {
    private T key;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public static <T extends Number> T getMiddle(T... a) {
        return a[a.length / 2];
    }

    public static <T extends List> T show(T t) {
        return t;
    }
}
