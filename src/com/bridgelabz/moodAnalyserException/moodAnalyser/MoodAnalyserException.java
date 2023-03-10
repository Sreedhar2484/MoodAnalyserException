package com.bridgelabz.moodAnalyserException.moodAnalyser;

public class MoodAnalyserException extends Exception {

    public enum Exception_Type {
        NULL, EMPTY
    }

    public Exception_Type type;

    public MoodAnalyserException(String message, Exception_Type type) {
        super(message);
        this.type = type;
    }
}
