import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    JFrame frame;
    JTextField txtFirst, txtSecond, txtResult;
    JButton btnSum, btnSub, btnMul, btnDiv, btnMod, btnClear; // Declare buttons
    float f, s, result = 0;
    public Calculator() {
        frame = new JFrame("Calculator");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(6, 2)); // Local variable declaration

        panel.add(new JLabel("First Number:"));
        txtFirst = new JTextField();
        panel.add(txtFirst);

        panel.add(new JLabel("Second Number:"));
        txtSecond = new JTextField();
        panel.add(txtSecond);

        panel.add(new JLabel("Result:"));
        txtResult = new JTextField();
        txtResult.setEnabled(false);
        panel.add(txtResult);

        btnSum = new JButton("+");
        btnSum.addActionListener(this);
        panel.add(btnSum);

        btnSub = new JButton("-");
        btnSub.addActionListener(this);
        panel.add(btnSub);

        btnMul = new JButton("*");
        btnMul.addActionListener(this);
        panel.add(btnMul);

        btnDiv = new JButton("/");
        btnDiv.addActionListener(this);
        panel.add(btnDiv);

        btnMod = new JButton("%");
        btnMod.addActionListener(this);
        panel.add(btnMod);

        btnSum.addActionListener(this);
        btnSub.addActionListener(this);
        btnDiv.addActionListener(this);
        btnMul.addActionListener(this);
        btnMod.addActionListener(this);

        btnClear = new JButton("Clear");
        btnClear.addActionListener(this);
        panel.add(btnClear);
        frame.add(panel);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnSum) {
            f = Float.parseFloat(txtFirst.getText());
            s = Float.parseFloat(txtSecond.getText());
            result = f + s;
            txtResult.setText(String.valueOf(result));
        } else if (e.getSource() == btnSub){
            f = Float.parseFloat(txtFirst.getText());
            s = Float.parseFloat(txtSecond.getText());
            result = f - s;
            txtResult.setText(String.valueOf(result));
        }
        else if(e.getSource() == btnMul){
            f = Float.parseFloat(txtFirst.getText());
            s = Float.parseFloat(txtSecond.getText());
            result = f * s;
            txtResult.setText(String.valueOf(result));
        }
        else if(e.getSource() == btnDiv){
            f = Float.parseFloat(txtFirst.getText());
            s = Float.parseFloat(txtSecond.getText());
            if(s == 0){
                JOptionPane.showMessageDialog(null, "Divition by (0)");
                return;
            }
            result = f / s;
            txtResult.setText(String.valueOf(result));
        }
        else if (e.getSource() == btnMod) {
            f = Float.parseFloat(txtFirst.getText());
            s = Float.parseFloat(txtSecond.getText());
            result = f % s;
            txtResult.setText(String.valueOf(result));
        } else if (e.getSource() == btnClear) {
            txtResult.setText("");
            txtFirst.setText("");
            txtSecond.setText("");
        }
    }
}