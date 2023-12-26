package com.nizam.distance.controller;

import com.nizam.distance.request.DistanceRequest;
import com.nizam.distance.response.DistanceResponse;
import com.nizam.distance.service.DistanceCalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DistanceController {

    private final DistanceCalculationService calculationService;

    @Autowired
    public DistanceController(DistanceCalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @PostMapping("/calculateDistance")
    public DistanceResponse calculateDistance(@RequestBody DistanceRequest request) {
        double totalDistance = calculationService.calculateTotalDistance(
                request.getFirstDistance(), request.getFirstUnit(),
                request.getSecondDistance(), request.getSecondUnit(),
                request.getResultUnit());

        return new DistanceResponse(totalDistance);
    }
}

