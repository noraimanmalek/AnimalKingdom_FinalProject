import java.awt.*;

public class Giant extends Critter {
    private int move;

    public Color getColor() {
        return Color.GRAY;
    }

    public String toString() {
        if (move < 6) {
            return "fee";
        } else if (move < 12) {
            return "fie";
        } else if (move < 18) {
            return "foe";
        } else if (move < 24){
            return "fum";
        } else {
            move = 0;
            return "fee";
        }
    }

    public Action getMove(CritterInfo info) {
        move++;
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.RIGHT;
        }
    }
}
