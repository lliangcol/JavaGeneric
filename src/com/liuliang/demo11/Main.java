package com.liuliang.demo11;

import java.lang.reflect.Constructor;

/**
 * <p>Description: 泛型和反射</p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/4/30 - 23:24
 */
public class Main {
    public static void main(String[] args) throws Exception {
        // 反射常用的泛型类
        Class<Person> personClass = Person.class;
        Constructor<Person> constructor = personClass.getConstructor();
        Person person = constructor.newInstance();
        person.setName("Jack");
        System.out.println(person.getName());
    }

    /**
     * 以下代码是不使用泛型的情况
     *
     * @param args
     * @throws Exception
     */
    public static void main1(String[] args) throws Exception {
        Class personClass = Person.class;
        Constructor constructor = personClass.getConstructor();
        Object o = constructor.newInstance();
        Person person = (Person) o;
        person.setName("Jack");
        System.out.println(person.getName());
    }
}
