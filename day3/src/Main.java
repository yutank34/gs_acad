public class Main {
    public static void main(String[] args) {
        PocketMonster pikachu = new PocketMonster("ピカチュウ", 10, "でんこうせっか", "ねずみポケモン", "ライチュウ");
//        pikachu.attack(); //　親クラスのメソッドを呼び出してる
//        pikachu.evolution(); // 子クラスのメソッドを呼び出してる
//        pikachu.attack();

        DqMonster slime = new DqMonster("スライム", 20, "体当たり", "スライム系", 2);
        slime.setName("スラリン");
        System.out.println(slime.getName());
//        slime.attack();
//
//        System.out.println("ここから配列を使ってattack");
//        Monster[] monsters = new Monster[5];
//        monsters[0] = slime;
//        monsters[1] = pikachu;
//        for (int i = 0; i < 2; i++) {
//            monsters[i].attack();
//        }
    }
}
