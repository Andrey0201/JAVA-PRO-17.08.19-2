package com.javapro.lesson24.truck;

import com.javapro.lesson24.Transport;
import com.javapro.lesson24.Manager;
import com.javapro.lesson24.TransportTeamFactory;
import com.javapro.lesson24.Logist;

public class TruckTeamFactory implements TransportTeamFactory {
    @Override
    public Transport getTransport() {
        return new Truck();
    }

    @Override
    public Logist getLogist() {
        return new TruckLogist();
    }

    @Override
    public Manager getManager() {
        return new TruckManager();
    }
}
