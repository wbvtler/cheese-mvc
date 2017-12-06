package org.launchcode.models;

import java.util.ArrayList;

public class CheeseData {


    static ArrayList<Cheese> cheeses = new ArrayList<>();

    // getAll
    public static ArrayList<Cheese> getAll() {
        return cheeses;
    }

    // add
    public static void add(Cheese newCheese) {
        cheeses.add(newCheese);
    }

    // getById
    public static Cheese getById(int id) {
        Cheese theCheese = null;
        // for each cheese in the arraylist of cheeses
        for (Cheese candidCheese : cheeses) {
            if (candidCheese.getCheeseId() == id) {
                theCheese = candidCheese;
            }

        }

        return theCheese;
    }

    // remove
    public static void remove(int id) {
        Cheese cheeseToRem = getById(id);
        cheeses.remove(cheeseToRem);
    }
}
