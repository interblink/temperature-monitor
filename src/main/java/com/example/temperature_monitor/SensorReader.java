/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.temperature_monitor;

/**
 *
 * @author Virtutienda
 */
import org.springframework.stereotype.Component;

@Component
public class SensorReader {
    public double readTemperature() {
        return 9.0; // Simulación
    }
}
