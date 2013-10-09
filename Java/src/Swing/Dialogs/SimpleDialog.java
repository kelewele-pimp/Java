/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.Dialogs;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

/**
 *
 * @author Desmond
 */
public class SimpleDialog extends JFrame {
    
    public SimpleDialog(){
        initUI();        
    }
    
     private void initUI() {
         
         JMenuBar menuBar = new JMenuBar();
         JMenu menu = new JMenu("Menu");
         menu.setMnemonic(KeyEvent.VK_M);
         menuBar.add(menu); 
         
         JMenu help = new JMenu("Help");
         help.setMnemonic(KeyEvent.VK_H);
         menuBar.add(help); 
         
         JMenuItem about = new JMenuItem("About");
         help.add(about); 
         
         about.addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent ae) {
                 CustomDialog cd = new CustomDialog(); 
                 cd.setVisible(true);
             }
         });
         
         menuBar.add(menu); 
         menuBar.add(help); 
         setJMenuBar(menuBar);
         
         add(menuBar, BorderLayout.NORTH); 
         
        setTitle("Simple Dialog");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300, 200);
    }
    
      public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        SimpleDialog sd_frame = new SimpleDialog(); 
        sd_frame.setVisible(true);
    }

   
}
