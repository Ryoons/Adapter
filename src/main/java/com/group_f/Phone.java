package com.group_f;

// This is the client class
public class Phone {

    public static void main(String[] args) {

        var usbcHead = new UsbcHeadphone(new Sony());
        usbcHead.sound(new UsbC(new AudioJack()));

    }
}
