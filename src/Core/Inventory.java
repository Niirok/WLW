package Core;

import Interfaces.InterfaceItem;
import java.awt.TextArea;

public class Inventory {
    InterfaceItem bag[];
    int usedPlaces; 
    
    
    public Inventory(){
        this.bag = new InterfaceItem[15];
        usedPlaces = 0;
    }
    
    
    public void addItem(InterfaceItem itAdd){ 
        boolean find = false;
        for(int i = 0; find || i < this.getBag().length; i++ ){
                if (this.bag[i].getName().equals(itAdd.getName()) ){
                    this.bag[i].setQuantity(this.bag[i].getQuantity() +1);
                    find = true;
                    break;
                }
            }           
        if (usedPlaces < 15 && !find){
            this.bag[usedPlaces] = itAdd;
            usedPlaces++;          
        }else{
            System.out.println("Plus de place dans votre sac.");
            //System.setOut(new PrintStream(, true));
        }
    }
    public void addItem(InterfaceItem itAdd, int qty){
        boolean find = false;
        for(int i = 0; find || i < this.getBag().length; i++ ){
                if (this.bag[i].getName().equals(itAdd.getName()) ){
                    this.bag[i].setQuantity(this.bag[i].getQuantity() +qty);
                    find = true;
                    break;
                }
            }           
        if (usedPlaces < 15 && !find){
            this.bag[usedPlaces] = itAdd;
            this.bag[usedPlaces].setQuantity(qty);
            usedPlaces++;          
        }else{
            System.out.println("Plus de place dans votre sac.");
            
        }
    } 
    public void removeItem(int slot){
        this.bag[slot].setQuantity(0);
        this.bag[slot] = null;
        usedPlaces--;
    }
    public void removeItem(int slot, int qty){
        this.bag[slot].setQuantity(this.bag[slot].getQuantity()-qty);
        if ( this.bag[slot].getQuantity() <= 0){
            removeItem(slot);
        }
        
    }
    public void removeOneItem(int slot){
        this.bag[slot].setQuantity(this.bag[slot].getQuantity()-1);
        if ( this.bag[slot].getQuantity() <= 0){
            removeItem(slot);
        }
        
    }
    
    public InterfaceItem[] getBag(){
        return bag;
    }
    
    
}
