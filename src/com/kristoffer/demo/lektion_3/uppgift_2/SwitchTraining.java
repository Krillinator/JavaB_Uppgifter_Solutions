package com.kristoffer.demo.lektion_3.uppgift_2;

import java.util.Scanner;

public class SwitchTraining {

    public void findWeekDayScanner() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Type a day of the week as a number, example: 2 for tuesday");

        switch (sc.nextInt()) {
            case 1,2,3,4,5 -> System.out.println("This is Weekday");
            case 6,7 -> System.out.println("This is Weekend");

            default -> System.out.println("TRY AGAIN - from 1-7");
        }

    }


}
