package com.kristoffer.demo.lektion_2.puzzle_4_tough_nut;

import java.util.ArrayList;
import java.util.List;

public class NoNegative {

    /*
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

     */

    public List<Integer> filterNegativeNumbers(List<Integer> unfilteredArraylist) {

        for (int i = 0; i < unfilteredArraylist.size(); i++) {
            System.out.println(unfilteredArraylist.get(i) );

            if (unfilteredArraylist.get(i) < 0) {
                unfilteredArraylist.remove(i);
                System.out.println("The value is less than 0");
                i--;
            }
        }

        return unfilteredArraylist;

    }

}
