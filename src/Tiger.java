import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Tiger extends Critter {
    private Color newColor;
    private int move;
    ArrayList<Color> color = new ArrayList<Color>();

    public Color getColor() {
        color.add(Color.RED);
        color.add(Color.BLUE);
        color.add(Color.GREEN);
        Random rand = new Random();
        if (move % 3 == 0) {
            Color aColor = color.get(rand.nextInt(color.size()));
            this.newColor = aColor;
            return newColor;
        } else {
            return this.newColor;
        }
    }

    public String toString() {
        return "TGR";
    }

    public Action getMove(CritterInfo info) {
        move++;
        if (info.getFront() == Neighbor.OTHER) {
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
