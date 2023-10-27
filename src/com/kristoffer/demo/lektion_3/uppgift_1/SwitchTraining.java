package com.kristoffer.demo.lektion_3.uppgift_1;

import java.util.Scanner;

public class SwitchTraining {

    public String weekDay;

    public void findWeekDayOldSwitch() {

        switch (weekDay) {
            case "1": System.out.println("Monday");
                break;

            case "2": System.out.println("Tuesday");
                break;

            case "3": System.out.println("Wednesday");
                break;

            case "4": System.out.println("Thursday");
                break;

            case "5": System.out.println("Friday");
                break;

            case "6": System.out.println("Saturday");
                break;
            case "7": System.out.println("Sunday");
        }

    }


    public void findWeekDay() {

        switch (weekDay) {
            case "1" -> System.out.println("Monday");
            case "2" -> System.out.println("Tuesday");
            case "3" -> System.out.println("Wednesday");
            case "4" -> System.out.println("Thursday");
            case "5" -> System.out.println("Friday");
            case "6" -> System.out.println("Saturday");
            case "7", "8", "9" -> System.out.println("Sunday");
        }

    }

}
