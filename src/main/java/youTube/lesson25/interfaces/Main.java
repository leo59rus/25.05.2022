package youTube.lesson25.interfaces;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(1);
        Person person = new Person("Bob");
        animal.sleep();
        person.sayHello();
        System.out.println();

        animal.showInfo();
        person.showInfo();
        System.out.println();

        //для вызова методов только интерфейса
        Info info1 = new Animal(2);
        Info info2 = new Person("Karl");
        info1.showInfo();
        info2.showInfo();

       // info1.sleep();  // error
        System.out.println();

        outputInfo(animal);
    }
    public  static void outputInfo(Info info) {
        info.showInfo();
    }
}
