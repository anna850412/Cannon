package com.kodilla.cannon;

public class Cannon {
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
