package com.javapro.lesson24.truck;

import com.javapro.lesson24.Logist;

public class TruckLogist implements Logist {
    @Override
    public void checkDelivery() {
        System.out.println("The Truck logistician lays and checks the route of delivery of goods by truck");
    }
}
