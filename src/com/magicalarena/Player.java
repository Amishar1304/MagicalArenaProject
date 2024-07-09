package com.magicalarena;

public class Player {
    private int health;
    private int strength;
    private int attack;

    public Player(int health, int strength, int attack) {
        if (health <= 0 || strength <= 0 || attack <= 0) {
            throw new IllegalArgumentException("Numbers must be positive integers.");
        }
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }
    
    public int getStrength() {
        return strength;
    }
    
    public int getAttack() {
        return attack;
    }

    public void reduceHealth(int amount) {
        this.health = Math.max(0, this.health - amount);
    }

    public int rollAttack() {
        return attack * rollDice();
    }

    public int rollDefense() {
        return strength * rollDice();
    }

    private int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public String toString() {
        return "Player{" +
                "health=" + health +
                ", strength=" + strength +
                ", attack=" + attack +
                '}';
    }
}
