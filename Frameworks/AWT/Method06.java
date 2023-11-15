package Frameworks.AWT;
import java.awt.*;
import java.awt.event.*;

class MyFrame_ extends Frame implements ActionListener{
    TextField tf;
    Button bt;

    public MyFrame_(){
        super("My App");
        setLayout(new FlowLayout());

        Panel p = new Panel();
        tf  = new TextField();
        bt = new Button("Click Me!");        
        p.add(tf);
        p.add(bt);
        add(p);
        bt.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText("Wellcome To the Pakistan");
    }
}
public class Method06 {
    public static void main(String[] args) {
        MyFrame_ m = new MyFrame_();
        m.setSize(300,300);
        m.setVisible(true);
    }
    
}
