package com.bridgelabz.exception;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("WELCOME TO MOOD ANALYZER PROGRAM");

//      System.out.println("Enter Your Message.");
//		Scanner sc = new Scanner(System.in);
//		String message = null;
        MoodAnalyser mood = new MoodAnalyser(null);
        System.out.println(mood.analyse_Mood());
    }
}
