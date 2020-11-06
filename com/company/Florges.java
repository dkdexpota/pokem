package com.company;
import com.company.attacks.Petal_Blizzard;

public class Florges extends Floette {
    public Florges(String name, int lvl) {
        super(name, lvl);
        setStats(78, 65, 68, 112, 154, 75);
        addMove(new Petal_Blizzard());
    }
}