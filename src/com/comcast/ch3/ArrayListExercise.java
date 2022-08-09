package com.comcast.ch3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercise {
    public static void main(String[] args) {
//Number List
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(8);
        nums.add(10);
        nums.add(12);
        nums.add(14);
        nums.add(16);
        nums.add(18);
        nums.add(20);
        nums.add(333);
//Word List
        ArrayList<String> words = new ArrayList<>();
        words.add("string");
        words.add("test");
        words.add("testing");
        words.add("lol");
        words.add("Grows");
        words.add("toooo");
        words.add("Code!");

        System.out.println(sumEven(nums));

        printFivers(words);
    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static void printFivers(ArrayList<String> words){
        ArrayList<String> fivers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();

        for(String word : words) {
            if(word.length() == numChars){
                fivers.add(word);
            }

        }
        System.out.println(fivers);
    }
}
