package com.example.game;

public class GoldenAura extends CharacterDecorator {
    private static final String GOLDEN_SPRITE = "golden_aura.png";
    private static final int SPEED_BUFF = 2;
    private static final int DAMAGE_BUFF = 5;

    GoldenAura(Character character) {
        super(character);
    }

    @Override
    public int getSpeed() {
        return character.getSpeed() + SPEED_BUFF;
    }

    @Override
    public void move() {
        System.out.println("Moving at speed " + getSpeed() + " with sprite " + getSprite() + " [Golden Aura glowing]");
    }

    @Override
    public int getDamage() {
        return character.getDamage() + DAMAGE_BUFF;
    }

    @Override
    public void attack() {
        System.out.println(
                "Attacking with damage " + getDamage() + " using sprite " + getSprite() + " [Golden Aura blazing]");
    }

    @Override
    public String getSprite() {
        return GOLDEN_SPRITE;
    }

}
