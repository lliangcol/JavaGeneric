package com.liuliang.demo6;

import java.util.List;

/**
 * <p>Description: 泛型方法的使用</p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/4/30 - 17:16
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("苹果手机", "华为手机", "小米手机", "魅族手机", "vivo手机", "oppo手机");
        String product1 = ProductGetter.getProduct(list);
        System.out.println("抽中的商品是：" + product1);

        ProductGetter.print("hello", "world", "java", "python", "c++");
    }
}
