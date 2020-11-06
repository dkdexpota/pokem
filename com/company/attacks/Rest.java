package com.company.attacks;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(){
        super(Type.PSYCHIC, 0, 0);
    }
    @Override
    protected String describe() {
        return "Атакует, используя Rest";
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect e = new Effect();
        e.sleep(pokemon);
        e.turns(2);
        pokemon.restore();
    }
}
