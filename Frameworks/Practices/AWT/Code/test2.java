package Frameworks.Practices.AWT.Code;

import java.awt.*;

import javax.print.DocFlavor.STRING;

class MyFrame extends Frame{
    public MyFrame(String title){
        super(title);
        

        Label l = new Label("Name: ");
        TextField tf = new TextField(20);
        Button b = new Button("Submit");

        // Adding Components to the Frame
        add(l);
        add(tf);
        add(b);

    }
}

public class test2 {
    public static void main(String[] args) {
        MyFrame F = new MyFrame("My APP Name");
        F.setLayout(new FlowLayout());
        F.setSize(400,300);
        F.setVisible(true);
    }
    
}
