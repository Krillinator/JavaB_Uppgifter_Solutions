package com.kristoffer.demo.lektion_2.uppgift_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DataStructureTraining {

    public void myArrayList() {
        List<Integer> scoresList = new ArrayList<>();

        // Add Elements
        System.out.println(scoresList);
        scoresList.addAll(new ArrayList<>(Arrays.asList(5, 50, 150)));
        scoresList.add(150);
        scoresList.add(500);
        System.out.println(scoresList);

        // Set Elements
        scoresList.set(0, 1000);    // Change index 0 = 1000

        // Get Elements
        System.out.println( scoresList.get(0) );

        // Remove Elements
        scoresList.remove( scoresList.size() - 1 ); // Remove last element in list

        System.out.println(scoresList);

    }

    public void myLinkedList() {
        List<Integer> scoresList = new LinkedList<>();

        // Add Elements
        System.out.println(scoresList);
        scoresList.addAll(new ArrayList<>(Arrays.asList(5, 50, 150)));
        scoresList.add(150);
        scoresList.add(500);
        System.out.println(scoresList);

        // Set Elements
        scoresList.set(0, 1000);    // Change index 0 = 1000

        // Get Elements
        System.out.println( scoresList.get(0) );

        // Remove Elements
        scoresList.remove( scoresList.size() - 1 ); // Remove last element in list

        System.out.println(scoresList);
    }

}
