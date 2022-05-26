package youTube.lesson25;

public class Lesson25 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        Dog dog = new Dog();
        dog.eat();//ызовется метод у дог
        dog.sleep();
        dog.bark();
        dog.showName();

    }
}
