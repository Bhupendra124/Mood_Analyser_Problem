package com.BridgeLabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    @Test
 public   void givenMessage_whenSad_shouldReturnSad() throws MoodAnalyserException {
        try {


        MoodAnalyser moodAnalyser=new MoodAnalyser(null);
            String mood = moodAnalyser.analyseMood("This is a Sad Message ");
        Assertions.assertEquals("SAD" ,mood);
    }
  catch (Exception e){
      System.out.println("Please type message");}
    }

    @Test
    void givenMessage_WhenNotSad_ShouldReturnHappy() throws MoodAnalyserException {
        try{
        MoodAnalyser moodAnalyser   = new MoodAnalyser(null);
            String mood =moodAnalyser.analyseMood("This is a Happy Message ");
            Assertions.assertEquals("HAPPY",mood);

    }catch (Exception e){
            System.out.println("Please type valid message ");
        }
}
