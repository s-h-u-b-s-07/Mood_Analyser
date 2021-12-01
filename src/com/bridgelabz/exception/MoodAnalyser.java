package com.bridgelabz.exception;

public class MoodAnalyser {
    public static String message;
    public static MoodAnalyser instance;

    MoodAnalyser(String message) {
        this.message = message;
    }

    public static MoodAnalyser getInstance() {
        if (instance == null) {
            instance = new MoodAnalyser(message);
        }
        return instance;
    }

    public String analyse_Mood() {
        if (message.toLowerCase().contains("sad")) {
            message = "SAD";
            System.out.println("SAD");
        }else {
            message = "HAPPY";
            System.out.println("HAPPY");
        }
        return message;
    }
}
