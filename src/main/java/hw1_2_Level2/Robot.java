package hw1_2_Level2;

public class Robot implements Player {
    private final String name;
    private final int runLimit; //предел беговой дистанции
    private final int jumpLimit;  //предел высоты прыжка
    private boolean play;

    public Robot(String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.play = true;
    }


    @Override
    public boolean isPlay() {
        return play; //возвращаем результат проверки преодоления препятствия
    }
    @Override
    public int getRunLimit() {
        return runLimit;
    }

    @Override
    public int getJumpLimit() {
        return jumpLimit;
    }

    @Override
    public void setPlay(boolean play) {
        this.play = play;
    }

    @Override
    public String toString() {
        return "Робот модели " + name;
    }
}
