package hw1_2_Level2;

public class Track implements Barrier { //беговая дорожка
    private int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public void overcome(Player player) {
        player.run(this);//игрок бежит и принимает зиз беговую дорожку
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "беговая дорожка длиной " + length + " метров";
    }
}
