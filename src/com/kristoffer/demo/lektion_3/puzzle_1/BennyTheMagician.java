package com.kristoffer.demo.lektion_3.puzzle_1;

import com.kristoffer.demo.Colors;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

import static com.kristoffer.demo.Colors.*;

public class BennyTheMagician {

    public String stone = "Stone";
    Scanner sc = new Scanner(System.in);

    public void castMagicSpell() {



        do {

            System.out.println("What spell do you want to cast?");
            System.out.println("""
                1. "red"
                2. "blue"
                3. "green"
                4. "yellow"
                """);

            switch (sc.nextLine()) {
                case "red" -> System.out.println(RED + stone + RESET);
                case "blue" -> System.out.println(BLUE + stone + RESET);
                case "green" -> System.out.println(GREEN + stone + RESET);
                case "yellow" -> System.out.println(YELLOW + stone + RESET);

                default -> System.out.println("Please look at instructions again!");

            }

        } while (true);

    }

}
