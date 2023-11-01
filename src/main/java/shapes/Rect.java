package shapes;

import java.awt.*;

public class Rect extends Shape {
    private int width;
    private int height;


    public Rect(int width, int height, Point coords, Color colour){
        super(coords, colour);
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics g){
        g.setColor(colour);
        g.fillRect(coords.x, coords.y, width, height);
    }





}
