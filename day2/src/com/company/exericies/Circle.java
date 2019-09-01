package com.company.exericies;

public class Circle {

	// フィールド = オブジェクトが持つデータ
	public int radius; // 半径

	// コンストラクタ
	// 引数なしコンストラクタ
	public Circle() {
		this.radius = 5;
	}
	// 引数ありコンストラクタ
	public Circle(int radius) {
		this.radius = radius;
	}

	// メソッド = オブジェクトの振る舞い
	// 面積を求めるメソッド
	public double getArea() {
		return (radius * radius * 3.14);
	}
	// 円周を求めるメソッド
	public double getCircumference() {
		return (2 * radius * 3.14);
	}
	// fuga
}
