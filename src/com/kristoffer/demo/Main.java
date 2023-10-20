package com.kristoffer.demo;


import com.kristoffer.demo.lektion_1.uppgift_2.MyCounter;
import com.kristoffer.demo.lektion_2.puzzle_1.Shop;
import com.kristoffer.demo.lektion_2.puzzle_2.DataStructureSorting;
import com.kristoffer.demo.lektion_2.puzzle_3.SwitchPlacesDataStructure;
import com.kristoffer.demo.lektion_2.puzzle_4_tough_nut.NoNegative;
import com.kristoffer.demo.lektion_2.uppgift_3.DataStructureTraining;
import com.kristoffer.demo.lektion_2.uppgift_4.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Exercise 1_1
        /*
        Counter counter = new Counter();

        counter.counter();          // Instance
        counterStatic();    // Static reference method

         */

        // Exercise 1_2
        /*
        MyCounter counterOne = new MyCounter();
        MyCounter counterTwo = new MyCounter();
        MyCounter counterThree = new MyCounter();

        counterOne.counter();
        counterTwo.counterStatic();
        counterThree.counterStatic();
         */

        // Exercise 2_2
        /*
        DataStructureTraining dataStructureTraining = new DataStructureTraining();
        dataStructureTraining.myLinkedList();

         */

        // Exercise 2_3
        /*
        DataStructureTraining dataStructureTraining = new DataStructureTraining();
        dataStructureTraining.myLinkedList();
         */

        // Exercise 2_4
        /*
        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Student benny = new Student("Benny"+i, 15+i);

            studentList.add(benny);
        }

        // Scanner scanner = new Scanner(System.in);
        // Student student = new Student(scanner.next(), scanner.nextInt());

         Anonymous object example
        for (int i = 0; i < 10; i++) {
            studentList.add(
                    new Student("Benny"+i, 15+i)
            );
        }


        System.out.println(studentList);
        */

        // Exercise Puzzle 2_1
        /*
        Shop shop = new Shop();
        shop.makeDecision();
         */

        // Exercise Puzzle 2_2
        /*
        DataStructureSorting dataStructureSorting = new DataStructureSorting();
        dataStructureSorting.sort();

         */

        // Exercise Puzzle 2_3
        /*
        SwitchPlacesDataStructure switchPlacesDataStructure = new SwitchPlacesDataStructure();
        switchPlacesDataStructure.myArrayList();
         */

        // Exercise Puzzle 2_4
        NoNegative noNegative = new NoNegative();

        noNegative.noNeg(new ArrayList<>(
                Arrays.asList(0, 5, -1)
        ));

    }

}
