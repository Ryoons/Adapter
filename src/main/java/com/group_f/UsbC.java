package com.group_f;

// This is the usbc adapter
public class UsbC implements HeadphoneInput {
    private AudioJack audioJack;

    public UsbC(AudioJack audioJack) {

        this.audioJack = audioJack;
    }
    @Override
    public void sound(Sony sony) {
        AudioJack.init();
        System.out.println("Converting Sound.");
        audioJack.steroSound();
   }
   @Override
    public void power(Sony sony) {
        AudioJack.init();
        System.out.println("Converting Power.");
        audioJack.voltage();
    }
}
