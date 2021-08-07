import java.awt.*;

public class WhiteTiger extends Critter{
    private int move;
    private boolean infected;

    public Color getColor() {
        return Color.WHITE;
    }

    public String toString() {
        if (!infected) {
            return "tgr";
        } else {
            return "TGR";
        }
    }

    public Action getMove(CritterInfo info) {
        move++;
        if (info.getFront() == Neighbor.OTHER) {
            this.infected = true;
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
            return Action.LEFT;
        } else if (info.getFront() == Neighbor.SAME) {
            return Action.RIGHT;
        } else {
            return Action.HOP;
        }
    }
}
