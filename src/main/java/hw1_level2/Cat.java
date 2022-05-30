package hw1_level2;

public class Cat implements Ready, RunTrack, Wall{
    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public void run(double length) {
        System.out.println("кот по имени " + name + ", пробежал " + length + " кмлометров");
    }

    @Override
    public void jump(int height) {
        System.out.println("кот по имени " + name + ", подпрыгнул в высоту на  " + height + " свнтиметров");
    }

    @Override
    public void runTrack(double length) {
        if (length >= 8) {
            System.out.println("кот по имени " + name + " пробежал дистанцию беговой дорожки");
        } else {
            System.out.println("кот по имени " + name + " не пробежал дистанцию беговой дорожки");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


    @Override
    public void jumpWall(int height) {
        if (height > 200) {
            System.out.println("кот по имени " + name + " перепрыгнул стену высотой 2 метра");
        } else {
            System.out.println("кот по имени " + name + " не перепрыгнул стену высотой 2 метра");
        }
    }
}
