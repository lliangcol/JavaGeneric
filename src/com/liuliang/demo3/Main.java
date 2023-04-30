package com.liuliang.demo3;

/**
 * <p>Description: </p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/4/30 - 10:39
 */
public class Main {
    public static void main(String[] args) {
        ProductGetter<String> stringProductGetter = new ProductGetter<>();
        String[] strProducts = {"苹果手机", "华为手机", "小米手机", "魅族手机", "vivo手机", "oppo手机"};
        for (String strProduct : strProducts) {
            stringProductGetter.addProduct(strProduct);
        }
        String product1 = stringProductGetter.getProduct();
        System.out.println("抽中的商品是：" + product1);

        ProductGetter<Integer> integerProductGetter = new ProductGetter<>();
        Integer[] intProducts = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        for (Integer intProduct : intProducts) {
            integerProductGetter.addProduct(intProduct);
        }
        Integer product2 = integerProductGetter.getProduct();
        System.out.println("抽中的奖金是：" + product2);
    }
}
