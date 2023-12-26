package com.nizam.distance.request;

public class DistanceRequest {
    private double firstDistance;
    private String firstUnit;
    private double secondDistance;
    private String secondUnit;
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
