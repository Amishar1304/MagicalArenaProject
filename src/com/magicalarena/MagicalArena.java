package com.magicalarena;

import java.util.Scanner;

public class MagicalArena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the details of Player A: ");
        Player playerA = createPlayer(scanner);

        System.out.println("Enter the details of Player B: ");
        Player playerB = createPlayer(scanner);

        Arena arena = new Arena(playerA, playerB);
        arena.startFight();
    }

    private static Player createPlayer(Scanner scanner) {
        System.out.print("Enter health = ");
        int health = scanner.nextInt();

        System.out.print("Enter strength = ");
        int strength = scanner.nextInt();

        System.out.print("Enter attack = ");
        int attack = scanner.nextInt();

        return new Player(health, strength, attack);
    }
}
