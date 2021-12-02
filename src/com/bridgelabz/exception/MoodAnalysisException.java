package com.bridgelabz.exception;

public class MoodAnalysisException extends Exception {
    Mood mood;
    enum Mood {NULL_MOOD}

    MoodAnalysisException(Mood mood , String message){
        super(message);
        this.mood = mood;
    }

}
