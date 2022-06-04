package hw1_2_Level2;

public class Wall implements Barrier {  //стена
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void overcome(Player player) {
        player.jump(this); //на прыжок игрок принимает зиз стену
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Стена высотой " + height + " метров.";
    }
}
