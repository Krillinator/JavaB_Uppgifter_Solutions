package com.kristoffer.demo;


import com.kristoffer.demo.lektion_1.uppgift_2.MyCounter;
import com.kristoffer.demo.lektion_2.puzzle_1.Shop;
import com.kristoffer.demo.lektion_2.puzzle_2.DataStructureSorting;
import com.kristoffer.demo.lektion_2.puzzle_3.SwitchPlacesDataStructure;
import com.kristoffer.demo.lektion_2.puzzle_4_tough_nut.NoNegative;
import com.kristoffer.demo.lektion_2.uppgift_3.DataStructureTraining;
import com.kristoffer.demo.lektion_2.uppgift_4.Student;
import com.kristoffer.demo.lektion_3.puzzle_1.BennyTheMagician;
import com.kristoffer.demo.lektion_3.uppgift_5_tough_nut.SwitchTraining;
import com.kristoffer.demo.lektion_4.puzzle_1.Book;
import com.kristoffer.demo.lektion_4.puzzle_1.LibraryApp;
import com.kristoffer.demo.lektion_5.Biology;
import com.kristoffer.demo.lektion_5.IT;
import com.kristoffer.demo.lektion_5.Math;
import com.kristoffer.demo.lektion_5.Subject;
import com.kristoffer.demo.lektion_5.puzzle_1.CardGame;

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
        /*
        NoNegative noNegative = new NoNegative();

        List<Integer> scoreList = new ArrayList<>();

        scoreList.add(5);
        scoreList.add(-5);
        scoreList.add(-50);
        scoreList.add(500);

        System.out.println(scoreList);
        System.out.println(noNegative.filterNegativeNumbers(scoreList));

         */

        // Exercise 3_1
        /*
        SwitchTraining switchTraining = new SwitchTraining();
        switchTraining.weekDay = "5";

        switchTraining.findWeekDay();

         */

        // Exercise 3_2
        /*
        SwitchTraining switchTraining = new SwitchTraining();
        switchTraining.findWeekDayScanner();

         */

        // Exercise 3_3
        /*
        SwitchTraining switchTraining = new SwitchTraining();
        switchTraining.infiniteScannerSwitch();
         */

        // Exercise 3_4
        /*
        SwitchTraining switchTraining = new SwitchTraining();
        switchTraining.infiniteScannerSwitch();
         */

        // Exercise 3_5 Tough Nut
        /*
        SwitchTraining switchTraining = new SwitchTraining();
        switchTraining.test();

         */

        // Exercise Puzzle 3_1
        /*
        BennyTheMagician benny = new BennyTheMagician();
        benny.castMagicSpell();
         */

        // Exercise Puzzle 4_1
        /*
        LibraryApp libraryApp = new LibraryApp();

        libraryApp.addBookToShelf(
                new Book("MyBook", "Benny")
        );

        System.out.println(libraryApp.getBookshelfList());
         */

        // Exercise 5_2
        // Instantiate Subjects
        /*
        Math math = new Math();
        IT it = new IT();
        Biology biology = new Biology();

        List<Subject> subjectList = new ArrayList();

        subjectList.add(math);
        subjectList.add(it);
        subjectList.add(biology);

         */

        // Exercise puzzle 5_1
        CardGame cardGame = new CardGame();

        cardGame.generateDeckOfCards();
        System.out.println(cardGame.getDeck());

    }

}
