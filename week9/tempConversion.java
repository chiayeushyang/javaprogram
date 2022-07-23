import javax.swing.*;
import javax.xml.transform.Templates;
import java.awt.event.*;
import java.awt.*;

public class tempConversion{
    private final int WINDOW_WIDTH = 400, WINDOW_HEIGHT = 150;
    private JLabel message;
    private JLabel lableResult= new JLabel();
    private JPanel panel;
    private JTextField input;
    
    tempConversion() {
        
        JFrame window =  new JFrame();
        panel = new JPanel();

        window.setTitle("Temperature Converter");
        window.setSize(WINDOW_WIDTH,  WINDOW_HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        message = new JLabel("Enter Fahrenheit Temperature: ");
        input = new JTextField(20);
        input.addActionListener(new celsiusConverter());

        panel.add(message);
        panel.add(input);

        window.add(panel);
        window.setVisible(true);
    }
    public static void main(String[] args) {
        tempConversion test = new tempConversion();
    }

    public class celsiusConverter implements ActionListener {
        public void actionPerformed(ActionEvent e){
            try{
                String tempStr = input.getText();
                input.setText("");
    
                Double temp = Double.parseDouble(tempStr);
                Double celsius = (5.0 / 9.0) * ( temp - 32);
    
                String resultMsg = "Temperature in Celsius is : " + String.format("%.02f", celsius);

                lableResult.setText(resultMsg);
                System.out.println(resultMsg);
                panel.add(lableResult);
                panel.revalidate();
                panel.repaint();
    
            }catch(Exception ex){
                lableResult.setText("Temperature in Celsius is : Invalid data type");
                panel.add(lableResult);
                panel.revalidate();
                panel.repaint();
            }
        }
    }
}

 
