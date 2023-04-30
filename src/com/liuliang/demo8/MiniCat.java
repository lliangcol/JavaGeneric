package com.liuliang.demo8;

/**
 * <p>Description: </p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/4/30 - 20:31
 */
public class MiniCat extends Cat {
    public int level;

    public MiniCat(String name, int age, int level) {
        super(name, age);
        this.level = level;
    }

    @Override
    public String toString() {
        return "MiniCat{" +
                "level=" + level +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
