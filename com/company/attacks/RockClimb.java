package com.company.attacks;
import ru.ifmo.se.pokemon.*;
public class RockClimb extends PhysicalMove {
    public RockClimb() {
        super(Type.NORMAL, 90, 85);
    }
    @Override
    protected String describe() {
        return "Атакует, используя Rock Climb";
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < 0.2) {
            Effect.confuse(pokemon);
        }
    }
}
