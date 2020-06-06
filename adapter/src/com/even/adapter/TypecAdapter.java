package com.even.adapter;

import com.even.usb.TypecUsb;
import com.even.usb.Usb;

public class TypecAdapter implements TypecUsb {

    private Usb usb;

    public TypecAdapter(Usb usb){
        this.usb = usb;
    }

    @Override
    public void quickCharge() {
        usb.charge();
        System.out.println("转换为快充");
    }
}
