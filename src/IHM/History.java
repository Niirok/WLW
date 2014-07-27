/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IHM;

/**
 *
 * @author Alexis
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.text.Format;
import java.text.MessageFormat;
import javax.swing.BorderFactory;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JEditorPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
/**
 *
 * @author Alexis
 */
public class History extends JPanel {
    private JPanel content;
    private JFormattedTextField formula;
    private JLabel label;
    private JEditorPane textarea;
    
    public History() {
        // On set un BorderLayout sur ce JPanel:
            this.setLayout(new BorderLayout());
        // On customize le Panel:
            this.setBackground(Color.WHITE);
            this.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        // On ajoute le JTextField en bas:
        JPanel labelPane = new JPanel();
            label = new JLabel("Battle Logs", JLabel.CENTER);
            labelPane.add(label);
        JPanel formulaPane = new JPanel();
            formula = new JFormattedTextField();
            formula.setPreferredSize(new Dimension(350, 20));
            formula.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent ke) {}

                @Override
                public void keyPressed(KeyEvent ke) {
                    if(ke.getKeyCode() == KeyEvent.VK_ENTER) {
                        if(formula.getText().equals("")) {
                            System.out.println("Pas de texte !");
                        }
                        else {
                            textarea.setText(textarea.getText() + "« " + formula.getText()+"\n");
                            formula.setText("");
                        }
                    }
                }

                @Override
                public void keyReleased(KeyEvent ke) {}
            });
            formulaPane.add(formula);
        content = new JPanel();
            this.textarea = new JEditorPane();
            this.textarea.setEditable(false);
            JScrollPane scrollTeaxtarea = new JScrollPane(this.textarea);
            scrollTeaxtarea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            scrollTeaxtarea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            scrollTeaxtarea.setPreferredSize(new Dimension(390, 180));
            content.add(scrollTeaxtarea);
        content.setBackground(Color.WHITE);
        
            
        this.add(labelPane, BorderLayout.NORTH);
        this.add(content, BorderLayout.CENTER);
        this.add(formulaPane, BorderLayout.SOUTH);
        
    }
}
