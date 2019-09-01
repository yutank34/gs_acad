package com.company.exericies.ex04;

public class Person {
    // フィールド = オブジェクトの持つデータ
    public String name;
    public String from;

    // コンストラクタ = オブジェクトの実体化のさせ方
    public Person(String name, String from) {
        this.name = name;
        this.from = from;
    }

    // メソッド = オブジェクトの持つ振る舞い
    public void getSelfIntroduction() {
        System.out.println("私の名前は" + this.name + "です。" + this.from + "出身です。" );
    }
}
