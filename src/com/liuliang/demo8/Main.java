package com.liuliang.demo8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * <p>Description: </p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/4/30 - 20:30
 */
public class Main {
    public static void main1(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<MiniCat> miniCats = new ArrayList<>();

        //cats.addAll(animals);
        cats.addAll(new ArrayList<>());
        cats.addAll(miniCats);

        //showAnimal1(animals);
        showAnimal1(cats);
        showAnimal1(miniCats);

        showAnimal2(animals);
        showAnimal2(cats);
        //showAnimal2(miniCats);
    }

    public static void main(String[] args) {
        //TreeSet<Cat> cats = new TreeSet<>(new Comparator2());
        TreeSet<Cat> cats = new TreeSet<>(new Comparator1());
        cats.add(new Cat("Jack", 3));
        cats.add(new Cat("Jim", 1));
        cats.add(new Cat("Tom", 2));
        cats.add(new Cat("Jerry", 4));
        cats.add(new Cat("Lily", 5));

        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    /**
     * 通配符的上限
     *
     * @param list 列表
     */
    public static void showAnimal1(ArrayList<? extends Cat> list) {
        for (Cat cat : list) {
            System.out.println(cat);
        }
    }

    /**
     * 通配符的下限
     *
     * @param list 列表
     */
    public static void showAnimal2(ArrayList<? super Cat> list) {
        list.add(new Cat("Jack", 3));
        list.add(new MiniCat("Jim", 1, 1));
        for (Object o : list) {
            System.out.println(o);
        }
    }
}

class Comparator1 implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.name.compareTo(o2.name);
    }
}

class Comparator2 implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.age - o2.age;
    }
}

class Comparator3 implements Comparator<MiniCat> {
    @Override
    public int compare(MiniCat o1, MiniCat o2) {
        return o1.level - o2.level;
    }
}
