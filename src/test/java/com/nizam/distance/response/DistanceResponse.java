package com.nizam.distance.response;

public class DistanceResponse {
    private double totalDistance;

    public DistanceResponse(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    // Getter and setter

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }
}
