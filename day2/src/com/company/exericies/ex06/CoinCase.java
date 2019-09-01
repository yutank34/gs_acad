package com.company.exericies.ex06;

public class CoinCase {
    // フィールド = オブジェクトの持つデータ
    public int count500y; // 500円玉の枚数
    public int count100y;
    public int count50y;
    public int count10y;
    public int count5y;
    public int count1y;

    public CoinCase() {}

    // メソッド
    public void addCoins(int type, int num) {
        if (type == 500) {
            this.count500y += num;
        } else if (type == 100) {
            this.count100y += num;
        } else if (type == 50) {
            this.count50y += num;
        } else if (type == 10) {
            this.count10y += num;
        } else if (type == 5) {
            this.count5y += num;
        } else {
            this.count1y += num;
        }
    }

    public int getCount(int type) {
        if (type == 500) {
            return this.count500y;
        } else if (type == 100) {
            return this.count100y;
        } else if (type == 50) {
            return this.count50y;
        } else if (type == 10) {
            return this.count10y;
        } else if (type == 5) {
            return this.count5y;
        } else {
            return this.count1y;
        }
    }

    public int getAmount() {
        return this.count500y * 500 + this.count100y * 100 + this.count50y * 50 + this.count10y * 10 + this.count5y * 5 + this.count1y;
    }


}
