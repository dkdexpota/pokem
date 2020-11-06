package com.company.attacks;
import ru.ifmo.se.pokemon.*;

public class Fairy_Wind extends SpecialMove {
    public Fairy_Wind() {
        super(Type.NORMAL, 40, 100);
    }
    @Override
    protected String describe() {
        return "Атакует, используя Fairy Wind";
    }
}
