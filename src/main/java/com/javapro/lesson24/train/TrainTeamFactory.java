package com.javapro.lesson24.train;


import com.javapro.lesson24.Transport;
import com.javapro.lesson24.Manager;
import com.javapro.lesson24.TransportTeamFactory;
import com.javapro.lesson24.Logist;

public class TrainTeamFactory implements TransportTeamFactory {
    @Override
    public Transport getTransport() {
        return new Train();
    }

    @Override
    public Logist getLogist() {
        return new TrainLogist();
    }

    @Override
    public Manager getManager() {
        return new TrainManager();
    }
}
