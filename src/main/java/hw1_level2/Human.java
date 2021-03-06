package hw1_level2;

class Human implements Ready, RunTrack, Wall{
    private String name;
    private double lengthRun = 10;
    private int heightJump = 120;

    public double getLengthRun() {
        return lengthRun;
    }

    public int getHeightJump() {
        return heightJump;
    }

    public Human(String name) {
        this.name = name;

    }



    public String getName() {
        return name;
    }



    @Override
    public void run(double length) {
        System.out.println("человек по имени " + name + ", пробежал " + length + " километров");
    }


    @Override
    public void jump(int height) {
        System.out.println("человек по имени " + name + ", подпрыгнул в высоту на  " + height + " свнтиметров");

    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lengthRun=" + lengthRun +
                ", heightJump=" + heightJump +
                '}';
    }

    @Override
    public void runTrack(double length) {
        if (length >= 8) {
            System.out.println("человек по имени " + name + " пробежал дистанцию беговой дорожки");
        } else {
            System.out.println("человек по имени " + name + " не пробежал дистанцию беговой дорожки");
        }
    }

    @Override
    public void jumpWall(int height) {

        if (height > 200) {
            System.out.println("человек по имени " + name + " перепрыгнул стену высотой 2 метра");
        } else {
            System.out.println("человек по имени " + name + " не перепрыгнул стену высотой 2 метра");
        }
    }
}
