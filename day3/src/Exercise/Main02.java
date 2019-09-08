package Exercise;

public class Main02 {
    public static void main(String[] args) {
        Cat cat = new Cat("たま", 5);
        Dog dog = new Dog("ぽち", 2);
        cat.showProfile();
        cat.sleep();
        dog.showProfile();
        dog.run();
    }
}
