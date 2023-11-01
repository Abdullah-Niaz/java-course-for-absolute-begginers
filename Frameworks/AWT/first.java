package Frameworks.AWT;

import java.awt.*;
import java.awt.event.*;

public class first {
    public static void main(String[] args) {
        Frame frame = new Frame("Simple Calculator");
        TextField textField = new TextField();
        Button[] buttons = new Button[16];
        String[] buttonLabels = {
            "7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "*",
            "C", "0", "=", "/"
        };

        textField.setBounds(50, 50, 200, 30);
        frame.add(textField);

        int x = 50, y = 100, buttonWidth = 50, buttonHeight = 50;
        for (int i = 0; i < 16; i++) {
            buttons[i] = new Button(buttonLabels[i]);
            buttons[i].setBounds(x, y, buttonWidth, buttonHeight);
            frame.add(buttons[i]);

            if (i % 4 == 3) {
                x = 50;
                y += buttonHeight;
            } else {
                x += buttonWidth;
            }
        }

        frame.setSize(300, 400);
        frame.setLayout(null);
        frame.setVisible(true);

        // Add action listeners to the buttons
        for (int i = 0; i < 16; i++) {
            if (i == 12) {
                buttons[i].addActionListener(new ClearAction(textField));
            } else if (i == 14) {
                buttons[i].addActionListener(new CalculateAction(textField));
            } else {
                buttons[i].addActionListener(new AppendAction(textField, buttonLabels[i]));
            }
        }

        // Close the window when the user clicks the close button
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}

class AppendAction implements ActionListener {
    TextField textField;
    String textToAppend;

    public AppendAction(TextField textField, String textToAppend) {
        this.textField = textField;
        this.textToAppend = textToAppend;
    }

    public void actionPerformed(ActionEvent ae) {
        textField.setText(textField.getText() + textToAppend);
    }
}

class ClearAction implements ActionListener {
    TextField textField;

    public ClearAction(TextField textField) {
        this.textField = textField;
    }

    public void actionPerformed(ActionEvent ae) {
        textField.setText("");
    }
}

class CalculateAction implements ActionListener {
    TextField textField;

    public CalculateAction(TextField textField) {
        this.textField = textField;
    }

    public void actionPerformed(ActionEvent ae) {
        String expression = textField.getText();
        try {
            // Evaluate the expression and display the result
            double result = evaluateExpression(expression);
            textField.setText(Double.toString(result));
        } catch (ArithmeticException e) {
            textField.setText("Error");
        }
    }

    private double evaluateExpression(String expression) {
        // You can implement the expression evaluation logic here
        // For simplicity, this example does not include expression evaluation.
        // You can use libraries like javax.script for more advanced calculation.
        throw new UnsupportedOperationException("Not implemented");
    }
}
