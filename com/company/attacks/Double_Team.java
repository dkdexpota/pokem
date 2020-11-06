package com.company.attacks;

import ru.ifmo.se.pokemon.*;

public class Double_Team extends StatusMove {
    public Double_Team(){
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected String describe() {
        return "Атакует, используя Double Team";
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect e = new Effect();
        e.stat(Stat.EVASION, 1);
    }
}
