package Core;

public class Mage extends Character {
    // Attributs
    // Caractéristiques:
        private int arcanepower;
        private int intel;
        private Stuff stuff;
        private Inventory inventory;

    public Mage() {}
    public Mage(String n) {
        super(n);
        
        this.arcanepower = 50;
        this.intel = 10;
    }
    
    public int getArcanePower() {
        return arcanepower;
    }
    public void setArcanepower(int ap) {
        this.arcanepower = ap;
    }
    public int getIntel() {
        return intel;
    }
    public void setIntel(int i) {
        this.intel = i;
    }
    public Inventory getInventory(){
        return inventory;
    }
    public Stuff getStuff() {
        return stuff;
    }  
}
