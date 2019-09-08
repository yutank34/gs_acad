public class DqMonster extends Monster{
    public int damage;

    public DqMonster(String name, int hp, String waza, String type, int damage) {
        super(name, hp, type, waza);
        this.damage = damage;
    }

    @Override //　省略しても大丈夫なんだけど、書いた方が圧倒的に良い
    public void attack() {
        System.out.println(this.name + "は攻撃を繰り出した");
        System.out.println(this.damage + "のダメージを与えた!");
    }
}
