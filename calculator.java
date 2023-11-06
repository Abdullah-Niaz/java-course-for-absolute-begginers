import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends Frame {
    Label l1, l2;
    TextField tf1, tf2;
    Label l3;
    TextField tf3;

    public MyFrame() {
        super("My Calculator");
        setLayout(new FlowLayout());

        l1 = new Label("Value1: ");
        tf1 = new TextField(20);
        Panel val1 = new Panel();
        val1.add(l1);
        val1.add(tf1);
        add(val1);

        l2 = new Label("Value2: ");
        tf2 = new TextField(20);
        Panel val2 = new Panel();
        val2.add(l2);
        val2.add(tf2);
        add(val2);

        Button ad = new Button("+");
        Button sub = new Button("-");
        Button mult = new Button("*");
        Button divi = new Button("/");
        Panel buttons = new Panel();
        buttons.add(ad);
        buttons.add(sub);
        buttons.add(mult);
        buttons.add(divi);
        add(buttons);

        Panel resultPanel = new Panel(); // Create a panel for the "Result" label and text field
        l3 = new Label("Result: ");
        tf3 = new TextField(20);
        resultPanel.add(l3); // Add the "Result" label to the panel
        resultPanel.add(tf3); // Add the text field to the panel
        add(resultPanel); // Add the panel to the frame

        // Add action listeners to the buttons
        ad.addActionListener(new ButtonClickListener("+"));
        sub.addActionListener(new ButtonClickListener("-"));
        mult.addActionListener(new ButtonClickListener("*"));
        divi.addActionListener(new ButtonClickListener("/"));
    }

    private class ButtonClickListener implements ActionListener {
        private String operation;

        public ButtonClickListener(String operation) {
            this.operation = operation;
        }

        public void actionPerformed(ActionEvent e) {
            try {
                double value1 = Double.parseDouble(tf1.getText());
                double value2 = Double.parseDouble(tf2.getText());
                double result = 0.0;

                if (operation.equals("+")) {
                    result = value1 + value2;
                } else if (operation.equals("-")) {
                    result = value1 - value2;
                } else if (operation.equals("*")) {
                    result = value1 * value2;
                } else if (operation.equals("/")) {
                    if (value2 != 0) {
                        result = value1 / value2;
                    } else {
                        tf3.setText("Error: Division by zero");
                        return;
                    }
                }

                tf3.setText(String.valueOf(result));
            } catch (NumberFormatException ex) {
                tf3.setText("Error: Invalid input");
            }
        }
    }
}

public class calculator {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(330, 300);
        f.setVisible(true);
    }
}
