package com.example.game;

public class DamageBoost extends CharacterDecorator {
    private int damageIncrease;

    DamageBoost(Character character, int damageIncrease) {
        super(character);
        this.damageIncrease = damageIncrease;

    }

    @Override
    public int getDamage() {
        return character.getDamage() + damageIncrease;
    }

    @Override
    public void attack() {
        System.out
                .println("Attacking with damage " + getDamage() + " using sprite " + getSprite() + " [Damage Boosted]");
    }

}
