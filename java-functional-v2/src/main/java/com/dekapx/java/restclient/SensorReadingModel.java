package com.dekapx.java.restclient;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SensorReadingModel {
    private String sensorId;
    private double temperature;
    private double humidity;
    private double windSpeed;
    private LocalDateTime timestamp;
}

