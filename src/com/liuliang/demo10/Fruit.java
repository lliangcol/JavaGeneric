package com.liuliang.demo10;

/**
 * <p>Description: 可以通过 java.lang.reflect.Array.newInstance(Class<?> componentType, int length) 方法创建带泛型的数组对象</p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/4/30 - 23:16
 */
public class Fruit<T> {
    private T[] array;

    public Fruit(Class<T> clz, int length) {
        array = (T[]) java.lang.reflect.Array.newInstance(clz, length);
    }

    public void put(int index, T item) {
        array[index] = item;
    }

    public T get(int index) {
        return array[index];
    }

    public T[] getArray() {
        return array;
    }
}
