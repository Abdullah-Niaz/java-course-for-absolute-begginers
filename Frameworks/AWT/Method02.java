package Frameworks.AWT;

import java.awt.*;
import java.util.concurrent.Flow;

class MyFrame extends Frame{
    Label l ;
    TextField tf;
    Button b;

    public MyFrame(){
        super("My App Name");
        setLayout(new FlowLayout());


        l = new Label("Name: ");
        tf = new TextField(20);
        b = new Button("Submit");
    
        // adding 
        add(l);
        add(tf);
        add(b);
    }
}

public class Method02 {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();

        f.setSize(400,400);
        f.setVisible(true);
    }
    
}
