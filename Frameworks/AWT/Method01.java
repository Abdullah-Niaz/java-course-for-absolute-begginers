package Frameworks.AWT;

import java.awt.*;

public class Method01 {
    public static void main(String[] args) {
        // Adding Components
        Frame f = new Frame("My App");
        f.setLayout(new FlowLayout());

        // adding Components to frame
        Button b  = new Button("Okay?");
        Label l = new Label("Hello World");
        TextField tf = new TextField(20);

        f.add(b);
        f.add(l);
        f.add(tf);
        f.setSize(400 , 400);
        f.setVisible(true);
    }
}
