import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class totalCharges extends JFrame {

    private JPanel roomPanel, travelPanel, outputPanel;
    private JComboBox<String> roomBox, travelBox;
    private JLabel roomLabel, travelLabel, inputLabel;
    private JTextField customerNumber;

    private String[] testType = { "Standard room: RM150 per day", "Deluxe room: RM250 per day",
            "Superior room: RM350 per day" };
    private String[] testPlan = { "1 day trip around Kajang: RM100 per person",
            "1 day trip around Klang: RM200 per person", "1 day trip around KL: $250 per person" };

    public totalCharges() {
        setTitle("Total Charge Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        buildroomPanel();
        buildtravelPanel();
        buildoutputPanel();

        add(roomPanel, BorderLayout.NORTH);
        add(travelPanel, BorderLayout.CENTER);
        add(outputPanel, BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }

    private void buildroomPanel() {
        roomPanel = new JPanel();

        roomLabel = new JLabel("Please Select Room Type");
        roomBox = new JComboBox<>(testType);

        roomPanel.add(roomLabel);
        roomPanel.add(roomBox);
    }

    private void buildtravelPanel() {

        travelPanel = new JPanel();

        travelLabel = new JLabel("Please Select Your Plan");
        travelBox = new JComboBox<>(testPlan);

        travelPanel.add(travelLabel);
        travelPanel.add(travelBox);

    }

    private void buildoutputPanel() {

        outputPanel = new JPanel();

        inputLabel = new JLabel("Enter Customer Number");
        customerNumber = new JTextField(10);
        customerNumber.addActionListener(new ComboBoxListener());

        outputPanel.add(inputLabel);
        outputPanel.add(customerNumber);
    }

    private class ComboBoxListener
            implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String room, plan, customer;; 
            double total = 0; 

            customer = customerNumber.getText();
            room = (String) roomBox.getSelectedItem();
            plan = (String) travelBox.getSelectedItem();

            try {
                if (room=="Standard room: RM150 per day") {
                    total = Double.parseDouble(customer) * 150;
                } else if (room=="Deluxe room: RM250 per day"){
                    total = Double.parseDouble(customer) * 250;
                } else if (room=="Superior room: RM350 per day"){
                    total = Double.parseDouble(customer) * 350;
                }

                if (plan =="1 day trip around Kajang: RM100 per person") {
                    total += Double.parseDouble(customer) * 100;
                } else if (plan=="1 day trip around Klang: RM200 per person"){
                    total += Double.parseDouble(customer) * 200;
                } else if (plan=="1 day trip around KL: $250 per person"){
                    total += Double.parseDouble(customer) * 250;
                }

                JOptionPane.showMessageDialog(null, "Total Charge is RM " + String.format("%.2f", (total)));      

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Please Enter a Number !!!", "Oops something wrong ",
                        JOptionPane.WARNING_MESSAGE);
            }

        }
    }

    private class inputListener
            implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
           
        }
    }

    public static void main(String[] args) {
        new totalCharges();
    }
}
