package com.even.usb;

/**
 * 微口usb
 */
public class MicroUsb implements Usb{


    @Override
    public void charge() {
        System.out.println("普通usb充电");
    }
}
