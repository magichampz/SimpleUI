import javax.naming.ldap.Control;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {


    static GraphicsConfiguration gc;	// Contains this computer’s graphics configuration

    public static void main(String[] args) {
        JFrame frame= new JFrame(gc);	// Create a new JFrame
        ControlPanel controlPanel = new ControlPanel();
        Drawing drawing = new Drawing(controlPanel);
        MainMenu mainMenu = new MainMenu(drawing);
        frame.setSize(500,300);
        frame.setVisible(true);
        frame.setJMenuBar(mainMenu);
        // This next line closes the program when the frame is closed
        frame.addWindowListener(new WindowAdapter() {	// Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        // Create the JPanels and the components
        JPanel mainPanel=new JPanel();
//        JPanel sliderPanel=new JPanel();
//        JSlider redSlider=new JSlider(1,255); // Sets range of slider
//        JSlider greenSlider=new JSlider(1,255);
//        JSlider blueSlider=new JSlider(1,255);
//        JSlider lengthSlider=new JSlider(30,80);

        // Add mainPanel to the frame client area
        frame.getContentPane().add(mainPanel);

        // Add the button panel and the slider panel to the mainPanel
        mainPanel.setLayout(new GridLayout(1,2));
        mainPanel.add(drawing);
        mainPanel.add(controlPanel);

        // Show the window!
        frame.setVisible(true);
    }

}

