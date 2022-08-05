import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class salesTax extends JFrame{

    private JPanel panel, sliderPanel; 
    private JLabel amount, totalTax; 
    private JTextField input, output;
    private JSlider taxRateSlider;

    public salesTax() {
        setTitle("Sales Tax Charge Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        buildPanel();
        buildsliderPanel();

        add(panel, BorderLayout.NORTH);
        add(sliderPanel, BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }

    private void buildPanel() {
        panel = new JPanel();

        amount = new JLabel("Enter Amount");
        input = new JTextField(10);

        totalTax = new JLabel("Total Tax Need to Pay ");
        output = new JTextField(10);
        output.setEditable(false);

        panel.add(amount);
        panel.add(input);
        panel.add(totalTax);
        panel.add(output);
    }

    private void buildsliderPanel() {
        sliderPanel = new JPanel();

        taxRateSlider = new JSlider(JSlider.HORIZONTAL, 0, 10, 0);
        taxRateSlider.setMajorTickSpacing(2); 
        taxRateSlider.setMinorTickSpacing(1); 
        taxRateSlider.setPaintTicks(true);    
        taxRateSlider.setPaintLabels(true);   
        taxRateSlider.addChangeListener(new SliderListener());

        sliderPanel.add(taxRateSlider);
    }

    private class SliderListener implements ChangeListener
   {
      public void stateChanged(ChangeEvent e){
        double totalTax, taxRate, twoDecimal;
        String userAmount;

        userAmount = input.getText();
        taxRate = taxRateSlider.getValue();
        
        try {
            totalTax = Double.parseDouble(userAmount) * (taxRate/100);
            twoDecimal = Math.round(totalTax*100.0)/100.0;
            output.setText(Double.toString(twoDecimal));
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Please Enter a Number !!!", "Oops something wrong ",
                    JOptionPane.WARNING_MESSAGE);
        }
      }
   }
   public static void main(String[] args) {
    new salesTax();
   }
}

