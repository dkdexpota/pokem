package com.company;
import com.company.attacks.Calm_Mind;
import com.company.attacks.Dazzling_Gleam;
import ru.ifmo.se.pokemon.*;

public class Flabebe extends Pokemon {
    public Flabebe(String name, int lvl) {
        super(name, lvl);
        setType(Type.FAIRY);
        setStats(44, 38, 39, 61, 79, 42);
        setMove(new Dazzling_Gleam(), new Calm_Mind());
    }
}