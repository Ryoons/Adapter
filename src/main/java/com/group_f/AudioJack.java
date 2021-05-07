package com.group_f;
import com.group_f.HeadphoneInput;

// This is the audio jack adaptee class
public class AudioJack implements HeadphoneInput{
    public static void init() {
    }
    public void steroSound() {
        System.out.println("Playing audio.");
    }
    public void voltage() {
        System.out.println("Sending power.");
    }

}
