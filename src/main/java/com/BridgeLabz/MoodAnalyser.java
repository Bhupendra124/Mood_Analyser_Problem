package com.BridgeLabz;

public class MoodAnalyser {
    public String message;
    public MoodAnalyser(String message){
        this.message=message;
    }

    public String analyseMood(String message) throws MoodAnalyserException {
        try {


            if (message.isEmpty())
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY,"Please type any message");
            if (message.contains("SAD"))
                return "SAD";
            else
                return "HAPPY";
        }catch (NullPointerException e){
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,"Please enter message");
        }

    }
}
