package com.company.practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Monster pikachu = new Monster("ピカチュウ", 10, "でんきポケモン", "でんこうせっか");
//        pikachu.name = "ピカチュウ";
//        pikachu.hp = 10;
//        pikachu.type = "でんきポケモン";
//        pikachu.waza = "でんこうせっか";
//        Monster pika = new Monster("ピカチュウ");

        // ヒトカゲ, 20, ひのこ, とかげポケモン
        Monster charmander = new Monster("ヒトカゲ", 20, "とかげポケモン", "ひのこ");
//        System.out.println(pikachu.name);
        pikachu.attack();
        charmander.attack();
    }
}
