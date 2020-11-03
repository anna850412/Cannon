package com.kodilla.cannon;

import java.util.LinkedList;
import java.util.List;

public  class Application {
    public static void main(String[] args) {

        List<Cannon> cannonList = new LinkedList<>();
        cannonList.add(new Cannon(false));
        cannonList.add(new Cannon(true));
        cannonList.add(new Cannon(false));
        cannonList.add(new Cannon(true));

        for (Cannon cannon : cannonList) {
            System.out.println("Before loading");
            System.out.println(cannon.loaded);
            cannon.loaded = true;
            System.out.println("After loading");
            System.out.println(cannon.loaded);
        }
    }
}
