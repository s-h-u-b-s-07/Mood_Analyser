package com.bridgelabz.exception;

import com.bridgelabz.exception.MoodAnalysisException.Mood;

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

    public String analyse_Mood() throws MoodAnalysisException {
        try {
            if (message == null) {
                throw new MoodAnalysisException(Mood.NULL_MOOD, "Null MooD");
            }
            if (message == "SAD") {
                throw new MoodAnalysisException(Mood.SAD_MOOD, "SAD MOOD");
            }
            if (message == "SAD") {
                throw new MoodAnalysisException(Mood.HAPPY_MOOD, "HAPPY MOOD");
            }
            if (message.toLowerCase().contains("sad"))

                message = "SAD";
            else
                message = "HAPPY";
            return message;
        } catch (MoodAnalysisException e) {

            System.out.print(e);
        }
        return message;
    }
}
