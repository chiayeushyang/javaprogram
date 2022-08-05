import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class callCharge extends JFrame {
    private final int WINDOW_WIDTH = 420, WINDOW_HEIGHT = 185;
    private JLabel message;
    private JPanel panel;
    private JTextField input;
    private JRadioButton radio1, radio2, radio3;
    ButtonGroup group;

    callCharge() {
        setTitle("Call Charge Calculator");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildPanel();
        add(panel);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void buildPanel() {
        message = new JLabel("Enter the number of minutes of the call");
        input = new JTextField(10);
        radio1 = new JRadioButton("Daytime (6:00 A.M through 5.59 P.M)");
        radio2 = new JRadioButton("Evening (6:00 P.M through 11:59 P.M)");
        radio3 = new JRadioButton("Off-Peak (12:00 A.M through 5:59 A.M.)");

        group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        group.add(radio3);

        panel = new JPanel();
        panel.add(message);
        panel.add(input);
        panel.add(radio1);
        panel.add(radio2);
        panel.add(radio3);

        radio1.addActionListener(new callChargeCalculate());
        radio2.addActionListener(new callChargeCalculate());
        radio3.addActionListener(new callChargeCalculate());
    }

    public static void main(String[] args) {
        new callCharge();
    }

    public class callChargeCalculate implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String minute;
            String rateCategory = "";
            double result = 0.0;

            minute = input.getText();

            try {
                if (e.getSource() == radio1) {
                    rateCategory = "Daytime";
                    result = Double.parseDouble(minute) * 0.07;
                } else if (e.getSource() == radio2) {
                    rateCategory = "Evening";
                    result = Double.parseDouble(minute) * 0.12;
                } else if (e.getSource() == radio3) {
                    rateCategory = "Off-Peak ";
                    result = Double.parseDouble(minute) * 0.05;
                }

                JOptionPane.showMessageDialog(null, "Charge for the call in " + rateCategory + " is RM" + String.format("%.2f", (result)));

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Please Enter a Number !!!", "Oops something wrong ",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}
