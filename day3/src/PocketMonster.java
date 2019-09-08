public class PocketMonster extends Monster{
    public String nextName; // 進化後の名前

    public PocketMonster(String name, int hp, String waza, String type, String nextName) {
        super(name, hp, type, waza);
        this.nextName = nextName;
    }

    public void evolution() {
        System.out.println(this.name + "は" + this.nextName + "に進化した！");
        this.name = this.nextName;
    }
}
