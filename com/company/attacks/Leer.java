package com.company.attacks;
import ru.ifmo.se.pokemon.*;

public class Leer extends StatusMove {
    public Leer(){
        super(Type.NORMAL,0,100);
    }
    @Override
    protected String describe() {
        return "Атакует, используя Leer";
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.DEFENSE, -1);
    }
}
