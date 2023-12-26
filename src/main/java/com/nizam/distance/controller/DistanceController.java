package com.nizam.distance.controller;

import com.nizam.distance.exception.*;
import com.nizam.distance.request.DistanceRequest;
import com.nizam.distance.response.DistanceResponse;
import com.nizam.distance.service.DistanceCalculationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

//import javax.validation.Valid;

@ControllerAdvice
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
    public ResponseEntity<?> calculateDistance(@Valid @RequestBody DistanceRequest request, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            throw new InvalidRequestException("Invalid request: " + bindingResult.getAllErrors());
        }

        double totalDistance = calculationService.calculateTotalDistance(
                request.getFirstDistance(), request.getFirstUnit(),
                request.getSecondDistance(), request.getSecondUnit(),
                request.getResultUnit());

        DistanceResponse response = new DistanceResponse(totalDistance);
        return ResponseEntity.ok(response);
    }

    // Exception handler for handling InvalidRequestException
    @ExceptionHandler(InvalidRequestException.class)
    public ResponseEntity<String> handleInvalidRequestException(InvalidRequestException ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }

}
