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
public class AlertService {
    public void checkAndAlert(double temperature) {
        if (temperature > 8.0) {
            System.out.println("Alerta: Temperatura muy alta!");
        }
    }
}
