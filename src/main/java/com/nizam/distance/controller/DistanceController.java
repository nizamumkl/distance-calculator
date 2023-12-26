package com.nizam.distance.controller;

import com.nizam.distance.request.DistanceRequest;
import com.nizam.distance.response.DistanceResponse;
import com.nizam.distance.service.DistanceCalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DistanceController {

    private final
    @Autowired
    DistanceCalculationService calculationService;

    public DistanceController(DistanceCalculationService calculationService) {
        this.calculationService = calculationService;
    }

    //    @Secured("ROLE_USER")
    @PostMapping("/calculateDistance")
    public DistanceResponse calculateDistance(@RequestBody DistanceRequest request) {
        double totalDistance = calculationService.calculateTotalDistance(
                request.getFirstDistance(), request.getFirstUnit(),
                request.getSecondDistance(), request.getSecondUnit(),
                request.getResultUnit());

        return new DistanceResponse(totalDistance);
    }
}

