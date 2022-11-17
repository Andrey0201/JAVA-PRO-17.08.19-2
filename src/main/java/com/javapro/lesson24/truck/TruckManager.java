package com.javapro.lesson24.truck;

import com.javapro.lesson24.Manager;

public class TruckManager implements Manager {
    @Override
    public void manageDelivery() {
        System.out.println("Manager manages delivery by train");
    }
}
