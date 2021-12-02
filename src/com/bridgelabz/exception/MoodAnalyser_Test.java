package com.bridgelabz.exception;

import org.junit.BeforeClass;
import org.junit.Test;
import com.bridgelabz.exception.MoodAnalysisException;
import static org.junit.Assert.assertEquals;

public class MoodAnalyser_Test {
    //	public String message = "I am in happy Mood";
    public static MoodAnalyser mood;
    private static String message;

    @BeforeClass
    public static void init() {

        mood = MoodAnalyser.getInstance();
    }

    @Test
    public void given_message_should_return_SAD() {
        try {
            mood = new MoodAnalyser(message);
            String testMessage = mood.analyse_Mood();
            assertEquals("SAD", testMessage);
        } catch (MoodAnalysisException e) {
        }
    }

    @Test
    public void given_message_should_return_HAPPY() {
        try {
            mood = new MoodAnalyser(message);
            String testMessage = mood.analyse_Mood();
            assertEquals("HAPPY", testMessage);
        } catch (MoodAnalysisException e) {
        }
    }
}