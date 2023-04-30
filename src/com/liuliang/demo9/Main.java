package com.liuliang.demo9;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * <p>Description: 类型擦除</p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/4/30 - 21:03
 */
public class Main {
    public static void main1(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        Class classStringArrayList = stringArrayList.getClass();
        System.out.println(classStringArrayList);
        Class classIntegerArrayList = integerArrayList.getClass();
        System.out.println(classIntegerArrayList);

        System.out.println(classStringArrayList == classIntegerArrayList);
    }

    public static void main2(String[] args) {
        Erasure<Integer> erasure = new Erasure<>();
        Class<? extends Erasure> clz = erasure.getClass();
        Field[] declaredFields = clz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName() + ":" + declaredField.getType().getSimpleName());
        }

        Erasure1<Integer> erasure1 = new Erasure1<>();
        Class<? extends Erasure1> clz1 = erasure1.getClass();
        Field[] declaredFields1 = clz1.getDeclaredFields();
        for (Field declaredField : declaredFields1) {
            System.out.println(declaredField.getName() + ":" + declaredField.getType().getSimpleName());
        }

        Method[] declaredMethods = clz1.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName() + ":" + declaredMethod.getReturnType().getSimpleName());
        }
    }

    public static void main(String[] args) {
        InfoImpl info = new InfoImpl();
        System.out.println(info.info("hello"));

        Class<? extends InfoImpl> clz = info.getClass();
        Method[] declaredMethods = clz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName() + ":" + declaredMethod.getReturnType().getSimpleName());
        }
    }
}
