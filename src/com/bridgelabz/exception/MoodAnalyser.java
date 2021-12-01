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
        try {
            if(message.toLowerCase().contains("sad")) {
                return "SAD";
            }else {
                return "HAPPY";
            }
        }catch(Exception ex) {
            return "Empty String";
        }
    }

}
