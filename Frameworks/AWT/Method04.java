package Frameworks.AWT;

import java.awt.*;
import java.awt.event.*;
import java.security.PublicKey;

class MyCheckBox extends Frame implements ItemListener {

    Label l ;
    Checkbox c1,c2,c3,c4;

    public MyCheckBox(){
        super("ToDo APP");
        setLayout(new FlowLayout());
        
        l = new Label("Nothing is Slected");
        c1 = new Checkbox("Java");
        c2 = new Checkbox("Python");
        c3 = new Checkbox("C++");
        c4 = new Checkbox("C#");

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);
        
        
        add(l);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String str = "";

        if(c1.getState()){
            str = str + " " + c1.getLabel();
        }
        if(c2.getState()){
            str = str + " " + c2.getLabel();
        }
        if(c3.getState()){
            str = str + " " + c3.getLabel();
        }
        if(str.isEmpty()){
            str = "Nothing is slected !";
        }

        l.setText(str);
    }
}

public class Method04 {
    public static void main(String[] args) {
    
        MyCheckBox mcb = new MyCheckBox();
        mcb.setSize(400, 200);
        mcb.setVisible(true);;
    }
}
