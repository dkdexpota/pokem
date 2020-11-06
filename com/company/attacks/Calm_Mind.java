package com.company.attacks;

import ru.ifmo.se.pokemon.*;

public class Calm_Mind extends StatusMove {
    public Calm_Mind(){
        super(Type.PSYCHIC, 0, 0);
    }
    @Override
    protected String describe() {
        return "Атакует, используя Calm Mind";
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPECIAL_ATTACK, 1);
        pokemon.setMod(Stat.SPECIAL_DEFENSE, 1);
    }
}