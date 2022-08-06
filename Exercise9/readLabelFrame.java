import javax.swing.*;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

public class readLabelFrame extends JFrame{
    private JPanel panel;
    private JLabel label;
    private JButton button;
    private final static int WIDTH = 350;
    private final static int HEIGHT = 150;

    readLabelFrame() {
        setTitle("Load Object");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);

        panel = new JPanel(); 
        label = new JLabel("Click OK to refresh");

        label.setHorizontalAlignment(JLabel.CENTER);

        button = new JButton("OK");
        button.addActionListener(new buttonListener());
        panel.setLayout(new BorderLayout());
        panel.add(label, BorderLayout.CENTER);
        panel.add(button, BorderLayout.SOUTH);

        add(panel);


        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class buttonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                FileInputStream inStream = new FileInputStream("Objects.dat");
                ObjectInputStream objectInputFile= new ObjectInputStream(inStream);
                labelFrame readlabel = (labelFrame) objectInputFile.readObject();
                readlabel.setHorizontalAlignment(JLabel.CENTER);
                objectInputFile.close();

                panel.removeAll();
                panel.add(readlabel, BorderLayout.CENTER);
                panel.add(button, BorderLayout.SOUTH);
                panel.updateUI();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erroc Occuranced", "Oops something wrong", JOptionPane.WARNING_MESSAGE);
            }
         }
    }

    public static void main(String[] args) {
        new readLabelFrame();
    }
}