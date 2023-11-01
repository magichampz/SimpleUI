import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderListener implements ChangeListener {

    Drawing canvas;
    JSlider sliderR, sliderG, sliderB;
    public SliderListener(Drawing drawing, ControlPanel cp){
        this.canvas = drawing;
        this.sliderR = cp.sliderR;
        this.sliderG = cp.sliderG;
        this.sliderB = cp.sliderB;

    }


    public void stateChanged(ChangeEvent e) {
        JSlider slider = (JSlider) e.getSource();

        if (slider == sliderR) {
            canvas.redValue = slider.getValue();
//            displayRGBColor();
        } else if (slider == sliderG) {
            canvas.greenValue = slider.getValue();
//            displayRGBColor();
        } else if (slider == sliderB) {
            canvas.blueValue = slider.getValue();
//            displayRGBColor();
        }
        }
//        canvas.repaint();
    }