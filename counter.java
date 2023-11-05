import java.awt.*;
import java.awt.event.*;

class myownFrame extends Frame implements ActionListener{
    int count = 0;
    Label la;
    Button bu;

    public myownFrame(){
        super("My APP");
        setLayout(new FlowLayout());

        la  = new Label(" "+count);
        bu = new Button("Click");
        bu.addActionListener(this);

        add(la);
        add(bu);
    }
    public void actionPerformed(ActionEvent e) {
            count++;
            la.setText(" "+count);   
            
    }
}

public class counter {
    public static void main(String[] args) {
        myownFrame fb = new myownFrame();
        fb.setSize(300,400);
        fb.setVisible(true);
    }
}
