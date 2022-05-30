package hw1_level2;

public class Robot implements Ready, RunTrack, Wall{
    private String name;
    private double lengthRun = 29;
    private int heightJump = 5000;


    public Robot(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public double getLengthRun() {
        return lengthRun;
    }

    public int getHeightJump() {
        return heightJump;
    }

    @Override
    public void run(double length) {
        System.out.println("робот модели " + name + " пробежал "
                + length + " километров");
    }

    @Override
    public void jump(int height) {
        System.out.println("робот модели " + name + " подпрыгнул в высоту "
                + height + " сантиметров");

    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", lengthRun=" + lengthRun +
                ", heightJump=" + heightJump +
                '}';
    }

    @Override
    public void runTrack(double length) {
        if (length >= 8) {
            System.out.println("робот модели " + name + " пробежал дистанцию беговой дорожки");
        } else {
            System.out.println("робот модели " + name + " не пробежал дистанцию беговой дорожки");
        }
    }

    @Override
    public void jumpWall(int height) {
        if (height > 200) {
            System.out.println("робот модели " + name + " перепрыгнул стену высотой 2 метра");
        } else {
            System.out.println("робот модели " + name + " не перепрыгнул стену высотой 2 метра");
        }
    }
}
