package com.magicalarena.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.magicalarena.Player;

public class PlayerTest {
    @Test
    public void testPlayerInitialization() {
        Player player = new Player(50, 5, 10);
        assertEquals(50, player.getHealth());
        assertEquals(5, player.getStrength());
        assertEquals(10, player.getAttack());
    }

    @Test
    public void testReduceHealth() {
        Player player = new Player(50, 5, 10);
        player.reduceHealth(20);
        assertEquals(30, player.getHealth());
        player.reduceHealth(30);
        assertEquals(0, player.getHealth());
    }

    @Test
    public void testRollAttack() {
        Player player = new Player(50, 5, 10);
        int attackRoll = player.rollAttack();
        assertTrue(attackRoll >= 10 && attackRoll <= 60); 
    }

    @Test
    public void testRollDefense() {
        Player player = new Player(50, 5, 10);
        int defenseRoll = player.rollDefense();
        assertTrue(defenseRoll >= 5 && defenseRoll <= 30); 
    }

    @Test
    public void testIsAlive() {
        Player player = new Player(50, 5, 10);
        assertTrue(player.isAlive());
        player.reduceHealth(50);
        assertFalse(player.isAlive());
    }
}
