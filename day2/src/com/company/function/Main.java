package com.company.function;

public class Main {
    public static void main(String[] args) {
//        int result = sum(2, 3);
//        System.out.println(result);
        System.out.println(add("こんにちは", "世界"));
        sayYeah();
    }

    static String add(String pre, String suf) {
        return pre + suf;
    }

    static int sum(int a, int b) {
        return a + b;
    }

    // 文字列 を二つ受け取って、くっつけて文字列を返す関数


    static void sayYeah() {
        System.out.println("SayYeah");
    }
}
