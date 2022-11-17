package com.javapro.lesson24.train;

import com.javapro.lesson24.Manager;

public class TrainManager implements Manager {
    @Override
    public void manageDelivery() {
        System.out.println("Manager manages delivery by train");
    }
}
