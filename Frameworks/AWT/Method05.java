package Frameworks.AWT;

import java.awt.*;
import java.awt.event.*;
import java.security.PublicKey;

class MyRadio extends Frame implements ItemListener {

    Label l ;
    Checkbox c1,c2,c3,c4;
    CheckboxGroup cbg;

    public MyRadio(){
        super("ToDo APP");
        setLayout(new FlowLayout());
        
        l = new Label("Nothing is Slected");

        cbg = new CheckboxGroup();
        c1 = new Checkbox("Java",false,cbg);
        c2 = new Checkbox("Python",false,cbg);
        c3 = new Checkbox("C++",false,cbg);
        c4 = new Checkbox("C#",false,cbg);

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
        if(c4.getState()){
            str = str + " " + c4.getLabel();
        }
        if(str.isEmpty()){
            str = "Nothing is slected !";
        }

        l.setText(str);
    }
}

public class Method05 {
    public static void main(String[] args) {
    
        MyRadio mcb = new MyRadio();
        mcb.setSize(400, 200);
        mcb.setVisible(true);;
    }
}
