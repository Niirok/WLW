/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package war.lord.wizzard;
import IHM.ihm;
import Core.Mage;
import Core.Stuff;
import IHM.History;
import java.io.PrintStream;


/**
 *
 * @author Alexis
 */
public class WarLordWizzard {
    private Mage c;
    private Stuff s;
    
    public WarLordWizzard() {
        c = new Mage("Richard Rahl");
        s = new Stuff();
        ihm ihm = new ihm(c, s);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new WarLordWizzard();
    }
    
}
