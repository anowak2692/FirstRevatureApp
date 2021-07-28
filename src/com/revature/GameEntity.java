package com.revature;

public class GameEntity {
    protected String name;
    protected int health;
    protected double speed;
    protected boolean canBeDamaged;

    public GameEntity(String name, int health, double speed){
        this.name = name;
        this.health = health;
        this.speed = speed;
        this.canBeDamaged = true;
    }

    public String getName() {
        return name;
    }

    public int getHealth(){
        return health;
    }

    public double getSpeed(){
        return speed;
    }

    public boolean getCanBeDamaged(){
        return canBeDamaged;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setHealth(int newHealth){
        if(newHealth < 0){
            health = 0;
        }
        else{
            health = newHealth;
        }
    }

    public void setSpeed(double newSpeed){
        speed = newSpeed;
    }

    public void setCanBeDamaged(boolean newValue){
        canBeDamaged = newValue;
    }

    public final void announceDeath(){
        System.out.println(name + " has perished!");
    }
}
