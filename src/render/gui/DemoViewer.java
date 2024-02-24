package render.gui;

import javax.swing.*;
import java.awt.*;

public class DemoViewer {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        Container pane = frame.getContentPane();
        pane.setLayout(new BorderLayout());

        JSlider headingSlider = new JSlider(0, 360, 180);
        pane.add(headingSlider, BorderLayout.SOUTH);

        
    }
}
