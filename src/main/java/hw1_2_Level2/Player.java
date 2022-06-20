package hw1_2_Level2;

public interface Player {  //действие игрока
    boolean isPlay();
    void setPlay(boolean play);
    int getJumpLimit();
    int getRunLimit();

    default void jump(Wall wall) {//метод с реализацией дефолт можно не переопределять в наследниках
        if (isPlay()) { //если игрок в игре
            if (getJumpLimit() >= wall.getHeight()) { //предел прыжка б/р стены
                System.out.println(this + " успешно предолел " + wall);
            } else {
                System.out.println(this + " не предолел " + wall);
                setPlay(false); //игрок не в игре
            }
        }
    }
    default void run(Track track) {
        if (isPlay()) { //если игрок в игре
            if (getRunLimit() >= track.getLength()) { //предел бега б/р бег дорожки
                System.out.println(this + " успешно предолел " + track);
            } else {
                System.out.println(this + " не предолел " + track);
                setPlay(false); //игрок не в игре
            }
        }
    }
}
