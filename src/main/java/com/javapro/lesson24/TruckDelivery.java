package com.javapro.lesson24;

import com.javapro.lesson24.truck.TruckTeamFactory;

public class TruckDelivery {
    public static void main(String[] args) {
        TransportTeamFactory projectTeamFactory = new TruckTeamFactory();
        Transport transport = projectTeamFactory.getTransport();
        Logist logist = projectTeamFactory.getLogist();
        Manager manager = projectTeamFactory.getManager();

        logist.checkDelivery();
        transport.cargoDelivery();
        manager.manageDelivery();
    }
}