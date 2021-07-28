package com.revature;

public class Main{
    public static void main(String args[]){
        Player p1 = new Player("Mega Man X", 32, 5.5);
        Enemy sigma = new Enemy("Sigma", 32, 10.2);

        p1.normalAttack(sigma);
        sigma.attack(p1);
        sigma.invincibilityMove();
        p1.normalAttack(sigma);
        sigma.endInvincibility();
        p1.superAttack(sigma);
        sigma.announceDeath();
    }
}

