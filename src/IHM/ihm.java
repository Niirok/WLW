/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IHM;
import IHM.*;
import Core.*;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author Alexis
 */
public class ihm extends JFrame {
    private Options opt;
    private Inventory inv;
    private Map map;
    private SpellBook book;
    private History history;
    private Menu menu;
    
    private Mage c;
    private Stuff s;
    
    public ihm() {
        super();
    }
    public ihm(Mage c, Stuff s) {
        this(); 
        
        this.c = c;
        this.s = s;
        
        // Instanciation et paramétrage de la fenêtre:
        this.setTitle("War Lord Wizard V0.0.1");
        this.setSize(1000, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // On choisi le Layout null pour placer les ContentPane:
        this.setLayout(null);
        // On instancie et positionne les JPanels nécessaires:
        this.book = new SpellBook();
        this.inv = new Inventory(this.c, this.s);
        this.map = new Map();
        this.history = new History();
        
        // On instancie le menu:
        this.menu = new Menu(this);
                
        // On set le JPanel et on ouvre la fenêtre:
        this.getContentPane().add(this.book);
        this.getContentPane().add(this.inv);
        this.getContentPane().add(this.map);
        this.getContentPane().add(this.history);
        
        this.book.setBounds(0, 0, 600, 550);
        this.inv.setBounds(600, 0, 200, 300);
        this.map.setBounds(800, 0, 194, 300);
        this.history.setBounds(600, 300, 394, 250);
        
        this.setJMenuBar(this.menu);
        this.setVisible(true);
    }
    
    
}
