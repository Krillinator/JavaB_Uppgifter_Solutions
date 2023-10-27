package com.kristoffer.demo.lektion_3.uppgift_3;

import java.util.Scanner;

public class SwitchTraining {

    public void infiniteScannerSwitch() {

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Press 1-7 for a day on the week! PRESS 0 TO EXIT");

            switch (sc.nextInt()) {
                case 1,2,3,4,5 -> System.out.println("Weekday");
                case 6,7 -> System.out.println("Weekend");
                case 0 -> System.exit(0);
            }

        } while(true);

    }

}
