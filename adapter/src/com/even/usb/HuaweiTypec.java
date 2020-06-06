package com.even.usb;

public class HuaweiTypec implements TypecUsb {
    @Override
    public void quickCharge() {
        System.out.println("华为usb快充");
    }
}
