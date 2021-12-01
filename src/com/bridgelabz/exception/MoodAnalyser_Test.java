package com.bridgelabz.exception;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoodAnalyser_Test {

    public String message = "I an in happy Mood";
    public static MoodAnalyser mood;


    @BeforeClass
    public static void init() {

        mood = MoodAnalyser.getInstance();
    }

    @Test
    public void given_message_should_return_SAD() {
        mood =  new MoodAnalyser(message);
        String testMessage = mood.analyse_Mood();
        assertEquals("SAD", testMessage);
    }

    @Test
    public void given_message_should_return_HAPPY() {
        mood =  new MoodAnalyser(message);
        String testMessage = mood.analyse_Mood();
        assertEquals("HAPPY", testMessage);
    }


}
