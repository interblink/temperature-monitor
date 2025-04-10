/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.temperature_monitor;

/**
 *
 * @author Virtutienda
 */
import org.springframework.stereotype.Service;

@Service
public class TemperatureMonitor {

    private final SensorReader sensorReader;
    private final DataStorage dataStorage;
    private final AlertService alertService;

    public TemperatureMonitor(SensorReader sensorReader, DataStorage dataStorage, AlertService alertService) {
        this.sensorReader = sensorReader;
        this.dataStorage = dataStorage;
        this.alertService = alertService;
    }

    public void monitor() {
        double temperature = sensorReader.readTemperature();
        dataStorage.store(temperature);
        alertService.checkAndAlert(temperature);
    }
}
