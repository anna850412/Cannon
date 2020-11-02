package com.kodilla.cannon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.LinkedList;
import java.util.List;

@SpringBootApplication class Cannon {
    boolean loaded;

    public Cannon(boolean loaded) {
        this.loaded = loaded;
    }

    public void fire() {
        if (this.loaded == true) {
            System.out.println("Cannon is loaded");

        } else {
            System.out.println("Cannon is not loaded. Insert bullet");
            this.loaded = true;
        }
    }

}
    class Application{
    public static void main(String[] args) {
        SpringApplication.run(Cannon.class, args);
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