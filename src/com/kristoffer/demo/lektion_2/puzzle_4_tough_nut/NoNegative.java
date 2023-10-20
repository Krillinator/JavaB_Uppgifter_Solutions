package com.kristoffer.demo.lektion_2.puzzle_4_tough_nut;

import java.util.ArrayList;
import java.util.List;

public class NoNegative {

    public List<Integer> noNeg(List<Integer> numbersList) {

        List<Integer> newNumbersList = new ArrayList<>(
                numbersList
        );

        System.out.println(numbersList);
        for (int i = 0; i < newNumbersList.size(); i++) {

            if (newNumbersList.get(i) < 0) {
                System.out.println("INSIDE IF-CONDITION");
                newNumbersList.remove(i);
            }

        }
        System.out.println(newNumbersList);

        return newNumbersList;

    }

}
