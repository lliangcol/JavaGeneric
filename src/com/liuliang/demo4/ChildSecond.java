package com.liuliang.demo4;

/**
 * <p>Description: 子类不是泛型类，要指定父类泛型参数的具体类型</p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/4/30 - 16:53
 */
public class ChildSecond extends Parent<Integer> {
    @Override
    public Integer getValue() {
        return super.getValue() * 10;
    }
}
