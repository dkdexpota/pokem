package com.company.attacks;

import ru.ifmo.se.pokemon.*;

public class Leaf_Storm extends SpecialMove {
    public Leaf_Storm(){
        super(Type.GRASS, 130, 90);
    }
    @Override
    protected String describe() {
        return "Атакует, используя Leaf Storm";
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPECIAL_ATTACK, -2);
    }
}
