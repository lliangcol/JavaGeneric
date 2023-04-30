package com.liuliang.demo9;

/**
 * <p>Description: 桥接方法，保持接口和类的实现关系</p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/4/30 - 21:27
 */
public class InfoImpl implements Info<String> {
    @Override
    public String info(String s) {
        return s;
    }
}
