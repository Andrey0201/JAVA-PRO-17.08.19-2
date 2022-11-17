package com.javapro.lesson24;

import com.javapro.lesson24.train.TrainTeamFactory;

public class TrainDelivery {
    public static void main(String[] args) {
        TransportTeamFactory projectTeamFactory = new TrainTeamFactory();
        Transport transport = projectTeamFactory.getTransport();
        Logist logist = projectTeamFactory.getLogist();
        Manager manager = projectTeamFactory.getManager();

        logist.checkDelivery();
        transport.cargoDelivery();
        manager.manageDelivery();
    }
}
