package shapes;

import java.awt.*;

public class Circle extends Shape {

    private int radius;

    public Circle(int radius, Point coords, Color colour){
        super(coords, colour);
        this.radius = radius;
    }

//    @Override
    public void draw(Graphics g){
        g.setColor(colour);
        g.fillOval(coords.x, coords.y, radius, radius);
    }
}
