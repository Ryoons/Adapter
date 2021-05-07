package com.group_f;

// This is the Target Interface
public interface HeadphoneInput {
    default void sound() {
        sound();
    }
    default void sound(Sony sony) {
    }
    default void power() {
        power();
    }
    default void power(Sony sony) {
    }
}
