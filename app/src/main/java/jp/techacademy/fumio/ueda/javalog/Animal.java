package jp.techacademy.fumio.ueda.javalog;

/**
 * Created by Fumio on 2017/09/13.
 */

abstract class Animal {
    // メンバ変数
    String name;  // 名前
    String hobby;
    int age;    // 年齢

    abstract public void say();
}