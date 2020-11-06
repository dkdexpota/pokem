package com.company.attacks;
import ru.ifmo.se.pokemon.*;

public class Dazzling_Gleam extends SpecialMove {
    public Dazzling_Gleam () {
        super (Type.NORMAL, 40, 100);
    }
    @Override
    protected String describe() {
        return "Атакует, используя Dazzling Gleam";
    }
    @Override
    protected void applySelfEffects (Pokemon pokemon) {
        pokemon.setMod(Stat.ATTACK, -1 );
    }
}
