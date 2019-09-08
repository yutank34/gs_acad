package Exercise;

public class Animal {
    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showProfile() {
        System.out.println("名前は" + this.name + "年齢は" + this.age);
    }

    public void speak() {
        System.out.println("......");
    }

}
