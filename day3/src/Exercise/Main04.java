package Exercise;

public class Main04 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        for (int i = 1; i <= 4; i++ ) {
            if (i % 2 == 0) {
                animals[i-1] = new Cat("たま", 4);
            } else {
                animals[i-1] = new Dog("ぽち", 2);
            }
        }
        for (Animal animal : animals) {
            animal.speak();
        }
    }
}
