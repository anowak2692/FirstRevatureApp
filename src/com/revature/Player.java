package com.revature;

public class Player extends GameEntity{

    public Player(String name, int health, double speed) {
        super(name, health, speed);
    }

    public void normalAttack(Enemy enemy){
        if(enemy.getCanBeDamaged()){
            System.out.println(name + " attacks!");
            enemy.setHealth(enemy.getHealth() - 3);
            System.out.println(enemy.getName() + " takes 3 damage!");
            System.out.println(enemy.getName() + " has " + enemy.getHealth() + " health.");
        }
        else {
            System.out.println(enemy.getName() + " is currently invincible!");
        }
    }

    public void superAttack(Enemy enemy){
        if(enemy.getCanBeDamaged()){
            System.out.println(name + " does a super attack!");
            enemy.setHealth(enemy.getHealth() - 40);
            System.out.println(enemy.getName() + " takes 40 damage!");
            System.out.println(enemy.getName() + " has " + enemy.getHealth() + " health.");
        }
        else {
            System.out.println(enemy.getName() + " is currently invincible!");
        }
    }
}
