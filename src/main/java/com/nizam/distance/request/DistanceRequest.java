package com.nizam.distance.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class DistanceRequest {
    @NotNull(message = "First distance cannot be null")
    @Min(value = 0, message = "First distance should be a positive number")
    private Double firstDistance;

    @NotBlank(message = "First unit cannot be blank")
    private String firstUnit;

    @NotNull(message = "Second distance cannot be null")
    @Min(value = 0, message = "Second distance should be a positive number")
    private Double secondDistance;

    @NotBlank(message = "Second unit cannot be blank")
    private String secondUnit;

    @NotBlank(message = "Result unit cannot be blank")
    private String resultUnit;

    // Getters and setters

    public double getFirstDistance() {
        return firstDistance;
    }

    public void setFirstDistance(double firstDistance) {
        this.firstDistance = firstDistance;
    }

    public String getFirstUnit() {
        return firstUnit;
    }

    public void setFirstUnit(String firstUnit) {
        this.firstUnit = firstUnit;
    }

    public double getSecondDistance() {
        return secondDistance;
    }

    public void setSecondDistance(double secondDistance) {
        this.secondDistance = secondDistance;
    }

    public String getSecondUnit() {
        return secondUnit;
    }

    public void setSecondUnit(String secondUnit) {
        this.secondUnit = secondUnit;
    }

    public String getResultUnit() {
        return resultUnit;
    }

    public void setResultUnit(String resultUnit) {
        this.resultUnit = resultUnit;
    }
}
