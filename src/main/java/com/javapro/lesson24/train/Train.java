package com.javapro.lesson24.train;

import com.javapro.lesson24.Transport;

public class Train implements Transport {
    @Override
    public void cargoDelivery() {
        System.out.println("Train delivering cargo along the route");
    }
}
