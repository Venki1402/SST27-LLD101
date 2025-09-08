package com.example.game;

public class SpeedBoost extends CharacterDecorator {
    private int speedIncrease;

    SpeedBoost(Character character, int speedIncrease) {
        super(character);
        this.speedIncrease = speedIncrease;
    }

    @Override
    public int getSpeed() {
        return character.getSpeed() + speedIncrease;
    }

    @Override
    public void move() {
        System.out.println("Moving at speed " + getSpeed() + " with sprite " + getSprite() + " [Speed Boosted]");
    }

}
