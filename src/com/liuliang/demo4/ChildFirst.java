package com.liuliang.demo4;

/**
 * <p>Description: 子类也是泛型类，子类的泛型标识要和父类一致</p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/4/30 - 16:48
 */
public class ChildFirst<T> extends Parent<T> {
    @Override
    public T getValue() {
        return super.getValue();
    }
}
