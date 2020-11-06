package com.company.attacks;

import ru.ifmo.se.pokemon.*;

public class Petal_Blizzard extends PhysicalMove {
    public Petal_Blizzard(){
        super(Type.GRASS, 0, 0);
    }
    @Override
    protected String describe() {
        return "Атакует, используя Petal Blizzard";
    }
}