package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // {"apple", "りんご"}
//        String[] words1 = new String[10];
//
//        // {"apple", "grape"}
//        // {"リンゴ", "ぶどう"}
//        String[] words2 = new String[10];
//        String[] meanings = new String[10];
//
//        // {{"apple", "りんご"}, {"grape", "ぶどう}}
//        String[][] words3 = new String[10][2];
//        words3[0][0] = "apple";
//        words3[0][1] = "りんご";
//
//        String x1 = "aaa";
//        String x2 = new String("aaa");

        // {Words(word="apple", meaning="りんご"), ...}
//        Word[] words4 = new Word[10]; // { , , , , , , , ...}
//        words4[0] = new Word(); // {Word(), , , , , , ...}
//        words4[0].word = "apple";
//        words4[0].meaning = "りんご";

//        int y = 10; // プリミティブ型
//        String z = "aaa"; // 参照型
//        Scanner scanner = new Scanner(System.in); // Scannerのインスタンス化
//        String input = scanner.nextLine(); // "apple りんご"みたいな形式で文字列を受け取る
//        String[] wordAndMeaning = input.split(" "); // {"apple", "りんご"}みたいな形で文字列を分割した配列を受け取る
//        Word word = new Word(wordAndMeaning[0], wordAndMeaning[1]); // Wordのインスタンス化: word = "apple", meaing = "りんご"
//        System.out.println(word); // System.out.println()メソッドの引数で参照型のオブジェクトを渡した場合、暗黙的にtoStringメソッドが呼ばれる
////        System.out.println(wordAndMeaning);
//        String s = "ああああ";
//        s.toString();
//        System.out.println(s);
        Word[] words = new Word[10];
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while(count < 10) {
            // 入力を受け取る
            String input = scanner.nextLine();

            if (input.equals("e")) {
                break;
            }

            // 受け取った入力をスペース区切りで分割する
            String[] wordAndMeaning = input.split(" ");

            // 分割した0番目を単語として、 １番目を意味としてWordを生成する
            Word word = new Word(wordAndMeaning[0], wordAndMeaning[1]);

            // wordsに生成したWordをセットする
            words[count] = word;
            count++;
        }

        // 出力処理
        System.out.println(count + "件登録完了");
        for (int i = 0; i < count; i++) {
            System.out.println("単語は" + words[i].word + "意味は" + words[i].meaning);
        }
//        System.out.println(word.word);
//        System.out.println(word.meaning);







                // 単語と意味のセットで10個
    }
}
