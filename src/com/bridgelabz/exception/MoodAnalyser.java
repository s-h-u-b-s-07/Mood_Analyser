package com.bridgelabz.exception;

public class MoodAnalyser {
    public static MoodAnalyser instance;
    private String message;

    private MoodAnalyser() {
    }
    public static MoodAnalyser getInstance() {

        if (instance == null) {
            instance = new MoodAnalyser();
        }
        return instance;
    }

    public String analyse_Mood(String message) {
        if (message.contains(message)) {
            message = "SAD";
            System.out.println("SAD");
        }else {
            message = "HAPPY";
            System.out.println("HAPPY");
        }
        return message;
    }
}
