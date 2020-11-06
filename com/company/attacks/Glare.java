package com.company.attacks;
import ru.ifmo.se.pokemon.*;

public class Glare extends StatusMove {
    public Glare(){
        super(Type.NORMAL,0, 100);
    }

    @Override
    protected String describe() {
        return "Атакует, используя Glare";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.paralyze(pokemon);
        if (Math.random() < 0.25) {
            Effect e = new Effect().attack(0);
        }
    }
}
