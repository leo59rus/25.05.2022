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
    public void jump(Wall wall) {
        if (isPlay()) { //если игрок в игре
            if (jumpLimit >= wall.getHeight()) { //предел прыжка б/р стены
                System.out.println(this + " успешно предолел " + wall);
            } else {
                System.out.println(this + " не предолел " + wall);
                play = false; //игрок не в игре
            }
        }
    }

    @Override
    public void run(Track track) {
        if (isPlay()) { //если игрок в игре
            if (runLimit >= track.getLength()) { //предел бега б/р бег дорожки
                System.out.println(this + " успешно предолел " + track);
            } else {
                System.out.println(this + " не предолел " + track);
                play = false; //игрок не в игре
            }
        }
    }

    @Override
    public String toString() {
        return "Робот модели " + name;
    }
}
