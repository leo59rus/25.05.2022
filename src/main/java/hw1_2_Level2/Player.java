package hw1_2_Level2;

public interface Player {  //действие игрока
    boolean isPlay();

    void jump(Wall wall); //в прыжок добавляем стену
    void run(Track track); //в бег добавляем бег дорожку
}
