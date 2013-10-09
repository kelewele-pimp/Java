/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.Dialogs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Desmond
 */
public class CustomDialog extends JFrame {

    public CustomDialog() {
        initUI();
    }

    private void initUI() {
        
        JPanel panel = new JPanel(); 
        panel.setLayout(null);
        
        JLabel label = new JLabel("This is a test"); 
        label.setBounds(90, 30, 110, 20);
        
        JButton close_button = new JButton("Close");
        close_button.setBounds(75, 60, 140, 20);
        close_button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {
                dispose(); //Releases all of the native screen resources used by this Window, its subcomponents, and all of its owned children.
            }
        });
        
        panel.add(label); 
        panel.add(close_button); 
        add(panel); 

        setTitle("Simple Dialog");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300, 200);
    }
}
