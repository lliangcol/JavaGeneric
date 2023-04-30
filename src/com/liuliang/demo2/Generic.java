package com.liuliang.demo2;

/**
 * <p>Description: 泛型类的定义</p>
 * @param <T> 泛型类型-定义在类名后面，类型参数可以有多个，用逗号隔开，如<T, E, K, V>，创建对象时指定具体的类型
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/4/30 - 10:10
 */
public class Generic<T> {
    private T key;

    public Generic(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Generic{" +
                "key=" + key +
                '}';
    }
}
