import java.awt.*;

public class Bear extends Critter {
    private boolean answer;
    private int move;

    public Bear(boolean polar) {
        this.answer = polar;
        move++;
    }

    public Color getColor() {
        if (answer == true) {
            return Color.WHITE;
        } else {
            return Color.BLACK;
        }
    }

    public String toString() {
        if (move % 2 == 0) {
            return "\\";
        } else {
            return "/";
        }
    }

    public Action getMove(CritterInfo info) {
        move++;
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.LEFT;
        }
    }
}
