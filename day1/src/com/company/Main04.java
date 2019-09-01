package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main04 {
    public static void main(String[] args) {
        String[] questions = {"Q1", "Q2"};
        List<String> questionList = Arrays.asList(questions);
        Collections.shuffle(questionList);
        String[] answers = {"A1", "A2"};

        Scanner sc = new Scanner(System.in);

        int sum = 0;

        Random r = new Random();

//        Integer[] answered = new Integer[questions.length];

        for (int i = 0; i < questions.length; i++) {
//            // Qを出力して
//            int n = r.nextInt(questions.length);
//            if (Arrays.asList(answered).contains(n)) {
//                i--;
//                continue;
//            }
//            answered[i] = n;
            System.out.println(questions[n]);
            // Aを入力として受け取る
            String input = sc.next();
            sum += Integer.parseInt(input);
        }

        // Randomを使う方法
        // Collectionを使う方法
    }
}
