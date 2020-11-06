package com.company.attacks;
import ru.ifmo.se.pokemon.*;
public class Growth extends StatusMove {
    public Growth() {
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected String describe() {
        return "Атакует, используя Growth";
    }
    @Override
    protected void applySelfEffects (Pokemon pokemon) {
        pokemon.setMod(Stat.ATTACK, -1 );
        pokemon.setMod(Stat.SPECIAL_ATTACK, -1 );
    }
}