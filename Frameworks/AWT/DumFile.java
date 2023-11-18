package Frameworks.AWT;
import java.awt.*;

class Dumy extends Frame{
    Button b ;
    public Dumy (){
        super("My button");
        setLayout(new FlowLayout());

        b = new Button("My Buttom");
        b.setLabel("MY Button Overrided");
        b.setEnabled(true);
        b.setBackground(Color.blue);
        add(b);

    }
}

public class DumFile {
    public static void main(String[] args) {
        Dumy df = new Dumy();
        df.setSize(400 , 400);
        df.setVisible(true);
    }
}
