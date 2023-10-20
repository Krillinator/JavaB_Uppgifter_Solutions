package com.kristoffer.demo.lektion_2.uppgift_3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DataStructureTraining {

    public void myLinkedList() {
        LinkedList<Integer> scoresList = new LinkedList<>(
                Arrays.asList(0, 150, 500, 1000)
        );

        System.out.println(scoresList);
        scoresList.removeFirst();                       // Remove first index in list
        scoresList.addFirst(9999);                   // Add as first index in list
        System.out.println(scoresList.getFirst());     // Get first index in list
        System.out.println(scoresList);

    }

}
