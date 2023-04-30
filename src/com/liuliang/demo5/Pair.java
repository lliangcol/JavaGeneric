package com.liuliang.demo5;

/**
 * <p>Description: 泛型接口的实现类是一个泛型类</p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/4/30 - 17:01
 */
public class Pair<K, V> implements Generator<K> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
