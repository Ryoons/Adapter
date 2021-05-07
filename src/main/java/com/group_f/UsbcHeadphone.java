package com.group_f;

public class UsbcHeadphone {
    private Sony sony;

    public UsbcHeadphone(Sony sony) {
        this.sony = sony;
    }
    public void sound(HeadphoneInput input) {
        input.sound(sony);
    }
    public void power(HeadphoneInput input) {
        input.power(sony);
    }
}
