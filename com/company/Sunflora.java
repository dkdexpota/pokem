package com.company;

import com.company.attacks.Leaf_Storm;

public class Sunflora extends Sunkern {
    Leaf_Storm ls;

    public Sunflora (String name, int level) {
        super(name, level);
        ls = new Leaf_Storm();
        setStats(75, 75, 55, 105, 85, 30);
        super.addMove(ls);
    }
}
