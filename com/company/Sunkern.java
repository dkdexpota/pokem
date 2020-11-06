package com.company;
import com.company.attacks.Growth;
import com.company.attacks.Rest;
import com.company.attacks.Swagger;
import ru.ifmo.se.pokemon.*;

public class Sunkern extends Pokemon {
    public Sunkern(String name, int level) {
        super(name, level);
        setType(Type.GRASS);
        setStats(30, 30, 30, 30, 30, 30);
        setMove(new Growth(), new Rest(), new Swagger());
    }
}