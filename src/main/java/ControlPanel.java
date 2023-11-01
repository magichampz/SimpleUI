import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlPanel extends JPanel{

    int red, green, blue, length;
    String selected;
    JSlider sliderR, sliderG, sliderB;

    public ControlPanel(){
        JPanel sliderPanel=new JPanel();
        String[] items = {"Circle", "Rectangle", "Square"};
        sliderR = getSlider(0, 255, 0, 50, 5);
        sliderG = getSlider(0, 255, 0, 50, 5);
        sliderB = getSlider(0, 255, 0, 50, 5);
//        JSlider lengthSlider=new JSlider(30,80);
        JComboBox<String> shapeSelect = new JComboBox<>(items);
        shapeSelect.setSelectedItem("Circle");
        selected = (String) shapeSelect.getSelectedItem();
        sliderPanel.setLayout(new GridLayout(5,1));
        sliderPanel.add(new JLabel("R-G-B Sliders (0 - 255)"));
        sliderPanel.add(sliderR);
        sliderPanel.add(sliderG);
        sliderPanel.add(sliderB);
        sliderPanel.add(shapeSelect);
        System.out.println(shapeSelect.getSelectedItem());

//        sliderPanel.add(lengthSlider);

        this.add(sliderPanel);


        sliderR.addChangeListener(new ChangeListener(){
            public void stateChanged(ChangeEvent e) {
                red = sliderR.getValue();
            }
        });

        sliderG.addChangeListener(new ChangeListener(){
            public void stateChanged(ChangeEvent e) {
                green = sliderG.getValue();
            }
        });

        sliderB.addChangeListener(new ChangeListener(){
            public void stateChanged(ChangeEvent e) {
                blue = sliderB.getValue();
            }
        });

        shapeSelect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the selected item from the JComboBox
                selected = (String) shapeSelect.getSelectedItem();
            }
        });
//
//        lengthSlider.addChangeListener(new ChangeListener(){
//            public void stateChanged(ChangeEvent e) {
//                length = lengthSlider.getValue();
//            }
//        });

}
    public JSlider getSlider(int min, int max, int init, int mjrTkSp, int mnrTkSp) {
        JSlider slider = new JSlider(JSlider.HORIZONTAL, min, max, init);
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(mjrTkSp);
        slider.setMinorTickSpacing(mnrTkSp);
        slider.setPaintLabels(true);
//        slider.addChangeListener(new SliderListener());
        return slider;
    }
}
