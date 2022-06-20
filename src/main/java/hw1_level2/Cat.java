package hw1_level2;

public class Cat implements Ready, RunTrack, Wall{
    private String name;
    private double lengthRun = 0.2;
    private int heightJump = 25;



    public double getLengthRun() {
        return lengthRun;
    }

    public int getHeightJump() {
        return heightJump;
    }

    public String getName() {
        return name;
    }



    public Cat(String name) {
        this.name = name;
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
                ", lengthRun=" + lengthRun +
                ", heightJump=" + heightJump +
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
