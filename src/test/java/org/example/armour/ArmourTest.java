package org.example.armour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmourTest {

    Armour armour = new Armour();
    @Test
    public void Anything_that_has_Health_may_be_a_target(){
    armour.setHealth(2000);
    assertEquals(2000, armour.getHealth());
    }

    @Test
    public void things_cannot_be_Healed_and_they_dnt_Deal_Damage(){
        armour.setHealth(2000);
        armour.destroyed(armour, 1000);
        assertEquals(1000, armour.getHealth());
        armour.destroyed(armour, 1000);
        assertEquals(0, armour.getHealth());
        assertFalse(armour.isAlive());
    }

}