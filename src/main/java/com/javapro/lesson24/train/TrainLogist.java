package com.javapro.lesson24.train;

import com.javapro.lesson24.Logist;

public class TrainLogist implements Logist {
    @Override
    public void checkDelivery() {
        System.out.println("The train logistician plots and checks the route for the delivery of goods by train");
    }
}
