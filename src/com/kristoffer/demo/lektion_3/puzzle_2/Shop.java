package com.kristoffer.demo.lektion_3.puzzle_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Shop {

    List<Product> productList = new ArrayList<>();

    // Buy a product
    public void buy() {

        Scanner sc = new Scanner(System.in);

        switch (sc.nextLine()) {
            case "apples" -> System.out.println();
        }

    }

    public boolean getDiscount(int productPrice) {

        if (productPrice >= 700) {
            return true;
        } else {
            return false;
        }

    }

    public void getProducts() {
        System.out.println(productList);
    }

    public void stockUpProductList() {

        // Create Apples
        for (int i = 0; i < 10; i++) {
            productList.add(
                    new Product(
                            "Apple",
                            new Random().nextInt(500) + 1
                    )
            );
        }

    }

}
