package com.company;
import com.company.attacks.Double_Team;
import com.company.attacks.Glare;
import com.company.attacks.Leer;
import com.company.attacks.RockClimb;
import ru.ifmo.se.pokemon.*;

public class Druddigon extends Pokemon {
    public Druddigon (String name, int level) {
        super(name, level);
        setType(Type.DRAGON);
        super.setStats(77, 120, 90, 60,90, 48);
        setMove(new RockClimb(), new Glare(), new Leer(), new Double_Team());
    }
}