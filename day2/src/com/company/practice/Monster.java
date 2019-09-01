package com.company.practice;

public class Monster {
    // フィールド ＝ オブジェクトが持つデータ
    public String name;
    public int hp;
    public String waza;
    public String type;

    public Monster() {
        System.out.println("コンストラクターが呼ばれた");
        this.hp = 10;
    }

    public Monster(String name) {
    }

    public Monster(String name, String waza) {

    }

    public Monster(String name, int hp, String type, String waza) {
        this.name = name;
        this.hp = hp;
        this.type = type;
        this.waza = waza;
    }


    // メソッド = オブジェクトの振る舞い
    public void attack() {
        System.out.println(this.name + "は" + this.waza + "を繰り出した");
    }
}
