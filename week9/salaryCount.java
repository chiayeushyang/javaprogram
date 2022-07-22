import javax.swing.*;
import javax.swing.JOptionPane;

public class salaryCount {

    public static void main(String[] args) {
        String name, week, payRate, message;
        double hours, pay, total; 
        int repeat;

        do {
            try {
                name = JOptionPane.showInputDialog(null, "What is your name?");
                week = JOptionPane.showInputDialog(null, "How many hours did you work this week?");
                hours = Double.parseDouble(week);
                payRate = JOptionPane.showInputDialog(null, "What is your hourly pay rate?");
                pay = Double.parseDouble(payRate);
                message = "Hello " + name + ". " + "Your total salary is RM" + String.format("%.2f", (hours*pay));
                JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.INFORMATION_MESSAGE);
    
                repeat=0;

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Please enter a number at hour and pay rate","Wrong Input Type", JOptionPane.WARNING_MESSAGE);
                repeat = 1;
            }
        } while (repeat==1);
    }
}
