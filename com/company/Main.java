package com.company;
import ru.ifmo.se.pokemon.Battle;
public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Druddigon p1 = new Druddigon("Молодец", 1);
        Flabebe p2 = new Flabebe("Хищник", 1);
        Floette p3 = new Floette("fas", 1);
        Florges p4 = new Florges("vfd", 1);
        Sunkern p5 = new Sunkern("ffse", 1);
        Sunflora p6 = new Sunflora("vgdthg", 1);
        b.addAlly(p1);
        b.addFoe(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addAlly(p5);
        b.addFoe(p6);
        b.go();
    }
}
