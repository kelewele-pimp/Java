/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.Dialogs;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Desmond
 */
public class MessageBoxes extends JFrame {

    public MessageBoxes() {
        initUI();
    }

    private void initUI() {

        final JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        JButton error_button = new JButton("Error");
        JButton warning_button = new JButton("Warnig");
        JButton question_button = new JButton("Question");
        JButton information_button = new JButton("Information");

        error_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                JOptionPane.showMessageDialog(panel, "Could not open file", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

        warning_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                JOptionPane.showMessageDialog(panel, "A deprecated call", "Warning",
                        JOptionPane.WARNING_MESSAGE);
            }
        });

        question_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {

                int reply = JOptionPane.showConfirmDialog(panel, "ConfirmBox", "Are you sure you want to quit?", JOptionPane.YES_NO_OPTION);
                if (reply != JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(panel, "GOODBYE :) ", "Good Bye Message", JOptionPane.PLAIN_MESSAGE);
                } else {
                    JOptionPane.showInputDialog(panel, "Enter your message here", "Input ", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });

        information_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                String message = JOptionPane.showInputDialog(panel, "Enter your message here", "Input message", JOptionPane.PLAIN_MESSAGE);
                if (message != null) {
                    JOptionPane.showMessageDialog(panel, message, "Informaion",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(panel, "Goodbye", "Information", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });


        panel.add(error_button);
        panel.add(warning_button);
        panel.add(question_button);
        panel.add(information_button);

        add(panel);

        setTitle("Message Boxes");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300, 300);
    }

    private static void createAndShowGUI() {
        MessageBoxes mb_frame = new MessageBoxes();
        mb_frame.setVisible(true);
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
