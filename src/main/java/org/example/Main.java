package org.example;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setDefenseType("Shield");


        System.out.println("Boss health: " + boss.getHealth());
        System.out.println("Boss damage: " + boss.getDamage());
        System.out.println("Boss defense type: " + boss.getDefenseType());

        Hero[] heroes = createHeroes();

        for (Hero hero : heroes) {
            System.out.println("Hero health: " + hero.getHealth());
            System.out.println("Hero damage: " + hero.getDamage());
            System.out.println("Hero superpower: " + hero.getSuperpower());
            System.out.println();
        }

    }
    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(100, 20, "Teleport");
        Hero hero2 = new Hero(120, 30);
        Hero hero3 = new Hero(80, 25, "Invisibility");

        return new Hero[]{hero1, hero2, hero3};
    }

}