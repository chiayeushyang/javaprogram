import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
import java.util.function.IntSupplier;
import java.util.Random;

public class guessNumber extends JFrame{
    private final int WINDOW_WIDTH = 250, WINDOW_HEIGHT = 150;
    private JLabel message;
    private JLabel lableResult;
    private JPanel panel;
    private JTextField input;
    private JButton button; 
    private int randomNum; 

    guessNumber() {
        randomNum = new Random().nextInt(100)+ 1;

        System.out.println(randomNum);
        setTitle("Guess Game");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        createPane();
        add(panel);
        setVisible(true);
    }

    private void createPane() {
        message = new JLabel("I have a number between 1 and 100.");
        lableResult = new JLabel("Can you guess my number?");
        input = new JTextField(15);
        button = new JButton("New Game");

        input.addActionListener(new correctOrNot());
        button.addActionListener(new newGame());

        panel = new JPanel();
        panel.add(message);
        panel.add(lableResult);
        panel.add(input);
        panel.add(button);
    }

    public static void main(String[] args) {
        guessNumber test = new guessNumber();
    }

    private class correctOrNot implements ActionListener {
        public void actionPerformed(ActionEvent e){
            try {
                String textNumber = input.getText();
                int guessNumber = Integer.parseInt(textNumber);
                input.setText("");

                if (randomNum == guessNumber){
                    lableResult.setText("Congratulations, You are correct!");
                    input.setEditable(false);

                } else if (randomNum > guessNumber){
                    lableResult.setText("Too Low, try a higher number");

                } else {
                    lableResult.setText("Too High, try a lower number");
                }

            } catch (Exception ex) {
                lableResult.setText("Please enter a valid data type");
            }
        }
    }
    private class newGame implements ActionListener {
        public void actionPerformed(ActionEvent e){
            randomNum = new Random().nextInt(100)+ 1;

            System.out.println(randomNum);
            lableResult.setText("Can you guess my number?");
            input.setEditable(true);
        }
    }

}
