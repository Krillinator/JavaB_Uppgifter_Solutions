package com.kristoffer.demo.lektion_2.puzzle_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {

    Scanner sc = new Scanner(System.in);
    List<String> shoppingList = new ArrayList<>();

    public void makeDecision() {

        do {
            System.out.println("1. add, 2. remove, 3. show, 0. EXIT");

            switch (sc.nextLine()) {
                case "1" -> addProduct();
                case "2" -> removeProduct();
                case "3" -> showProducts();
                case "0" -> System.exit(0);

                default -> System.out.println("Try again");
            }
        } while (true);

    }

    public void addProduct() {
        System.out.println("What do you want to add?");
        String product = sc.nextLine();
        shoppingList.add(product);
    }

    public void removeProduct() {
        shoppingList.remove("Fruits");
    }

    public void showProducts() {
        System.out.println(shoppingList);
    }

}
