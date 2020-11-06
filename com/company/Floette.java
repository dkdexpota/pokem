package com.company;
import com.company.attacks.Fairy_Wind;

public class Floette extends Flabebe {
    public Floette(String name, int lvl) {
        super(name, lvl);
        setStats(54, 45, 47, 75, 98, 52);
        addMove(new Fairy_Wind());
    }
}