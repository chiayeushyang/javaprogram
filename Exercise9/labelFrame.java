import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class labelFrame extends JLabel implements Serializable {

    public static void main(String[] args) {
        new frame();
    }
}

class frame extends JFrame {

    private JPanel insertPanel, choosePanel, buttonPanel;
    private JComboBox<String> colorBox;
    private JLabel insertLabel, colorLabel;
    private JTextField lableText;
    private JButton button;

    private String[] labelColor = { "Red", "Blue", "Green", "Yellow" };

    public frame() {
        setTitle("Save Object");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        buildinsertPanel();
        buildchoosePanel();
        buildbuttonPanel();

        add(insertPanel, BorderLayout.NORTH);
        add(choosePanel, BorderLayout.CENTER);
        // add(buttonPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }

    public void buildinsertPanel() {
        insertPanel = new JPanel();

        insertLabel = new JLabel("Insert text for Label");
        lableText = new JTextField(15);

        insertPanel.add(insertLabel);
        insertPanel.add(lableText);
    }

    public void buildchoosePanel() {
        choosePanel = new JPanel();

        colorLabel = new JLabel("choose color for label display text");
        colorBox = new JComboBox<>(labelColor);

        choosePanel.add(colorLabel);
        choosePanel.add(colorBox);
    }

    public void buildbuttonPanel() {
        buttonPanel = new JPanel();
        button = new JButton("OK");

        button.addActionListener(new writeLabelListener());
        buttonPanel.add(button);
    }

    private class writeLabelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String color;

            labelFrame labelColor = new labelFrame();
            labelColor.setText(lableText.getText());

            color = (String) colorBox.getSelectedItem();

            switch (color) {
                case "Red" : labelColor.setForeground(Color.RED); break;
                case "Blue": labelColor.setForeground(Color.BLUE); break;
                case "Green": labelColor.setForeground(Color.GREEN); break;
                case "Yellow":labelColor.setForeground(Color.YELLOW); break;
            }

            try {  
                FileOutputStream outputStream = new FileOutputStream("Objects.dat");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                objectOutputStream.writeObject(labelColor);
                objectOutputStream.close();

            } catch (Exception ex) {
                 JOptionPane.showMessageDialog(null, "Erroc Occuranced", "Oops something wrong", JOptionPane.WARNING_MESSAGE);
            }
        }

    }

}
