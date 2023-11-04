package Frameworks.Practices.AWT.Code;

import java.awt.*;

public class test1 {
    public static void main(String[] args) {
        // Calling the Class of the Frame
        Frame f = new Frame("Hello World");
        f.setLayout(new FlowLayout()); // To make the everthing look proper in the Frame
        f.setSize(300,400); // Setting the Width and Height of the Frame

        //! Making and Adding Components
        // Add label to the button
        Label l  =  new Label("Name: ");
        f.add(l);

        // Make the TextField
        TextField tf = new TextField(10);
        f.add(tf);

        // Make Buttons
        Button b = new Button("Submit");
        f.add(b);

        // Make your Frame Visible
        f.setVisible(true);
    }
    
}
