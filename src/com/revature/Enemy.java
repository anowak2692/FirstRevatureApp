package com.revature;

public class Enemy extends GameEntity {

    public Enemy(String name, int health, double speed) {
        super(name, health, speed);
    }

    public void attack(Player p){
        if(p.getCanBeDamaged()){
            System.out.println(name + " attacks!");
            p.setHealth(p.getHealth() - 1);
            System.out.println(p.getName() + " takes 1 damage!");
            System.out.println(p.getName() + " has " + p.getHealth() + " health.");
        }
        else{
            System.out.println(p.getName() + " cannot take damage!");
        }
    }

    public void invincibilityMove(){
        this.canBeDamaged = false;
    }

    public void endInvincibility(){
        this.canBeDamaged = true;
    }
}
