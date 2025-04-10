package com.example.temperature_monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TemperatureMonitorApplication implements CommandLineRunner {

    private final TemperatureMonitor monitor;

    public TemperatureMonitorApplication(TemperatureMonitor monitor) {
        this.monitor = monitor;
    }

    public static void main(String[] args) {
        SpringApplication.run(TemperatureMonitorApplication.class, args);
    }

    @Override
    public void run(String... args) {
        monitor.monitor();
    }
}
