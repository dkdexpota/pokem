package com.company.attacks;
import ru.ifmo.se.pokemon.*;
public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }
    @Override
    protected String describe() {
        return "Атакует, используя Swagger";
    }
    @Override
    protected void applySelfEffects (Pokemon pokemon) {
        pokemon.setMod(Stat.ATTACK, -2 );
        Effect.confuse(pokemon);
    }
}
