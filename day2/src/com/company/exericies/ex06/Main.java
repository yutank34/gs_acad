package com.company.exericies.ex06;

public class Main {
    public static void main(String[] args) {
        CoinCase coinCase = new CoinCase();
        coinCase.addCoins(500, 10);
        coinCase.addCoins(50, 1);
//        System.out.println(coinCase.getCount(500));
        System.out.println(coinCase.getAmount());
    }
}
