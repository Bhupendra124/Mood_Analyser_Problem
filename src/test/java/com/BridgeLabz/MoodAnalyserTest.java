package com.BridgeLabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    void givenMessage_whenSad_shouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
            String mood = moodAnalyser.analyseMood("This is a Sad Message ");
        Assertions.assertEquals("SAD" ,mood);
    }


    @Test
    void givenMessage_WhenNotSad_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser   = new MoodAnalyser();
            String mood =moodAnalyser.analyseMood("This is a Happy Message ");
            Assertions.assertEquals("HAPPY",mood);

    }
}
