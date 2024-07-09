package com.magicalarena;

public class Arena {
    private Player playerA;
    private Player playerB;

    public Arena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public void startFight() {
        while (playerA.isAlive() && playerB.isAlive()) {
            Player attacker, defender;

            if (playerA.getHealth() <= playerB.getHealth()) {
                attacker = playerA;
                defender = playerB;
            } else {
                attacker = playerB;
                defender = playerA;
            }

            int attackRoll = attacker.rollAttack();
            int defenseRoll = defender.rollDefense();
            int damage = Math.max(0, attackRoll - defenseRoll);
            defender.reduceHealth(damage);

            System.out.println("Attacker " + (attacker == playerA ? "A" : "B") + 
                " attacks with " + attackRoll + " damage.");
            System.out.println("Defender " + (defender == playerA ? "A" : "B") + 
                " defends with " + defenseRoll + " defense.");
            System.out.println("Defender " + (defender == playerA ? "A" : "B") + 
                " health is now " + defender.getHealth() + ".");

            if (!defender.isAlive()) {
                System.out.println("Player " + (attacker == playerA ? "A" : "B") + " wins the fight!");
                break;
            }
        }
    }
}
