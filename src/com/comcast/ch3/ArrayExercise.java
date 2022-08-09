package com.comcast.ch3;

import java.util.Arrays;

public class ArrayExercise {
    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};

        String phrase = "I would not, could not, in a box. I would not, could " +
                "not with a fox. I will not eat them in a house. I will not eat " +
                "them with a mouse.";
        String[] words = phrase.split(" ");
        String[] sentences = phrase.split("[.]"); //or  "\\."

        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(sentences));


        for(int i : integerArray){
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }



    }
}
