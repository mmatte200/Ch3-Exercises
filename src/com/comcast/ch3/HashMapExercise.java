package com.comcast.ch3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExercise {
    public static void main(String[] args) {

        String newStudent;
        HashMap<Integer, String> classRoster = new HashMap<>();
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Student Name: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID#: ");
                Integer newID = input.nextInt();
                classRoster.put(newID, newStudent);

                input.nextLine();
            }
        } while (!newStudent.equals(""));

        input.close();

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : classRoster.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }

        System.out.println("Number of students in roster: " + classRoster.size());
    }
}
