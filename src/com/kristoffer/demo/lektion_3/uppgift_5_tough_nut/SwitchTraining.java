package com.kristoffer.demo.lektion_3.uppgift_5_tough_nut;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwitchTraining {

    public void test() {

        Scanner sc = new Scanner(System.in);

        List<String> characterList = new ArrayList<>();

        boolean isCreatingCharacterName = true;
        String input;
        String username;

        do {
            System.out.println("Press enter to add a new word or letter to your name. Write: 'quit' to exit! ");

            switch (input = sc.nextLine()) {
                case "quit" -> isCreatingCharacterName = false;

                default -> characterList.add(input.replace(" ", ""));   // Remove whitespaces
            }

            System.out.println(characterList);

        } while (isCreatingCharacterName);

        username = String.join("", characterList);  // Todo - String.join works behind the scenes
        System.out.println(username);
        System.out.println(username.replaceAll("\\s+", "")); // Alternative #2

    }

}
