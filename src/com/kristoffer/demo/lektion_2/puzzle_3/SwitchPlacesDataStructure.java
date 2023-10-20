package com.kristoffer.demo.lektion_2.puzzle_3;

import com.kristoffer.demo.lektion_2.uppgift_4.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwitchPlacesDataStructure {

    public void myArrayList() {

        List<Student> studentList = new ArrayList<>(
                Arrays.asList(
                        new Student("Benny", 15),
                        new Student("Frida", 15)
                )
        );

        System.out.println(studentList);
        studentList.remove(0);
        studentList.add(new Student("Benny", 15));
        System.out.println(studentList);
    }

}
