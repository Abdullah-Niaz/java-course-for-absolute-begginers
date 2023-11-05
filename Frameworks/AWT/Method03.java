package Frameworks.AWT;

import java.awt.*;
import java.awt.event.*;

class myframe extends Frame implements ActionListener{
    int count = 0;
    Label la;
    Button bu;

    public myframe(){
        super("My APP");
        setLayout(new FlowLayout());

        la  = new Label(" "+count);
        bu = new Button("Click");
        bu.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        count++;
        la.setText(" "+count);
    }
}

public class Method03 {
    public static void main(String[] args) {
        myframe f = new myframe();
        f.setSize(300,400);
        f.setVisible(true);
    }
}
