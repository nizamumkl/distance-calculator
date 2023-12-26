package com.nizam.distance.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DistanceCalculationServiceTest {

    @Test
    public void testConvertToMeters() {
        DistanceCalculationService calculationService = new DistanceCalculationService();

        double yardsToMeters = calculationService.convertToMeters(5, "yards");
        assertEquals(4.572, yardsToMeters, 0.01); // Expected conversion result with a tolerance of 0.01

        // Add more conversion tests for different units if needed
    }

    @Test
    public void testConvertToUnit() {
        DistanceCalculationService calculationService = new DistanceCalculationService();

        double metersToYards = calculationService.convertToUnit(5, "meters", "yards");
        assertEquals(5.46807, metersToYards, 0.01); // Expected conversion result with a tolerance of 0.01

        // Add more conversion tests for different units if needed
    }

    @Test
    public void testInvalidUnits() {
        DistanceCalculationService calculationService = new DistanceCalculationService();

        // Test invalid units
        assertThrows(IllegalArgumentException.class, () -> {
            calculationService.convertToMeters(5, "invalid_unit");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            calculationService.convertToUnit(5, "meters", "invalid_unit");
        });
    }

    @Test
    public void testNegativeDistance() {
        DistanceCalculationService calculationService = new DistanceCalculationService();

        // Test negative distance
        assertThrows(IllegalArgumentException.class, () -> {
            calculationService.calculateTotalDistance(-3, "meters", 5, "yards", "meters");
        });
    }

}

