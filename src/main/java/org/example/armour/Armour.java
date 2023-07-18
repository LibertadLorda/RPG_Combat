
package org.example.armour;

public class Armour {

    private int health;

    private boolean alive = true;

    public boolean isAlive() {
        return alive;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void destroyed(Armour armour, int damage) {
        armour.health -= damage;
        if(armour.health <=0){
            armour.alive=false;
        }
        }




}
