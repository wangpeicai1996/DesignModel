package com.even.client;

import com.even.adapter.MicroUsbAdapter;
import com.even.adapter.TypecAdapter;
import com.even.usb.HuaweiTypec;
import com.even.usb.MicroUsb;

public class AdapterClient {

    public static void main(String[] args) {
        TypecAdapter adapter = new TypecAdapter(new MicroUsb());
        adapter.quickCharge();

        MicroUsbAdapter microUsbAdapter = new MicroUsbAdapter(new HuaweiTypec());
        microUsbAdapter.charge();
    }
}
