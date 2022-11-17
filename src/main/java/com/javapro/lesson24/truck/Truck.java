package com.javapro.lesson24.truck;

import com.javapro.lesson24.Transport;

public class Truck implements Transport {
    @Override
    public void cargoDelivery() {
        System.out.println("Truck delivering cargo along the route");
    }
}
