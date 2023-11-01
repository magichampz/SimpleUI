import shapes.Circle;
import shapes.Rect;
import shapes.Shape;
import shapes.Square;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Objects;

public class Drawing extends Canvas {

//    Circle circle = new Circle(50, new Point(100,100), Color.green );
//    Rect rect = new Rect(70,30,new Point(40,40), Color.blue);
//    Square square = new Square(70,30,new Point(150,150), Color.red);

    ArrayList<Shape> shapeList = new ArrayList<Shape>();
    int pointX, pointY, redValue, greenValue, blueValue;
    String nextShape;
    Shape newShape;

    public Drawing(ControlPanel cp){
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                pointX = e.getX();
                pointY = e.getY();

                redValue = cp.red;
                greenValue = cp.green;
                blueValue = cp.blue;
                nextShape = cp.selected;

                if (Objects.equals(nextShape, "Circle")) {
                    shapeList.add(new Circle(50, new Point(pointX,pointY), new Color(redValue,greenValue,blueValue)));
                } else if (Objects.equals(nextShape, "Rectangle")) {
                    shapeList.add(new Rect(70,30,new Point(pointX,pointY), new Color(redValue,greenValue,blueValue)));
                } else if (Objects.equals(nextShape, "Square")) {
                    shapeList.add(new Square(70,30,new Point(pointX,pointY), new Color(redValue,greenValue,blueValue)));
                }
//                shapeList.add(new Circle(50, new Point(pointX,pointY), new Color(redValue,greenValue,blueValue)));
                repaint();
                System.out.println("selected shape: " + nextShape + "\nred: "+ redValue +", green: " +greenValue + ", blue: " + blueValue);
            }
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        });
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
//        g.drawLine(0, 0, 100, 100);


        for (Shape shape : shapeList) {
            shape.draw(g);
        }

//        circle.draw(g);
//        rect.draw(g);
//        square.draw(g);
    }



}


