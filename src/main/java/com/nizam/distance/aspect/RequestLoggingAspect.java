package com.nizam.distance.aspect;


import com.nizam.distance.request.DistanceRequest;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.*;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Aspect
@Component
public class RequestLoggingAspect {

    private final Logger logger = LoggerFactory.getLogger(RequestLoggingAspect.class);

    @Before("execution(* com.nizam.distance.controller.DistanceController.calculateDistance(..)) && args(request)")
    public void logRequest(@RequestBody DistanceRequest request) {
        logger.info("Request received for calculateDistance: {}", request);
    }
}
