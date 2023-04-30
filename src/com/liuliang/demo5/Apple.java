package com.liuliang.demo5;

/**
 * <p>Description: 实现泛型接口的类不是泛型类，需要明确实现泛型接口的数据类型</p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/4/30 - 16:59
 */
public class Apple implements Generator<String> {
    @Override
    public String getKey() {
        return "apple";
    }
}
