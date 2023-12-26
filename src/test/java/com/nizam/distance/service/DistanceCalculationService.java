package com.nizam.distance.service;

public class DistanceCalculationService {
    public double calculateTotalDistance(double firstDistance, String firstUnit,
                                         double secondDistance, String secondUnit,
                                         String resultUnit) {
        double totalDistance = convertToMeters(firstDistance, firstUnit)
                + convertToMeters(secondDistance, secondUnit);

        return convertToUnit(totalDistance, resultUnit);
    }

    // [sorry, re-commit] the following existing 2 methods implementing the calculation logic.
    private double convertToMeters(double distance, String unit) {
        if (unit.equalsIgnoreCase("yards")) {
            // 1 yard = 0.9144 meters
            return distance * 0.9144;
        }
        // Assuming 'meters' as the default unit
        return distance;
    }

    private double convertToUnit(double distance, String unit) {
        if (unit.equalsIgnoreCase("yards")) {
            // 1 meter = 1.09361 yards
            return distance * 1.09361;
        }
        // Assuming 'meters' as the default unit
        return distance;
    }

}
