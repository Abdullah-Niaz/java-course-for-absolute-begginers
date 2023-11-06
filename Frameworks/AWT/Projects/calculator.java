package Frameworks.AWT.Projects;

// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class calculator extends Frame {
//     private TextField textField;
//     private String buffer = "";
//     private String operator = "";
//     private double result = 0.0;

//     public calculator() {
//         setLayout(new BorderLayout());
//         setTitle("Simple Calculator");

//         textField = new TextField();
//         textField.setEditable(false);
//         add(textField, BorderLayout.NORTH);

//         Panel buttonPanel = new Panel();
//         buttonPanel.setLayout(new GridLayout(4, 4));

//         String[] buttonLabels = {
//             "7", "8", "9", "/",
//             "4", "5", "6", "*",
//             "1", "2", "3", "-",
//             "0", "=", "+", "C"
//         };

//         for (String label : buttonLabels) {
//             Button button = new Button(label);
//             button.addActionListener(new ButtonClickListener());
//             buttonPanel.add(button);
//         }

//         add(buttonPanel, BorderLayout.CENTER);

//         setSize(300, 300);
//         setVisible(true);
//     }

//     private class ButtonClickListener implements ActionListener {
//         public void actionPerformed(ActionEvent e) {
//             String command = e.getActionCommand();

//             if (command.matches("[0-9]")) {
//                 buffer += command;
//                 textField.setText(buffer);
//             } else if (command.matches("[+\\-*/]")) {
//                 if (!buffer.isEmpty()) {
//                     result = calculate(result, buffer, operator);
//                     operator = command;
//                     buffer = "";
//                     textField.setText(String.valueOf(result));
//                 }
//             } else if (command.equals("=")) {
//                 if (!buffer.isEmpty() && !operator.isEmpty()) {
//                     result = calculate(result, buffer, operator);
//                     operator = "";
//                     buffer = "";
//                     textField.setText(String.valueOf(result));
//                 }
//             } else if (command.equals("C")) {
//                 buffer = "";
//                 operator = "";
//                 result = 0.0;
//                 textField.setText("");
//             }
//         }

//         private double calculate(double num1, String num2Str, String op) {
//             double num2 = Double.parseDouble(num2Str);
//             switch (op) {
//                 case "+":
//                     return num1 + num2;
//                 case "-":
//                     return num1 - num2;
//                 case "*":
//                     return num1 * num2;
//                 case "/":
//                     if (num2 != 0) {
//                         return num1 / num2;
//                     }
//             }
//             return 0.0; // Handle division by zero gracefully
//         }
//     }

//     public static void main(String[] args) {
//         new calculator();
//     }
// }



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Cal extends Frame {
    private TextField textField;
    private String buffer = "";
    private String operator = "";
    private double result = 0.0;

    public Cal() {
        setLayout(new BorderLayout());
        setTitle("Simple Calculator");

        textField = new TextField();
        textField.setEditable(false);
        add(textField, BorderLayout.NORTH);

        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "=", "+", "C"
        };

        for (String label : buttonLabels) {
            Button button = new Button(label);
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);

        setSize(300, 300);
        setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.matches("[0-9]")) {
                // Append the number to the buffer
                buffer += command;
                textField.setText(buffer);
            } else if (command.matches("[+\\-*/]")) {
                if (!buffer.isEmpty()) {
                    // Calculate and update result when an operator is pressed
                    result = calculate(result, buffer, operator);
                    operator = command;
                    buffer = "";
                    textField.setText(String.valueOf(result));
                }
            } else if (command.equals("=")) {
                if (!buffer.isEmpty() && !operator.isEmpty()) {
                    // Calculate and display the final result when '=' is pressed
                    result = calculate(result, buffer, operator);
                    operator = "";
                    buffer = "";
                    textField.setText(String.valueOf(result));
                }
            } else if (command.equals("C")) {
                // Clear the calculator
                buffer = "";
                operator = "";
                result = 0.0;
                textField.setText("");
            }
        }

        private double calculate(double num1, String num2Str, String op) {
            double num2 = Double.parseDouble(num2Str);
            switch (op) {
                case "+":
                    return num1 + num2;
                case "-":
                    return num1 - num2;
                case "*":
                    return num1 * num2;
                case "/":
                    if (num2 != 0) {
                        return num1 / num2;
                    }
            }
            return 0.0; // Handle division by zero gracefully
        }
    }
}
public class calculator{

    public static void main(String[] args) {
        new Cal();
    }
}
