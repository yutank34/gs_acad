package Exercise;

public class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age);
    }
    public void sleep() {
        System.out.println("スースー");
    }

    @Override
    public void speak() {
        System.out.println("にゃー");
    }
}
