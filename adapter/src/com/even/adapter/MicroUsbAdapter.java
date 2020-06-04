package com.even.adapter;

import com.even.usb.TypecUsb;
import com.even.usb.Usb;

public class MicroUsbAdapter implements Usb {

    private TypecUsb typecUsb;
    public MicroUsbAdapter(TypecUsb typecUsb){
        this.typecUsb = typecUsb;
    }

    @Override
    public void charge() {
        typecUsb.quickCharge();
        System.out.println("转换为普通充电");
    }
}
