package shapes;

import java.awt.*;



public abstract class Shape implements Drawable {
    protected Point coords;
    protected Color colour;

    public Shape(Point coords, Color colour) {
        this.coords = coords;
        this.colour = colour;
    }



//    public abstract void draw(Graphics g);


}
