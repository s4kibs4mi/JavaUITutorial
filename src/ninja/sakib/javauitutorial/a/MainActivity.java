package ninja.sakib.javauitutorial.a;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * := Coded with love by Sakib Sami on 6/23/16.
 * := s4kibs4mi@gmail.com
 * := www.sakib.ninja
 * := Coffee : Dream : Code
 */

public class MainActivity extends JFrame implements ActionListener {
    private JTextArea sampleText;
    private JLabel sampleTextCount;
    private JButton getCharCountBtn;

    public void init() {

        setLayout(null);                                        // Setting frame layout to null
        setPreferredSize(new Dimension(500, 500));              // Setting frame size

        sampleText = new JTextArea();                           // Initializing Textarea
        sampleText.setBounds(100, 50, 300, 200);                // Setting sample text position in frame
        add(sampleText);                                        // Adding sample text to frame

        sampleTextCount = new JLabel("Character count ???");    // Initializing Label
        sampleTextCount.setBounds(100, 270, 300, 50);           // Setting sampleTextCount position in frame
        add(sampleTextCount);                                   // Adding sampleTextCount to frame

        getCharCountBtn = new JButton("Get Count");             // Initializing Button
        getCharCountBtn.setBounds(200, 350, 100, 50);           // Setting getCharCountBtn position in frame
        getCharCountBtn.addActionListener(this);                // Adding action lister to button
        add(getCharCountBtn);                                   // Adding getCharCountBtn to frame

        pack();                                                 // Initialize & Decorate frame
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        sampleTextCount.setText("Total Characters : " + sampleText.getText().length());
    }
}
