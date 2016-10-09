package com.epam.rpg;

/**
 * Created by kodoo on 09.10.16.
 */
public class App {

    public static void main(String[] args) {
        Unit[] units = {
                new Warrior(),
                new Warrior().withAnimation(Animation.WALK),
                new Archer(),
                new Archer().withAnimation(Animation.ATTACK),
                new Horse<Warrior>().withRider(new Warrior()),
                //new Wolf<Warrior>().withRider(new Archer()), //error
                new Wolf<Archer>().withRider((Archer) new Archer().withAnimation(Animation.ATTACK)), //cast needed
                new Horse<Mount<Unit>>().withRider(new Wolf<>().withRider(new Warrior())) //cast is not needed
        };

        for(Unit u : units) {
            System.out.println(u);
        }
    }
}
