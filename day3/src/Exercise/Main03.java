package Exercise;

public class Main03 {
    public static void main(String[] args) {
        Cat cat = new Cat("たま", 5);
        Dog dog = new Dog("ぽち", 2);
        cat.showProfile();
        dog.showProfile();
        cat.speak();
        dog.speak();
    }
}
